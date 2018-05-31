package NM.Metods;

import java.util.ArrayList;

public class FakeJacobo {

    private ArrayList<Double> arrayA,arrayB,arrayC,arrayD,arrayE,arrayF,arrayG,arrayH,arrayI,arrayJ,
            arrayAA,arrayBB,arrayCC,arrayDD,arrayEE,arrayFF,arrayGG,arrayHH,arrayII,arrayJJ,
            arrayAError,arrayBError,arrayCError,arrayDError,arrayEError,arrayFError,arrayGError,arrayHError,arrayIError,arrayJError;
    private double error;
    private double x1,x2,x3,x4,x5,x6,x7,x8,x9,x10,error1,error2,error3,error4,error5,error6,error7,error8,error9,error10;
    private double a1,b1,c1,d1,e1,f1,g1,h1,i1,j1,res1,
            a2,b2,c2,d2,e2,f2,g2,h2,i2,j2,res2,
            a3,b3,c3,d3,e3,f3,g3,h3,i3,j3,res3,
            a4,b4,c4,d4,e4,f4,g4,h4,i4,j4,res4,
            a5,b5,c5,d5,e5,f5,g5,h5,i5,j5,res5,
            a6,b6,c6,d6,e6,f6,g6,h6,i6,j6,res6,
            a7,b7,c7,d7,e7,f7,g7,h7,i7,j7,res7,
            a8,b8,c8,d8,e8,f8,g8,h8,i8,j8,res8,
            a9,b9,c9,d9,e9,f9,g9,h9,i9,j9,res9,
            a10,b10,c10,d10,e10,f10,g10,h10,i10,j10,res10;
    private int iteraciones = 0;
    //3x3
    public FakeJacobo(double a1, double b1, double c1, double res1,
                      double a2, double b2, double c2, double res2,
                      double a3, double b3, double c3, double res3) {
        this.a1 = a1;
        this.b1 = b1;
        this.c1 = c1;
        this.res1 = res1;
        this.a2 = a2;
        this.b2 = b2;
        this.c2 = c2;
        this.res2 = res2;
        this.a3 = a3;
        this.b3 = b3;
        this.c3 = c3;
        this.res3 = res3;
    }
    //4x4
    public FakeJacobo(double a1, double b1, double c1, double d1, double res1,
                        double a2, double b2, double c2, double d2, double res2,
                        double a3, double b3, double c3, double d3, double res3,
                        double a4, double b4, double c4, double d4, double res4) {
        this.a1 = a1;
        this.b1 = b1;
        this.c1 = c1;
        this.d1 = d1;
        this.res1 = res1;
        this.a2 = a2;
        this.b2 = b2;
        this.c2 = c2;
        this.d2 = d2;
        this.res2 = res2;
        this.a3 = a3;
        this.b3 = b3;
        this.c3 = c3;
        this.d3 = d3;
        this.res3 = res3;
        this.a4 = a4;
        this.b4 = b4;
        this.c4 = c4;
        this.d4 = d4;
        this.res4 = res4;
    }
    //5x5
    public FakeJacobo(double a1, double b1, double c1, double d1, double e1, double res1,
                        double a2, double b2, double c2, double d2, double e2, double res2,
                        double a3, double b3, double c3, double d3, double e3, double res3,
                        double a4, double b4, double c4, double d4, double e4, double res4,
                        double a5, double b5, double c5, double d5, double e5, double res5) {
        this.a1 = a1;
        this.b1 = b1;
        this.c1 = c1;
        this.d1 = d1;
        this.e1 = e1;
        this.res1 = res1;
        this.a2 = a2;
        this.b2 = b2;
        this.c2 = c2;
        this.d2 = d2;
        this.e2 = e2;
        this.res2 = res2;
        this.a3 = a3;
        this.b3 = b3;
        this.c3 = c3;
        this.d3 = d3;
        this.e3 = e3;
        this.res3 = res3;
        this.a4 = a4;
        this.b4 = b4;
        this.c4 = c4;
        this.d4 = d4;
        this.e4 = e4;
        this.res4 = res4;
        this.a5 = a5;
        this.b5 = b5;
        this.c5 = c5;
        this.d5 = d5;
        this.e5 = e5;
        this.res5 = res5;
    }
    //6x6
    public FakeJacobo(double a1, double b1, double c1, double d1, double e1, double f1, double res1,
                        double a2, double b2, double c2, double d2, double e2, double f2, double res2,
                        double a3, double b3, double c3, double d3, double e3, double f3, double res3,
                        double a4, double b4, double c4, double d4, double e4, double f4, double res4,
                        double a5, double b5, double c5, double d5, double e5, double f5, double res5,
                        double a6, double b6, double c6, double d6, double e6, double f6, double res6) {
        this.a1 = a1;
        this.b1 = b1;
        this.c1 = c1;
        this.d1 = d1;
        this.e1 = e1;
        this.f1 = f1;
        this.res1 = res1;
        this.a2 = a2;
        this.b2 = b2;
        this.c2 = c2;
        this.d2 = d2;
        this.e2 = e2;
        this.f2 = f2;
        this.res2 = res2;
        this.a3 = a3;
        this.b3 = b3;
        this.c3 = c3;
        this.d3 = d3;
        this.e3 = e3;
        this.f3 = f3;
        this.res3 = res3;
        this.a4 = a4;
        this.b4 = b4;
        this.c4 = c4;
        this.d4 = d4;
        this.e4 = e4;
        this.f4 = f4;
        this.res4 = res4;
        this.a5 = a5;
        this.b5 = b5;
        this.c5 = c5;
        this.d5 = d5;
        this.e5 = e5;
        this.f5 = f5;
        this.res5 = res5;
        this.a6 = a6;
        this.b6 = b6;
        this.c6 = c6;
        this.d6 = d6;
        this.e6 = e6;
        this.f6 = f6;
        this.res6 = res6;
    }
    //7x7
    public FakeJacobo(double a1, double b1, double c1, double d1, double e1, double f1, double g1, double res1,
                        double a2, double b2, double c2, double d2, double e2, double f2, double g2, double res2,
                        double a3, double b3, double c3, double d3, double e3, double f3, double g3, double res3,
                        double a4, double b4, double c4, double d4, double e4, double f4, double g4, double res4,
                        double a5, double b5, double c5, double d5, double e5, double f5, double g5, double res5,
                        double a6, double b6, double c6, double d6, double e6, double f6, double g6, double res6,
                        double a7, double b7, double c7, double d7, double e7, double f7, double g7, double res7) {
        this.a1 = a1;
        this.b1 = b1;
        this.c1 = c1;
        this.d1 = d1;
        this.e1 = e1;
        this.f1 = f1;
        this.g1 = g1;
        this.res1 = res1;
        this.a2 = a2;
        this.b2 = b2;
        this.c2 = c2;
        this.d2 = d2;
        this.e2 = e2;
        this.f2 = f2;
        this.g2 = g2;
        this.res2 = res2;
        this.a3 = a3;
        this.b3 = b3;
        this.c3 = c3;
        this.d3 = d3;
        this.e3 = e3;
        this.f3 = f3;
        this.g3 = g3;
        this.res3 = res3;
        this.a4 = a4;
        this.b4 = b4;
        this.c4 = c4;
        this.d4 = d4;
        this.e4 = e4;
        this.f4 = f4;
        this.g4 = g4;
        this.res4 = res4;
        this.a5 = a5;
        this.b5 = b5;
        this.c5 = c5;
        this.d5 = d5;
        this.e5 = e5;
        this.f5 = f5;
        this.g5 = g5;
        this.res5 = res5;
        this.a6 = a6;
        this.b6 = b6;
        this.c6 = c6;
        this.d6 = d6;
        this.e6 = e6;
        this.f6 = f6;
        this.g6 = g6;
        this.res6 = res6;
        this.a7 = a7;
        this.b7 = b7;
        this.c7 = c7;
        this.d7 = d7;
        this.e7 = e7;
        this.f7 = f7;
        this.g7 = g7;
        this.res7 = res7;
    }
    //8x8
    public FakeJacobo(double a1, double b1, double c1, double d1, double e1, double f1, double g1, double h1, double res1,
                        double a2, double b2, double c2, double d2, double e2, double f2, double g2, double h2, double res2,
                        double a3, double b3, double c3, double d3, double e3, double f3, double g3, double h3, double res3,
                        double a4, double b4, double c4, double d4, double e4, double f4, double g4, double h4, double res4,
                        double a5, double b5, double c5, double d5, double e5, double f5, double g5, double h5, double res5,
                        double a6, double b6, double c6, double d6, double e6, double f6, double g6, double h6, double res6,
                        double a7, double b7, double c7, double d7, double e7, double f7, double g7, double h7, double res7,
                        double a8, double b8, double c8, double d8, double e8, double f8, double g8, double h8, double res8) {
        this.a1 = a1;
        this.b1 = b1;
        this.c1 = c1;
        this.d1 = d1;
        this.e1 = e1;
        this.f1 = f1;
        this.g1 = g1;
        this.h1 = h1;
        this.res1 = res1;
        this.a2 = a2;
        this.b2 = b2;
        this.c2 = c2;
        this.d2 = d2;
        this.e2 = e2;
        this.f2 = f2;
        this.g2 = g2;
        this.h2 = h2;
        this.res2 = res2;
        this.a3 = a3;
        this.b3 = b3;
        this.c3 = c3;
        this.d3 = d3;
        this.e3 = e3;
        this.f3 = f3;
        this.g3 = g3;
        this.h3 = h3;
        this.res3 = res3;
        this.a4 = a4;
        this.b4 = b4;
        this.c4 = c4;
        this.d4 = d4;
        this.e4 = e4;
        this.f4 = f4;
        this.g4 = g4;
        this.h4 = h4;
        this.res4 = res4;
        this.a5 = a5;
        this.b5 = b5;
        this.c5 = c5;
        this.d5 = d5;
        this.e5 = e5;
        this.f5 = f5;
        this.g5 = g5;
        this.h5 = h5;
        this.res5 = res5;
        this.a6 = a6;
        this.b6 = b6;
        this.c6 = c6;
        this.d6 = d6;
        this.e6 = e6;
        this.f6 = f6;
        this.g6 = g6;
        this.h6 = h6;
        this.res6 = res6;
        this.a7 = a7;
        this.b7 = b7;
        this.c7 = c7;
        this.d7 = d7;
        this.e7 = e7;
        this.f7 = f7;
        this.g7 = g7;
        this.h7 = h7;
        this.res7 = res7;
        this.a8 = a8;
        this.b8 = b8;
        this.c8 = c8;
        this.d8 = d8;
        this.e8 = e8;
        this.f8 = f8;
        this.g8 = g8;
        this.h8 = h8;
        this.res8 = res8;
    }
    //9x9
    public FakeJacobo(double a1, double b1, double c1, double d1, double e1, double f1, double g1, double h1, double i1, double res1,
                        double a2, double b2, double c2, double d2, double e2, double f2, double g2, double h2, double i2, double res2,
                        double a3, double b3, double c3, double d3, double e3, double f3, double g3, double h3, double i3, double res3,
                        double a4, double b4, double c4, double d4, double e4, double f4, double g4, double h4, double i4, double res4,
                        double a5, double b5, double c5, double d5, double e5, double f5, double g5, double h5, double i5, double res5,
                        double a6, double b6, double c6, double d6, double e6, double f6, double g6, double h6, double i6, double res6,
                        double a7, double b7, double c7, double d7, double e7, double f7, double g7, double h7, double i7, double res7,
                        double a8, double b8, double c8, double d8, double e8, double f8, double g8, double h8, double i8, double res8,
                        double a9, double b9, double c9, double d9, double e9, double f9, double g9, double h9, double i9, double res9) {
        this.a1 = a1;
        this.b1 = b1;
        this.c1 = c1;
        this.d1 = d1;
        this.e1 = e1;
        this.f1 = f1;
        this.g1 = g1;
        this.h1 = h1;
        this.i1 = i1;
        this.res1 = res1;
        this.a2 = a2;
        this.b2 = b2;
        this.c2 = c2;
        this.d2 = d2;
        this.e2 = e2;
        this.f2 = f2;
        this.g2 = g2;
        this.h2 = h2;
        this.i2 = i2;
        this.res2 = res2;
        this.a3 = a3;
        this.b3 = b3;
        this.c3 = c3;
        this.d3 = d3;
        this.e3 = e3;
        this.f3 = f3;
        this.g3 = g3;
        this.h3 = h3;
        this.i3 = i3;
        this.res3 = res3;
        this.a4 = a4;
        this.b4 = b4;
        this.c4 = c4;
        this.d4 = d4;
        this.e4 = e4;
        this.f4 = f4;
        this.g4 = g4;
        this.h4 = h4;
        this.i4 = i4;
        this.res4 = res4;
        this.a5 = a5;
        this.b5 = b5;
        this.c5 = c5;
        this.d5 = d5;
        this.e5 = e5;
        this.f5 = f5;
        this.g5 = g5;
        this.h5 = h5;
        this.i5 = i5;
        this.res5 = res5;
        this.a6 = a6;
        this.b6 = b6;
        this.c6 = c6;
        this.d6 = d6;
        this.e6 = e6;
        this.f6 = f6;
        this.g6 = g6;
        this.h6 = h6;
        this.i6 = i6;
        this.res6 = res6;
        this.a7 = a7;
        this.b7 = b7;
        this.c7 = c7;
        this.d7 = d7;
        this.e7 = e7;
        this.f7 = f7;
        this.g7 = g7;
        this.h7 = h7;
        this.i7 = i7;
        this.res7 = res7;
        this.a8 = a8;
        this.b8 = b8;
        this.c8 = c8;
        this.d8 = d8;
        this.e8 = e8;
        this.f8 = f8;
        this.g8 = g8;
        this.h8 = h8;
        this.i8 = i8;
        this.res8 = res8;
        this.a9 = a9;
        this.b9 = b9;
        this.c9 = c9;
        this.d9 = d9;
        this.e9 = e9;
        this.f9 = f9;
        this.g9 = g9;
        this.h9 = h9;
        this.i9 = i9;
        this.res9 = res9;
    }
    //10x10
    public FakeJacobo(double a1, double b1, double c1, double d1, double e1, double f1, double g1, double h1, double i1, double j1, double res1,
                        double a2, double b2, double c2, double d2, double e2, double f2, double g2, double h2, double i2, double j2, double res2,
                        double a3, double b3, double c3, double d3, double e3, double f3, double g3, double h3, double i3, double j3, double res3,
                        double a4, double b4, double c4, double d4, double e4, double f4, double g4, double h4, double i4, double j4, double res4,
                        double a5, double b5, double c5, double d5, double e5, double f5, double g5, double h5, double i5, double j5, double res5,
                        double a6, double b6, double c6, double d6, double e6, double f6, double g6, double h6, double i6, double j6, double res6,
                        double a7, double b7, double c7, double d7, double e7, double f7, double g7, double h7, double i7, double j7, double res7,
                        double a8, double b8, double c8, double d8, double e8, double f8, double g8, double h8, double i8, double j8, double res8,
                        double a9, double b9, double c9, double d9, double e9, double f9, double g9, double h9, double i9, double j9, double res9,
                        double a10, double b10, double c10, double d10, double e10, double f10, double g10, double h10, double i10, double j10, double res10) {
        this.a1 = a1;
        this.b1 = b1;
        this.c1 = c1;
        this.d1 = d1;
        this.e1 = e1;
        this.f1 = f1;
        this.g1 = g1;
        this.h1 = h1;
        this.i1 = i1;
        this.j1 = j1;
        this.res1 = res1;
        this.a2 = a2;
        this.b2 = b2;
        this.c2 = c2;
        this.d2 = d2;
        this.e2 = e2;
        this.f2 = f2;
        this.g2 = g2;
        this.h2 = h2;
        this.i2 = i2;
        this.j2 = j2;
        this.res2 = res2;
        this.a3 = a3;
        this.b3 = b3;
        this.c3 = c3;
        this.d3 = d3;
        this.e3 = e3;
        this.f3 = f3;
        this.g3 = g3;
        this.h3 = h3;
        this.i3 = i3;
        this.j3 = j3;
        this.res3 = res3;
        this.a4 = a4;
        this.b4 = b4;
        this.c4 = c4;
        this.d4 = d4;
        this.e4 = e4;
        this.f4 = f4;
        this.g4 = g4;
        this.h4 = h4;
        this.i4 = i4;
        this.j4 = j4;
        this.res4 = res4;
        this.a5 = a5;
        this.b5 = b5;
        this.c5 = c5;
        this.d5 = d5;
        this.e5 = e5;
        this.f5 = f5;
        this.g5 = g5;
        this.h5 = h5;
        this.i5 = i5;
        this.j5 = j5;
        this.res5 = res5;
        this.a6 = a6;
        this.b6 = b6;
        this.c6 = c6;
        this.d6 = d6;
        this.e6 = e6;
        this.f6 = f6;
        this.g6 = g6;
        this.h6 = h6;
        this.i6 = i6;
        this.j6 = j6;
        this.res6 = res6;
        this.a7 = a7;
        this.b7 = b7;
        this.c7 = c7;
        this.d7 = d7;
        this.e7 = e7;
        this.f7 = f7;
        this.g7 = g7;
        this.h7 = h7;
        this.i7 = i7;
        this.j7 = j7;
        this.res7 = res7;
        this.a8 = a8;
        this.b8 = b8;
        this.c8 = c8;
        this.d8 = d8;
        this.e8 = e8;
        this.f8 = f8;
        this.g8 = g8;
        this.h8 = h8;
        this.i8 = i8;
        this.j8 = j8;
        this.res8 = res8;
        this.a9 = a9;
        this.b9 = b9;
        this.c9 = c9;
        this.d9 = d9;
        this.e9 = e9;
        this.f9 = f9;
        this.g9 = g9;
        this.h9 = h9;
        this.i9 = i9;
        this.j9 = j9;
        this.res9 = res9;
        this.a10 = a10;
        this.b10 = b10;
        this.c10 = c10;
        this.d10 = d10;
        this.e10 = e10;
        this.f10 = f10;
        this.g10 = g10;
        this.h10 = h10;
        this.i10 = i10;
        this.j10 = j10;
        this.res10 = res10;
    }
    //Sistema 3x3
    public void resolverSistemaA(){
        double errorTempA = 0;
        double errorTempB = 0;
        double errorTempC = 0;
        double x1Temp = 0;
        double x2Temp = 0;
        double x3Temp = 0;
        do{
            x1 = x1Temp;
            x2 = x2Temp;
            x3 = x3Temp;
            arrayA.add(x1);
            arrayB.add(x2);
            arrayC.add(x3);
            x1Temp = (res1 - (b1*x2) - (c1*x3))/a1;
            x2Temp = (res2 - (a2*x1) - (c2*x3))/b2;
            x3Temp = (res3 - (a3*x1) - (b3*x2))/c3;
            arrayAA.add(x1Temp);
            arrayBB.add(x2Temp);
            arrayCC.add(x3Temp);
            errorTempA = getAbsoluto( (x1Temp - x1) / x1Temp ) * 100;
            errorTempB = getAbsoluto( (x2Temp - x2) / x2Temp ) * 100;
            errorTempC = getAbsoluto( (x3Temp - x3) / x3Temp ) * 100;
            arrayAError.add(errorTempA);
            arrayBError.add(errorTempB);
            arrayCError.add(errorTempC);
            iteraciones++;
        }while(!((errorTempA<=error) && (errorTempB<=error) && (errorTempC<=error)));
    }
    //Sistema 4x4
    public void resolverSistemaB(){
        double errorTempA = 0;
        double errorTempB = 0;
        double errorTempC = 0;
        double errorTempD = 0;
        double x1Temp = 0;
        double x2Temp = 0;
        double x3Temp = 0;
        double x4Temp = 0;
        do{
            x1 = x1Temp;
            x2 = x2Temp;
            x3 = x3Temp;
            x4 = x4Temp;
            arrayA.add(x1);
            arrayB.add(x2);
            arrayC.add(x3);
            arrayD.add(x4);
            x1Temp = (res1 - (b1*x2) - (c1*x3) - (d1*x4))/a1;
            x2Temp = (res2 - (a2*x1) - (c2*x3) - (d2*x4))/b2;
            x3Temp = (res3 - (a3*x1) - (b3*x2) - (d3*x4))/c3;
            x4Temp = (res4 - (a4*x1) - (b4*x2) - (c4*x3))/d4;
            arrayAA.add(x1Temp);
            arrayBB.add(x2Temp);
            arrayCC.add(x3Temp);
            arrayDD.add(x4Temp);
            errorTempA = getAbsoluto( (x1Temp - x1) / x1Temp ) * 100;
            errorTempB = getAbsoluto( (x2Temp - x2) / x2Temp ) * 100;
            errorTempC = getAbsoluto( (x3Temp - x3) / x3Temp ) * 100;
            errorTempD = getAbsoluto( (x4Temp - x4) / x4Temp ) * 100;
            arrayAError.add(errorTempA);
            arrayBError.add(errorTempB);
            arrayCError.add(errorTempC);
            arrayDError.add(errorTempD);
            iteraciones++;
        }while(!((errorTempA<=error) && (errorTempB<=error) && (errorTempC<=error) && (errorTempD<=error)));
    }
    //Sistema 5x5
    public void resolverSistemaC(){
        double errorTempA = 0;
        double errorTempB = 0;
        double errorTempC = 0;
        double errorTempD = 0;
        double errorTempE = 0;
        double x1Temp = 0;
        double x2Temp = 0;
        double x3Temp = 0;
        double x4Temp = 0;
        double x5Temp = 0;
        do{
            x1 = x1Temp;
            x2 = x2Temp;
            x3 = x3Temp;
            x4 = x4Temp;
            x5 = x5Temp;
            arrayA.add(x1);
            arrayB.add(x2);
            arrayC.add(x3);
            arrayD.add(x4);
            arrayE.add(x5);
            x1Temp = (res1 - (b1*x2) - (c1*x3) - (d1*x4) - (e1*x5))/a1;
            x2Temp = (res2 - (a2*x1) - (c2*x3) - (d2*x4) - (e2*x5))/b2;
            x3Temp = (res3 - (a3*x1) - (b3*x2) - (d3*x4) - (e3*x5))/c3;
            x4Temp = (res4 - (a4*x1) - (b4*x2) - (c4*x3) - (e4*x5))/d4;
            x5Temp = (res5 - (a5*x1) - (b5*x2) - (c5*x3) - (d5*x5))/e5;
            arrayAA.add(x1Temp);
            arrayBB.add(x2Temp);
            arrayCC.add(x3Temp);
            arrayDD.add(x4Temp);
            arrayEE.add(x5Temp);
            errorTempA = getAbsoluto( (x1Temp - x1) / x1Temp ) * 100;
            errorTempB = getAbsoluto( (x2Temp - x2) / x2Temp ) * 100;
            errorTempC = getAbsoluto( (x3Temp - x3) / x3Temp ) * 100;
            errorTempD = getAbsoluto( (x4Temp - x4) / x4Temp ) * 100;
            errorTempE = getAbsoluto( (x5Temp - x5) / x5Temp ) * 100;
            arrayAError.add(errorTempA);
            arrayBError.add(errorTempB);
            arrayCError.add(errorTempC);
            arrayDError.add(errorTempD);
            arrayEError.add(errorTempE);
            iteraciones++;
        }while(!((errorTempA<=error) && (errorTempB<=error) && (errorTempC<=error) && (errorTempD<=error) && (errorTempE<=error)));
    }
    //Sistema 6x6
    public void resolverSistemaD(){
        double errorTempA = 0;
        double errorTempB = 0;
        double errorTempC = 0;
        double errorTempD = 0;
        double errorTempE = 0;
        double errorTempF = 0;
        double x1Temp = 0;
        double x2Temp = 0;
        double x3Temp = 0;
        double x4Temp = 0;
        double x5Temp = 0;
        double x6Temp = 0;
        do{
            x1 = x1Temp;
            x2 = x2Temp;
            x3 = x3Temp;
            x4 = x4Temp;
            x5 = x5Temp;
            x6 = x6Temp;
            arrayA.add(x1);
            arrayB.add(x2);
            arrayC.add(x3);
            arrayD.add(x4);
            arrayE.add(x5);
            arrayF.add(x6);
            x1Temp = (res1 - (b1*x2) - (c1*x3) - (d1*x4) - (e1*x5) - (f1*x6))/a1;
            x2Temp = (res2 - (a2*x1) - (c2*x3) - (d2*x4) - (e2*x5) - (f2*x6))/b2;
            x3Temp = (res3 - (a3*x1) - (b3*x2) - (d3*x4) - (e3*x5) - (f3*x6))/c3;
            x4Temp = (res4 - (a4*x1) - (b4*x2) - (c4*x3) - (e4*x5) - (f4*x6))/d4;
            x5Temp = (res5 - (a5*x1) - (b5*x2) - (c5*x3) - (d5*x5) - (f5*x6))/e5;
            x6Temp = (res6 - (a6*x1) - (b6*x2) - (c6*x3) - (d6*x4) - (e6*x5))/f6;
            arrayAA.add(x1Temp);
            arrayBB.add(x2Temp);
            arrayCC.add(x3Temp);
            arrayDD.add(x4Temp);
            arrayEE.add(x5Temp);
            arrayFF.add(x6Temp);
            errorTempA = getAbsoluto( (x1Temp - x1) / x1Temp ) * 100;
            errorTempB = getAbsoluto( (x2Temp - x2) / x2Temp ) * 100;
            errorTempC = getAbsoluto( (x3Temp - x3) / x3Temp ) * 100;
            errorTempD = getAbsoluto( (x4Temp - x4) / x4Temp ) * 100;
            errorTempE = getAbsoluto( (x5Temp - x5) / x5Temp ) * 100;
            errorTempF = getAbsoluto( (x6Temp - x6) / x6Temp ) * 100;
            arrayAError.add(errorTempA);
            arrayBError.add(errorTempB);
            arrayCError.add(errorTempC);
            arrayDError.add(errorTempD);
            arrayEError.add(errorTempE);
            arrayFError.add(errorTempF);
            iteraciones++;
        }while(!((errorTempA<=error) && (errorTempB<=error) && (errorTempC<=error) && (errorTempD<=error) && (errorTempE<=error) && (errorTempF<=error)));
    }
    //Sistema 7x7
    public void resolverSistemaE(){
        double errorTempA = 0;
        double errorTempB = 0;
        double errorTempC = 0;
        double errorTempD = 0;
        double errorTempE = 0;
        double errorTempF = 0;
        double errorTempG = 0;
        double x1Temp = 0;
        double x2Temp = 0;
        double x3Temp = 0;
        double x4Temp = 0;
        double x5Temp = 0;
        double x6Temp = 0;
        double x7Temp = 0;
        do{
            x1 = x1Temp;
            x2 = x2Temp;
            x3 = x3Temp;
            x4 = x4Temp;
            x5 = x5Temp;
            x6 = x6Temp;
            x7 = x7Temp;
            arrayA.add(x1);
            arrayB.add(x2);
            arrayC.add(x3);
            arrayD.add(x4);
            arrayE.add(x5);
            arrayF.add(x6);
            arrayG.add(x7);
            x1Temp = (res1 - (b1*x2) - (c1*x3) - (d1*x4) - (e1*x5) - (f1*x6) - (g1*x7))/a1;
            x2Temp = (res2 - (a2*x1) - (c2*x3) - (d2*x4) - (e2*x5) - (f2*x6) - (g2*x7))/b2;
            x3Temp = (res3 - (a3*x1) - (b3*x2) - (d3*x4) - (e3*x5) - (f3*x6) - (g3*x7))/c3;
            x4Temp = (res4 - (a4*x1) - (b4*x2) - (c4*x3) - (e4*x5) - (f4*x6) - (g4*x7))/d4;
            x5Temp = (res5 - (a5*x1) - (b5*x2) - (c5*x3) - (d5*x5) - (f5*x6) - (g5*x7))/e5;
            x6Temp = (res6 - (a6*x1) - (b6*x2) - (c6*x3) - (d6*x4) - (e6*x5) - (g6*x7))/f6;
            x7Temp = (res7 - (a7*x1) - (b7*x2) - (c7*x3) - (d7*x4) - (e7*x5) - (f7*x7))/g7;
            arrayAA.add(x1Temp);
            arrayBB.add(x2Temp);
            arrayCC.add(x3Temp);
            arrayDD.add(x4Temp);
            arrayEE.add(x5Temp);
            arrayFF.add(x6Temp);
            arrayGG.add(x7Temp);
            errorTempA = getAbsoluto( (x1Temp - x1) / x1Temp ) * 100;
            errorTempB = getAbsoluto( (x2Temp - x2) / x2Temp ) * 100;
            errorTempC = getAbsoluto( (x3Temp - x3) / x3Temp ) * 100;
            errorTempD = getAbsoluto( (x4Temp - x4) / x4Temp ) * 100;
            errorTempE = getAbsoluto( (x5Temp - x5) / x5Temp ) * 100;
            errorTempF = getAbsoluto( (x6Temp - x6) / x6Temp ) * 100;
            errorTempG = getAbsoluto( (x7Temp - x7) / x7Temp ) * 100;
            arrayAError.add(errorTempA);
            arrayBError.add(errorTempB);
            arrayCError.add(errorTempC);
            arrayDError.add(errorTempD);
            arrayEError.add(errorTempE);
            arrayFError.add(errorTempF);
            arrayGError.add(errorTempG);
            iteraciones++;
        }while(!((errorTempA<=error) && (errorTempB<=error) && (errorTempC<=error) && (errorTempD<=error) && (errorTempE<=error) && (errorTempF<=error) && (errorTempG<=error)));
    }
    //Sistema 8x8
    public void resolverSistemaF(){
        double errorTempA = 0;
        double errorTempB = 0;
        double errorTempC = 0;
        double errorTempD = 0;
        double errorTempE = 0;
        double errorTempF = 0;
        double errorTempG = 0;
        double errorTempH = 0;
        double x1Temp = 0;
        double x2Temp = 0;
        double x3Temp = 0;
        double x4Temp = 0;
        double x5Temp = 0;
        double x6Temp = 0;
        double x7Temp = 0;
        double x8Temp = 0;
        do{
            x1 = x1Temp;
            x2 = x2Temp;
            x3 = x3Temp;
            x4 = x4Temp;
            x5 = x5Temp;
            x6 = x6Temp;
            x7 = x7Temp;
            x8 = x8Temp;
            arrayA.add(x1);
            arrayB.add(x2);
            arrayC.add(x3);
            arrayD.add(x4);
            arrayE.add(x5);
            arrayF.add(x6);
            arrayG.add(x7);
            arrayH.add(x8);
            x1Temp = (res1 - (b1*x2) - (c1*x3) - (d1*x4) - (e1*x5) - (f1*x6) - (g1*x7) - (h1*x8))/a1;
            x2Temp = (res2 - (a2*x1) - (c2*x3) - (d2*x4) - (e2*x5) - (f2*x6) - (g2*x7) - (h2*x8))/b2;
            x3Temp = (res3 - (a3*x1) - (b3*x2) - (d3*x4) - (e3*x5) - (f3*x6) - (g3*x7) - (h3*x8))/c3;
            x4Temp = (res4 - (a4*x1) - (b4*x2) - (c4*x3) - (e4*x5) - (f4*x6) - (g4*x7) - (h4*x8))/d4;
            x5Temp = (res5 - (a5*x1) - (b5*x2) - (c5*x3) - (d5*x5) - (f5*x6) - (g5*x7) - (h5*x8))/e5;
            x6Temp = (res6 - (a6*x1) - (b6*x2) - (c6*x3) - (d6*x4) - (e6*x5) - (g6*x7) - (h6*x8))/f6;
            x7Temp = (res7 - (a7*x1) - (b7*x2) - (c7*x3) - (d7*x4) - (e7*x5) - (f7*x7) - (h7*x8))/g7;
            x8Temp = (res8 - (a8*x1) - (b8*x2) - (c8*x3) - (d8*x4) - (e8*x5) - (f8*x7) - (g8*x8))/h8;
            arrayAA.add(x1Temp);
            arrayBB.add(x2Temp);
            arrayCC.add(x3Temp);
            arrayDD.add(x4Temp);
            arrayEE.add(x5Temp);
            arrayFF.add(x6Temp);
            arrayGG.add(x7Temp);
            arrayHH.add(x8Temp);
            errorTempA = getAbsoluto( (x1Temp - x1) / x1Temp ) * 100;
            errorTempB = getAbsoluto( (x2Temp - x2) / x2Temp ) * 100;
            errorTempC = getAbsoluto( (x3Temp - x3) / x3Temp ) * 100;
            errorTempD = getAbsoluto( (x4Temp - x4) / x4Temp ) * 100;
            errorTempE = getAbsoluto( (x5Temp - x5) / x5Temp ) * 100;
            errorTempF = getAbsoluto( (x6Temp - x6) / x6Temp ) * 100;
            errorTempG = getAbsoluto( (x7Temp - x7) / x7Temp ) * 100;
            errorTempH = getAbsoluto( (x8Temp - x8) / x8Temp ) * 100;
            arrayAError.add(errorTempA);
            arrayBError.add(errorTempB);
            arrayCError.add(errorTempC);
            arrayDError.add(errorTempD);
            arrayEError.add(errorTempE);
            arrayFError.add(errorTempF);
            arrayGError.add(errorTempG);
            arrayHError.add(errorTempH);
            iteraciones++;
        }while(!((errorTempA<=error)&&(errorTempB<=error)&&(errorTempC<=error)&&(errorTempD<=error)&&(errorTempE<=error)&&(errorTempF<=error)&&(errorTempG<=error)&&(errorTempH<=error)));
    }
    //Sistema 9x9
    public void resolverSistemaG(){double errorTempA = 0;
        double errorTempB = 0;
        double errorTempC = 0;
        double errorTempD = 0;
        double errorTempE = 0;
        double errorTempF = 0;
        double errorTempG = 0;
        double errorTempH = 0;
        double errorTempI = 0;
        double x1Temp = 0;
        double x2Temp = 0;
        double x3Temp = 0;
        double x4Temp = 0;
        double x5Temp = 0;
        double x6Temp = 0;
        double x7Temp = 0;
        double x8Temp = 0;
        double x9Temp = 0;
        do{
            x1 = x1Temp;
            x2 = x2Temp;
            x3 = x3Temp;
            x4 = x4Temp;
            x5 = x5Temp;
            x6 = x6Temp;
            x7 = x7Temp;
            x8 = x8Temp;
            x9 = x9Temp;
            arrayA.add(x1);
            arrayB.add(x2);
            arrayC.add(x3);
            arrayD.add(x4);
            arrayE.add(x5);
            arrayF.add(x6);
            arrayG.add(x7);
            arrayH.add(x8);
            arrayI.add(x9);
            x1Temp = (res1-(b1*x2)-(c1*x3)-(d1*x4)-(e1*x5)-(f1*x6)-(g1*x7)-(h1*x8)-(i1*x9))/a1;
            x2Temp = (res2-(a2*x1)-(c2*x3)-(d2*x4)-(e2*x5)-(f2*x6)-(g2*x7)-(h2*x8)-(i2*x9))/b2;
            x3Temp = (res3-(a3*x1)-(b3*x2)-(d3*x4)-(e3*x5)-(f3*x6)-(g3*x7)-(h3*x8)-(i3*x9))/c3;
            x4Temp = (res4-(a4*x1)-(b4*x2)-(c4*x3)-(e4*x5)-(f4*x6)-(g4*x7)-(h4*x8)-(i4*x9))/d4;
            x5Temp = (res5-(a5*x1)-(b5*x2)-(c5*x3)-(d5*x5)-(f5*x6)-(g5*x7)-(h5*x8)-(i5*x9))/e5;
            x6Temp = (res6-(a6*x1)-(b6*x2)-(c6*x3)-(d6*x4)-(e6*x5)-(g6*x7)-(h6*x8)-(i6*x9))/f6;
            x7Temp = (res7-(a7*x1)-(b7*x2)-(c7*x3)-(d7*x4)-(e7*x5)-(f7*x7)-(h7*x8)-(i7*x9))/g7;
            x8Temp = (res8-(a8*x1)-(b8*x2)-(c8*x3)-(d8*x4)-(e8*x5)-(f8*x7)-(g8*x8)-(i8*x9))/h8;
            x9Temp = (res9-(a9*x1)-(b9*x2)-(c9*x3)-(d9*x4)-(e9*x5)-(f9*x7)-(g9*x8)-(h9*x9))/i9;
            arrayAA.add(x1Temp);
            arrayBB.add(x2Temp);
            arrayCC.add(x3Temp);
            arrayDD.add(x4Temp);
            arrayEE.add(x5Temp);
            arrayFF.add(x6Temp);
            arrayGG.add(x7Temp);
            arrayHH.add(x8Temp);
            arrayII.add(x9Temp);
            errorTempA = getAbsoluto( (x1Temp - x1) / x1Temp ) * 100;
            errorTempB = getAbsoluto( (x2Temp - x2) / x2Temp ) * 100;
            errorTempC = getAbsoluto( (x3Temp - x3) / x3Temp ) * 100;
            errorTempD = getAbsoluto( (x4Temp - x4) / x4Temp ) * 100;
            errorTempE = getAbsoluto( (x5Temp - x5) / x5Temp ) * 100;
            errorTempF = getAbsoluto( (x6Temp - x6) / x6Temp ) * 100;
            errorTempG = getAbsoluto( (x7Temp - x7) / x7Temp ) * 100;
            errorTempH = getAbsoluto( (x8Temp - x8) / x8Temp ) * 100;
            errorTempI = getAbsoluto( (x9Temp - x9) / x9Temp ) * 100;
            arrayAError.add(errorTempA);
            arrayBError.add(errorTempB);
            arrayCError.add(errorTempC);
            arrayDError.add(errorTempD);
            arrayEError.add(errorTempE);
            arrayFError.add(errorTempF);
            arrayGError.add(errorTempG);
            arrayHError.add(errorTempH);
            arrayIError.add(errorTempI);
            iteraciones++;
        }while(!((errorTempA<=error)&&(errorTempB<=error)&&(errorTempC<=error)&&(errorTempD<=error)&&(errorTempE<=error)&&(errorTempF<=error)&&(errorTempG<=error)&&(errorTempH<=error)&&(errorTempI<=error)));}
    //Sistema 10x10
    public void resolverSistemaH(){double errorTempA = 0;
        double errorTempB = 0;
        double errorTempC = 0;
        double errorTempD = 0;
        double errorTempE = 0;
        double errorTempF = 0;
        double errorTempG = 0;
        double errorTempH = 0;
        double errorTempI = 0;
        double errorTempJ = 0;
        double x1Temp = 0;
        double x2Temp = 0;
        double x3Temp = 0;
        double x4Temp = 0;
        double x5Temp = 0;
        double x6Temp = 0;
        double x7Temp = 0;
        double x8Temp = 0;
        double x9Temp = 0;
        double x10Temp = 0;
        do{
            x1 = x1Temp;
            x2 = x2Temp;
            x3 = x3Temp;
            x4 = x4Temp;
            x5 = x5Temp;
            x6 = x6Temp;
            x7 = x7Temp;
            x8 = x8Temp;
            x9 = x9Temp;
            x10 = x10Temp;
            arrayA.add(x1);
            arrayB.add(x2);
            arrayC.add(x3);
            arrayD.add(x4);
            arrayE.add(x5);
            arrayF.add(x6);
            arrayG.add(x7);
            arrayH.add(x8);
            arrayI.add(x9);
            arrayJ.add(x10);
            x1Temp = (res1-(b1*x2)-(c1*x3)-(d1*x4)-(e1*x5)-(f1*x6)-(g1*x7)-(h1*x8)-(i1*x9)-(j1*x10))/a1;
            x2Temp = (res2-(a2*x1)-(c2*x3)-(d2*x4)-(e2*x5)-(f2*x6)-(g2*x7)-(h2*x8)-(i2*x9)-(j2*x10))/b2;
            x3Temp = (res3-(a3*x1)-(b3*x2)-(d3*x4)-(e3*x5)-(f3*x6)-(g3*x7)-(h3*x8)-(i3*x9)-(j3*x10))/c3;
            x4Temp = (res4-(a4*x1)-(b4*x2)-(c4*x3)-(e4*x5)-(f4*x6)-(g4*x7)-(h4*x8)-(i4*x9)-(j4*x10))/d4;
            x5Temp = (res5-(a5*x1)-(b5*x2)-(c5*x3)-(d5*x5)-(f5*x6)-(g5*x7)-(h5*x8)-(i5*x9)-(j5*x10))/e5;
            x6Temp = (res6-(a6*x1)-(b6*x2)-(c6*x3)-(d6*x4)-(e6*x5)-(g6*x7)-(h6*x8)-(i6*x9)-(j6*x10))/f6;
            x7Temp = (res7-(a7*x1)-(b7*x2)-(c7*x3)-(d7*x4)-(e7*x5)-(f7*x7)-(h7*x8)-(i7*x9)-(j7*x10))/g7;
            x8Temp = (res8-(a8*x1)-(b8*x2)-(c8*x3)-(d8*x4)-(e8*x5)-(f8*x7)-(g8*x8)-(i8*x9)-(j8*x10))/h8;
            x9Temp = (res9-(a9*x1)-(b9*x2)-(c9*x3)-(d9*x4)-(e9*x5)-(f9*x7)-(g9*x8)-(h9*x9)-(j9*x10))/i9;
            x10Temp = (res10-(a10*x1)-(b10*x2)-(c10*x3)-(d10*x4)-(e10*x5)-(f10*x7)-(g10*x8)-(h10*x9)-(i10*x10))/j10;
            arrayAA.add(x1Temp);
            arrayBB.add(x2Temp);
            arrayCC.add(x3Temp);
            arrayDD.add(x4Temp);
            arrayEE.add(x5Temp);
            arrayFF.add(x6Temp);
            arrayGG.add(x7Temp);
            arrayHH.add(x8Temp);
            arrayII.add(x9Temp);
            arrayJJ.add(x10Temp);
            errorTempA = getAbsoluto( (x1Temp - x1) / x1Temp ) * 100;
            errorTempB = getAbsoluto( (x2Temp - x2) / x2Temp ) * 100;
            errorTempC = getAbsoluto( (x3Temp - x3) / x3Temp ) * 100;
            errorTempD = getAbsoluto( (x4Temp - x4) / x4Temp ) * 100;
            errorTempE = getAbsoluto( (x5Temp - x5) / x5Temp ) * 100;
            errorTempF = getAbsoluto( (x6Temp - x6) / x6Temp ) * 100;
            errorTempG = getAbsoluto( (x7Temp - x7) / x7Temp ) * 100;
            errorTempH = getAbsoluto( (x8Temp - x8) / x8Temp ) * 100;
            errorTempI = getAbsoluto( (x9Temp - x9) / x9Temp ) * 100;
            errorTempJ = getAbsoluto( (x10Temp - x10) / x10Temp ) * 100;
            arrayAError.add(errorTempA);
            arrayBError.add(errorTempB);
            arrayCError.add(errorTempC);
            arrayDError.add(errorTempD);
            arrayEError.add(errorTempE);
            arrayFError.add(errorTempF);
            arrayGError.add(errorTempG);
            arrayHError.add(errorTempH);
            arrayIError.add(errorTempI);
            arrayJError.add(errorTempJ);
            iteraciones++;
        }while(!((errorTempA<=error)&&(errorTempB<=error)&&(errorTempC<=error)&&(errorTempD<=error)&&(errorTempE<=error)&&(errorTempF<=error)&&(errorTempG<=error)&&(errorTempH<=error)&&(errorTempI<=error)&&(errorTempJ<=error)));}

