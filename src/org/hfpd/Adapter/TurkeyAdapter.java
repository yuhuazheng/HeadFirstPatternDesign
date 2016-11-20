package org.hfpd.Adapter;


/**
 * Created by yuhzheng on 11/19/16.
 */
public class TurkeyAdapter implements SimpleDuck {
    Turkey turkey;

    public TurkeyAdapter(Turkey t){
        turkey = t;
    }

    public void quack(){
        turkey.gobble();
    }

    public void fly(){
        for(int i=0;i<5;i++)
            turkey.fly();
    }
}
