package NM.Controllers;

import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Label;


import java.net.URL;
import java.util.ResourceBundle;

public class MeterFcnController implements Initializable
{
    String fcn, limitea, limiteb, error;

    @FXML
    Button btn1, btn2, btn3, btn4, btn5, btn6, btn7, btn8, btn9, btn0, btnpor, btnx, btnmas, btnclear, btnmenos, btnsqrt, btnexp,btnlog;
    @FXML
    Label funcion, a, b, eP;


    EventHandler<ActionEvent> ListenerBtns = new EventHandler<ActionEvent>()
    {
        @Override
        public void handle(ActionEvent event) {
            if (event.getSource()==btn0)
                getfuncion(btn0);
            if (event.getSource()==btn1)
                getfuncion(btn1);
            if (event.getSource()==btn2)
                getfuncion(btn2);
            if (event.getSource()==btn3)
                getfuncion(btn3);
            if (event.getSource()==btn4)
                getfuncion(btn4);
            if (event.getSource()==btn5)
                getfuncion(btn5);
            if (event.getSource()==btn6)
                getfuncion(btn6);
            if (event.getSource()==btn7)
                getfuncion(btn7);
            if (event.getSource()==btn8)
                getfuncion(btn8);
            if (event.getSource()==btn9)
                getfuncion(btn9);
            if (event.getSource()==btnpor)
                getfuncion(btnpor);
            if (event.getSource()==btnx)
                getfuncion(btnx);
            if (event.getSource()==btnmas)
                getfuncion(btnmas);
            if (event.getSource()==btnclear)
                getfuncion(btnclear);
            if (event.getSource()==btnmenos)
                getfuncion(btnmenos);
            if (event.getSource()==btnsqrt)
                getfuncion(btnsqrt);
            if (event.getSource()==btnexp)
                getfuncion(btnexp);
            if (event.getSource()==btnlog)
                getfuncion(btnlog);

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
    }

    public String getfuncion(Button b1)
    {
        fcn = fcn + b1.getText();
        return fcn;
    }

    public double getLimiteA(Button b1)
    {
        limitea = limitea + b1.getText();
        double _a = Double.parseDouble(limitea);
        return _a;
    }

    public double getLimiteB(Button b1)
    {
        limiteb = limitea + b1.getText();
        double _b = Double.parseDouble(limiteb);
        return _b;
    }

    public double getErr(Button b1)
    {
        error = error + b1.getText();
        double _eP = Double.parseDouble(error);
        return _eP;
    }

}
