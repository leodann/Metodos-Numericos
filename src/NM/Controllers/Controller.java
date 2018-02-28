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
Button btn1;

    @Override
    public void initialize(URL location, ResourceBundle resources) {
        btn1.setOnAction(event);
    }

    EventHandler<ActionEvent> event = new EventHandler<ActionEvent>() {
        @Override
        public void handle(ActionEvent event) {
            try {
                changingScene();
            } catch (IOException e) {
                e.printStackTrace();

            }
        }
    };


    private void changingScene() throws  IOException{


        Parent Parcial1 = FXMLLoader.load(getClass().getResource("../FXML/Parcial1.fxml"));
        Stage stageP1;
        Scene sceneP1 = new Scene(Parcial1,300,300);
        stageP1 = Main.homeS;
        stageP1.setScene(sceneP1);

    }
}
