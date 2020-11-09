package st_lab2.default_base_funcs;

import st_lab2.interfaces.ICos;

public class MathCos implements ICos {

    @Override
    public double func(double x) {
        return Math.cos(x);
    }
}
