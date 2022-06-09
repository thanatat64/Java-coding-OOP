import java.lang.Math;
public class Triangle extends GeometricObject {
    private double s1 = 1, s2 = 1, s3 = 1;

    public Triangle() {

    }

    public Triangle(double s1, double s2, double s3) {
        setS1(s1);
        setS2(s2);
        setS3(s3);
    }

    public Triangle(String color, boolean filled, double s1, double s2, double s3) {
        super(color, filled);
        setS1(s1);
        setS2(s2);
        setS3(s3);
    }

    public double getS1() {
        return this.s1;
    }

    public void setS1(double s1) {
        if (s1 <= 0) {
            System.out.println("Side1 : you must enter number above zero!!");
        }
        this.s1 = s1;
    }

    public double getS2() {
        return this.s2;
    }

    public void setS2(double s2) {
        if (s2 <= 0) {
            System.out.println("Side2 :you must enter number above zero!!");
        }
        this.s2 = s2;
    }

    public double getS3() {
        return this.s3;
    }

    public void setS3(double s3) {
        if (s3 <= 0) {
            System.out.println("Side 3: you must enter number above zero!!");
        }
        this.s3 = s3;
    }

    public static boolean checkTriangle(double s1, double s2, double s3) {
        if (s1 + s2 > s3 && s1 + s3 > s2 && s2 + s3 > s1) {
            return true;
        }
        return false;
    }

    @Override
    public double getArea() {
        double area = (s1 + s2 + s3) / 2;
        return Math.sqrt((area * (area - s1)) * (area - s2) * (area - s3));
    }

    @Override
    public double getPerimeter() {
        return s1 + s2 + s3;
    }


    @Override
    public String toString() {
        return "\n" +
              "Triangle: side1 = "+ getS1() +" side2 = " + getS2() + " side3 = " + getS3() +"\nArea : " + getArea() + "\n" + "Perimeter : " + getPerimeter()+"\n"+ super.toString();
    }
}
