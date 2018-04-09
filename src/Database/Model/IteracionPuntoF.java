package Database.Model;

public class IteracionPuntoF {
    private double Xi,Xr,e;
    private int iteracion;

    public IteracionPuntoF(int iteracion, double Xi, double Xr, double e){
        this.iteracion = iteracion;
        this.Xi = Xi;
        this.Xr = Xr;
        this.e = e;
    }

    @Override
    public String toString(){
        String print = new String("iteración: " +iteracion+"\nXi: " +Xi+ "\nXr: " +Xr+"\nerror: " + e);
        return print;
    }

    public double getXi() {
        return Xi;
    }

    public double getXr() {
        return Xr;
    }

    public double getE() {
        return e;
    }

    public int getIteracion() {
        return iteracion;
    }
}
