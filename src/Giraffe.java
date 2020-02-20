/**
 * Created by h205p4 on 2/18/20.
 */
public class Giraffe extends Animal{

    public Giraffe(String name) {

        super(name, "leaves");

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


}