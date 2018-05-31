/*package NM.Func;
import org.lsmp.djep.djep.DJep;
import org.nfunk.jep.JEP;
import org.nfunk.jep.Node;
import org.nfunk.jep.ParseException;


public class Funcion {
    private final JEP jep = new JEP();
    private final String funcion;
    private String derivada;
    private boolean validaFuncion;

    public Funcion(String funcion)
    {
        jep.addVariable("x",0);
        jep.addVariable("y",0);
        this.funcion = funcion;
        jep.addStandardConstants();
        jep.addStandardFunctions();
        jep.addComplex();
        jep.setImplicitMul(true);
        jep.parseExpression(funcion);
        if(jep.hasError())
            validaFuncion = false;
    }

    public double evaluar(double x)
    {
        jep.addVariable("x", x);
        return jep.getValue();
    }

    public double evaluar(double x, double y){
        jep.addVariable("x",x);
        jep.addVariable("y",y);
        return jep.getValue();
    }

    public String derivar(String funcion){
        derivada = "";
        DJep derivar = new DJep();
        derivar.addStandardFunctions();
        derivar.addStandardConstants();
        derivar.addComplex();
        derivar.setAllowUndeclared(true);
        derivar.setAllowAssignment(true);
        derivar.setImplicitMul(true);
        derivar.addStandardDiffRules();

        try{
            Node node = derivar.parse(funcion);
            Node diff = derivar.differentiate(node,"x");
            Node simplificar = derivar.simplify(diff);
            derivada = derivar.toString(simplificar);
        }catch(ParseException e){
        }

        return derivada;
    }


    public String getFuncion(){ return funcion; }
    public String getDerivada(){ return derivada; }
    public boolean getValidaFuncion() { return validaFuncion; }
}*/
