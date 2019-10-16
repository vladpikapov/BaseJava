package Tasks;

import javax.naming.spi.DirObjectFactory;

public class LinearProgram {
    public int takeFirstFunctionValue(int a, int b, int c) {
        return ((a - 3) * b / 2) + c;
    }
public double takeSecondFunctionValue(int a, int b, int c){
        return (b + Math.sqrt(Math.pow(b,2)+4*a*c))/2 - Math.pow(a,3)*c + Math.pow(b,-2);
    }
public double takeThirdFunctionValue(int x, int y){
        return ((Math.sin(x)+Math.cos(y))/(Math.cos(x) - Math.sin(y))) + Math.tan(x*y);
}
public static double swapIntegerPartWithFractional(double swapNumber){
        String [] temp = Double.toString(swapNumber).split("\\.");
        return Double.parseDouble(temp[1] + "." + temp[0]);
}
public static String takeFullTimeBySeconds(int timeBySeconds){
       int hours = timeBySeconds / 3600;
       int minutes = timeBySeconds / 60 - hours*60;
       int seconds = timeBySeconds - minutes * 60 - hours*3600;
       return hours +":"+ minutes + ":"+ seconds;
}
public static boolean CheckRange(int x,int y){
        return (y >= -3 && y <= 4 && x >= -2 && x <= 2) || (y <= 0 && y >= -3 && x >= -4 && x <= 4);
}
}
