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
        double delta = 1;
        double k = 0;
        for (int i = 0; i < numTerms; ++i){
            //delta = sign * t / fact;
            res += delta;

            k += 2;
            //fact *= k * (k - 1);
            //t *= x*x;
            //sign *= -1;
            delta *=  x * x  / k / (k - 1) * -1;
        }

        return res;
    }
}
