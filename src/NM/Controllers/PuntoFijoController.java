package NM.Controllers;

import Database.Model.IteracionPuntoF;
import NM.Func.Func;
import NM.Metods.PuntoFijo;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.Scene;
import javafx.scene.chart.LineChart;
import javafx.scene.chart.NumberAxis;
import javafx.scene.chart.XYChart;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import javafx.scene.layout.StackPane;
import javafx.stage.Modality;
import javafx.stage.Stage;

import java.net.URL;
import java.util.ArrayList;
import java.util.List;
import java.util.ResourceBundle;

public class PuntoFijoController implements Initializable {
    @FXML
    Button btnGrafica, btnIngresa;
    @FXML
    TextField f_TF, Xi_TF,ep_TF;
    @FXML
    TableView<IteracionPuntoF> tabPF;

    PuntoFijo pf;

    @Override
    public void initialize(URL location, ResourceBundle resources) {
        btnIngresa.setDisable(true);
        btnIngresa.setOnAction(ListenBtns);
        btnGrafica.setOnAction(ListenBtns);

    }

    EventHandler<ActionEvent> ListenBtns = new EventHandler<ActionEvent>() {
        @Override
        public void handle(ActionEvent event) {
            if(event.getSource()== btnIngresa){
                try{
                    pf = new PuntoFijo(getXi(),getEp(),getFuncion());
                    initTab();
                }catch (Exception e){
                    Alert alert = new Alert(Alert.AlertType.ERROR);
                    alert.setTitle("Error");
                    alert.setHeaderText("Se ha detectado un error");
                    alert.setContentText("Ingrese una funcion valida porfavor");
                    alert.showAndWait();
                }
            }

            if(event.getSource()== btnGrafica){
                initGrap();
            }
        }

    };

    private void initGrap(){
        String validate = getFuncion();
        if(validate.equals("f(x)=")){
            Alert alert = new Alert(Alert.AlertType.INFORMATION);
            alert.setTitle("Erro en la Grafica");
            alert.setHeaderText("No se ha detectado la función");
            alert.setContentText("Ingrese una función valida porvafor");
            alert.showAndWait();
        }else{
            Func fg = new Func(getFuncion());

            double[]x= new double[21];
            double[]y= new double[21];
            double nplots =20;
            for (int i=0; i<x.length;i++){
                double p = i;//-(nplots/2);
                x[i] = p;
                y[i] = fg.evaluate(p);
            }

            Stage stage = new Stage();
            StackPane root = new StackPane();
            Scene scene = new Scene(root, 500, 500);

            NumberAxis xAxis = new NumberAxis();
            NumberAxis yAxis = new NumberAxis();

            LineChart<Number, Number> lineChartPlot = new LineChart<>(xAxis, yAxis);

            lineChartPlot.setAnimated(false);
            lineChartPlot.setCreateSymbols(false);

            List<XYChart.Data<Double[], Double[]>> data = new ArrayList<>();

            for (int n = 0; n < x.length; n++) {
                data.add(new XYChart.Data(x[n],y[n]));
            }

            XYChart.Series dataSeries = new XYChart.Series<>();

            dataSeries.setName("data"); // taking the data
            dataSeries.getData().addAll(data); // taking the data

            lineChartPlot.getData().add(dataSeries);
            scene.getStylesheets().add("resources/css/DarkTheme.css");
            root.getChildren().add(lineChartPlot);
            stage.initModality(Modality.APPLICATION_MODAL);
            stage.setTitle("Hello World!");
            stage.setScene(scene);
            stage.show();
            btnIngresa.setDisable(false);
        }
    }

    private void initTab(){
        tabPF.getItems().clear();
        tabPF.setItems(pf.getData());
    }

    private String getFuncion(){
        String _F = "f(x)="+f_TF.getText();
        return  _F;
    }

    private double getXi(){
        double _xi = Double.parseDouble(Xi_TF.getText());
        return _xi;
    }

    private double getEp(){
        double e_P = Double.parseDouble(ep_TF.getText());
        return e_P;
    }
}
