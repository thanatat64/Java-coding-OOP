public class Octagon extends GeometricObject implements Comparable<Octagon>,Cloneable {
    private double side;
    public Octagon(){
    }
    public Octagon(double side){
        this.side = side;
    }
    public Octagon(String color,boolean filled,double side){
        super(color, filled);
        this.side = side;
    }

    public double getSide() {
        return this.side;
    }

    public void setSide(double side) {
        this.side = side;
    }

    @Override
    protected Octagon clone() throws CloneNotSupportedException {
        return (Octagon)super.clone();
    }

    @Override
    public int compareTo(Octagon o) {
        if (getArea() > o.getArea()) 
            return 1;
        else if (getArea() < o.getArea()) 
            return -1;
        return 0;
    }

    @Override
    public double getArea() {
        return (2 + 4/22) * side * side;
    }

    @Override
    public double getPerimeter() {
        return side*8;
    }

    @Override
    public String toString() {
        return super.toString() + "\n" +
                "Area : " + getArea() + "\n" + "Perimeter :" + getPerimeter();
    }
}
