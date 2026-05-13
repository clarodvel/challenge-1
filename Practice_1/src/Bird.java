import java.time.LocalDate;
import java.util.Date;

public class Bird extends Animal{
    private Boolean fly;
    private float wingspan;


    public Bird(String name, String species, LocalDate dateOfBirth, Habitat habitat, Boolean fly, float wingspan) {
        super(name, species, dateOfBirth, habitat);
        this.fly = fly;
        this.wingspan = wingspan;
    }

    public Boolean getFly() {
        return fly;
    }

    public float getWingspan() {
        return wingspan;
    }

    @Override
    public String toString() {
        return super.toString() + ", can fly: " + fly + ", wingspan " + wingspan + " cm";
    }
}
