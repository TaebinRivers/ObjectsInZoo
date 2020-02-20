/**
 * Created by h205p4 on 2/13/20.
 */
public class Bear extends Animal{

    public Bear(String name) {

        super(name, "fish");

    }


    public void sleep() {
        // complete your sleep function here, noting the change from global to properties
        System.out.println(name + " hibernates for 4 months.");
    }


}
