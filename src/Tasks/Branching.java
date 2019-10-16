package Tasks;

public class Branching {

    public String isTriangleByAngles(int firstTriangleAngle, int secondTriangleAngle) {
        if (180 - (firstTriangleAngle + secondTriangleAngle) > 0 && (firstTriangleAngle > 0 && secondTriangleAngle > 0)) {
            return  (180 - (firstTriangleAngle + secondTriangleAngle) == 90 || firstTriangleAngle == 90 || secondTriangleAngle == 90)?"It`s a right triangle!":"It`s a triangle, but not a right";
        }
        return "It`s not a triangle!";
    }
    public int findMaximalNumberInMinimal(int a, int b, int c, int d){
        return Math.max(Math.min(a,b),Math.min(c,d));
    }
    public boolean dotsOnOneLine(int x1,int y1, int x2,int y2,int x3,int y3){
        return (x3-x1)/(x2-x1)==(y3-y1)/(y2-y1);
    }
    public boolean willTheBrickFit(int aSide, int bSide, int x, int y, int z){
        return (((aSide>=x) && (bSide>=y) || (aSide >=y) && (bSide>=x)) || ((aSide>=x) && (bSide>=z) || (aSide>=z) && (bSide>=x)) || ((aSide>=z)&&(bSide>=y) || (aSide>=y) && (bSide>=z)));

    }
    public double GetFunctionResult(int x){
            return x>=3?Math.pow(x,2) - 3*x+9:1/(Math.pow(x,3)+6);
    }
}
