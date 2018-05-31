package NM.Metods;

import NM.Func.Func;

public class InterpolaciónCuadratica {
    private double X_0,X_1,X_2,x,f_0,f_1,f_2,b0,b1,b2, res;
    private String f;
    private Func func;

    public InterpolaciónCuadratica(String f, double x, double X_0,double X_1, double X_2){
        this.x = x;
        this.X_0 = X_0; this.X_1 = X_1; this.X_2 = X_2;
        func = new Func(f);
        F();
    }

    private void CalculateF(){
        f_0 = func.evaluate(X_0);
        f_0 = rounding(f_0);
        f_1 = func.evaluate(X_1);
        f_1 = rounding(f_1);
        f_2 = func.evaluate(X_2);
        f_2 = rounding(f_2);
    }

    private void CalculateB(){
        b0 = f_0;
        b0 = rounding(b0);
        b1 = (f_1 - f_0)/(X_1 - X_0);
        b1 = rounding(b1);
        b2 = (((f_2-f_1)/(X_2-X_1))-((f_1-f_0)/(X_1-X_0)))/(X_2-X_0);
        b2 = rounding(b2);
    }

    private void F(){
        CalculateF();
        CalculateB();
        res = b0 + (b1*(x-X_0))+b2*((x-X_0)*(x-X_1));
        res = rounding(res);
        System.out.println(res);
        System.out.println(b2);
        System.out.println(b1);
        System.out.println(b0);
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
}
