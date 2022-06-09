public class Pro3 {
    public static void main(String[] args) throws Exception {
        Octagon shape1  = new Octagon(5);
        Octagon shape2;
        System.out.println("====================================================================");
        System.out.println(shape1);
        shape2 = shape1.clone();
        System.out.println("====================================================================");
        System.out.println("*************************Clone Octagon******************************");
        System.out.println(shape2);
        System.out.println("********************************************************************");
        int compare = shape1.compareTo(shape2);
        if (compare == 0) {
            System.out.println("--------------------->Octagon is equal!!!<--------------------------");
        }
        else{
            System.out.println("--------------------->Octagon is not equal!!!<----------------------");
        }
    }
}