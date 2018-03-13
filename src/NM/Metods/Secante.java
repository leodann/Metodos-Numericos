package NM.Metods;

import NM.Func.Func;

public class Secante {
    private double Xi,Ximinus1,Xiadd1,ea,ep;
    private String xfunc;
    private Func f;
    private boolean root;
    private int interacion=1;

    public Secante(double Xi,double Ximinus1,double ep,String xfunc){
        this.Xi=Xi; this.Ximinus1=Ximinus1; this.ep=ep; this.xfunc=xfunc;
        f = new Func(xfunc);
        calculateRoot();

    }

    private double calculateXiadd1(){
        Xiadd1 = Xi-((f.evaluate(Xi)*(Ximinus1-Xi))/(f.evaluate(Ximinus1)-f.evaluate(Xi)));
        return Xiadd1;
    }

    private double calculateEa(){
        if(Xi!=0){
            ea=Math.abs((Xi-Xiadd1)/Xi)*100;
        }else{ea=10.0;}
        if(ea<ep){
            root=true;
        }else{
            root=false;
            Ximinus1=Xi;
            Xi=Xiadd1;
        }
        return ea;
    }

    private void calculateRoot(){
        do{
            System.out.println("///////////////////////////////");
            System.out.println("Nuemero de interación: " +interacion);
            System.out.println("Xi-1 : "+Ximinus1);
            System.out.println("Xi   : "+Xi);
            System.out.println("Xi+i : "+calculateXiadd1());
            System.out.println("ea   : "+calculateEa());
            interacion++;
        }while(root!=true);
        System.out.println("  ");
        System.out.println("resultado: "+Xiadd1);
        System.exit(0);
    }
}
