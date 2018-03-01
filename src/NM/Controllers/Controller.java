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
        btn3.setOnAction(event);
        btn4.setOnAction(event);
    }

    EventHandler<ActionEvent> event = new EventHandler<ActionEvent>() {
        @Override
        public void handle(ActionEvent event) {
            try {
                pantallaparcial1();
            } catch (IOException e) {
                e.printStackTrace();

            }
        }
    };


    private void pantallaparcial1() throws  IOException{


        Parent Parcial1 = FXMLLoader.load(getClass().getResource("../FXML/Parcial1.fxml"));
        Stage stageP1;
        Scene sceneP1 = new Scene(Parcial1,300,300);
        stageP1 = Main.homeS;
        stageP1.setScene(sceneP1);

    }
}
