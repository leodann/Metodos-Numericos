package Database.Model;

public class IteracionSecante {
    private int iteracion;
    private double Ximinus1, Xi, f_Xi, f_Ximinus1, Xiadd1, e;

    public IteracionSecante(int iteracion, double Ximinus1, double Xi, double f_Xi
                            ,double f_Ximinus1, double xiadd1, double e){
        this.iteracion = iteracion;     this.Ximinus1 = Ximinus1;
        this.Xi = Xi; this.f_Xi = f_Xi; this.f_Ximinus1 = f_Ximinus1;
        this.Xiadd1 = xiadd1; this.e = e;
    }

    @Override
    public String toString(){
        String printS = new String("iteración: " +iteracion +"\nXi-1: " +Ximinus1+"\nXi: "+Xi+
                                    "\nf(Xi): " +f_Xi+ "\nf(Xi-1): "+ f_Ximinus1+
                                    "\nXi+1:"+ Xiadd1+"\nep: " +e);
        return printS;
    }

    public int getIteracion() {
        return iteracion;
    }

    public double getXiminus1() {
        return Ximinus1;
    }

    public double getXi() {
        return Xi;
    }

    public double getF_Xi() {
        return f_Xi;
    }

    public double getF_Ximinus1() {
        return f_Ximinus1;
    }

    public double getXiadd1() {
        return Xiadd1;
    }

    public double getE() {
        return e;
    }
}
