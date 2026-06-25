import java.util.ArrayList;
import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {

        ArrayList<Animal> animals = new ArrayList<>();
        ArrayList<Mammal> mammals = new ArrayList<>();
        ArrayList<Bird> birds = new ArrayList<>();

        animals.add(new Mammal("Simba",
                "Lion",
                LocalDate.of(2018,3,15),
                Habitat.OUTDOOR,
                true, 6  ));

        animals.add(new Bird("Tweety",
                "Canary",
                LocalDate.of(2021, 9, 5),
                Habitat.INDOOR,
                true,
                25.0));

        animals.add(new Mammal("Dumbo",
                "Elephant",
                LocalDate.of(2010, 11, 22),
                Habitat.OUTDOOR,
                false,
                4));

        animals.add(new Bird("Pingu",
                "Penguin",
                LocalDate.of(2019, 2, 14),
                Habitat.OUTDOOR,
                false,
                45.0));

        animals.add(new Mammal("Luna",
                "Dolphin",
                LocalDate.of(2015, 4, 7),
                Habitat.ACUATIC,
                true,
                0));

        animals.add(new Animal("Rex",
                "Komodo dragon",
                LocalDate.of(2015, 4, 7),
                "Reptile",
                Habitat.OUTDOOR));

        System.out.println("\nITERATING THROUGH ALL ANIMALS:");

        for (Animal animal : animals) {
            if (animal instanceof Mammal) {
                mammals.add((Mammal) animal);
                System.out.println("The animal named "+ animal.getName() +" has been added to the list of mammals");
            }else if (animal instanceof Bird) {
                birds.add((Bird) animal);
                System.out.println("The animal named "+ animal.getName() +" has been added to the list of birds");
            }else {
                System.out.println("The animal named "+ animal.getName()+" does not belong to any animal group because its type is: "+ animal.getCategoria());
            }
        }
        System.out.println("\nMAMMALS:");
        for(Mammal mammal : mammals) {
            System.out.println(mammal.getName()+ " "+"("+mammal.getSpecies()+")"+" was born on "+mammal.getDateOfBirth()+" lives in an "+ mammal.getHabitat()+", is carnivore: "+ mammal.getCarnivore()+ " has "+ mammal.getNumberOfLegs()+" legs." );
        }
        System.out.println("\nBIRDS:");
        for(Bird bird : birds) {
            System.out.println(bird.getName() + " (" +  bird.getSpecies()+ ") was born on "+ bird.getDateOfBirth() +" lives in an "+ bird.getHabitat()+ ", can fly: "+ bird.getCanFly()+" wingspan: "+ bird.getWingSpancm()+" cm" );
        }
    }
}
