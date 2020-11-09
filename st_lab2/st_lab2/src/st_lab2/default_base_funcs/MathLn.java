package st_lab2.default_base_funcs;


import st_lab2.interfaces.ILn;

public class MathLn implements ILn {
    @Override
    public double func(double x) {
        return Math.log(x);
    }
}
