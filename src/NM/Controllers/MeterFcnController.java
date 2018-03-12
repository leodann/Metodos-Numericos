package NM.Controllers;

import Database.Model.Dao.IteracionBisecDAO;
import NM.Metods.Bisection;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import javafx.scene.input.MouseEvent;


import java.net.URL;
import java.util.ArrayList;
import java.util.ResourceBundle;

public class MeterFcnController implements Initializable {
    @FXML
    Button btn1, btn2, btn3, btn4, btn5, btn6, btn7, btn8, btn9, btn0, btnpor, btnx, btnmas, btnclear, btnmenos, btnsqrt, btnexp, btnlog, btnIngresa;
    @FXML
    TextField funcion, a, b, ep;
    @FXML
    TableView<ArrayList> tabresultados;

    private Bisection Bis;
    private int txt = 0;
    //IteracionBisecDAO it = new IteracionBisecDAO(Bis.getArrIt());

    EventHandler<ActionEvent> ListenerBtns = new EventHandler<ActionEvent>() {
        @Override
        public void handle(ActionEvent event) {
            if (event.getSource() == btnIngresa) {
                Bis = new Bisection(getLimA(), getLimB(), getEp(), getfuncion());


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
        //initTableTransactions();
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


   /* private void initTableTransactions() {
        tabresultados.setItems(it.getData());

    }*/
}