package designpattern.observer;

public interface Subscriber {

    public void notifySunRose();
    public void notifySunSet();
    public boolean isOutdoors();
}