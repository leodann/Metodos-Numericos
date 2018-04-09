package NM.Controllers;

import Database.Model.IteracionNewton;
import NM.Func.Func;
import NM.Metods.Newtton_Raphson;
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

public class NewtonRaphsonController implements Initializable {
    @FXML
    Button IngresaBtn, GraficaBtn;
    @FXML
    TextField fx_TF,Xi_TF,eP_TF;
    @FXML
    TableView<IteracionNewton> table_NR;
    Newtton_Raphson NR;

    @Override
    public void initialize(URL location, ResourceBundle resources) {
        IngresaBtn.setDisable(true);
        IngresaBtn.setOnAction(ListenBtns);
        GraficaBtn.setOnAction(ListenBtns);
    }

    EventHandler<ActionEvent> ListenBtns = new EventHandler<ActionEvent>() {
        @Override
        public void handle(ActionEvent event) {
            if(event.getSource()==IngresaBtn){
                try{

                    NR = new Newtton_Raphson(get_Xi(),get_Fx(),get_ep());
                    initTabaleN();
                }catch (Exception e){
                    Alert alert = new Alert(Alert.AlertType.ERROR);
                    alert.setTitle("Error");
                    alert.setHeaderText("Funcion incorrecta");
                    alert.setContentText("Verifique su función");
                    alert.showAndWait();
                }
            }

            if(event.getSource() ==  GraficaBtn){
                initGrapN();
            }
        }
    };

    private void initTabaleN(){
        table_NR.getItems().clear();
        table_NR.setItems(NR.getDataN());
    }

    private void initGrapN(){
        String validateN = get_Fx();
        if(validateN.equals("f(x)=")){
            Alert alert = new Alert(Alert.AlertType.INFORMATION);
            alert.setTitle("Erro en la Grafica");
            alert.setHeaderText("No se ha detectado la función");
            alert.setContentText("Ingrese una función valida porvafor");
            alert.showAndWait();
        }else{
            Func fg = new Func(get_Fx());

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
            IngresaBtn.setDisable(false);
        }
    }

    public String get_Fx(){
        String _Fx = "f(x)=" +fx_TF.getText();
        return _Fx;
    }

    public double get_Xi(){
        double _Xi = Double.parseDouble(Xi_TF.getText());
        return _Xi;
    }

    public double get_ep(){
        double _ep = Double.parseDouble(eP_TF.getText());
        return _ep;
    }
}
