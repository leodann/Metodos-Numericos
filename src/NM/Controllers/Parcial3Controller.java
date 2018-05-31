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

import static NM.Controllers.parcial1cont.StageP1;

public class Parcial3Controller implements Initializable
{
    @FXML
    Button btnJacobi, btnSeidel, btnNRMulti, btnAprox, regresar,btnInterpol;


    @Override
    public void initialize(URL location, ResourceBundle resources) {
        btnJacobi.setOnAction(ListenerButtons);
        btnSeidel.setOnAction(ListenerButtons);
        btnNRMulti.setOnAction(ListenerButtons);
        btnAprox.setOnAction(ListenerButtons);
        regresar.setOnAction(ListenerButtons);
        btnInterpol.setOnAction(ListenerButtons);
    }

    EventHandler<ActionEvent> ListenerButtons = new EventHandler<ActionEvent>() {
        @Override
        public void handle(ActionEvent event) {
            if(event.getSource() == btnJacobi){
                try {
                    pantallaMetodo(btnJacobi);
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }

            if(event.getSource() == btnSeidel){
                try {
                    pantallaMetodo(btnSeidel);
                } catch (IOException e) {
                    e.printStackTrace();
                }

            }

            if(event.getSource() == btnNRMulti){
                try {
                    pantallaMetodo(btnNRMulti);
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }

            if(event.getSource() == btnAprox){
                try {
                    pantallaMetodo(btnAprox);
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
            if(event.getSource() == regresar)
            {
                try {
                    back();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }

            if(event.getSource() == btnInterpol){
                try{
                    pantallaMetodo(btnInterpol);
                }catch (IOException e){e.printStackTrace();}
            }
        }
    };

    private void pantallaMetodo(Button btn) throws IOException {
        if(btn == btnJacobi){
            Stage StageP2;
            Parent Parcial2 = FXMLLoader.load(getClass().getResource("../FXML/PuntoFijo_fxml.fxml"));
            Scene sceneP1 = new Scene(Parcial2);
            sceneP1.getStylesheets().add("resources/css/DarkTheme.css");
            StageP2 = Main.homeS;
            StageP2.setScene(sceneP1);
            StageP2.setMaximized(true);
        }

        if(btn == btnSeidel){
            Stage StageP2;
            Parent Parcial2 = FXMLLoader.load(getClass().getResource("../FXML/NewtonRaphson_fxml.fxml"));
            Scene sceneP1 = new Scene(Parcial2);
            sceneP1.getStylesheets().add("resources/css/DarkTheme.css");
            StageP2 = Main.homeS;
            StageP2.setScene(sceneP1);
            StageP2.setMaximized(true);
        }

        if(btn == btnNRMulti){
            Stage StageP2;
            Parent Parcial2 = FXMLLoader.load(getClass().getResource("../FXML/Secante_fxml.fxml"));
            Scene sceneP1 = new Scene(Parcial2);
            sceneP1.getStylesheets().add("resources/css/DarkTheme.css");
            StageP2 = Main.homeS;
            StageP2.setScene(sceneP1);
            StageP2.setMaximized(true);
        }

        if(btn == btnAprox){
            Stage StageP2;
            Parent Parcial2 = FXMLLoader.load(getClass().getResource("../FXML/AproxFuncional.fxml"));
            Scene sceneP1 = new Scene(Parcial2);
            sceneP1.getStylesheets().add("resources/css/DarkTheme.css");
            StageP2 = Main.homeS;
            StageP2.setScene(sceneP1);
            StageP2.setMaximized(true);
        }
        if(btn == btnInterpol){
            Stage StageP2;
            Parent Parcial2 = FXMLLoader.load(getClass().getResource("../FXML/Lagrange.fxml"));
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
