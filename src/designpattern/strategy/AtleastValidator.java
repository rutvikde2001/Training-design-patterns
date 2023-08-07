package designpattern.strategy;

class AtleastValidator implements ValidatorStrategy {

    @Override
    public void validate(String[] args) {
        if (Integer.parseInt(args[0]) < Integer.parseInt(args[1]))
            throw new RuntimeException("at least check failed:" + Integer.parseInt(args[0]));
    }

}
