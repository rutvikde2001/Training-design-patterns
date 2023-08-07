package designpattern.strategy;

class EmptyValidator implements ValidatorStrategy {

    @Override
    public void validate(String[] args) {
        if (args[0] == null || args[0].length() == 0)
            throw new RuntimeException("not empty check failed for value:" + args[1]);
    }


}
