package NM.Metods;

public class InterpolLagrange {
    int n,i;
    double x, y;//"y" guarda el resultado al correr el metodo RunMethod
    double a[][] = new double [4][2];
    double b[][] = new double[4][2];

    public  InterpolLagrange(double x0,double fx0,double x1,double fx1, double val)//constructor dos puntos y valor a interpolar
    {
        this.n = 2;
        this.x = val;
        this.b[0][0]=x0;
        this.b[1][0]=x1;
        this.b[0][1]=fx0;
        this.b[1][1]=fx1;
        InitA();
        RunMethod();
    }

    //constructor tres puntos y valor a interpolar
    public  InterpolLagrange(double x0,double fx0,double x1,double fx1, double x2,double fx2, double val)
    {
        this.n = 3;
        this.x = val;
        this.b[0][0]=x0;
        this.b[1][0]=x1;
        this.b[2][0]=x2;
        this.b[0][1]=fx0;
        this.b[1][1]=fx1;
        this.b[2][1]=fx2;
        InitA();
        RunMethod();
    }

    //constructor cuatro puntos y valor a interpolar
    public  InterpolLagrange(double x0,double fx0,double x1,double fx1, double x2,double fx2,double x3,double fx3, double val)
    {
        this.n = 4;
        this.x = val;
        this.b[0][0]=x0;
        this.b[1][0]=x1;
        this.b[2][0]=x2;
        this.b[3][0]=x3;
        this.b[0][1]=fx0;
        this.b[1][1]=fx1;
        this.b[2][1]=fx2;
        this.b[3][1]=fx3;
        InitA();
        RunMethod();
    }

    public void InitA()
    {
        for(i=0;i<n;i++){
            a[i][0]=b[i][0];
            a[i][1]=b[i][1];
        }
    }

    public void RunMethod(){

        switch(n){
            case 2:
                this.y=(((((x-a[1][0])*a[0][1])/(a[0][0]-a[1][0]))+(((x-a[0][0])*a[1][1])/(a[1][0]-a[0][0]))));
                System.out.println("f(x) en ese punto es: "+y);
                break;
            case 3:
                this.y=((x-a[1][0])*(x-a[2][0])*a[0][1])/((a[0][0]-a[1][0])*(a[0][0]-a[2][0]))+((x-a[0][0])*(x-a[2][0])*a[1][1])/((a[1][0]-a[0][0])*(a[1][0]-a[2][0]))+((x-a[1][0])*((x-a[0][0])*a[2][1])/((a[2][0]-a[0][0])*(a[2][0]-a[1][0])));
                System.out.println("f(x) en ese punto es: "+y);
                break;
            case 4:
                this.y=((x-a[1][0])*(x-a[3][0])*(x-a[2][0])*a[0][1])/((a[0][0]-a[1][0])*(a[0][0]-a[2][0])*(a[0][0]-a[3][0]))+((x-a[0][0])*(x-a[2][0])*(x-a[3][0])*a[1][1])/((a[1][0]-a[0][0])*(a[1][0]-a[2][0])*(a[1][0]-a[3][0]))+((x-a[0][0])*(x-a[1][0])*((x-a[3][0])*a[2][1])/((a[2][0]-a[0][0])*(a[2][0]-a[1][0])*(a[2][0]-a[3][0]))+((x-a[0][0])*(x-a[1][0])*((x-a[2][0])*a[
                        3][1])/((a[3][0]-a[0][0])*(a[3][0]-a[1][0])*(a[3][0]-a[2][0]))));
                System.out.println("f(x) en ese punto es: "+y);
                break;
            default:
                System.out.println("INVALIDO");
                break;
        }
    }

    public double getY() {
        return rounding(y);
    }

    public double rounding(double StartValue){
        double Entero,Roundres;
        Roundres = StartValue;
        Entero = Math.floor(Roundres);
        Roundres = (Roundres-Entero)*Math.pow(10,6);
        Roundres = Math.round(Roundres);
        Roundres = (Roundres/Math.pow(10,6))+Entero;
        return Roundres;
    }
}
