package  designpattern.strategy;

/**
 * Created by IntelliJ IDEA.
 * User: goyalamit
 * Date: Jul 18, 2011
 * Time: 1:35:40 PM
 * To change this template use File | Settings | File Templates.
 */
public class SeniorEmployee extends GenericEmployee {
    private int setMaxBonus;

    ValidatorStrategy strategy;

    @Override
    public void setSalary(int salary) {
        super.setSalary(salary);
        strategy = new AtleastValidator();
        strategy.validate(new String[]{String.valueOf(salary), String.valueOf(200)});
        this.salary = salary;
    }

    @Override
    public void setMonthsSpent(int months) {
        super.setMonthsSpent(months);
        strategy = new AtleastValidator();
        strategy.validate(new String[]{String.valueOf(months), String.valueOf(60)});
        this.monthsSpent = months;
    }

    public void setMaxBonus(int bonus) {
        strategy = new AtleastValidator();
        strategy.validate(new String[]{String.valueOf(bonus), String.valueOf(1)});
        this.setMaxBonus = bonus;
    }
}
