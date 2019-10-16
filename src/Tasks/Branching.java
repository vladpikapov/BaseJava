package Tasks;

public class Branching {
    public static String isTriangleByAngles(int firstTriangleAngle, int secondTriangleAngle) {
        if (180 - (firstTriangleAngle + secondTriangleAngle) > 0 && (firstTriangleAngle > 0 && secondTriangleAngle > 0)) {
            if (180 - (firstTriangleAngle + secondTriangleAngle) == 90 || firstTriangleAngle == 90 || secondTriangleAngle == 90)
                return "It`s a right triangle!";
            else
                return "It`s a triangle, but not a right";

        }
        return "It`s not a triangle!";
    }
}
