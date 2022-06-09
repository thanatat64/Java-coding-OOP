import java.util.Date;

public abstract class GeometricObject {
    private String color;
    private boolean filled;
    private Date dateCreated = new Date();
    protected GeometricObject() {
    }
    protected GeometricObject(String color,boolean filled) {
        this.color= color;
        this.filled = filled;
    }

    public String getColor() {
        return this.color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public boolean isFilled() {
        return this.filled;
    }
    public void setFilled(boolean filled) {
        this.filled = filled;
    }

    public Date getDateCreated() {
        return this.dateCreated;
    }

    public static void displayObject(Object object){
        if (object instanceof Triangle triangle) {
            System.out.println("side 1 : "+triangle.getS1());
            System.out.println("side 2 : "+triangle.getS2());   
            System.out.println("side 3 : "+triangle.getS3());
            System.out.println("Area : "+ triangle.getArea());
            System.out.println("Perimeter : " + triangle.getPerimeter());
        }
        else if (object instanceof Rectangle rectangle) {
            System.out.println("Width : "+rectangle.getWidth());
            System.out.println("Height : "+rectangle.getHeight());
            System.out.println("Area : "+ rectangle.getArea());
            System.out.println("Perimeter : " + rectangle.getPerimeter());
        }
        else if (object instanceof Circle circle) {
            System.out.println("Area : " + circle.getArea());
            System.out.println("Perimeter : " + circle.getPerimeter());
            System.out.println("Diameter : " + circle.getDiameter());
        }
        else{
            System.out.println("Bruhhhh!! : invalid object");
        }
    }

    @Override
    public String toString() {
        return "[" +
            " color: " + getColor() +
            ", filled: " + isFilled() +
            ", dateCreated: " + getDateCreated() +
            "]";
    }
    public abstract double getArea();
    public abstract double getPerimeter();
}
