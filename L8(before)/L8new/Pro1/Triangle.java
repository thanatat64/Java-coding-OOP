import java.lang.Math;
public class Triangle extends GeometricObject {
    private double a, b, c;

    public Triangle() {

    }

    public Triangle(double a, double b, double c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public Triangle(String color, boolean filled, double a, double b, double c) {
        super(color, filled);
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public double getA() {
        return this.a;
    }

    public void setA(double a) {
        this.a = a;
    }

    public double getB() {
        return this.b;
    }

    public void setB(double b) {
        this.b = b;
    }

    public double getC() {
        return this.c;
    }

    public void setC(double c) {
        this.c = c;
    }

    @Override
    public double getArea() {
        double area = (a + b + c) / 2;
        return Math.sqrt((area*(area-a)) * (area-b) * (area-c));
    }

    @Override
    public double getPerimeter() {
        return a + b + c;
    }

    @Override
    public String toString() {
        return "\n" +
              "Triangle: side1 = "+ getA() +" side2 = " + getB() + " side3 = " + getC() +"\nArea : " + getArea() + "\n" + "Perimeter : " + getPerimeter()+"\n"+ super.toString();
    }
}
