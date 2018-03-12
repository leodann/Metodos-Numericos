package NM.Metods;

import NM.Func.Func;

public class ReglaFalsa {
    private double Resutlado,Xr2,Xr,a,b,ep,ea;
    private boolean root;
    private String xfunc;
    private Func f;
    private int interation = 1;

    public ReglaFalsa(double a, double b, double ep, String xfunc){
        this.a=a;   this.b=b;   this.ep=ep; this.xfunc=xfunc;
        Xr=0;
        f = new Func(xfunc);
        calculateRootR();

    }
    private double calcularFa(){
        double fa = f.evaluate(a);
        return fa;
    }

    private double calculateFb(){
        double fb = f.evaluate(b);
        return fb;
    }

    private double calculateEa(){
        calculteXr();
        if(Xr!=0){
            ea = Math.abs((Xr-Xr2)/Xr)*100;
        }else{
            ea=10.00;
        }
        if(ea<ep){
            root=true;
        }else{
            root=false;
        }
        return ea;
    }

    private double calculteXr(){
        Xr2 =Xr;
        Xr=b-(calculateFb()*(a-b))/(calcularFa()-(calculateFb()));
        return Xr;
    }

    private void evaluationR(){
        calculteXr();
        double conditions =calcularFa()*f.evaluate(Xr);
        if(conditions<0){
            System.out.println("\na: " +a+"\nb: "+a+"\nXr: " +Xr+"\nf(a)*f(xr)<0 res:"+ conditions);
            b=Xr;
            root=false;
            System.out.println("Nuevos valores: \na: "+a+"\nb: "+b);

        }

        if(conditions>0){
            System.out.println("\na: " +a+"\nb: "+a+"\nXr: " +Xr+"\nf(a)*f(xr)>0 res:"+ conditions);
            a=Xr;
            root=false;
            System.out.println("Nuevos valores: \na: "+a+"\nb: "+b);
        }

        if(conditions<0){
            root=true;
        }

    }

    private void calculateRootR(){
        do{
          evaluationR();
          calculateEa();
          System.out.println("\ninteracción: " +interation+"\nError aceptado: " + ea+"\nXr1: " +Xr+"\nXr2: "+Xr2);
          interation++;
        }while(root !=true);
        Resutlado = Xr;
        System.out.println("Resulatado es: "+ Resutlado);

    }
}
