import java.time.LocalDate;

public class Animal {

    protected String Name;
    protected String Especies;
    protected LocalDate DateOfBirth;
    protected String category;
    public Animal(String name, String especies, LocalDate dateOfBirth, Habitat habitat) {
        Name = name;
        Especies = especies;
        DateOfBirth = dateOfBirth;
    }

    public Animal(String name, String especies, LocalDate dateOfBirth,String category ,Habitat habitat) {
        Name = name;
        Especies = especies;
        DateOfBirth = dateOfBirth;
        this.category = category;
    }

    public String getCategory() {
        return category;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public String getEspecies() {
        return Especies;
    }

    public void setEspecies(String especies) {
        Especies = especies;
    }

    public LocalDate getDateOfBirth() {
        return DateOfBirth;
    }

    public void setDateOfBirth(LocalDate dateOfBirth) {
        DateOfBirth = dateOfBirth;
    }

    public String getTexto() {
        return "The animal named "+getName()+" has been added to the list of ";
    }
}
