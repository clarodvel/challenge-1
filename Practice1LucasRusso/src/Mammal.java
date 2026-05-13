import java.time.LocalDate;

public class Mammal extends Animal{
    private boolean carnivore;
    private int legs;

    public Mammal(String name, String species, LocalDate birthDate, Habitat habitat, boolean carnivore, int legs) {
        super(name, species, birthDate, habitat);
        this.carnivore = carnivore;
        this.legs = legs;
    }

    public boolean getCarnivore() {
        return carnivore;
    }

    public void setCarnivore(boolean carnivore) {
        this.carnivore = carnivore;
    }

    public int getLegs() {
        return legs;
    }

    public void setLegs(int legs) {
        this.legs = legs;
    }

    @Override
    public String toString() {
        return name+" ("+species+") was born on "+birthDate+", lives in an "+habitat+" habitat, is carnivore: "+carnivore+", has "+legs+" legs";
    }
}
