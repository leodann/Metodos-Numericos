package NM.Metods;

import Database.Model.IteracionNewton;
import NM.Func.Func;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;

public class Newtton_Raphson {
    private double Xi,Xiadd1,ea,ep;
    private String xfunc;
    private boolean root;
    private int interation=1;
    private Func f;
    ObservableList<IteracionNewton> ListN = FXCollections.observableArrayList();

    public Newtton_Raphson(double Xi,String xfunc,double ep){
        this.Xi=Xi; this.xfunc=xfunc;   this.ep=ep;
        f= new Func(xfunc);
        calcculateRoot();
    }

    private double fxi(){
        double fXi= f.evaluate(Xi);
        return fXi;
    }
    private double Fxi(){
        double FXi = f.derivative(Xi);
        return FXi;
    }

    private double calculateXiadd1(){
        Xiadd1 = Xi-(fxi()/Fxi());
        return  Xiadd1;
    }

    private double calculateEa(){
        if(Xi!=0){
            ea=Math.abs((Xi-Xiadd1)/Xi)*100;
        }else{ ea=10.0;}
        if(ea<ep){
            root=true;
        }else{
            root=false;
            Xi=Xiadd1;
        }
        return ea;
    }

    private void calcculateRoot(){
        do {

            IteracionNewton ItN = new IteracionNewton(interation,Xi,fxi(),Fxi(),calculateXiadd1(),calculateEa());
            ListN.add(ItN);
            System.out.println(ListN.get(interation-1).toString());
            //calculateEa();

            interation++;
        }while(root!=true);
        System.out.println("");
        System.out.println("Resultado: " + Xiadd1);
    }

    public ObservableList<IteracionNewton> getDataN(){
        return ListN;
    }
}
