package org.hfpd.Singleton;

/**
 * Created by yuhzheng on 11/15/16.
 */
public class Singleton {
    private volatile static Singleton uniqueInstance;

    private Singleton(){}

    public static Singleton getInstance(){
        if(uniqueInstance == null){
            synchronized (Singleton.class){
                if(uniqueInstance == null)
                    uniqueInstance = new Singleton();
            }
        }
        return uniqueInstance;
    }
}
