/**
 * Created by h205p4 on 2/13/20.
 */
public class Runner {

    public static void main(String[] args) {

        Runner r = new Runner();
        r.sleep("Tigger");
        r.eat("Tigger", "bacon");

        Tiger tigger = new Tiger("Tigger");
        tigger.eat("meat");
        tigger.eat("kibble");
        Bear pooh = new Bear("Pooh");
        pooh.eat("fish");
        pooh.eat("meat");
        Unicorn rarity = new Unicorn("Rarity");
        rarity.eat("marshmallows");
        Giraffe gemma = new Giraffe("Gemma");
        gemma.eat("meat");
        gemma.eat("leaves");
        Bee stinger = new Bee("Stinger");
        stinger.eat("ice cream");
        stinger.eat("pollen");

        Animal[] animals = {tigger, pooh, rarity, gemma, stinger};

        Zookeeper z = new Zookeeper("Zoebot");
        z.feedAnimals(animals, "steak", Animal.population);
    }



    String favoriteFood = "bacon";

    public void sleep(String name) {

        System.out.println(name + " sleeps for 8 hours.");
    }

    public void eat(String name, String food) {

        System.out.println(name + " eats " + food);
        if(food == favoriteFood) {

            System.out.println("YUM!!! " + name + " wants more " + food);

        }else {

            sleep(name);

        }

    }

}
