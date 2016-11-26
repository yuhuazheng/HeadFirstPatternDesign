package org.hfpd.Composite;

/**
 * Created by yuhzheng on 11/25/16.
 */
public class waiter {
    MenuComponent allMenus;

    public waiter(MenuComponent allMenus){
        this.allMenus=allMenus;
    }

    public void printMenu(){
        allMenus.print();
    }
}
