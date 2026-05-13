import java.time.LocalDate;

public class Mammal extends Animal {

    private int legs;
    private boolean carnivore;
    private Habitat habitat;
    public Mammal(String name, String especies, LocalDate dateOfBirth, boolean carnivore, int legs, Habitat habitat) {
        super(name, especies, dateOfBirth, habitat);
        this.legs = legs;
        this.carnivore = carnivore;
        this.habitat = habitat;
    }

    public Habitat getHabitat() {
        return habitat;
    }

    public int getLegs() {
        return legs;
    }

    public void setLegs(int legs) {
        this.legs = legs;
    }

    public boolean isCarnivore() {
        return carnivore;
    }

    public void setCarnivore(boolean carnivore) {
        this.carnivore = carnivore;
    }

    public String toString() {
        return getName()+" ("+getEspecies()+") was born on "+getDateOfBirth()+" lives in an "+getHabitat()+" is carnivore: "+carnivore+", has "+legs+" legs";
    }
}
