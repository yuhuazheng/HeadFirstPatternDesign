package org.hfpd.Iterator;

/**
 * Created by yuhzheng on 11/25/16.
 */
public class Waiter {
    Menu pancakeHouseMenu;
    Menu dinerMenu;

    public Waiter(Menu p, Menu d){
        pancakeHouseMenu=p;
        dinerMenu=d;
    }

    public void printMenu(){
        MyIterator pIterator = pancakeHouseMenu.getIterator();
        MyIterator dIterator = dinerMenu.getIterator();
        System.out.println("breakfast");
        printMenuFromIterator(pIterator);
        System.out.println("lunch");
        printMenuFromIterator(dIterator);
    }

    private void printMenuFromIterator(MyIterator it){
        while(it.hasNext()) {
            MenuItem item = (MenuItem) it.next();
            System.out.println(item.getName() + ", " + item.getDescription() + ", " + item.getPrice() + ", " + item.isVegetarian());
        }
    }
}
