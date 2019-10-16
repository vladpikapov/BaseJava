package Tasks;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class LinearProgramTest {

    private LinearProgram linearProgram = new LinearProgram();

    @Test
    void getFirstFunctionValueTest() {
        assertEquals(linearProgram.getFirstFunctionValue(1,2,3),1);
    }

    @Test
    void getSecondFunctionValueTest() {
        assertEquals(linearProgram.getSecondFunctionValue(1,1,1),1.618033988749895);
    }

    @Test
    void getThirdFunctionValueTest() {
        assertEquals(linearProgram.getThirdFunctionValue(3,4),1.5620199545364426);
    }

    @Test
    void swapIntegerPartWithFractionalTest() {
        assertEquals(linearProgram.swapIntegerPartWithFractional(404.032),32.404);
    }

    @Test
    void getFullTimeBySecondsTest() {
        assertEquals(linearProgram.getFullTimeBySeconds(5000),"1:23:20");
    }

    @Test
    void checkRangeTest() {
       assertTrue(linearProgram.CheckRange(-1,-1));
    }
}