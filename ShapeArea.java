public class ShapeArea {
    public static void main(String[] args) {
        Rectangle r = new Rectangle(9,5);
        Triangle t = new Triangle(10,8);
        Circle c = new Circle(5,5);
        Ellipse e = new Ellipse(7,7);
        Square s = new Square(6,6);
        Shape shape;
        shape = r;
        System.out.println("Area is " +shape.area());
        shape = t;
        System.out.println("Area is " +shape.area());
        shape = c;
        System.out.println("Area is " +shape.area());
        shape = e;
        System.out.println("Area is " +shape.area());
        shape = s;
        System.out.println("Area is " +shape.area());

    }
}
