package Database.Model.Dao;

public class IteracionPuntoF {
    private double Xi,Xr,eP;
    private int iteracion;

    public IteracionPuntoF(int iteracion, double Xi, double Xr, double eP){
        this.iteracion = iteracion;
        this.Xi = Xi;
        this.Xr = Xr;
        this.eP = eP;
    }

    @Override
    public String toString(){
        String print = new String("iteración: " +iteracion+"\nXi: " +Xi+ "\nXr: " +Xr+"\nerror: " + eP);
        return print;
    }

    public double getXi() {
        return Xi;
    }

    public double getXr() {
        return Xr;
    }

    public double geteP() {
        return eP;
    }

    public int getIteracion() {
        return iteracion;
    }
}
