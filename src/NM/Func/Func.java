package NM.Func;

import org.mariuszgromada.math.mxparser.*;

public class Func {
    private String expresion;
    private Function f;
    private Argument arx,ary;

    public Func(String expresion){
        this.expresion = expresion;
        buildFunction();
    }

    private void buildFunction(){
        f = new Function(expresion);
    }

    public double evaluate(double a){
        double resultado = (f.calculate(a) );
//"Resultado: f("+a+")= "
        return resultado;
    }

    public double derivative(double a){
        String arrgx ="x ="+ a +"";
        arx = new Argument(arrgx);
        Expression e = new Expression("der(f(x),x)",arx,f);
        double result =e.calculate();
        return  result;
    }
    public void plots(){
        int plot=10+1;
        double[] x= new double[plot];
        for (int i=0; i<x.length;i++){
            double xval =i-5.0;
            x[i]=xval;
        }
        double[] y= new double[plot];
        for (int j=0; j<y.length; j++){
            double yval = evaluate(x[j]);
            y[j]= yval;

            System.out.println("x: " +x[j]+"\ty: " +y[j]);
        }


    }
    public String getExpresion() {
        return expresion;
    }

    public void setExpresion(String expresion) {
        this.expresion = expresion;
    }
}
