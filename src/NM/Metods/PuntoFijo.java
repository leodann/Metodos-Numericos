package NM.Metods;

import Database.Model.IteracionPuntoF;
import NM.Func.Func;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;

public class PuntoFijo {
    double Xi, eP, eA, Xr, Xr2, resultado;
    private String x;//cadena de f(x)
    private Func f;
    private boolean root;
    private double auxXi;
    ObservableList<IteracionPuntoF> List = FXCollections.observableArrayList();

    public PuntoFijo(double xi, double eP, String x) {
        Xi = xi;
        this.eP = eP;
        this.x = x;
        f = new Func(x);
        calculateRoot();
    }

    public void calculateRoot()
    {
        int c;
        c=1;
        do {
            calculateXr();
            calculateEA();
            IteracionPuntoF itF = new IteracionPuntoF(c,auxXi,Xr,eA);
            List.add(itF);
            System.out.println(List.get(c-1).toString());
            //System.out.println("iteracion: "+c+"\nXi: " +auxXi+"\nX1: " +Xr + "\nEp: " +eA);
            calculateEA();
            /*System.out.println("\nerror aceptado:"+eA+"\nXr1:"+Xr+"\nXi:"+Xi);
            System.out.println("iteración # "+c);*/
            c++;
        }
        while(root!= true);
        resultado = Xr;
        System.out.println("resultado = " +resultado);
    }

    private double calculateXr() {
        auxXi = Xi;
        Xr2 = Xr;
        Xr = f.evaluate(Xi);
        return Xr;
    }

    private double calculateEA()
    {
        //calculateXr();
        if(Xr2!=0) {
            eA = Math.abs((Xr - Xr2) / Xr) * 100;
        }else{
            eA = 1000.00;
        }
        if(eA <= eP){
            root=true;
        }else{
            root=false;
            Xi = Xr;

        }
        return eA;
    }

    public ObservableList<IteracionPuntoF> getData(){
        return List;
    }

}
