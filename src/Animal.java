/**
 * Created by h205p4 on 2/13/20.
 */
public class Animal {
    // put your properties here!
    public String name;
    public String favoriteFood;
    public static int population = 0;

    public Animal(String name, String favFood) {
        // put your constructor content here
        this.name = name;
        favoriteFood = favFood;
        population++;
    }

    public void sleep() {
        // complete your sleep function here, noting the change from global to properties
        System.out.println(name + " sleeps for 8 hours.");
    }

    public void eat(String food) {
        // complete your eat function here!
        System.out.println(name + " eats " + food);
        if(food == favoriteFood) {

            System.out.println("YUM!!! " + name + " wants more " + food);

        }else {

            sleep();

        }
    }

    public static void main(String[] args) {


    }

}
