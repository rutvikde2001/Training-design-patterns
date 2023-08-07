package designpattern.abstractfactory;

/**
 * Created by IntelliJ IDEA.
 * User: goyalamit
 * Date: Jul 18, 2011
 * Time: 6:34:34 PM
 * To change this template use File | Settings | File Templates.
 */
public class PhoneMaker {

    public Case buildPhone(String phoneType) {
        Case phoneCase;
        if (phoneType.equals("Android")) {
            phoneCase = new AndroidFactory().buildPhone();
        } else {
            phoneCase = new IphoneFactory().buildPhone();
        }
        return phoneCase;
    }
}
