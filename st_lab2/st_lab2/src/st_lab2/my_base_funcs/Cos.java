package st_lab2.my_base_funcs;

import st_lab2.interfaces.ICos;

public class Cos extends BaseFunc implements ICos {

    public Cos(double errorTolerance){
        super(errorTolerance);
    }

    public Cos(){
        super(0.000001);
    }

    @Override
    public double func(double x) {
        // make sure x is in range
        x = (Math.abs(x)+Math.PI)%(2*Math.PI) - Math.PI;

        double res = 0;

        int k = 0;
        double delta = 1;
        do {
            res += delta;
            k += 2;
            delta *=  x * x  / k / (k - 1) * -1;
        } while ( Math.abs(delta) > errorTolerance );

        return res;
    }
}
