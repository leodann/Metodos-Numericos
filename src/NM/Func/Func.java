package NM.Func;

import org.mariuszgromada.math.mxparser.*;

public class Func {
    private String expresion;
    private Function f;

    public Func(String expresion){
        this.expresion = expresion;
        buildFunction();
    }

    private void buildFunction(){
        f = new Function(expresion);
    }

    public String evaluate(double a){
        String resultado = ("Resultado: f("+a+")= " + f.calculate(a) );

        return resultado;
    }

    public String getExpresion() {
        return expresion;
    }

    public void setExpresion(String expresion) {
        this.expresion = expresion;
    }
}
