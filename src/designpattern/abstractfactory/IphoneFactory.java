package designpattern.abstractfactory;

public class IphoneFactory implements PhoneFactory {
    @Override

    public MotherBoard buildMotherboard() {
        MotherBoard motherBoard = new IphoneMotherBoard();
        motherBoard.attachBattery(new Battery());
        motherBoard.attachProcessor(new IphoneProcessor());
        return motherBoard;
    }

    @Override
    public Screen buildScreen() {
        return new IphoneScreen();
    }

    @Override
    public Case buildCase() {
        return new IphoneCase();
    }

    public Case buildPhone(){
        Case phoneCase = buildCase();
        phoneCase.attachMotherBoard(buildMotherboard());
        phoneCase.attachScreen(buildScreen());
        return phoneCase;
    }
}

