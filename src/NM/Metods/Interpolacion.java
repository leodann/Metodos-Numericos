package NM.Metods;

import NM.Func.Func;

public class Interpolacion {
    private double x,x1,x0,f1,f0,fx,error,realfx;
    private String f;
    private Func func;

    public Interpolacion(String f,double x,double x0,double x1){
        this.f  = f;
        this.x  = x;
        this.x1 = x1;
        this.x0 = x0;
        func = new Func(f);
        calcularFx();
        calcularError();
        System.out.println("calcular el valor de f("+x+").\nf(x) = "+ f+"cuadno x = "+x );
        System.out.println("a) Interpolacion entre "+x0+" y "+x1);
        System.out.println("x0 = " +x0+"    f(x0) = "+f0);
        System.out.println("x1 = " +x1+"    f(x1) = "+f1);
        System.out.println("valor real de f("+x+")="+ realfx);
        System.out.println("valor calculado f("+x+") = "+fx);
        System.out.println("Error = "+error);


    }
    private double calcularFx(){
        f0 = rounding(func.evaluate(x0));
        f1 = rounding(func.evaluate(x1));
        fx = f0+((f1-f0)/(x1-x0))*(x-x0);
        fx = rounding(fx);
        return fx;

    }

    private double calcularError(){
        realfx = rounding(func.evaluate(x));
        error = Math.abs((realfx -fx)/realfx)*100;
        error = rounding(error);
        return error;
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
