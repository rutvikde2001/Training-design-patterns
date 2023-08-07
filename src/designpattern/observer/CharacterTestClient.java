package  designpattern.observer;

import java.util.ArrayList;

/**
 * Created by IntelliJ IDEA.
 * User: joelrosario
 * Date: Jul 21, 2011
 * Time: 12:26:53 AM
 * To change this template use File | Settings | File Templates.
 */
public class CharacterTestClient {
    private Cat cat;
    private Person person;
    private Dog dog;
    private Robot robot;
    private ArrayList<Subscriber> subscribers;


    public CharacterTestClient() {
        robot = new Robot();
        dog = new Dog();
        person = new Person();
        cat = new Cat();
        subscribers = new ArrayList<Subscriber>();
        addSubscriber(person);
        addSubscriber(cat);
        addSubscriber(dog);
        addSubscriber(robot);
    }

    public void addSubscriber(Subscriber subscriber){
        subscribers.add(subscriber);
    }

    public boolean testOutdoors() {
        robot.goOutdoors();
        person.goOutdoors();
        cat.goOutdoors();
        dog.goOutdoors();

        return robot.isOutdoors() && person.isOutdoors() && cat.isOutdoors() && dog.isOutdoors();
    }

    public boolean testSunRose() {
        for(int i = 0; i < subscribers.size();i++){
            subscribers.get(i).notifySunRose();
        }

        return robot.isFeelingWarm() && person.isFeelingWarm() && cat.isFeelingWarm() && dog.isFeelingWarm();
    }

    public boolean testSunSet() {
        for(int i = 0; i < subscribers.size();i++){
            subscribers.get(i).notifySunSet();
        }

        return !robot.isFeelingWarm() && !person.isFeelingWarm() && !cat.isFeelingWarm() && !dog.isFeelingWarm();
    }

    public boolean testIndoors() {
        robot.goIndoors();
        person.goIndoors();
        cat.goIndoors();
        dog.goIndoors();

        return !robot.isOutdoors() && !person.isOutdoors() && !cat.isOutdoors() && !dog.isOutdoors();
    }
}