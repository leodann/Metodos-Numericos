package NM.Func;

import org.mariuszgromada.math.mxparser.*;

public class Func {
    private String expresion;
    private Function f;
    private Argument argx,argy;

    public Func(String expresion){
        this.expresion = expresion;
        buildFunction();
    }

    private void buildFunction(){
        f = new Function(expresion);
    }

    public double  evaluate(double a){
        double resultado = (f.calculate(a) );
//"Resultado: f("+a+")= "
        return resultado;
    }

    public double derivative(double a){
        String arrgx ="x ="+ a +"";
        argx = new Argument(arrgx);
        Expression e = new Expression("der(f(x),x)",argx,f);
        double result =e.calculate();
        return  result;
    }

    private void validate(){
       double v = f.calculate(0);
       String v1 = String.valueOf(v);
       if(v1.equals("NaN")){
           System.out.println("Expresión incorrecta");
        }else{
           buildFunction();
       }

    }

    public String getExpresion() {
        return expresion;
    }

    public void setExpresion(String expresion) {
        this.expresion = expresion;
    }
}
