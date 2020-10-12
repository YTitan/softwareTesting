package st_lab1;

public class Sec implements TestFunction{
    public double Func(double x){
        x = (Math.abs(x)+Math.PI)%(2*Math.PI) - Math.PI;
        return 1.0/Cos(x, 8);
    }

    double Cos(double x, int numTerms){
        double res = 0;

        double sign = 1;
        double t = 1;
        double fact = 1;
        for (int i = 0; i < numTerms; ++i){
            res += sign * t / fact;

            double k = 2*(i+1);
            fact *= k * (k - 1);
            t *= x*x;
            sign *= -1;
        }

        return res;
    }
}
