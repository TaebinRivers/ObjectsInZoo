/**
 * Created by h205p4 on 2/18/20.
 */
public class Zookeeper {

     public String name;


     public Zookeeper(String name) {

         this.name = name;

     }

     public void feedAnimals(Animal[] animals, String food, int numberOfAnimals) {
         System.out.println(name + " is feeding " + food + " to " + numberOfAnimals + " of " + Animal.population + " total animals.");
         System.out.println(name + " is feeding "  + food + " to " + animals.length + " animals.");
         for(int i = 0; i < animals.length; i++) {

             animals[i].eat(food);

         }
     }

}
