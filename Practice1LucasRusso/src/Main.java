import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Animal simba = new Mammal("Simba", "Lion", LocalDate.of(2018,3,15), Habitat.OUTDOOR, true, 4);
        Animal tweety = new Bird("Tweety", "Canary", LocalDate.of(2021,9,5), Habitat.INDOOR, true, 25);
        Animal dumbo = new Mammal("Dumbo", "Elephant", LocalDate.of(2010,11,22), Habitat.OUTDOOR, false, 4);
        Animal pingu = new Bird("Pingu", "Pengüin", LocalDate.of(2019,2,14), Habitat.OUTDOOR, false, 45);
        Animal luna = new Mammal("Luna", "Dolphin", LocalDate.of(2015,4,7), Habitat.AQUATIC, true, 0);
        Animal rex = new Animal("Rex", "Komodo Dragon", LocalDate.of(2015,8,8),"Reptile", Habitat.OUTDOOR);

        List<Animal> animals = new ArrayList();
        List<Animal> mammals = new ArrayList();
        List<Animal> birds = new ArrayList();

        animals.add(simba);
        animals.add(tweety);
        animals.add(dumbo);
        animals.add(pingu);
        animals.add(luna);
        animals.add(rex);

        for (Animal a : animals) {
            if (a instanceof Mammal) {
                System.out.println("The animal named "+a.getName()+" has been added to the list of mammals");
                mammals.add(a);
            } else if (a instanceof Bird) {
                System.out.println("The animal named "+a.getName()+" has been added to the list of birds");
                birds.add(a);
            } else {
                System.out.println("The animal named "+a.getName()+" does not belong to any animal group because its type is: "+a.getCategory());
            }
        }

        System.out.println("\nMAMMALS:");

        for (int i = 0; i < mammals.size(); i++) {
            System.out.println(mammals.get(i));
        }

        System.out.println("\nBIRDS:");
        int cont = 0;
        while (cont < birds.size()) {
            System.out.println(birds.get(cont));
            cont++;
        }

    }
}