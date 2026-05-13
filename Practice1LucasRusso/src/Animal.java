import java.time.LocalDate;

public class Animal {
    protected String name;
    protected String species;
    protected LocalDate birthDate;
    protected Habitat habitat;
    protected String category;

    public Animal(String name, String species, LocalDate birthDate, Habitat habitat) {
        this.name = name;
        this.species = species;
        this.birthDate = birthDate;
        this.habitat = habitat;
    }
    public Animal(String name, String species, LocalDate birthDate,String category, Habitat habitat) {
        this.name = name;
        this.species = species;
        this.birthDate = birthDate;
        this.category = category;
        this.habitat = habitat;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
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

    public LocalDate getBirthDate() {
        return birthDate;
    }

    public void setBirthDate(LocalDate birthDate) {
        this.birthDate = birthDate;
    }

    public Habitat getHabitat() {
        return habitat;
    }

    public void setHabitat(Habitat habitat) {
        this.habitat = habitat;
    }

    @Override
    public String toString() {
        return "Animal{" +
                "name='" + name + '\'' +
                ", species='" + species + '\'' +
                ", birthDate=" + birthDate +
                ", habitat=" + habitat +
                '}';
    }
}
