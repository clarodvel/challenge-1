import java.time.LocalDate;

public class Bird extends Animal {
    private boolean canFly;
    private int WingSpan;
    private Habitat habitat;
    public Bird(String name, String especies, LocalDate dateOfBirth,boolean canFly, int wingSpan,Habitat habitat) {
        super(name, especies, dateOfBirth, habitat);
        this.canFly = canFly;
        WingSpan = wingSpan;
        this.habitat = habitat;
    }

    public boolean isCanFly() {
        return canFly;
    }

    public void setCanFly(boolean canFly) {
        this.canFly = canFly;
    }

    public int getWingSpan() {
        return WingSpan;
    }

    public void setWingSpan(int wingSpan) {
        WingSpan = wingSpan;
    }

    public Habitat getHabitat() {
        return habitat;
    }

    public String toString() {
        return getName()+" ("+getEspecies()+") was born on "+ getDateOfBirth() + " lives in an "+ getHabitat()+" habitat, can fly: " + canFly + " wingspan: "+getWingSpan()+ " cm" ;
    }
}
