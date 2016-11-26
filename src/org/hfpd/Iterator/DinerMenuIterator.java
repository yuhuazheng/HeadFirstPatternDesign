package org.hfpd.Iterator;

/**
 * Created by yuhzheng on 11/25/16.
 */
public class DinerMenuIterator implements MyIterator {
    private MenuItem[] items;
    private int pos = 0;

    public DinerMenuIterator(MenuItem[] items){
        this.items = items;
    }

    public boolean hasNext(){
        if(pos>= items.length || items[pos]==null)
            return false;
        return true;
    }

    public Object next(){
        return items[pos++];
    }
}
