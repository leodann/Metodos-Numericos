/*package NM.Metods;

import NM.Func.Func;

import java.util.ArrayList;

public class NewtonRaphsonMultivariable {

    private Func funcion;
    private Func funcionB;
    private Func derivadaParcialOneX;
    private Func derivadaParcialOneY;
    private Func derivadaParcialTwoX;
    private Func derivadaParcialTwoY;
    private ArrayList<Double> arrayX;
    private ArrayList<Double> arrayY;
    private ArrayList<Double> arrayF1;
    private ArrayList<Double> arrayF2;
    private ArrayList<Double> arrayF1_x;
    private ArrayList<Double> arrayF1_y;
    private ArrayList<Double> arrayF2_x;
    private ArrayList<Double> arrayF2_y;
    private ArrayList<Double> arrayDeltaX;
    private ArrayList<Double> arrayDeltaY;
    private ArrayList<Double> arrayErrorX;
    private ArrayList<Double> arrayErrorY;
    private int iteraciones;
    private double x;
    private double y;
    private double error;

    public NewtonRaphsonMultivariable(Func funcion,Func funcionB,
                                      Func derivadaParcialOneX,Func derivadaParcialOneY,
                                      Func derivadaParcialTwoX,Func derivadaParcialTwoY,
                                      double x, double y, double error){
        this.funcion = funcion;
        this.funcionB = funcionB;
        this.derivadaParcialOneX = derivadaParcialOneX;
        this.derivadaParcialOneY = derivadaParcialOneY;
        this.derivadaParcialTwoX = derivadaParcialTwoX;
        this.derivadaParcialTwoY = derivadaParcialTwoY;
        this.x = x;
        this.y = y;
        this.error = error;
        arrayX = new ArrayList<>();
        arrayY = new ArrayList<>();
        arrayF1 = new ArrayList<>();
        arrayF2 = new ArrayList<>();
        arrayF1_x = new ArrayList<>();
        arrayF1_y = new ArrayList<>();
        arrayF2_x = new ArrayList<>();
        arrayF2_y = new ArrayList<>();
        arrayDeltaX = new ArrayList<>();
        arrayDeltaY = new ArrayList<>();
        arrayErrorX = new ArrayList<>();
        arrayErrorY = new ArrayList<>();
        iteraciones = 0;
    }

    public void realizarMetodo(){
        double errorTempX;
        double errorTempY;
        double xTemp;
        double yTemp;
        double funcionTemp;
        double funcion2Temp;
        double parcial_funcionA_x;
        double parcial_funcionA_y;
        double parcial_funcionB_x;
        double parcial_funcionB_y;
        double deltaX;
        double deltaY;

        do{
            arrayX.add(x);
            arrayY.add(y);
            xTemp = x;
            yTemp = y;
            funcionTemp = funcion.evaluar(x,y);
            funcion2Temp = funcionB.evaluar(x,y);
            parcial_funcionA_x = derivadaParcialOneX.evaluar(x,y);
            parcial_funcionA_y = derivadaParcialOneY.evaluar(x,y);
            parcial_funcionB_x = derivadaParcialTwoX.evaluar(x,y);
            parcial_funcionB_y = derivadaParcialTwoY.evaluar(x,y);
            deltaX = ((-funcionTemp*parcial_funcionB_y)+(funcion2Temp*parcial_funcionA_y)) / ((parcial_funcionA_x*parcial_funcionB_y)-(parcial_funcionB_x*parcial_funcionB_y));
            deltaY = ((-funcion2Temp*parcial_funcionA_x)+(funcionTemp*parcial_funcionB_x)) / ((parcial_funcionA_x*parcial_funcionB_y)-(parcial_funcionB_x*parcial_funcionB_y));
            x = deltaX + xTemp;
            y = deltaY + yTemp;arrayF1.add(funcionTemp);
            errorTempX = getAbsoluto(((x-xTemp)/x)*100);
            errorTempY = getAbsoluto(((y-yTemp)/y)*100);
            arrayF2.add(funcion2Temp);
            arrayF1_x.add(parcial_funcionA_x);
            arrayF1_y.add(parcial_funcionA_y);
            arrayF2_x.add(parcial_funcionB_x);
            arrayF2_y.add(parcial_funcionB_y);
            arrayDeltaX.add(deltaX);
            arrayDeltaY.add(deltaY);
            arrayErrorX.add(errorTempX);
            arrayErrorY.add(errorTempY);
            iteraciones++;
        }while((!(errorTempX<=error)) && (!(errorTempY<=error)));
    }

    private double getAbsoluto(double numero){ return numero > 0 ? numero : -numero; }

    public ArrayList<Double> getArrayX() {
        return arrayX;
    }
    public ArrayList<Double> getArrayY() {
        return arrayY;
    }
    public ArrayList<Double> getArrayF1() {
        return arrayF1;
    }
    public ArrayList<Double> getArrayF2() {
        return arrayF2;
    }
    public ArrayList<Double> getArrayF1_x() {
        return arrayF1_x;
    }
    public ArrayList<Double> getArrayF1_y() {
        return arrayF1_y;
    }
    public ArrayList<Double> getArrayF2_x() {
        return arrayF2_x;
    }
    public ArrayList<Double> getArrayF2_y() {
        return arrayF2_y;
    }
    public ArrayList<Double> getArrayDeltaX() {
        return arrayDeltaX;
    }
    public ArrayList<Double> getArrayDeltaY() {
        return arrayDeltaY;
    }
    public ArrayList<Double> getArrayErrorX() {
        return arrayErrorX;
    }
    public ArrayList<Double> getArrayErrorY() {
        return arrayErrorY;
    }
    public int getIteraciones() {
        return iteraciones;
    }

}*/
