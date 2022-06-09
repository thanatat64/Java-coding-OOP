public class Pro2 {
    public static void main(String[] args) {
        RegularPolygon rec = new RegularPolygon();
        RegularPolygon rec2 = new RegularPolygon(6,4);
        RegularPolygon rec3 = new RegularPolygon(10, 4, 5.6, 7.8);
        System.out.println(rec.getPerimeter());
        System.out.println(rec.getArea());
        System.out.println(rec2.getPerimeter());
        System.out.println(rec2.getArea());
        System.out.println(rec3.getPerimeter());
        System.out.println(rec3.getArea());
    }
}
