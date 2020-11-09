package st_lab2.my_base_funcs;

import st_lab2.interfaces.ILn;

public class Ln extends BaseFunc implements ILn {

    public  Ln(double errorTolerance){
        super(errorTolerance);
    }

    public  Ln(){
        super(0.000001);
    }

    @Override
    public double func(double x) {

        if (x < 0)
            return Double.NaN;

        int n = 0;

        while (x < 0.3 || x > 1.7){
            if (x < 0.5){
                x *= 2;
                n++;
            } else if (x > 1.5){
                x /= 2;
                n--;
            }
        }

        return n*ln1(0.5, errorTolerance) + ln1(x, errorTolerance);
    }

    private double ln1(double x, double errorTolerance) {

        if (x < 0)
            return Double.NaN;

        double res = 0;
        double nthElem = x - 1;
        double n = 1;

        while (Math.abs(nthElem) > errorTolerance){
            res += nthElem;
            nthElem *= (x-1)*(-1)*n/++n;
        }
        res += nthElem;

        return res;
    }
}
