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

    public String getExpresion() {
        return expresion;
    }

    public void setExpresion(String expresion) {
        this.expresion = expresion;
    }
}
