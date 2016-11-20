package org.hfpd.Adapter;

/**
 * Created by yuhzheng on 11/19/16.
 */
public class AdapterTest {
    public static void main(String[] args) {
        WildTurkey turkey = new WildTurkey();
        SimpleDuck adapter = new TurkeyAdapter(turkey);

        System.out.println("test turkey");
        turkey.gobble();
        turkey.fly();

        System.out.println("test adapter");
        testDuck(adapter);

    }

    static void testDuck(SimpleDuck d){
        d.quack();
        d.fly();
    }
}
