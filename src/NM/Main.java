package NM;

import NM.Controllers.MeterFcnController;
import NM.Metods.Bisection;
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
        Scene scene = new Scene(root,400,400);
        scene.getStylesheets().add("resources/css/DarkTheme.css");
        homeS=primaryStage;
        primaryStage.setTitle("Metodos Numericos");
        primaryStage.setScene(scene);
        primaryStage.setResizable(false);
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch(args);
        /*String x="f(x)=x^2+3*x+9";
        Func fa = new Func(x);
        String res=fa.evaluate(2);
        System.out.println(res); Prueba de campo para evaluar funciones*/
        //Bisection b1 = new Bisection(4.2,4.4,0.01,"f(x)=x^4-2*x^3-12*x^2+16*x-40");
    }
}
