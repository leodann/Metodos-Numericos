package NM;

import NM.Controllers.MeterFcnController;
import NM.Func.Func;
import NM.Metods.*;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;
import org.mariuszgromada.math.mxparser.Argument;
import org.mariuszgromada.math.mxparser.Expression;
import org.mariuszgromada.math.mxparser.Function;
import org.mariuszgromada.math.mxparser.mathcollection.Calculus;

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
        //ReglaFalsa r1 = new ReglaFalsa(2.8,3.3,0.01,"f(x)=x^2-2*x-3");
        //Expression e = new Expression("der( sin(x),x,1)");

       /* Function f = new Function("f(x)=sin(x)");
        Argument x = new Argument("x=1");
        Expression e = new Expression("der(f(x),x)",x,f);

        double v = e.calculate();
        System.out.println(v);*/
        /*Func fa2 = new Func("f(x)=sin(x)");
        double e =fa2.derivative(1);
        System.out.println(e);
        System.exit(0);*/
        //Newtton_Raphson n1 = new Newtton_Raphson(1,"f(x)=x^4-2*x^3-12*x^2+16*x-40",0.01);
        //Secante s1=new Secante(1,0,1,"f(x)=exp(-x^2)-x");
        //PuntoFijo P1 = new PuntoFijo(1,0.001,"f(x)=3/(x-2)");
        //System.out.println( System.getProperties());
        //Bisection b = new Bisection(1,2,0.01,"f(x)=qwe");
    }
}
