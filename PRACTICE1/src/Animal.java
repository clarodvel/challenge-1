import java.time.LocalDate;
import java.util.Date;

public class Animal {
    protected String name;
    protected String species;
    protected LocalDate dateOfBirth;
    protected Habitat habitat;
    protected String categoria;

    public Animal(String name, String species, LocalDate dateOfBirth, Habitat habitat) {
        this.name = name;
        this.species = species;
        this.dateOfBirth = dateOfBirth;
        this.habitat = habitat;
    }
    public Animal(String name, String species, LocalDate dateOfBirth, String categoria, Habitat habitat) {
        this.name = name;
        this.species = species;
        this.dateOfBirth = dateOfBirth;
        this.categoria = categoria;
        this.habitat = habitat;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSpecies() {
        return species;
    }

    public void setSpecies(String species) {
        this.species = species;
    }

    public LocalDate getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(LocalDate dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public Habitat getHabitat() {
        return habitat;
    }

    public void setHabitat(Habitat habitat) {
        this.habitat = habitat;
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    @Override
    public String toString() {
        return "Animal{" +
                "name='" + name + '\'' +
                ", species='" + species + '\'' +
                ", dateOfBirth=" + dateOfBirth +
                ", habitat=" + habitat +
                '}';
    }
}
