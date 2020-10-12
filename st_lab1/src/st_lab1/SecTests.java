package st_lab1;

import static org.junit.Assert.*;


import org.junit.Before;
import org.junit.Test;

public class SecTests {

    public static final double errorTolerance = 0.00001;

    private TestFunction sec;

    @Before
    public void SetUp(){
        sec = new Sec();
    }

    @Test
    public void Test(){
        CheckVal(Math.PI);
        CheckVal(-Math.PI);
        CheckVal(2*Math.PI);
        CheckVal(-2*Math.PI);
        for (double j = -10; j < 10; j += 0.1){
            CheckVal(j);
        }
    }

    private void CheckVal(double val){
        assertTrue(KindaEqual(sec.Func(val), 1.0/Math.cos(val)));
    }

    private boolean KindaEqual(double f1, double f2){
        if (f1 == Double.POSITIVE_INFINITY && f2 == Double.POSITIVE_INFINITY)
            return true;
        if (f1 == Double.NEGATIVE_INFINITY && f2 == Double.NEGATIVE_INFINITY)
            return true;
        return Math.abs(f1 - f2) <= errorTolerance;
    }
}
