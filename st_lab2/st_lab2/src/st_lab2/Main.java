package st_lab2;

import st_lab2.default_base_funcs.MathCos;
import st_lab2.default_base_funcs.MathLn;
import st_lab2.funcs.Log;
import st_lab2.funcs.TheFunc;
import st_lab2.funcs.Trigon;
import st_lab2.interfaces.ICos;
import st_lab2.my_base_funcs.Cos;
import st_lab2.my_base_funcs.Ln;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Locale;

public class Main {
    public static void main(String[] args){

        Trigon trigon = new Trigon(new MathCos());
        Log log = new Log(new MathLn());

        double x[] = {0.0, -1.0, -2.0, -3.0, -Math.PI, -3.5, -4.0, -3.0 * Math.PI / 2.0, -4.8, -5.0, -5.15, -2.0 * Math.PI, -100.0 };

        double x2[] = {0.01, 0.05, 0.1, 1.0, 1.591, 2.554, 10.0, 50.0, 100.0, 2048.0};

        TheFunc func = new TheFunc(log, trigon);

        Locale.setDefault(Locale.US);

//        for (int i = 0; i < x.length; i ++){
//         System.out.printf("when(tri.sin(%f)).thenReturn(%f);\n", x[i], trigon.sin(x[i]));
//        }
//        System.out.println();
//
//        for (int i = 0; i < x.length; i ++){
//            System.out.printf("when(tri.cot(%f)).thenReturn(%f);\n", x[i], trigon.cot(x[i]));
//        }
//        System.out.println();
//
//        for (int i = 0; i < x.length; i ++){
//            System.out.printf("when(tri.csc(%f)).thenReturn(%f);\n", x[i], trigon.csc(x[i]));
//        }
//        System.out.println();



//        for (int i = 0; i < x2.length; i ++){
//            System.out.printf("when(log.ln(%f)).thenReturn(%f);\n", x2[i], log.ln(x2[i]));
//        }
//        System.out.println();
//
//        for (int i = 0; i < x2.length; i ++){
//            System.out.printf("when(log.log_2(%f)).thenReturn(%f);\n", x2[i], log.log_2(x2[i]));
//        }
//        System.out.println();
//
//        for (int i = 0; i < x2.length; i ++){
//            System.out.printf("when(log.log_10(%f)).thenReturn(%f);\n", x2[i], log.log_10(x2[i]));
//        }
//        System.out.println();

//        TheFunc f = new TheFunc(new Log(new Ln(0.000001)), new Trigon(new Cos(0.000001)));

//        double X = -6.283185;
//        System.out.println(func.trigon.cot(X));
//        System.out.println(func.trigon.csc(X));
//        System.out.println(func.trigon.sin(X));
//        System.out.println(func.trigon.cot(X) - func.trigon.csc(0.0));
//        System.out.println((func.trigon.cot(X) - trigon.csc(0.0)) / trigon.sin(0.0));
//        System.out.println();

//        for (int i = 0; i < x.length; i ++){
//            System.out.printf("when(func(%f)).thenReturn(%f);\n", x[i], func.func(x[i]));
//            System.out.printf("when(f(%f)).thenReturn(%f);\n", x[i], f.func(x[i]));
//        }
//        System.out.println();
//        for (int i = 0; i < x2.length; i ++){
//            System.out.printf("when(func(%f)).thenReturn(%f);\n", x2[i], func.func(x2[i]));
//            System.out.printf("when(f(%f)).thenReturn(%f);\n", x2[i], f.func(x2[i]));
//        }
//        System.out.println();

//        for (int i = 0; i < x.length; i++){
//            System.out.printf("when(cos.func(%f)).thenReturn(%f);\n", x[i], Math.cos(x[i]));
//            System.out.printf("when(cos.func(%f - Math.PI/2.0)).thenReturn(%f);\n", x[i], Math.cos(x[i]-Math.PI/2.0));
//        }
//        System.out.println();
//
//        for (int i = 0; i < x2.length; i++){
//            System.out.printf("when(func(%f)).thenReturn(%f);\n", x2[i], func.func(x2[i]));
//            System.out.printf("when(ln.func(%f)).thenReturn(%f);\n", x2[i], Math.log(x2[i]));
//        }
//        System.out.println();
//
//
//        System.out.printf("when(ln.func(%f)).thenReturn(%f);\n", 2.0, Math.log(2.0));
//        System.out.printf("when(ln.func(%f)).thenReturn(%f);\n", 10.0, Math.log(10.0));

        try{
            File f = new File("D:\\MyFiles\\ITMO\\Year4\\SoftwareTesting\\lab2\\res.csv");
            if(!f.exists())
                f.createNewFile();
            FileWriter writer = new FileWriter(f);
            for (double i = -10; i <= 10; i+=0.01){
                writer.append(i + "," + func.func(i) + "\n");
            }
        } catch (IOException e){
            System.out.println("error");
        }

    }
}
