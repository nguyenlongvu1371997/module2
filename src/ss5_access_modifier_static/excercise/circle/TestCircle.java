package ss5_access_modifier_static.excercise.circle;

public class TestCircle {
    public static void main(String[] args) {
        Circle circle1 = new Circle();
        System.out.println(circle1.getRadius());
        System.out.println(circle1.getArea());
        Circle circle2 = new Circle(15);
        System.out.println(circle2.getRadius());
        System.out.println(circle2.getArea());
    }
}


