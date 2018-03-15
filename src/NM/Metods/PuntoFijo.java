package NM.Metods;

import NM.Func.Func;

public class PuntoFijo {
    private double x0,ep,ea,fx0;
    private String xfunc;
    private Func f;
    private boolean root;
    private int interacion =1;

    public PuntoFijo(double x0, double ep, String xfunc) {
        this.x0 = x0; this.ep = ep;   this.xfunc = xfunc;
        f= new Func(xfunc);
        calculateRoot();
    }

    private double calculatefx0(){
        fx0 = f.evaluate(x0);
        return fx0;
    }

    private double Ea(){
        calculatefx0();
        System.out.println("x0 : "+x0);
        System.out.println("fx0: "+fx0);
        if(x0!=0){
            ea=Math.abs((x0-fx0)/x0)*100;
        }else{
            ea=10.00;
        }
        if(ea<ep){
            root=true;
        }else{
            root=false;
            x0=fx0;
        }
        System.out.println("Ea: " +ea);
        return ea;
    }

    private void calculateRoot(){
        do{
            Ea();
        }while(root!=true);
    }
}

