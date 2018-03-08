package NM.Metods;
import NM.Func.Func;
import javafx.scene.control.TableView;

public class Bisection {
    private double resultado,a,b,Xr,Xr2,eP,eA;
    private boolean root;
    private String x;//cadena de f(x)
    private Func f;


    public Bisection(double a, double b,double eP, String x){
        this.a=a;   this.b=b;   this.eP=eP; this.x=x;
        Xr=0;
        f= new Func(x);
        calculateRoot();

    }
    private void calculateRoot(){
        int c;
        c=1;
        do{
            evaluations();
            calculateEA();
            System.out.println("\nerror aceptado:"+eA+"\nXr1:"+Xr+"\nXr2:"+Xr2);
            System.out.println("iteración # "+c);
            c++;
        }while(root!=true);
        resultado=Xr;
        System.out.println("el reultado es: "+ resultado);
        System.exit(0);
    }

    private double calulateXr(){ //paso 2 y 4
        Xr2=Xr;
        Xr=(a+b)/2;
        return Xr;
    }

    private double calculateEA(){ //paso 5
        calulateXr();
        if(Xr!=0) {
            eA = Math.abs((Xr - Xr2) / Xr) * 100;
        }else{
            eA = 10.00;
        }
        if(eA <= eP){
            root=true;
        }else{root=false;}
        return eA;
    }

    private void evaluations(){ //paso 3
        calulateXr();
        double condition = f.evaluate(a) *f.evaluate(Xr);
        if(condition<0){
            System.out.println("b:"+b+"\na:"+a+"\nXr:"+Xr+"\nf(a)*f(xr)<0"+condition);
            b=Xr;
            root=false;
            System.out.println("Nuevos valores:\nb:"+b+"\na:"+a);
        }
        if(condition>0){
            System.out.println("b:"+b+"\na:"+a+"\nXr:"+Xr+"\nf(a)*f(xr)>0 res:"+condition);
            a=Xr;
            root=false;
            System.out.println("Nuevos valores:\nb:"+b+"\na:"+a);

        }
        if(condition==0){
            System.out.println("b:"+b+"\na:"+a+"\nXr:"+Xr+"\nf(a)*f(xr)=0"+condition);
            root=true;
            System.out.println("Nuevos valores:\nb:"+b+"\na:"+a);

        }
    }






}
