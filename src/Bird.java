import java.time.LocalDate;

public class Bird extends Animal {
    private Boolean canFly;
    private double wingSpancm;

    public Bird(String name, String species, LocalDate dateOfBirth, Habitat habitat, Boolean canFly, double wingSpancm) {
        super(name, species, dateOfBirth, habitat);
        this.canFly = canFly;
        this.wingSpancm = wingSpancm;
    }

    public Boolean getCanFly() {
        return canFly;
    }

    public void setCanFly(Boolean canFly) {
        this.canFly = canFly;
    }

    public double getWingSpancm() {
        return wingSpancm;
    }

    public void setWingSpancm(double wingSpancm) {
        this.wingSpancm = wingSpancm;
    }

    @Override
    public String toString() {
        return "Bird{" +
                "canFly=" + canFly +
                ", wingSpancm=" + wingSpancm +
                ", name='" + name + '\'' +
                ", species='" + species + '\'' +
                ", dateOfBirth=" + dateOfBirth +
                ", habitat=" + habitat +
                '}';
    }
}
