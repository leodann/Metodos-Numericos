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
    @FXML
    Button btn1, btn2, btn3, btn4, btn5, btn6, btn7, btn8, btn9, btn0, btnpor, btnx, btnmas, btnclear, btnmenos, btnsqrt, btnexp,btnlog;
    @FXML
    Label funcion, a, b, err;


    EventHandler<ActionEvent> ListenerBtns = new EventHandler<ActionEvent>()
    {
        @Override
        public void handle(ActionEvent event) {

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

    }
}
