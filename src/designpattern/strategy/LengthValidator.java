package designpattern.strategy;

class LengthValidator implements ValidatorStrategy {


    @Override
    public void validate(String[] args) {
        if (args[0].length() > Integer.parseInt(args[1]))
            throw new RuntimeException("Invalid length:" + Integer.parseInt(args[1]));
    }


}