    private double getAbsoluto(double numero){ return numero > 0 ? numero : -numero; }
    public int getIteraciones(){return iteraciones;}
    public void setError(double error){
        this.error = error;
    }

    public ArrayList<Double> getArrayA() { return arrayA; }
    public ArrayList<Double> getArrayB() { return arrayB; }
    public ArrayList<Double> getArrayC() { return arrayC; }
    public ArrayList<Double> getArrayD() { return arrayD; }
    public ArrayList<Double> getArrayE() { return arrayE; }
    public ArrayList<Double> getArrayF() { return arrayF; }
    public ArrayList<Double> getArrayG() { return arrayG; }
    public ArrayList<Double> getArrayH() { return arrayH; }
    public ArrayList<Double> getArrayI() { return arrayI; }
    public ArrayList<Double> getArrayJ() { return arrayJ; }
    public ArrayList<Double> getArrayAA() { return arrayAA; }
    public ArrayList<Double> getArrayBB() { return arrayBB; }
    public ArrayList<Double> getArrayCC() { return arrayCC; }
    public ArrayList<Double> getArrayDD() { return arrayDD; }
    public ArrayList<Double> getArrayEE() { return arrayEE; }
    public ArrayList<Double> getArrayFF() { return arrayFF; }
    public ArrayList<Double> getArrayGG() { return arrayGG; }
    public ArrayList<Double> getArrayHH() { return arrayHH; }
    public ArrayList<Double> getArrayII() { return arrayII; }
    public ArrayList<Double> getArrayJJ() { return arrayJJ; }
    public ArrayList<Double> getArrayAError() { return arrayAError; }
    public ArrayList<Double> getArrayBError() { return arrayBError; }
    public ArrayList<Double> getArrayCError() { return arrayCError; }
    public ArrayList<Double> getArrayDError() { return arrayDError; }
    public ArrayList<Double> getArrayEError() { return arrayEError; }
    public ArrayList<Double> getArrayFError() { return arrayFError; }
    public ArrayList<Double> getArrayGError() { return arrayGError; }
    public ArrayList<Double> getArrayHError() { return arrayHError; }
    public ArrayList<Double> getArrayIError() { return arrayIError; }
    public ArrayList<Double> getArrayJError() { return arrayJError; }

    public double getX1() { return x1; }
    public double getX2() { return x2; }
    public double getX3() { return x3; }
    public double getX4() { return x4; }
    public double getX5() { return x5; }
    public double getX6() { return x6; }
    public double getX7() { return x7; }
    public double getX8() { return x8; }
    public double getX9() { return x9; }
    public double getX10() { return x10; }
}
