package Database.Model;

public class IteracionBisec
{
    int iteracion;
    double a, b, f_a,f_b,xr,f_xr,err;

    public IteracionBisec(int iteracion, double a, double b, double f_a, double f_b, double xr, double f_xr, double err) {
        this.iteracion = iteracion;
        this.a = a;
        this.b = b;
        this.f_a = f_a;
        this.f_b = f_b;
        this.xr = xr;
        this.f_xr = f_xr;
        this.err = err;
    }

    public int getIteracion() {
        return iteracion;
    }

    public void setIteracion(int iteracion) {
        this.iteracion = iteracion;
    }

    public double getA() {
        return a;
    }

    public void setA(double a) {
        this.a = a;
    }

    public double getB() {
        return b;
    }

    public void setB(double b) {
        this.b = b;
    }

    public double getF_a() {
        return f_a;
    }

    public void setF_a(double f_a) {
        this.f_a = f_a;
    }

    public double getF_b() {
        return f_b;
    }

    public void setF_b(double f_b) {
        this.f_b = f_b;
    }

    public double getXr() {
        return xr;
    }

    public void setXr(double xr) {
        this.xr = xr;
    }

    public double getF_xr() {
        return f_xr;
    }

    public void setF_xr(double f_xr) {
        this.f_xr = f_xr;
    }

    public double getErr() {
        return err;
    }

    public void setErr(double err) {
        this.err = err;
    }
}
