package NM.Controllers;

import Database.Model.IteracionBisec;
import NM.Func.Func;
import NM.Metods.ReglaFalsa;
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

public class ReglaFController implements Initializable{
    @FXML
    Button graficarBTN, ingresaBTN;
    @FXML
    TextField funcionTF, aTF,bTF,epTF;
    @FXML
    TableView<IteracionBisec> tableReglaF;

    private ReglaFalsa ReF;
    private int txt = 0;

    @Override
    public void initialize(URL location, ResourceBundle resources) {
        ingresaBTN.setDisable(true);
        graficarBTN.setOnAction(ListnerButtons);
        ingresaBTN.setOnAction(ListnerButtons);
    }

    EventHandler<ActionEvent> ListnerButtons = new EventHandler<ActionEvent>() {
        @Override
        public void handle(ActionEvent event) {
            if(event.getSource() == graficarBTN){
                InitGraR();
            }
            if(event.getSource() == ingresaBTN){
                try {
                    ReF = new ReglaFalsa(getA(),getB(),getEp(),getFuncion());
                    InitTableR();
                }catch(Exception e){
                    Alert alert = new Alert(Alert.AlertType.ERROR);
                    alert.setTitle("Error");
                    alert.setHeaderText("Se ha detectado un error");
                    alert.setContentText("Ingrese una funcion valida porfavor");
                    alert.showAndWait();
                }
            }
        }
    };

    private void InitGraR(){
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
            ingresaBTN.setDisable(false);
        }
    }

    private void InitTableR(){
        tableReglaF.getItems().clear();
        tableReglaF.setItems(ReF.getData());
    }

    private String getFuncion(){
        String funcion = "f(x)=" + funcionTF.getText();
        return  funcion;
    }

    private double getA(){
        double a = Double.parseDouble(aTF.getText());
        return a;
    }

    private  double getB(){
        double b = Double.parseDouble(bTF.getText());
        return b;
    }

    private  double getEp(){
        double EP = Double.parseDouble(epTF.getText());
        return EP;
    }


}
