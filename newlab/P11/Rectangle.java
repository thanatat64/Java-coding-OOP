public class Rectangle extends GeometricObject implements Comparable<Rectangle> {
    private double width;
    private double height;

    public Rectangle() {
    }

    public Rectangle(double width, double height) {
        this.width = width;
        this.height = height;
    }

    public Rectangle(String color, boolean filled, double width, double height) {
        super(color, filled);
        this.width = width;
        this.height = height;
    }

    public double getWidth() {
        return this.width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getHeight() {
        return this.height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    @Override
    public int compareTo(Rectangle o) {
        if (getArea() > o.getArea())
            return 1;
        else if (getArea() < o.getArea())
            return -1;
        else
            return 0;
    }

    @Override
    public boolean equals(Object obj) {
        if (!(obj instanceof Rectangle)) {
            return false;
        }
        return getArea() == ((Rectangle) obj).getArea();
    }

    @Override
    public double getArea() {

        return height * width;
    }

    @Override
    public double getPerimeter() {
        return (height * 2) + (width * 2);
    }

    @Override
    public String toString() {
        return super.toString() + "\n" +
                "Area : " + getArea() + "\n" + "Perimeter :" + getPerimeter();
    }
}
