package  designpattern.observer;

import java.util.ArrayList;

/**
 * Created by IntelliJ IDEA.
 * User: joelrosario
 * Date: Jul 20, 2011
 * Time: 9:12:58 PM
 * To change this template use File | Settings | File Templates.
 */
public class Sun {
    private boolean isUp;
    private final Robot robot;
    private final Person person;
    private final Dog dog;
    private final Cat cat;

    private ArrayList<Subscriber> subscribers;

    public Sun(Robot robot, Person person, Dog dog, Cat cat) {
        this.robot = robot;
        this.person = person;
        this.dog = dog;
        this.cat = cat;
        subscribers = new ArrayList<Subscriber>();
        addSubscriber(person);
        addSubscriber(cat);
        addSubscriber(dog);
        addSubscriber(robot);
    }

    public void addSubscriber(Subscriber subscriber){
        subscribers.add(subscriber);
    }
    public void removeObserver(Subscriber observer) {
        subscribers.remove(observer);
    }

    public boolean isUp() {
        return isUp;
    }

    public void set() {
        isUp = false;

        for(int i = 0; i < subscribers.size();i++){
            if(subscribers.get(i).isOutdoors()){
                subscribers.get(i).notifySunSet();
            }
        }
    }

    public void rise() {
        isUp = true;

        for(int i = 0; i < subscribers.size();i++){
            if(subscribers.get(i).isOutdoors()){
                subscribers.get(i).notifySunRose();
            }
        }
    }
}