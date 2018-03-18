package NM.Metods;

import Database.Model.IteracionBisec;
import NM.Func.Func;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;

import java.util.ArrayList;

public class Bisection {
    private double resultado,a,b,Xr,Xr2,eP,eA;
    private boolean root;
    private String x;//cadena de f(x)
    private Func f;
    private int c = 1;

    ObservableList<IteracionBisec> list = FXCollections.observableArrayList();

    public Bisection(double a, double b,double eP, String x){
        this.a=a;   this.b=b;   this.eP=eP; this.x=x;
        Xr=0.0;
        f= new Func(x);
        calculateRoot();

    }
    private void calculateRoot(){
        do{
            calulateXr();
            calculateEA();
            IteracionBisec it1 = new IteracionBisec(c,a,b, _f(a),_f(b),Xr, _f(Xr), eA);
            evaluations();
            calculateEA();
            list.add(it1);
            System.out.println(list.get(c-1).toString());
            c++;
        }while(root!=true);
        resultado=Xr;
        System.out.println("el reultado es: "+ resultado);
    }

    private double _f(double ev){
        double res = f.evaluate(ev);
        res = rounding(res);
        System.out.println("rounding: " +res);
        return res;
    }

    private double calulateXr(){ //paso 2 y 4
        Xr2=Xr;
        Xr=rounding((a+b)/2);
        return Xr;
    }

    private double calculateEA(){ //paso 5
        //calulateXr();
        if(Xr!=0) {
        eA = rounding(Math.abs((Xr - Xr2) / Xr) * 100);
    }else{
        eA = 10.00;
    }
        if(eA <= eP){
        root=true;
    }else{root=false;}
        return eA;
}

    private void evaluations(){ //paso 3
        //calulateXr();
        double f_A = _f(a);   double f_Xr = _f(Xr);
        double condition = rounding(f_A*f_Xr);
        if(condition<0){

            b=Xr;
            root=false;

        }
        if(condition>0){

            a=Xr;
            root=false;


        }
        if(condition==0){

            root=true;


        }
    }

    public double rounding(double StartValue){
        double Entero,Roundres;
        Roundres = StartValue;
        Entero = Math.floor(Roundres);
        Roundres = (Roundres-Entero)*Math.pow(10,6);
        Roundres = Math.round(Roundres);
        Roundres = (Roundres/Math.pow(10,6))+Entero;
        return Roundres;
    }

    public ObservableList<IteracionBisec> getData() {
        return list;
    }

}
