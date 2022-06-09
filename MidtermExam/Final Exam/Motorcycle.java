public abstract class Motorcycle {
    public static int numberOfCar;
    private String brand;
    private String model;
    private int cc;
    private int yearModel;
    private int torque;
    public Motorcycle(){
    }
    public Motorcycle(String brand,String model,int cc ,int torque) {
        this.brand = brand; 
        this.model = model;
        this.cc = cc;
        this.torque = torque;
        numberOfCar++;
    }
    public Motorcycle(String model, int cc,int torque,int yM){
        this.model = model;
        this.cc = cc;
        this.yearModel = yM;
        this.torque = torque;
        numberOfCar++;
    }
    
    public void display(){
        System.out.println("brand : "+ getType());
        System.out.println("model : " + getModel());
        System.out.println("cc : " + getCc());
        if (getYearModel() == 0) {
            System.out.println("year : unknown" );
        }
        else{
            System.out.println("year : " + getYearModel());
        }
    }
    public String getType() {
        return this.type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getModel() {
        return this.model;
    }

    public void setModel(String model) {
        this.model = model;
    }
    
    public int getCc() {
        return this.cc;
    }
    
    public void setCc(int cc) {
        this.cc = cc;
    }
    public int getYearModel() {
        return this.yearModel;
    }
    
    public void setYearModel(int yearModel) {
        this.yearModel = yearModel;
    }
    
    public int getTorque() {
        return this.torque;
    }
    
    public void setTorque(int torque) {
        this.torque = torque;
    }
    public abstract double calculateHp();
    // {
    //    return 5200*torque/5252 ;
    // }
}
