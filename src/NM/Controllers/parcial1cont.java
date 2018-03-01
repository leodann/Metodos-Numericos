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

public class parcial1cont implements Initializable
{
    @FXML
    Button bisec, falsa;

    EventHandler<ActionEvent> ListenerBtns = new EventHandler<ActionEvent>()
    {
        @Override
        public void handle(ActionEvent event)
        {
                try
                {
                    if(event.getSource()== bisec)
                        pantallafuncion();
                    if(event.getSource()== falsa)
                        pantallafuncion();
                }
                catch(IOException e)
                {
                    e.printStackTrace();
                }
        }
    };



    @Override
    public void initialize(URL location, ResourceBundle resources)
    {
        bisec.setOnAction(ListenerBtns);
        falsa.setOnAction(ListenerBtns);
    }

    public void pantallafuncion() throws IOException
    {
        Parent Parcial1 = FXMLLoader.load(getClass().getResource("../FXML/MeterFuncion.fxml"));
        Stage stageP1;
        Scene sceneP1 = new Scene(Parcial1,300,300);
        stageP1 = Main.homeS;
        stageP1.setScene(sceneP1);
    }
}
