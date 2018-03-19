package Database.Model;

public class IteracionNewton {
    private double Xi, f_Xi,Fp_Xi,Xiadd1,eP;
    private int iteracion;

    public IteracionNewton(int iteracion, double Xi, double f_Xi, double Fp_Xi, double Xiadd1,double eP){
        this.iteracion = iteracion; this.Xi = Xi;   this.f_Xi = f_Xi;
        this.Fp_Xi = Fp_Xi;   this.Xiadd1 = Xiadd1;
        this.eP = eP;
    }

    @Override
    public String toString() {
        String print = new String("iteración: " +iteracion+"\nXi: " +Xi+"\nf(Xi): " +f_Xi+"\nf´(Xi): "+
                                    Fp_Xi+"\nXi+1: " +Xiadd1+"\nerror: " +eP);
        return print;
    }

    public double getXi() {
        return Xi;
    }

    public double getF_Xi() {
        return f_Xi;
    }

    public double getXiadd1() {
        return Xiadd1;
    }

    public double geteP() {
        return eP;
    }

    public int getIteracion() {
        return iteracion;
    }

    public double getFp_Xi() {
        return Fp_Xi;
    }
}
