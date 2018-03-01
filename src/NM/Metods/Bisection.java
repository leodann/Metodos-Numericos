package NM.Metods;
import NM.Func.Func;

public class Bisection {
    private double a,b,Xr,Xr2,eP,eA;
    private String x;//cadena de f(x)
    private Func f;

    public Bisection(double a, double b,double eP, String x){
        this.a=a;   this.b=b;   this.eP=eP; this.x=x;
        f= new Func(x);
    }

    private double calulateXr(){
        Xr=(a+b)/2;
        return Xr;
    }

    private double calculateEA(){
        eA= Math.abs((Xr-Xr2)/Xr);
        return eA;
    }

    public void evaluations(){

    }






}
