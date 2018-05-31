package NM.Metods;

import java.util.ArrayList;

public class RegresionPolinomial {
    private double sumaX;
    private double sumaY;
    private double sumaXE2;
    private double sumaXE3;
    private double sumaXE4;
    private double sumaXY;
    private double sumaXE2Y;
    private double sumaSt;
    private double sumaSr;
    private ArrayList<Double> arrayListX;
    private ArrayList<Double> arrayListY;
    private ArrayList<Double> arrayXE2;
    private ArrayList<Double> arrayXE3;
    private ArrayList<Double> arrayXE4;
    private ArrayList<Double> arrayXY;
    private ArrayList<Double> arrayXE2Y;
    private ArrayList<Double> arraySt;
    private ArrayList<Double> arraySr;
    private double[] xTempA,yTempA,xE2A,xE3A,xE4A,xyA,xe2YA,stA,srA;
    private double mediaY,a0,a1,a2;

    public RegresionPolinomial(double[] arrayX, double[] arrayY)
    {
        xTempA = arrayX;
        yTempA = arrayY;
        arrayListX = new ArrayList<>();
        arrayListY = new ArrayList<>();
        arrayXE2 = new ArrayList<>();
        arrayXE3 = new ArrayList<>();
        arrayXE4 = new ArrayList<>();
        arrayXY = new ArrayList<>();
        arrayXE2Y = new ArrayList<>();
        arraySt = new ArrayList<>();
        arraySr = new ArrayList<>();
        arreglarTabla(arrayX,arrayY);
        st();
        sr();
    }
    private void arreglarTabla(double[] arrayX,double[] arrayY){
        for (int i=0 ; i<arrayX.length ; i++){
            xE2A[i] = arrayX[i] * arrayX[i];
            xE3A[i] = arrayX[i] * arrayX[i] * arrayX[i];
            xE4A[i] = arrayX[i] * arrayX[i] * arrayX[i] * arrayX[i];
            xyA[i] = arrayX[i] * arrayY[i];
            xe2YA[i] = xE2A[i] * arrayY[i];
            sumaX = sumaX + arrayX[i];
            sumaY = sumaY + arrayY[i];
            sumaXE2 = sumaXE2 + xE2A[i];
            sumaXE3 = sumaXE3 + xE3A[i];
            sumaXE4 = sumaXE4 + xE4A[i];
            sumaXY = sumaXY + xyA[i];
            sumaXE2Y = sumaXE2Y + xe2YA[i];
            arrayListX.add(arrayX[i]);
            arrayListY.add(arrayY[i]);
            arrayXE2.add(xE2A[i]);
            arrayXE3.add(xE3A[i]);
            arrayXE4.add(xE4A[i]);
            arrayXY.add(xyA[i]);
            arrayXE2Y.add(xe2YA[i]);
        }
    }
    private void st(){
        mediaY = sumaY / xTempA.length;
        for(int i=0 ; i<xTempA.length ; i++){
            stA[i] = (yTempA[i]  - mediaY) * (yTempA[i]  - mediaY);
            sumaSt = sumaSt + stA[i];
        }
    }
    private void sr(){
        FakeJacobo metodo = new FakeJacobo(xTempA.length,sumaX,sumaXE2,sumaY,
                sumaX,sumaXE2,sumaXE3,sumaXY,
                sumaXE2,sumaXE3,sumaXE4,sumaXE2Y);
        metodo.resolverSistemaA();
        a0 = metodo.getX1();
        a1 = metodo.getX2();
        a2 = metodo.getX3();
        for (int i=0 ; i<xTempA.length ; i++){
            srA[i] = (yTempA[i] - a0 - (a1*xTempA[i]) - (a2*xE2A[i])) * (yTempA[i] - a0 - (a1*xTempA[i]) - (a2*xE2A[i]));
            arraySr.add(srA[i]);
            sumaSr = sumaSr + srA[i];
        }
    }
}
