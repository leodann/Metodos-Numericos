package NM.Controllers;

import NM.Main;
import NM.Metods.Bisection;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.input.MouseEvent;
import javafx.stage.Stage;


import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

public class MeterFcnController implements Initializable
{
    @FXML
    Button btn1, btn2, btn3, btn4, btn5, btn6, btn7, btn8, btn9, btn0, btnpor, btnx, btnmas, btnclear, btnmenos, btnsqrt, btnexp,btnlog,btnIngresa;
    @FXML
    TextField funcion,a,b,ep;


    Bisection Bis;

    EventHandler<ActionEvent> ListenerBtns = new EventHandler<ActionEvent>()
    {
        @Override
        public void handle(ActionEvent event) {
            try {

                if (event.getSource() == btnIngresa) {
                    Bis = new Bisection(getLimA(), getLimB(), getEp(), getfuncion());
                    pantallaresultados();
                }
            }
            catch (IOException e) {
                e.printStackTrace();
            }

        }
    };

    EventHandler<MouseEvent> ListenerFields = new EventHandler<MouseEvent>()
    {
        @Override
        public void handle(MouseEvent mouse) {
            if(mouse.getSource()==funcion){
                funcion.setEditable(true);
                a.setEditable(false);
                b.setEditable(false);
                ep.setEditable(false);

            }
            if(mouse.getSource()==a){
                funcion.setEditable(false);
                a.setEditable(true);
                b.setEditable(false);
                ep.setEditable(false);

            }
            if(mouse.getSource()==b){
                funcion.setEditable(false);
                a.setEditable(false);
                b.setEditable(true);
                ep.setEditable(false);
            }

            if(mouse.getSource()==ep){
                funcion.setEditable(false);
                a.setEditable(false);
                b.setEditable(false);
                ep.setEditable(true);

            }
        }
    };

    @Override
    public void initialize(URL location, ResourceBundle resources)
    {
        funcion.setEditable(false);
        a.setEditable(false);
        b.setEditable(false);
        ep.setEditable(false);
        funcion.setOnMouseClicked(ListenerFields);a.setOnMouseClicked(ListenerFields);
        b.setOnMouseClicked(ListenerFields); ep.setOnMouseClicked(ListenerFields);

        btn0.setOnAction(ListenerBtns); btn1.setOnAction(ListenerBtns);
        btn2.setOnAction(ListenerBtns); btn3.setOnAction(ListenerBtns);
        btn4.setOnAction(ListenerBtns); btn5.setOnAction(ListenerBtns);
        btn6.setOnAction(ListenerBtns); btn7.setOnAction(ListenerBtns);
        btn8.setOnAction(ListenerBtns); btn9.setOnAction(ListenerBtns);
        btnpor.setOnAction(ListenerBtns); btnmas.setOnAction(ListenerBtns);
        btnclear.setOnAction(ListenerBtns); btnmenos.setOnAction(ListenerBtns);
        btnsqrt.setOnAction(ListenerBtns); btnexp.setOnAction(ListenerBtns);
        btnlog.setOnAction(ListenerBtns); btnx.setOnAction(ListenerBtns);
        btnIngresa.setOnAction(ListenerBtns);
    }

    public String getfuncion()
    {
        String f ="f(x)="+funcion.getText();
        return  f;
    }

    public double getLimA(){
        double limA = Double.parseDouble(a.getText());
        return limA;
    }

    public double getLimB(){
        double limB = Double.parseDouble(b.getText());
        return limB;
    }

    public double getEp(){
        double Ep =Double.parseDouble(ep.getText());
        return Ep;
    }


    public void pantallaresultados() throws IOException
    {
        Parent Parcial1 = FXMLLoader.load(getClass().getResource("../FXML/TablaResultados.fxml"));
        Stage stageP1;
        Scene sceneP1 = new Scene(Parcial1,600,600);
        sceneP1.getStylesheets().add("resources/css/DarkTheme.css");
        stageP1 = Main.homeS;
        stageP1.setScene(sceneP1);
        stageP1.setMaximized(true);
    }

}
