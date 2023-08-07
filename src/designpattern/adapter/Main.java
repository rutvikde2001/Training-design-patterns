package designpattern.adapter;

public class Main {

    public static void main(String[] args){

        Adapter adapter = new Adapter();

        SalaryDisberser salaryDisberser = new SalaryDisberser(adapter);

        System.out.println(salaryDisberser.salary("Bond, James"));

        FrontDoorRegister frontDoorRegister = new FrontDoorRegister(adapter);

        System.out.println(frontDoorRegister.getDisplayWallOfShame());
    }
}