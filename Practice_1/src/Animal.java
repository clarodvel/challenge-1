import java.time.LocalDate;
import java.util.Date;

public class Animal {
    private String name;
    private String species;
    private LocalDate dateOfBirth;
    private Habitat habitat;

    public Animal(String name, String species, LocalDate dateOfBirth, Habitat habitat) {
        this.name = name;
        this.species = species;
        this.dateOfBirth = dateOfBirth;
        this.habitat = habitat;
    }

    public String getName() {
        return name;
    }

    public String getSpecies() {
        return species;
    }

    public LocalDate getDateOfBirth() {
        return dateOfBirth;
    }

    public Habitat getHabitat() {
        return habitat;
    }

    @Override
    public String toString() {
        return name + " ("+species+") " + "was born on " + dateOfBirth + ", lives in an " + habitat + " habitat";
    }
}
