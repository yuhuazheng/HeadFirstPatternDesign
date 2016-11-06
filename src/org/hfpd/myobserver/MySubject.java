package org.hfpd.myobserver;

/**
 * Created by yuhzheng on 11/5/16.
 */
public interface MySubject {
    public void registerObserver(MyObserver o);
    public void removeObserver(MyObserver o);
    public void notifyObserver();
}
