public abstract class Brand extends Motorcycle {
    private String name;

    public Brand() {
    }

    public Brand(int cc,int yearModel,int torque,String name) {
        super(cc, yearModel, torque);
        this.name = name;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Brand name(String name) {
        setName(name);
        return this;
    }
    public abstract double hpCalculate();
    
}
