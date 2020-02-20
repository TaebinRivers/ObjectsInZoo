/**
 * Created by h205p4 on 2/18/20.
 */
public class Bee extends Animal{

    public Bee(String name) {

        super(name, "pollen");

    }

    public void eat(String food) {
        // complete your eat function here!
        if(food == favoriteFood) {
            System.out.println(name + " eats " + food);
            System.out.println("YUM!!! " + name + " wants more " + food);

            sleep();

        } else {

            System.out.println("Yuck!!! " + name + " will not eat " + food);

        }
    }


    public void sleep() {
        // complete your sleep function here, noting the change from global to properties
        System.out.println(name + " never sleeps.");
    }


}
