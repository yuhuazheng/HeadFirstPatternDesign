package org.hfpd.Iterator;

import java.util.ArrayList;

/**
 * Created by yuhzheng on 11/25/16.
 */
public class PancakeHouseMenu implements Menu{

     private ArrayList<MenuItem> menuItems;

    public PancakeHouseMenu(){
        menuItems = new ArrayList<>();
        addItem("regular pancake","pancake with fried eggs, sausage", 2.99, false);
    }

    public void addItem(String name,
                        String description,
                        double price,
                        boolean vegetarian){
        MenuItem item = new MenuItem(name,description,vegetarian,price);
        menuItems.add(item);
    }

    public ArrayList<MenuItem> getMenuItems() {
        return menuItems;
    }

    public MyIterator getIterator(){
        return new PancakeMenuIterator(menuItems);
    }
}
