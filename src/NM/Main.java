package NM;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class Main extends Application{
    public static Stage homeS;
    @Override
    public void start(Stage primaryStage) throws Exception {
        Parent root = FXMLLoader.load(getClass().getResource("FXML/MenuFXML.fxml"));
        homeS=primaryStage;
        primaryStage.setTitle("Metodos Numericos");
        primaryStage.setScene(new Scene(root,300,300));
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch(args);
        /*String x="f(x)=x^2+3*x+9";
        Func fa = new Func(x);
        String res=fa.evaluate(2);
        System.out.println(res); Prueba de campo para evaluar funciones*/


    }
}
