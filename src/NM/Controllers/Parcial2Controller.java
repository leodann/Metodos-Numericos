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

public class Parcial2Controller implements Initializable {

    private Stage StageP1;
    @FXML
    Button btnPF,btnNR,btnSE, regresar;

    @Override
    public void initialize(URL location, ResourceBundle resources) {
        btnNR.setOnAction(ListenerButtons);
        btnPF.setOnAction(ListenerButtons);
        btnSE.setOnAction(ListenerButtons);
        regresar.setOnAction(ListenerButtons);
    }

    EventHandler<ActionEvent> ListenerButtons = new EventHandler<ActionEvent>() {
        @Override
        public void handle(ActionEvent event) {
            if(event.getSource() == btnPF){
                try {
                    pantallaMetodo(btnPF);
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }

            if(event.getSource() == btnNR){
                try {
                    pantallaMetodo(btnNR);
                } catch (IOException e) {
                    e.printStackTrace();
                }

            }

            if(event.getSource() == btnSE){
                try {
                    pantallaMetodo(btnSE);
                } catch (IOException e) {
                    e.printStackTrace();
                }

             if(event.getSource() == regresar)
             {
                 System.exit(0);
             }

            }
        }
    };

    private void pantallaMetodo(Button btn) throws IOException {
        if(btn == btnPF){
            Stage StageP2;
            Parent Parcial2 = FXMLLoader.load(getClass().getResource("../FXML/PuntoFijo_fxml.fxml"));
            Scene sceneP1 = new Scene(Parcial2);
            sceneP1.getStylesheets().add("resources/css/DarkTheme.css");
            StageP2 = Main.homeS;
            StageP2.setScene(sceneP1);
            StageP2.setMaximized(true);
        }

        if(btn == btnNR){
            Stage StageP2;
            Parent Parcial2 = FXMLLoader.load(getClass().getResource("../FXML/NewtonRaphson_fxml.fxml"));
            Scene sceneP1 = new Scene(Parcial2);
            sceneP1.getStylesheets().add("resources/css/DarkTheme.css");
            StageP2 = Main.homeS;
            StageP2.setScene(sceneP1);
            StageP2.setMaximized(true);
        }

        if(btn == btnSE){
            Stage StageP2;
            Parent Parcial2 = FXMLLoader.load(getClass().getResource("../FXML/Secante_fxml.fxml"));
            Scene sceneP1 = new Scene(Parcial2);
            sceneP1.getStylesheets().add("resources/css/DarkTheme.css");
            StageP2 = Main.homeS;
            StageP2.setScene(sceneP1);
            StageP2.setMaximized(true);
        }

    }


    private void back() throws IOException {
        Parent root = FXMLLoader.load(getClass().getResource("../FXML/MenuFXML.fxml"));
        Scene scene = new Scene(root,400,400);
        scene.getStylesheets().add("resources/css/DarkTheme.css");
        StageP1 = Main.homeS;
        StageP1.setScene(scene);
        StageP1.setMaximized(false);
    }

}
