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
    public static Stage StageP1;
    @FXML
    Button bise, fals,backbtn;

    EventHandler<ActionEvent> ListenerBtns = new EventHandler<ActionEvent>()
    {
        @Override
        public void handle(ActionEvent event)
        {
            if (event.getSource()==backbtn){
                try {
                    Rback();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }

                try
                {
                    if(event.getSource()== bise)
                        pantallafuncion(bise);
                    if(event.getSource()== fals)
                        pantallafuncion(fals);
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
        bise.setOnAction(ListenerBtns);
        fals.setOnAction(ListenerBtns);
        backbtn.setOnAction(ListenerBtns);
    }

    public void pantallafuncion(Button btn) throws IOException
    {
        if(btn == bise){
            Parent Parcial1 = FXMLLoader.load(getClass().getResource("../FXML/BisFXML.fxml"));
            Scene sceneP1 = new Scene(Parcial1);
            sceneP1.getStylesheets().add("resources/css/DarkTheme.css");
            StageP1 = Main.homeS;
            StageP1.setScene(sceneP1);
            StageP1.setMaximized(true);
        }else{
            Parent Parcial1 = FXMLLoader.load(getClass().getResource("../FXML/ReglaF_FXML.fxml"));
            Scene sceneP1 = new Scene(Parcial1);
            sceneP1.getStylesheets().add("resources/css/DarkTheme.css");
            StageP1 = Main.homeS;
            StageP1.setScene(sceneP1);
            StageP1.setMaximized(true);

        }
    }

    private void Rback() throws IOException {
        Parent root = FXMLLoader.load(getClass().getResource("../FXML/MenuFXML.fxml"));
        Scene scene = new Scene(root,400,400);
        scene.getStylesheets().add("resources/css/DarkTheme.css");
        StageP1 = Main.homeS;
        StageP1.setScene(scene);
        StageP1.setMaximized(false);
    }
}
