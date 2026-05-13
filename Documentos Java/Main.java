import java.time.LocalDate;

public class Main {
  public static void main(String[] args) {

    Animal[] animals = new Animal[6];
    Mammal[] mammals = new Mammal[6];
    Bird[] birds = new Bird[6];
    int contador = 0;
    int contadorpajaros = 0;
    int contadortotal = 0;
    animals[0] = new Mammal("Simba", "Lion", LocalDate.of(2008, 3, 15), true, 4, Habitat.OUTDOOR );
    animals[1] = new Bird("Tweety", "Canary", LocalDate.of(2021,9,5),  true, 25, Habitat.INDOOR);
    animals[2] = new Mammal("Dumbo", "Elephant", LocalDate.of(2010,11,22), false, 4, Habitat.OUTDOOR);
    animals[3] = new Bird("Pingu", "Pengüin", LocalDate.of(2019,2,14),  false, 45, Habitat.OUTDOOR);
    animals[4] = new Mammal("Luna", "Dolphin", LocalDate.of(2015, 4,7), true, 0, Habitat.AQUATIC);
    animals[5] = new Animal("Rex", "Komodo dragon", LocalDate.of(2015,8,8), "Reptil", Habitat.OUTDOOR);


    // Añadir los animales a sus respectivas listas
    for (Animal b : animals) {
      if (b instanceof Bird) {
        birds[contador] = (Bird) animals[contadortotal];
        System.out.println(animals[contadortotal].getTexto()+"Birds");
        contadorpajaros++;
      } else if (b instanceof Mammal) {
        mammals[contador] = (Mammal) animals[contadortotal];
        System.out.println(animals[contadortotal].getTexto()+"Mammals");
        contador++;
      } else {
        System.out.println("El animal " + animals[contadortotal].getName() + " does not belong to any animal group because is a "+b.getCategory());
      }
      contadortotal++;
    }

    // Mostrar información de mammals

    System.out.println("\nMAMMALS: ");
    for (Mammal m : mammals) {
      if (m != null) {
        System.out.println(m);
      }
    }
    System.out.println("\nBirds: ");
    for (Bird b : birds) {
      if (b != null) {
        System.out.println(b);
      }
    }

  }
}