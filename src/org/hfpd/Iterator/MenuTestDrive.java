package org.hfpd.Iterator;

/**
 * Created by yuhzheng on 11/25/16.
 */
public class MenuTestDrive {
    public static void main(String[] args) {
        PancakeHouseMenu pancakeHouseMenu = new PancakeHouseMenu();
        DinerMenu dinerMenu = new DinerMenu();
        Waiter w = new Waiter(pancakeHouseMenu,dinerMenu);
        w.printMenu();
    }
}
