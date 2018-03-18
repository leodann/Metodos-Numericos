package NM.Controllers;

import NM.Main;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.stage.Stage;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

public class Controller implements Initializable{
@FXML
Button btn1,btn2,btn3,btn4;

    @Override
    public void initialize(URL location, ResourceBundle resources) {
        btn1.setOnAction(event);
        btn2.setOnAction(event);
        /*btn3.setOnAction(event);
        btn4.setOnAction(event);*/
    }

    EventHandler<ActionEvent> event = new EventHandler<ActionEvent>() {
        @Override
        public void handle(ActionEvent event) {
            if(event.getSource()==btn1){
                try {
                    pantallaparcial1();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
            if (event.getSource()==btn2){
                try {
                    pantallaparcial2();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }

            if (event.getSource()==btn3){
                try {
                    pantallaparcial3();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }

            if (event.getSource()==btn4){
                try {
                    pantallaparcial4();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    };


    private void pantallaparcial1() throws  IOException{


        Parent Parcial1 = FXMLLoader.load(getClass().getResource("../FXML/Parcial1.fxml"));
        Stage stageP1;
        Scene sceneP1 = new Scene(Parcial1,400,400);
        Parcial1.getStylesheets().add("resources/css/DarkTheme.css");
        stageP1 = Main.homeS;
        stageP1.setScene(sceneP1);

    }

    private void pantallaparcial2()throws IOException{
        Parent Parcial1 = FXMLLoader.load(getClass().getResource("../FXML/Parcial2.fxml"));
        Stage stageP1;
        Scene sceneP1 = new Scene(Parcial1,400,400);
        Parcial1.getStylesheets().add("resources/css/DarkTheme.css");
        stageP1 = Main.homeS;
        stageP1.setScene(sceneP1);
    }

    private void pantallaparcial3()throws IOException{

    }

    private void pantallaparcial4()throws IOException{

    }
}
