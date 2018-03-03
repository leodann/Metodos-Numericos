package NM.Controllers;

import NM.Metods.Bisection;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;


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
            if(event.getSource()==btnIngresa){
                Bis = new Bisection(getLimA(),getLimB(),getEp(),getfuncion());

            }

        }
    };

    @Override
    public void initialize(URL location, ResourceBundle resources)
    {
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

}
