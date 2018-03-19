package NM.Controllers;

import Database.Model.IteracionSecante;
import NM.Func.Func;
import NM.Metods.Secante;
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

public class SecanteController implements Initializable {
    @FXML
    Button GrapSBtn, IngreSBtn;
    @FXML
    TextField fx_TF,Xi_TF,Ximinus1_TF,ep_TF;
    @FXML
    TableView<IteracionSecante> tableSecante;

    Secante se;

    @Override
    public void initialize(URL location, ResourceBundle resources) {
        IngreSBtn.setDisable(true);
        IngreSBtn.setOnAction(ListenBtns);
        GrapSBtn.setOnAction(ListenBtns);
    }

    EventHandler<ActionEvent> ListenBtns = new EventHandler<ActionEvent>() {
        @Override
        public void handle(ActionEvent event) {
            if(event.getSource()==GrapSBtn){
                initGrapS();
            }

            if(event.getSource()==IngreSBtn){
                try{
                    se = new Secante(getXi(),getXiminus1(),getErr(),getFun());
                    initTableS();
                }catch (Exception e){
                    Alert alert = new Alert(Alert.AlertType.ERROR);
                    alert.setTitle("Error");
                    alert.setHeaderText("Se ha detectado un error");
                    alert.setContentText("Ingrese una funcion valida porfavor");
                    alert.showAndWait();
                }
            }
        }
    };

    private void initGrapS(){
        String valS = getFun();
        if(valS.equals("f(x)")){
            Alert alert = new Alert(Alert.AlertType.INFORMATION);
            alert.setTitle("Erro en la Grafica");
            alert.setHeaderText("No se ha detectado la función");
            alert.setContentText("Ingrese una función valida porvafor");
            alert.showAndWait();
        }else{
            Func fg = new Func(getFun());

            double[]x= new double[21];
            double[]y= new double[21];
            double nplots =20;
            for (int i=0; i<x.length;i++){
                double p = i-(nplots/2);
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
            IngreSBtn.setDisable(false);
        }
    }

    private void initTableS(){
        tableSecante.setItems(se.getData());
    }

    public String getFun(){
        String fx = "f(x)="+ fx_TF.getText();
        return fx;
    }

    public double getXi(){
        double x_I = Double.parseDouble(Xi_TF.getText());
        return x_I;
    }

    public  double getXiminus1(){
        double _Xi_1 = Double.parseDouble(Ximinus1_TF.getText());
        return  _Xi_1;
    }

    public double getErr(){
        double _e_p = Double.parseDouble(ep_TF.getText());
        return _e_p;
    }
}
