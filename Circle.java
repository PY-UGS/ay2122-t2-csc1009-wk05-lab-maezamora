public class Circle extends GeometricObject{
    private double radius;

    public Circle(){}

    public Circle(double radius){
        this.radius = radius;
    }

    public Circle(String color, boolean filled, double radius) {
        super(color, filled);
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public double getArea(){
        double area = Math.PI*radius*radius;
        return area;
    }

    public double getPerimeter(){
        double perimeter = 2*Math.PI*radius;
        return perimeter;
    }

    public double getDiameter(){
        double diameter = 2*radius;
        return diameter;
    }

    public void printCircle(){
        System.out.println("Circle");
    }
}
