
public class CalculateArea {

    double circleArea(double radius) {
        return Math.PI * radius * radius;
    }

    public static void main(String[] args) {
        CalculateArea radius = new CalculateArea();
        double result = radius.circleArea(5);
        System.out.println("Radius: "+result);
    }

}
