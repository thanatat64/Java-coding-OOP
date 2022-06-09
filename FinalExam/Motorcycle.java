
public class Motorcycle {
    private int cc;
    private int yearModel;
    private int torque;
    private int hp;//hoursePower
    Motorcycle(){

    }
    Motorcycle(int cc,int yearModel,int torque){
        this.cc = cc;
        this.yearModel = yearModel;
        this.torque = torque;
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

    public int getHp() {
        return this.hp;
    }

    public void setHp(int hp) {
        this.hp = hp;
    }
}