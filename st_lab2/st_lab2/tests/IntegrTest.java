import st_lab2.funcs.TheFunc;
import st_lab2.funcs.Trigon;
import st_lab2.interfaces.ITrigon;

import static org.junit.Assert.*;

public class IntegrTest {

    final double errorTolerance = 0.001;

    protected TheFunc func;

    private void assertKindaEqual(String message, double expected, double real){
        //boolean cond = Double.isNaN(expected) && Double.isNaN(real) || Math.abs(expected - real) < errorTolerance;
        //assertTrue(message, cond);
        assertEquals(message, expected, real, errorTolerance);
    }

    private void assertKindaEqual(double expected, double real){
        assertEquals(expected, real, errorTolerance);
    }

    /**
     * x == 0
     *
     */
    protected void TestFirstExtrema(){
        assertKindaEqual("Testing first extrema, x == 0; func value is " + func.func(0.0), Double.NaN, func.func(0.0));
    }

    /**
     *
     */
    protected void TestFirstFuncFall(){
        assertKindaEqual("Testing first func Fall, x == -1.0",  0.807145, func.func(-1.0));
        assertKindaEqual("Testing first func Fall, x == -2.0",  2.757299, func.func(-2.0));
        assertKindaEqual("Testing first func Fall, x == -3.0",  3.962881, func.func(-3.0));
    }

    protected void TestSecondExtrema(){
        assertKindaEqual("Testing second extrema, x == -PI",  4.0, func.func(-3.141593));
    }

    protected void TestFirstFuncRise(){
        assertKindaEqual("Testing first func rise, x == -3.5",  3.706701, func.func(-3.5));
        assertKindaEqual("Testing first func rise, x == -4.0",  2.301079, func.func(-4.0));
        assertKindaEqual("Testing first func rise, x == -4.8", -0.155880, func.func(-4.8));
        assertKindaEqual("Testing first func rise, x == -5.0", -0.368625, func.func(-5.0));
    }

    protected void testZeroCase(){
        assertKindaEqual("Testing zero case, x == -4.712389",  0.0, func.func(-4.712389));
        assertKindaEqual("Testing zero case, x == -6.283185",  0.0, func.func(-6.283185));
    }

    protected void testThirdExtrema(){
        assertKindaEqual("Testing third extrema, x == -5.15", -0.411070, func.func(-5.15));
    }


    protected void testLogPart(){
        //assertKindaEqual("Testing log part, x == 0.01",  -60.795013, func.func(0.01));
        assertKindaEqual("Testing log part, x == 0.05",  -26.510968, func.func(0.05));
        assertKindaEqual("Testing log part, x == 0.1",  -16.3623, func.func(0.1));
        assertKindaEqual("Testing log part, x == 1.0",  Double.NaN, func.func(1.0));
        assertKindaEqual("Testing log part, x == 1.591",  0.432037, func.func(1.591));
        assertKindaEqual("Testing log part, x == 1.591",  0.432037, func.func(1.591));
        assertKindaEqual("Testing log part, x == 2.554",  -0.000344, func.func(2.554));
        assertKindaEqual("Testing log part, x == 10.0",  -5.708123, func.func(10.0));
        assertKindaEqual("Testing log part, x == 50.0",  -19.597434, func.func(50.0));
        assertKindaEqual("Testing log part, x == 100.0",  -27.486637, func.func(100.0));
        assertKindaEqual("Testing log part, x == 2048.0",  -70.363142, func.func(2048.0));
    }
}
