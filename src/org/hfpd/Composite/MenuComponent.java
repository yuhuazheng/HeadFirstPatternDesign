package org.hfpd.Composite;

/**
 * Created by yuhzheng on 11/25/16.
 */
public abstract class MenuComponent {
    public void add(MenuComponent c){
        throw new UnsupportedOperationException();
    }

    public void remove(MenuComponent c){
        throw new UnsupportedOperationException();
    }

    public MenuComponent getChild(int i){
        throw new UnsupportedOperationException();
    }

    public String getName(){
        throw new UnsupportedOperationException();
    }

    public String getDescription(){
        throw new UnsupportedOperationException();
    }

    public double getPrice(){
        throw new UnsupportedOperationException();
    }

    public boolean isVegetarian(){
        throw new UnsupportedOperationException();
    }

    public void print(){
        throw new UnsupportedOperationException();
    }
}
