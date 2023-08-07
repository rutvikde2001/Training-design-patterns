package designpattern.abstractfactory;

public interface PhoneFactory {
    MotherBoard buildMotherboard();

    Screen buildScreen();

    Case buildCase();

    Case buildPhone();
}
