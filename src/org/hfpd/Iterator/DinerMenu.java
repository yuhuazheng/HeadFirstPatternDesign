package org.hfpd.Iterator;

import org.hfpd.myobserver.DisplayElement;

/**
 * Created by yuhzheng on 11/25/16.
 */
public class DinerMenu implements Menu{
    static final int MAX_ITEMS = 6;
    private int numberOfItems = 0;

    public MenuItem[] getMenuItems() {
        return menuItems;
    }

    private MenuItem[] menuItems;

    public DinerMenu(){
        menuItems = new MenuItem[MAX_ITEMS];
        addItem("BLT","bacon lettuce and tomato", false, 2.99);
    }

    public void addItem(String name,
                        String description,
                        boolean vegetarian,
                        double price){
        MenuItem item = new MenuItem(name,description,vegetarian,price);
        if(numberOfItems>MAX_ITEMS)
            System.out.println("no capacity");
        else
            menuItems[numberOfItems++] = item;
    }

    public MyIterator getIterator(){
        return new DinerMenuIterator(menuItems);
    }
}
