package s3.w5;

public class Main {

    public static void main(String[] args) {

        Triangle triangle = new Triangle(6, 4);
        System.out.println(triangle.getTotalArea());
        System.out.println(triangle.getTotalPerimeter());
        triangle.info();

        System.out.println("");

        Rectangle rectangle = new Rectangle(10, 5);
        System.out.println(rectangle.getTotalArea());
        System.out.println(rectangle.getTotalPerimeter());
        rectangle.info();

        System.out.println("");

        Circle circle = new Circle(7);
        System.out.println(circle.getTotalArea());
        System.out.println(circle.getTotalPerimeter());
        circle.info();

    }

}
