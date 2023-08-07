package  designpattern.strategy;

/**
 * Created by IntelliJ IDEA.
 * User: goyalamit
 * Date: Jul 18, 2011
 * Time: 1:27:08 PM
 * To change this template use File | Settings | File Templates.
 */
public abstract class GenericEmployee extends CompanyMember {

    ValidatorStrategy strategy;
    public void setSalary(int salary) {
        super.setSalary(salary);
        strategy = new AtmostValidator();
        strategy.validate(new String[]{String.valueOf(salary), String.valueOf(1000)});
    }

    public void setManagerName(String name) {
        super.setManagerName(name);
        strategy =new EmptyValidator();
        strategy.validate(new String[]{name});
        this.mgrName = name;
    }

    public void setMonthsSpent(int months) {
        strategy = new AtleastValidator();
        strategy.validate(new String[]{String.valueOf(months), String.valueOf(0)});
    }
}
