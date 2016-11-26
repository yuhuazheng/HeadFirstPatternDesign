package org.hfpd.Composite;

import java.util.ArrayList;
import java.util.Iterator;

/**
 * Created by yuhzheng on 11/25/16.
 */
public class Menu extends MenuComponent {
    ArrayList<MenuComponent> menuComponents = new ArrayList<>();
    String name;
    String description;

    public Menu(String name,String description){
        this.name=name;
        this.description=description;
    }

    public void add(MenuComponent c){
        menuComponents.add(c);
    }

    public void remove(MenuComponent c){
        menuComponents.remove(c);
    }

    public MenuComponent getChild(int i){
        return menuComponents.get(i);
    }

    public String getName(){
        return name;
    }

    public String getDescription(){
        return description;
    }

    public void print(){
        System.out.println(getName()+getDescription());
        Iterator it = menuComponents.iterator();
        while(it.hasNext()){
            ((MenuComponent)it.next()).print();
        }
    }
}
