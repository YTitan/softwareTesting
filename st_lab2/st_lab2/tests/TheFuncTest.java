import org.junit.Before;
import org.junit.Test;
import st_lab2.funcs.Log;
import st_lab2.funcs.TheFunc;
import st_lab2.funcs.Trigon;

import static org.mockito.Mockito.*;

public class TheFuncTest extends IntegrTest{
    @Before
    public void mockCosAndTrigonFuncs() {
        Trigon tri = mock(Trigon.class);
        Log log = mock(Log.class);

        when(tri.sin(0.000000)).thenReturn(0.000000);
        when(tri.sin(-1.000000)).thenReturn(-0.841471);
        when(tri.sin(-2.000000)).thenReturn(-0.909297);
        when(tri.sin(-3.000000)).thenReturn(-0.141120);
        when(tri.sin(-3.141593)).thenReturn(-1.8369701987210297E-16);
        when(tri.sin(-3.500000)).thenReturn(0.350783);
        when(tri.sin(-4.000000)).thenReturn(0.756802);
        when(tri.sin(-4.712389)).thenReturn(1.000000);
        when(tri.sin(-4.800000)).thenReturn(0.996165);
        when(tri.sin(-5.000000)).thenReturn(0.958924);
        when(tri.sin(-5.150000)).thenReturn(0.905767);
        when(tri.sin(-6.283185)).thenReturn(3.071795869622047E-5);
        when(tri.sin(-100.000000)).thenReturn(0.506366);

        when(tri.cot(0.000000)).thenReturn(16331239353195370.0);
        when(tri.cot(-1.000000)).thenReturn(-0.642093);
        when(tri.cot(-2.000000)).thenReturn(0.457658);
        when(tri.cot(-3.000000)).thenReturn(7.015253);
        when(tri.cot(-3.141593)).thenReturn(5.443746451065123E15);
        when(tri.cot(-3.500000)).thenReturn(-2.669616);
        when(tri.cot(-4.000000)).thenReturn(-0.863691);
        when(tri.cot(-4.712389)).thenReturn(-0.000000);
        when(tri.cot(-4.800000)).thenReturn(0.087836);
        when(tri.cot(-5.000000)).thenReturn(0.295813);
        when(tri.cot(-5.150000)).thenReturn(0.467865);
        when(tri.cot(-6.283185)).thenReturn(3255424.65203911);
        when(tri.cot(-100.000000)).thenReturn(1.702957);

        when(tri.csc(0.000000)).thenReturn(16331239353195370.0);
        when(tri.csc(-1.000000)).thenReturn(-1.188395);
        when(tri.csc(-2.000000)).thenReturn(-1.099750);
        when(tri.csc(-3.000000)).thenReturn(-7.086167);
        when(tri.csc(-3.141593)).thenReturn(-5.443746451065123E15);
        when(tri.csc(-3.500000)).thenReturn(2.850763);
        when(tri.csc(-4.000000)).thenReturn(1.321349);
        when(tri.csc(-4.712389)).thenReturn(1.000000);
        when(tri.csc(-4.800000)).thenReturn(1.003850);
        when(tri.csc(-5.000000)).thenReturn(1.042835);
        when(tri.csc(-5.150000)).thenReturn(1.104037);
        when(tri.csc(-6.283185)).thenReturn(33255424.6520392634);
        when(tri.csc(-100.000000)).thenReturn(1.974858);

        when(log.ln(0.010000)).thenReturn(-4.605170);
        when(log.ln(0.050000)).thenReturn(-2.995732);
        when(log.ln(0.100000)).thenReturn(-2.302585);
        when(log.ln(1.000000)).thenReturn(0.000000);
        when(log.ln(1.591000)).thenReturn(0.464363);
        when(log.ln(2.554000)).thenReturn(0.937661);
        when(log.ln(10.000000)).thenReturn(2.302585);
        when(log.ln(50.000000)).thenReturn(3.912023);
        when(log.ln(100.000000)).thenReturn(4.605170);
        when(log.ln(2048.000000)).thenReturn(7.624619);

        when(log.log_2(0.010000)).thenReturn(-6.643856);
        when(log.log_2(0.050000)).thenReturn(-4.321928);
        when(log.log_2(0.100000)).thenReturn(-3.321928);
        when(log.log_2(1.000000)).thenReturn(0.000000);
        when(log.log_2(1.591000)).thenReturn(0.669934);
        when(log.log_2(2.554000)).thenReturn(1.352759);
        when(log.log_2(10.000000)).thenReturn(3.321928);
        when(log.log_2(50.000000)).thenReturn(5.643856);
        when(log.log_2(100.000000)).thenReturn(6.643856);
        when(log.log_2(2048.000000)).thenReturn(11.000000);

        when(log.log_10(0.010000)).thenReturn(-2.000000);
        when(log.log_10(0.050000)).thenReturn(-1.301030);
        when(log.log_10(0.100000)).thenReturn(-1.000000);
        when(log.log_10(1.000000)).thenReturn(0.000000);
        when(log.log_10(1.591000)).thenReturn(0.201670);
        when(log.log_10(2.554000)).thenReturn(0.407221);
        when(log.log_10(10.000000)).thenReturn(1.000000);
        when(log.log_10(50.000000)).thenReturn(1.698970);
        when(log.log_10(100.000000)).thenReturn(2.000000);
        when(log.log_10(2048.000000)).thenReturn(3.311330);

        func = new TheFunc(log, tri);
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
