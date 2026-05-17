import java.time.LocalDate;
import java.util.Date;

public class Mammal extends Animal {
    private Boolean carnivore;
    private int numberOfLegs;

    public Mammal(String name, String species, LocalDate dateOfBirth, Habitat habitat, Boolean carnivore, int numberOfLegs) {
        super(name, species, dateOfBirth, habitat);
        this.carnivore = carnivore;
        this.numberOfLegs = numberOfLegs;
    }

    public Boolean getCarnivore() {
        return carnivore;
    }

    public void setCarnivore(Boolean carnivore) {
        this.carnivore = carnivore;
    }

    public int getNumberOfLegs() {
        return numberOfLegs;
    }

    public void setNumberOfLegs(int numberOfLegs) {
        this.numberOfLegs = numberOfLegs;
    }
}
