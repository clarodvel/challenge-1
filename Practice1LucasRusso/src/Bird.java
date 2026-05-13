import java.time.LocalDate;

public class Bird extends Animal {
    private boolean fly;
    private double wingspan;

    public Bird(String name, String species, LocalDate birthDate, Habitat habitat, boolean fly, int wingspan) {
        super(name, species, birthDate, habitat);
        this.fly = fly;
        this.wingspan = wingspan;
    }

    public boolean getFly() {
        return fly;
    }

    public void setFly(boolean fly) {
        this.fly = fly;
    }

    public double getWingspan() {
        return wingspan;
    }

    public void setWingspan(int wingspan) {
        this.wingspan = wingspan;
    }

    @Override
    public String toString() {
        return name+" ("+species+") was born on "+birthDate+", lives in an "+habitat+" habitat, can fly: "+fly+", wingspan: "+wingspan+" cm";
    }
}
