package st_lab2.funcs;

import st_lab2.interfaces.ILn;
import st_lab2.interfaces.ILog;
import st_lab2.my_base_funcs.Ln;

public class Log implements ILog {

    private ILn ln;

    public Log(ILn iln){
        ln = iln;
    }

    public Log(){
        ln = new Ln(0.000001);
    }

    @Override
    public double ln(double x) {
        return ln.func(x);
    }

    @Override
    public double log_2(double x) {
        return ln.func(x)/ln.func(2.0);
    }

    @Override
    public double log_10(double x) {
        return ln.func(x)/ln.func(10.0);
    }
}
