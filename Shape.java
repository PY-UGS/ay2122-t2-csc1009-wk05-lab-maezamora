abstract class Shape {
    private double dim1;
    private double dim2;
    final double PI = 3.14;

    public Shape(double dim1, double dim2) {
        this.dim1 = dim1;
        this.dim2 = dim2;
    }

    public Shape() {
    }

    public abstract double area();
}

class Rectangle extends Shape{
    private double height;
    private double width;

    public Rectangle(double height, double width) {
        super();
        this.height = height;
        this.width = width;
    }

    public double area(){
        System.out.println("Inside area for Rectangle.");
        double area = height*width;
        return area;
    }
}

class Triangle extends Shape{
    private double height;
    private double base;

    public Triangle(double height, double base) {
        super();
        this.height = height;
        this.base = base;
    }

    public double area(){
        System.out.println("Inside area for Triangle.");
        double area = 0.5*base*height;
        return area;
    }
}

class Circle extends Shape{
    private double radius;
    private double radius1;

    public Circle(double radius, double radius1) {
        super();
        this.radius = radius;
        this.radius1 = radius1;
    }

    public double area(){
        System.out.println("Inside area for Circle.");
        double area = PI*radius*radius;
        return area;
    }
}

class Ellipse extends Shape{
    private double A;
    private double B;

    public Ellipse(double dim1, double dim2) {
        super(dim1, dim2);
        A = dim1;
        B = dim2;
    }

    public double area(){
        System.out.println("Inside area for Ellipse.");
        double area = PI*A*B;
        return area;
    }
}

class Square extends Shape{
    private double height;
    private double width;

    public Square(double height, double width) {
        super();
        this.height = height;
        this.width = width;
    }

    public double area(){
        System.out.println("Inside area for Square.");
        double area = height*width;
        return area;
    }
}