package NM.Metods;

import Database.Model.IteracionBisec;
import NM.Func.Func;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;

public class ReglaFalsa {
    private double Resutlado,Xr2,Xr,a,b,ep,ea;
    private boolean root;
    private String xfunc;
    private Func f;
    private int interation = 1;

    ObservableList<IteracionBisec> listR = FXCollections.observableArrayList();

    public ReglaFalsa(double a, double b, double ep, String xfunc){
        this.a=a;   this.b=b;   this.ep=ep; this.xfunc=xfunc;
        Xr=0.0;
        f = new Func(xfunc);
        calculateRootR();

    }

    private double Rounding(double val){
        double Entero, RounRes;
        RounRes = val;
        Entero = Math.floor(RounRes);
        RounRes = (RounRes-Entero)*Math.pow(10,6);
        RounRes = Math.round(RounRes);
        RounRes = (RounRes/Math.pow(10,6))+Entero;
        return  RounRes;

    }

    private double calculateF(double ev){
        double f_ = f.evaluate(ev);
        double resultado = Rounding(f_);
        return resultado;
    }
   /* private double calcularFa(){
        double fa = f.evaluate(a);
        return fa;
    }

    private double calculateFb(){
        double fb = f.evaluate(b);
        return fb;
    }*/

    private double calculateEa(){
        //calculteXr();
        if(Xr!=0){
            ea = Rounding(Math.abs((Xr-Xr2)/Xr)*100);
        }else{
            ea=10.00;
        }
        if(ea<=ep){
            root=true;
        }else{
            root=false;
        }
        return ea;
    }

    private double calculteXr(){
        Xr2 =Xr;
        Xr=Rounding(b-(calculateF(b)*(a-b))/(calculateF(a)-(calculateF(b))));
        return Xr;
    }

    private void evaluationR(){
        //calculteXr();
        double f_a = calculateF(a); double f_Xr = calculateF(Xr);
        double conditions =Rounding(f_a*f_Xr);
        if(conditions<0){
            b=Xr;
            root=false;
        }

        if(conditions>0){
            a=Xr;
            root=false;
        }

        if(conditions<0){
            root=true;
        }

    }

    private void calculateRootR(){
        do{
            calculteXr();
            calculateEa();
            IteracionBisec itR = new IteracionBisec(interation,a,b,Rounding(f.evaluate(a)),Rounding(f.evaluate(b)),Xr,Rounding(f.evaluate(Xr)),ea);
            evaluationR();
            calculateEa();
            listR.add(itR);
            System.out.println(listR.get(interation-1).toString());

            interation++;
        }while(root !=true);
        Resutlado = Xr;
        System.out.println();
        System.out.println(interation+"Resulatado es: "+ Resutlado);

    }

    public ObservableList<IteracionBisec> getData(){
        return listR;
    }
}
