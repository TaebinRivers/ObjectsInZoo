/**
 * Created by h205p4 on 2/18/20.
 */
public class Unicorn extends Animal{

    public Unicorn(String name) {

        super(name, "marshmallows");

    }


    public void sleep() {
        // complete your sleep function here, noting the change from global to properties
        System.out.println(name + " sleeps in a cloud");
    }


}
