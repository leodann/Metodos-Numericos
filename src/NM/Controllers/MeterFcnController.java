package NM.Controllers;

import Database.Model.Dao.IteracionBisecDAO;
import Database.Model.IteracionBisec;
import NM.Func.Func;
import NM.Main;
import NM.Metods.Bisection;
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
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.StackPane;
import javafx.stage.Modality;
import javafx.stage.Stage;


import java.net.URL;
import java.util.ArrayList;
import java.util.List;
import java.util.ResourceBundle;

public class MeterFcnController implements Initializable {
    @FXML
    Button btn1, btn2, btn3, btn4, btn5, btn6, btn7, btn8, btn9, btn0, btnpor, btnx, btnmas, btnclear, btnmenos, btnsqrt, btnexp, btnlog, btnIngresa,btngrafica;
    @FXML
    TextField funcion, a, b, ep;
    @FXML
    TableView<IteracionBisec> tabresultados;

    private Bisection Bis;
    private int txt = 0;


    EventHandler<ActionEvent> ListenerBtns = new EventHandler<ActionEvent>() {
        @Override
        public void handle(ActionEvent event) {
            if (event.getSource() == btnIngresa) {
                Bis = new Bisection(getLimA(), getLimB(), getEp(), getfuncion());
                 initTableTransactions();
            }

            if(event.getSource()==btngrafica) {
                initGrphic();
            }
            if (event.getSource() == btn1)
                setfuncion(btn1);
            if (event.getSource() == btn2)
                setfuncion(btn2);
            if (event.getSource() == btn3)
                setfuncion(btn3);
            if (event.getSource() == btn4)
                setfuncion(btn4);
            if (event.getSource() == btn5)
                setfuncion(btn5);
            if (event.getSource() == btn6)
                setfuncion(btn6);
            if (event.getSource() == btn7)
                setfuncion(btn7);
            if (event.getSource() == btn8)
                setfuncion(btn8);
            if (event.getSource() == btn9)
                setfuncion(btn9);
            if (event.getSource() == btn0)
                setfuncion(btn0);
            if (event.getSource() == btnx)
                setfuncion(btnx);
            if (event.getSource() == btnexp)
                setfuncion(btnexp);
            if (event.getSource() == btnsqrt)
                setfuncion(btnsqrt);
            if (event.getSource() == btnpor)
                setfuncion(btnpor);
            if (event.getSource() == btnmas)
                setfuncion(btnmas);
            if (event.getSource() == btnmenos)
                setfuncion(btnmenos);
            if (event.getSource() == btnlog)
                setfuncion(btnlog);
        }

    };

    EventHandler<MouseEvent> ListenerFields = new EventHandler<MouseEvent>() {
        @Override
        public void handle(MouseEvent mouse) {
            if (mouse.getSource() == funcion) {
                funcion.setEditable(true);
                a.setEditable(false);
                b.setEditable(false);
                ep.setEditable(false);
                txt = 0;

            }
            if (mouse.getSource() == a) {
                funcion.setEditable(false);
                a.setEditable(true);
                b.setEditable(false);
                ep.setEditable(false);
                txt = 1;

            }
            if (mouse.getSource() == b) {
                funcion.setEditable(false);
                a.setEditable(false);
                b.setEditable(true);
                ep.setEditable(false);
                txt = 2;
            }

            if (mouse.getSource() == ep) {
                funcion.setEditable(false);
                a.setEditable(false);
                b.setEditable(false);
                ep.setEditable(true);
                txt = 3;
            }
        }
    };

    @Override
    public void initialize(URL location, ResourceBundle resources) {
        funcion.setEditable(false);
        a.setEditable(false);
        b.setEditable(false);
        ep.setEditable(false);
        btnIngresa.setDisable(true);

        funcion.setOnMouseClicked(ListenerFields);
        a.setOnMouseClicked(ListenerFields);
        b.setOnMouseClicked(ListenerFields);
        ep.setOnMouseClicked(ListenerFields);

        btn0.setOnAction(ListenerBtns);
        btn1.setOnAction(ListenerBtns);
        btn2.setOnAction(ListenerBtns);
        btn3.setOnAction(ListenerBtns);
        btn4.setOnAction(ListenerBtns);
        btn5.setOnAction(ListenerBtns);
        btn6.setOnAction(ListenerBtns);
        btn7.setOnAction(ListenerBtns);
        btn8.setOnAction(ListenerBtns);
        btn9.setOnAction(ListenerBtns);
        btnpor.setOnAction(ListenerBtns);
        btnmas.setOnAction(ListenerBtns);
        btnclear.setOnAction(ListenerBtns);
        btnmenos.setOnAction(ListenerBtns);
        btnsqrt.setOnAction(ListenerBtns);
        btnexp.setOnAction(ListenerBtns);
        btnlog.setOnAction(ListenerBtns);
        btnx.setOnAction(ListenerBtns);
        btnIngresa.setOnAction(ListenerBtns);
        btngrafica.setOnAction(ListenerBtns);
    }

    private String getfuncion() {
        String f = "f(x)=" + funcion.getText();
        return f;
    }

    private double getLimA() {
        double limA = Double.parseDouble(a.getText());
        return limA;
    }

    private double getLimB() {
        double limB = Double.parseDouble(b.getText());
        return limB;
    }

    private double getEp() {
        double Ep = Double.parseDouble(ep.getText());
        return Ep;
    }

    private void setfuncion(Button b1) {
        String temp;
        switch (txt) {
            case (0):
                temp = funcion.getText() + b1.getText();
                funcion.setText(temp);
                break;
            case (1):
                temp = a.getText() + b1.getText();
                a.setText(temp);
                break;
            case (2):
                temp = b.getText() + b1.getText();
                b.setText(temp);
                break;
            case (3):
                temp = ep.getText() + b1.getText();
                ep.setText(temp);
        }
    }

    private void initTableTransactions() {
        tabresultados.setItems(Bis.getData());

    }

    private void initGrphic(){
        String fu = getfuncion();
        if(fu.equals("f(x)=")){
            Alert alert = new Alert(Alert.AlertType.INFORMATION);
            alert.setTitle("Error Función");
            alert.setHeaderText("No se ha detectado la función");
            alert.setContentText("Ingrese una función valida porvafor");
            alert.showAndWait();


        }else{

            Func fg = new Func(getfuncion());

            double[]x= new double[31];
            double[]y= new double[31];
            double nplots =30;
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
            btnIngresa.setDisable(false);
        }
    }
}