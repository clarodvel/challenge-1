import java.time.LocalDate;
import java.util.Date;

public class Mammal extends Animal{
    private Boolean carnivore;
    private int numLegs;

    public Mammal(String name, String species, LocalDate dateOfBirth, Habitat habitat, Boolean carnivore, int numLegs) {
        super(name, species, dateOfBirth, habitat);
        this.carnivore = carnivore;
        this.numLegs = numLegs;
    }

    public Boolean getCarnivore() {
        return carnivore;
    }

    public int getNumLegs() {
        return numLegs;
    }

    @Override
    public String toString() {
        return super.toString() + ", is carnivore: " + carnivore + ", has " + numLegs + " legs";
    }
}
