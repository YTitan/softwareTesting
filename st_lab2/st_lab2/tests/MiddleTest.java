import org.junit.Before;
import org.junit.Test;
import st_lab2.funcs.Log;
import st_lab2.funcs.TheFunc;
import st_lab2.funcs.Trigon;
import st_lab2.my_base_funcs.Cos;
import st_lab2.my_base_funcs.Ln;

import static org.mockito.Mockito.*;

public class MiddleTest extends IntegrTest {

    @Before
    public void MockLnAndCos(){
        Cos cos = mock(Cos.class);
        Ln ln = mock(Ln.class);

        when(ln.func(0.010000)).thenReturn(-4.605170);
        when(ln.func(0.050000)).thenReturn(-2.995732);
        when(ln.func(0.100000)).thenReturn(-2.302585);
        when(ln.func(1.000000)).thenReturn(0.000000);
        when(ln.func(1.591000)).thenReturn(0.464363);
        when(ln.func(2.554000)).thenReturn(0.937661);
        when(ln.func(10.000000)).thenReturn(2.302585);
        when(ln.func(50.000000)).thenReturn(3.912023);
        when(ln.func(100.000000)).thenReturn(4.605170);
        when(ln.func(2048.000000)).thenReturn(7.624619);
        when(ln.func(2.000000)).thenReturn(0.693147);
        when(ln.func(10.000000)).thenReturn(2.302585);

        when(cos.func(0.000000)).thenReturn(1.000000);
        when(cos.func(0.000000 - Math.PI/2.0)).thenReturn(0.000000);
        when(cos.func(-1.000000)).thenReturn(0.540302);
        when(cos.func(-1.000000 - Math.PI/2.0)).thenReturn(-0.841471);
        when(cos.func(-2.000000)).thenReturn(-0.416147);
        when(cos.func(-2.000000 - Math.PI/2.0)).thenReturn(-0.909297);
        when(cos.func(-3.000000)).thenReturn(-0.989992);
        when(cos.func(-3.000000 - Math.PI/2.0)).thenReturn(-0.141120);
        when(cos.func(-3.141593)).thenReturn(-1.000000);
        when(cos.func(-3.141593 - Math.PI/2.0)).thenReturn(3.071795869622047E-5);
        when(cos.func(-3.500000)).thenReturn(-0.936457);
        when(cos.func(-3.500000 - Math.PI/2.0)).thenReturn(0.350783);
        when(cos.func(-4.000000)).thenReturn(-0.653644);
        when(cos.func(-4.000000 - Math.PI/2.0)).thenReturn(0.756802);
        when(cos.func(-4.712389)).thenReturn(-0.000000);
        when(cos.func(-4.712389 - Math.PI/2.0)).thenReturn(1.000000);
        when(cos.func(-4.800000)).thenReturn(0.087499);
        when(cos.func(-4.800000 - Math.PI/2.0)).thenReturn(0.996165);
        when(cos.func(-5.000000)).thenReturn(0.283662);
        when(cos.func(-5.000000 - Math.PI/2.0)).thenReturn(0.958924);
        when(cos.func(-5.150000)).thenReturn(0.423777);
        when(cos.func(-5.150000 - Math.PI/2.0)).thenReturn(0.905767);
        when(cos.func(-6.283185)).thenReturn(1.000000);
        when(cos.func(-6.283185 - Math.PI/2.0)).thenReturn(3.071795869622047E-5);
        when(cos.func(-100.000000)).thenReturn(0.862319);
        when(cos.func(-100.000000 - Math.PI/2.0)).thenReturn(0.506366);

        func = new TheFunc(new Log(ln), new Trigon(cos));
    }

    @Test
    public void Test1(){
        TestFirstExtrema();
    }

    @Test
    public void TestFirstFall(){
        TestFirstFuncFall();
    }

    @Test
    public void TestScndExtrema(){
        TestSecondExtrema();
    }

    @Test
    public void TestFirstRise(){
        TestFirstFuncRise();
    }

    @Test
    public void TestZeroCase() {
        testZeroCase();
    }

    @Test
    public void TestThirdExtrema(){
        testThirdExtrema();
    }

    @Test
    public void TestLogPart(){
        testLogPart();
    }
}
