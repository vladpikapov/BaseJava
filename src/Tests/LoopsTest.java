package Tests;

import Tasks.Loops;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class LoopsTest {

    private Loops loops = new Loops();

    @Test
    void getSumTest() {
        assertEquals(loops.getSum(5),15);
    }

    @Test
    void getAmountOnSegmentTest(){
        assertEquals(loops.getAmountOnSegment(1,5,2),7);
    }

    @Test
    void  getSumOfSquareOfFirstHundredNumberTest() {
        assertEquals(loops.getSumOfSquaresOfFirstHundredNumbers(),338350);
    }

    @Test
    void getMultiplyOfSquareOfSecondHundredNumberTest(){
        assertEquals(loops.getMultiplyOfSquaresOfSecondHundredNumbers(), 9223372036854775807L);
    }

    @Test
    void getSumOfRowTest(){
        assertEquals(loops.getSumOfRow(5),10);
    }
}