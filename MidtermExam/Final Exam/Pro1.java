public class Pro1 {
    public static void main(String[] args) {
        Motorcycle1 mo1 = new Motorcycle1("Yamaha","XSR",700,6100); 
        Motorcycle1 mo2 = new Motorcycle1("Honda","Rebel",500,5200);
        Motorcycle1 mo3 = new Motorcycle1("Harlay","48",1000,9000,2016);
        Motorcycle1 mo4 = new Motorcycle1("Ducati","Panigale",1000,12000,2019);

        mo1.setCc(900);
        mo3.setYearModel(2030);

        System.out.println("!!!!Welcome to your Garage!!!!");
        System.out.println("------------------------------------------------------------");
        System.out.println();
        mo1.display();
        System.out.println("This car Hp: " + mo1.calculateHp());//behavior คำนวณแรงม้า
        System.out.println();
        System.out.println("------------------------------------------------------------");
        mo2.display();
        System.out.println("This car Hp: " + mo2.calculateHp());//behavior คำนวณแรงม้า
        System.out.println();
        System.out.println("------------------------------------------------------------");
        System.out.println();
        mo3.display();
        System.out.println("This car Hp: " + mo3.calculateHp());//behavior คำนวณแรงม้า
        System.out.println();
        System.out.println("------------------------------------------------------------");
        System.out.println();
        mo4.display();
        System.out.println("This car Hp: " + mo4.calculateHp());//behavior คำนวณแรงม้า
        System.out.println();
        System.out.println("------------------------------------------------------------");
        System.out.println("************************************************************");
        System.out.println("Number of cars in the garage :" + Motorcycle1.numberOfCar );
        System.out.println("************************************************************");
    }
}