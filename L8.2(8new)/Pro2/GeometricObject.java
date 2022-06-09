import java.util.Date;

public abstract class GeometricObject implements Comparable<GeometricObject> {
    private String color;
    private boolean filled;
    private Date dateCreated = new Date();

    protected GeometricObject() {
    }

    protected GeometricObject(String color, boolean filled) {
        this.color = color;
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

    @Override
    public String toString() {
        return "[" +
                "dateCreated=" + getDateCreated() +
                " ]";
    }

    public abstract double getArea();

    public abstract double getPerimeter();

    @Override
    public int compareTo(GeometricObject o) {
        if (this.getArea() == o.getArea()) {
            return 0;
        }
        else if (this.getArea() > o.getArea()) {
            return 1;
        }
        else {
            return -1;
        }
    }

    public static GeometricObject max(GeometricObject o1, GeometricObject o2) {
        if(o1.compareTo(o2) == 1) {
            return o1;
        }
        else if(o1.compareTo(o2) == -1) {
            return o2;
        }
        else {
            return o1;
        }
    }
}
