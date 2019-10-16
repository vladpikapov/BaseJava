package com.company;
import Tasks.Branching;
import Tasks.LinearProgram;
import java.io.Console;

public class Main {

    public static void main(String[] args) {
       getLinearProgramsInConsole();
       getBranchingTasks();
    }

    private static void getLinearProgramsInConsole(){
        LinearProgram program = new LinearProgram();
        System.out.println(program.takeFirstFunctionValue(1,2,3));
        System.out.println(program.takeSecondFunctionValue(3,4,5));
        System.out.println(program.takeThirdFunctionValue(3,4));
        System.out.println(LinearProgram.swapIntegerPartWithFractional(548.887));
        System.out.println(LinearProgram.takeFullTimeBySeconds(75256));
        System.out.println(LinearProgram.CheckRange(-3,1));
    }
    private static void getBranchingTasks(){
        System.out.println(Branching.isTriangleByAngles(0,5));
    }
}
