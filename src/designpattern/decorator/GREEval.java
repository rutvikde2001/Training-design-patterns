package  designpattern.decorator;

/**
 * Created by IntelliJ IDEA.
 * User: goyalamit
 * Date: Jul 18, 2011
 * Time: 10:28:33 AM
 * To change this template use File | Settings | File Templates.
 */
public class GREEval extends BaseEvaluator {

    GREEval(Criteria wrap) {
        super(wrap);
    }

    @Override
    public boolean evaluate(Application theApp) {
        System.out.println("GREEval called");
        return super.evaluate(theApp)&& theApp.getGre() > 1450;
    }
}
