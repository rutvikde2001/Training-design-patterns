package designpattern.decorator;

import javax.security.auth.login.CredentialException;

public class BaseEvaluator implements Criteria{

    private Criteria wrapper;

    BaseEvaluator(Criteria wrap){
        this.wrapper = wrap;
    }


    @Override
    public boolean evaluate(Application theApp) {
        return this.wrapper.evaluate(theApp);
    }
}
