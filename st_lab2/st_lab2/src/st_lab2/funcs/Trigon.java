package st_lab2.funcs;

import st_lab2.interfaces.ICos;
import st_lab2.interfaces.ITrigon;
import st_lab2.my_base_funcs.Cos;

public class Trigon implements ITrigon {

    private ICos cosFunc;

    public Trigon(ICos cosFunc){
        this.cosFunc = cosFunc;
    }

    public Trigon(){
        cosFunc = new Cos(0.000001);
    }

    @Override
    public double cot(double x) {
        return cosFunc.func(x)/ sin(x);
    }

    @Override
    public double csc(double x) {
        return 1.0/ sin(x);
    }

    @Override
    public double sin(double x) {
        if (x == 0.0)
            return 0.0;
        return cosFunc.func(x - Math.PI/2.0);
    }

    @Override
    public double cos(double x) {
        return cosFunc.func(x);
    }
}
