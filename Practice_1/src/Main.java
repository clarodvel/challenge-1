import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Locale;

public class Main{
     public static void main(String[] args){
         List<Animal> animals = new ArrayList<>();
         animals.add(new Mammal("Simba", "Lion", LocalDate.of(2018, 3, 15), Habitat.OUTDOR, true, 4));
         animals.add(new Bird("Tweety", "Canary", LocalDate.of(2021, 9, 5), Habitat.INDORR, true, 25));
         animals.add(new Mammal("Dumbo", "Elephant", LocalDate.of(2010, 11, 22), Habitat.OUTDOR, false, 4));
         animals.add(new Bird("Pingu", "Pengüin", LocalDate.of(2019, 2, 14), Habitat.OUTDOR, false, 45));
         animals.add(new Mammal("Luna", "Dolphin", LocalDate.of(2015, 4, 7), Habitat.AQUATIC, true, 0));
         animals.add(new Animal("Rex", "Komodo dragon", LocalDate.of(2015, 8, 8), Habitat.OUTDOR));

         List<Mammal> mammals = new ArrayList<>();
         List<Bird> birds = new ArrayList<>();

         System.out.println("ITERATING THROUGH ALL ANIMALS:");
         for (Animal a: animals){
             if(a instanceof Mammal){
                 mammals.add((Mammal) a);
                 System.out.println("The animal named " + a.getName() + " has been added to the list of mammals");
             } else if (a instanceof Bird) {
                 birds.add((Bird) a);
                 System.out.println("The animal named " + a.getName() + " has been added to the list of birds");
             } else {
                 System.out.println("The animal named " + a.getName() + " does not belong to any animal group because its type is: Reptile");
             }
         }
         System.out.println("");
         System.out.println("MAMMALS:");
         for (Mammal m: mammals){
             System.out.println(m);
         }

         System.out.println("");
         System.out.println("BIRDS:");
         for (Bird b: birds){
             System.out.println(b);
         }
    }
}
