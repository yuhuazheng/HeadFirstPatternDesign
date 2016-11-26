package org.hfpd.Composite;

/**
 * Created by yuhzheng on 11/25/16.
 */
public class MenuTestDrive {
    public static void main(String[] args) {
        MenuComponent pancakeMenu = new Menu("pancake menu","breakfast");
        MenuComponent dinerMenu = new Menu("diner menu","lunch");
        MenuComponent cafeMenu = new Menu("cafe menu","dinner");
        MenuComponent dessertMenu = new Menu("dessert menu","dessert");

        MenuComponent allMenus = new Menu("all menus","all");
        allMenus.add(pancakeMenu);
        allMenus.add(dinerMenu);
        allMenus.add(cafeMenu);

        dinerMenu.add(new MenuItem("pasta","spaghetti with meatball",3.89,false));
        dinerMenu.add(dessertMenu);
        dessertMenu.add(new MenuItem("apple pie","pie",1.59,true));

        waiter w = new waiter(allMenus);
        w.printMenu();
    }


}
