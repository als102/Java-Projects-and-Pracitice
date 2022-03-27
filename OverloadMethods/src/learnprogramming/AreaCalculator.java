package learnprogramming;

public class AreaCalculator {
    private static final double PI = Math.PI;
    public static double area(double radius){
        if(radius <= -1.0){
            return -1.0;
        }
        double circleArea = radius * radius *  PI;
        System.out.println(circleArea);
        return circleArea;
    }
    public static double area(double x,double y){
        if(x <= -1 || y <= -1){
            return -1.0;
        }
        double rectangleArea = x * y;
        System.out.println(rectangleArea);
        return rectangleArea;
    }
}
