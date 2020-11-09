package st_lab2.funcs;

import st_lab2.interfaces.IFunc;
import st_lab2.interfaces.ILog;
import st_lab2.interfaces.ITrigon;

public class TheFunc implements IFunc {
    public ILog log;
    public ITrigon trigon;

    public TheFunc(ILog log, ITrigon trigon){
        this.log = log;
        this.trigon = trigon;
    }

    @Override
    public double func(double x) {
        if (x <= 0.0){
            double p1 = ((trigon.cot(x) - trigon.csc(x)) / trigon.sin(x)) / (trigon.csc(x) * trigon.csc(x));
            p1 *= p1;
            double p2 = (trigon.sin(x) * (trigon.sin(x) * trigon.csc(x)));
            p2 = p2 * p2 * p2;
            return p1 - p2;
        }
        else if (x > 0.0)
            return (((((log.ln(x) / log.log_10(x)) - log.log_2(x)) * log.log_2(x)) - log.log_2(x)) +
                (log.log_10(x) * log.log_10(x) * log.log_10(x)));
        return Double.NaN;
    }
}
