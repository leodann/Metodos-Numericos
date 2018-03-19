package NM;

import NM.Metods.Newtton_Raphson;
import NM.Metods.PuntoFijo;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;
import org.mariuszgromada.math.mxparser.Function;

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
        primaryStage.setResizable(true);
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch(args);

        //Bisection b1 = new Bisection(4.2,4.4,0.01,"f(x)=x^4-2*x^3-12*x^2+16*x-40");
        //ReglaFalsa r1 = new ReglaFalsa(2.8,3.3,0.01,"f(x)=x^2-2*x-3");
        Newtton_Raphson n1 = new Newtton_Raphson(1,"f(x)=x^4-2*x^3-12*x^2+16*x-40",0.01);
        //Secante s1=new Secante(1,0,1,"f(x)=exp(-x^2)-x");
        //PuntoFijo P1 = new PuntoFijo(0,0.0001,"f(x)=sqrt(10/(x+4))");

        //Function f = new Function("f(x)=sqrt(10/(x+4))");
        //System.out.println(f.calculate(20));

    }
}
