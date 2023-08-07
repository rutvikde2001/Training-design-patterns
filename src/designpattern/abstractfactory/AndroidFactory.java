package designpattern.abstractfactory;

public class AndroidFactory implements PhoneFactory{
    @Override
    public MotherBoard buildMotherboard() {
        MotherBoard motherBoard = new AndroidMotherBoard();
        motherBoard.attachBattery(new Battery());
        motherBoard.attachProcessor(new AndroidProcessor());
        return motherBoard;
    }

    @Override
    public Screen buildScreen() {
        return new AndroidScreen();
    }

    @Override
    public Case buildCase() {
        return new AndroidCase();
    }

    @Override
    public Case buildPhone(){
        Case phoneCase = buildCase();
        phoneCase.attachMotherBoard(buildMotherboard());
        phoneCase.attachScreen(buildScreen());
        return phoneCase;
    }
}
