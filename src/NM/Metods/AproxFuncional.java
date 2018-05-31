package NM.Metods;

public class AproxFuncional {
    int numdatos;
    double[] x, y, xy, xcuadrada, srarr, starr;
    double a1, a0, totalx, totaly, totalxy, totalxcuad, st, sr, r, ymedia, xmedia;

    public AproxFuncional(int numdatos, double[] x, double[] y) {
        this.numdatos = numdatos;
        this.x = x;
        this.y = y;
        xy = new double[numdatos];
        starr = new double[numdatos];
        srarr = new double[numdatos];
        xcuadrada = new double[numdatos];
        llenarxcuad();
        llenarxy();
        sumatoriax();
        sumatoriay();
        sumatoriaxcuad();
        sumatoriaxy();
        ymedia();
        xmedia();
        calculatea1();
        calculatea0();
        llenarsrarr();
        llenarstarr();
        sumatoriasr();
        sumatoriast();
        calculater();



        System.out.println("St es igual a: " + st);
        System.out.println("Sr es igual a: " + sr);
        System.out.println("R es igual a: " + r);
    }

    public double[] llenarxcuad() {
        for (int i=0; i < x.length; i++) {
            xcuadrada[i] = Math.pow(x[i],2);
        }
        return xcuadrada;
    }

    public double[] llenarxy() {
        for (int i = 0; i < x.length; i++) {
            xy[i] = x[i] * y[i];
        }
        return xy;
    }

    public double sumatoriax() {
        for (int i = 0; i < x.length; i++) {
            totalx = totalx + x[i];
        }
        return totalx;
    }

    public double sumatoriay() {
        for (int i = 0; i < x.length; i++) {
            totaly = totaly + y[i];
        }
        return totaly;
    }

    public double sumatoriaxy() {
        for (int i = 0; i <x.length; i++) {
            totalxy = totalxy + xy[i];
        }
        return totalxy;
    }

    public double sumatoriaxcuad() {
        for (int i = 0; i < x.length; i++) {
            totalxcuad = totalxcuad + xcuadrada[i];
        }
        return totalxcuad;
    }

    public double calculatea1()
    {
        a1 = (((numdatos*totalxy) - (totalx*totaly)) / ((numdatos * totalxcuad) - (totalx*totalx)));
        return a1;
    }

    public double calculatea0()
    {
        a0 = ymedia - (a1 * xmedia);
        return a0;
    }

    public double ymedia (){
        double aux = 0;
        for(int i =0; i <y.length; i++){
            aux = aux + y[i];
        }
        ymedia = aux / y.length;
        return ymedia;
    }

    public double xmedia (){
        double aux = 0;
        for(int i =0; i <x.length; i++){
            aux = aux + x[i];
        }
        xmedia = aux / x.length;
        return xmedia;
    }

    public double[] llenarstarr ()
    {
        for(int i=0 ; i<y.length ; i++)
        {
            starr[i] = (y[i] - ymedia) * (y[i] - ymedia);
        }
        return starr;
    }

    public double[] llenarsrarr ()
    {
        for(int i=0 ; i<y.length ; i++)
        {
            srarr[i] = (y[i] - a0 - (a1*x[i])) * (y[i] - a0 - (a1*x[i])) ;
        }
        return srarr;
    }

    public double sumatoriast() {
        for (int i = 0; i < x.length; i++) {
            st = st + starr[i];
        }
        return st;
    }

    public double sumatoriasr() {
        for (int i = 0; i < x.length; i++) {
            sr = sr + srarr[i];
        }
        return sr;
    }

    public double calculater ()
    {
        r = Math.sqrt(((st-sr)/st));
        return r;
    }

    public int getNumdatos() {
        return numdatos;
    }

    public double[] getX() {
        return x;
    }

    public double[] getY() {
        return y;
    }

    public double[] getXy() {
        return xy;
    }

    public double[] getXcuadrada() {
        return xcuadrada;
    }

    public double[] getSrarr() {
        return srarr;
    }

    public double[] getStarr() {
        return starr;
    }

    public double getA1() {
        return a1;
    }

    public double getA0() {
        return a0;
    }

    public double getTotalx() {
        return totalx;
    }

    public double getTotaly() {
        return totaly;
    }

    public double getTotalxy() {
        return totalxy;
    }

    public double getTotalxcuad() {
        return totalxcuad;
    }

    public double getSt() {
        return st;
    }

    public double getSr() {
        return sr;
    }

    public double getR() {
        return r;
    }

    public double getYmedia() {
        return ymedia;
    }

    public double getXmedia() {
        return xmedia;
    }
}
