public class Model extends Brand implements Comparable<Model>,Cloneable {
    private String nameModel;

    public Model() {
    }

    public Model(int cc,int yearModel,int torque,String name,String nameModel) {
        super(cc, yearModel, torque, name);
        this.nameModel = nameModel;
    }

    public String getNameModel() {
        return this.nameModel;
    }

    public void setNameModel(String name) {
        this.nameModel = name;
    }

    public Model nameModel(String name) {
        setName(name);
        return this;
    }
    @Override
    public String toString() {
        
        return "******************************************************************" +"\n"
                +"This is your car!!!"+"\n"
                + "Brand : " + this.getName()+"\n"
                + "Model : " + this.getNameModel()+"\n"
                + "yearModel : " + this.getYearModel() + "\n"
                + "Car Hp : " + this.hpCalculate() + "\n"
                + "CC : " + this.getCc() + "\n"
                + "******************************************************************";
    }

    @Override
    public double hpCalculate() {
        return 5200*this.getTorque()/5252 ;
    }

    @Override
    public int compareTo(Model o) {
        if (hpCalculate() > o.hpCalculate()) 
            return 1;
        else if (hpCalculate() < o.hpCalculate()) 
            return -1;
        return 0;
    }

    protected Model clone()throws CloneNotSupportedException {
        return (Model)super.clone();
    }
    
}
