package Tests;

import Tasks.Branching;

import static org.junit.jupiter.api.Assertions.*;

class BranchingTest {

    Branching branching = new Branching();

    @org.junit.jupiter.api.Test
    void isTriangleByAngles() {
        assertEquals(branching.isTriangleByAngles(45,45),"It`s a right triangle!");
    }

    @org.junit.jupiter.api.Test
    void findMaximalNumberInMinimal() {
        assertEquals(branching.findMaximalNumberInMinimal(1,2,3,4),3);
    }

    @org.junit.jupiter.api.Test
    void dotsOnOneLine() {
        assertTrue(branching.dotsOnOneLine(1,8,-2,-7,-4,-17));
    }

    @org.junit.jupiter.api.Test
    void willTheBrickFit() {
        assertTrue(branching.willTheBrickFit(5,6,3,4,5));
    }

    @org.junit.jupiter.api.Test
    void getFunctionResult() {
        assertEquals(branching.GetFunctionResult(3),9);
    }
}