package designpattern.strategy;

/**
 * Created by IntelliJ IDEA.
 * User: goyalamit
 * Date: Jul 18, 2011
 * Time: 1:14:31 PM
 * To change this template use File | Settings | File Templates.
 */
public abstract class CompanyMember {
    private String name;
    protected String mgrName;
    protected int salary;
    protected int monthsSpent;

    ValidatorStrategy strategy;

    public void setName(String name) {
        strategy = new LengthValidator();
        strategy.validate(new String[]{name, String.valueOf(50)});
        this.name = name;
    }


    public void setSalary(int salary) {

        strategy = new AtleastValidator();
        strategy.validate(new String[]{String.valueOf(salary), String.valueOf(1)});
    }

    public void setManagerName(String name) {
        strategy = new LengthValidator();
        strategy.validate(new String[]{name, String.valueOf(50)});
    }
}

