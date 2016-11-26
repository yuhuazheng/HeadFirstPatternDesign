package org.hfpd.Iterator;

import java.util.ArrayList;

/**
 * Created by yuhzheng on 11/25/16.
 */
public class PancakeMenuIterator implements MyIterator {
    private ArrayList<MenuItem> items;
    private int pos=0;

    public PancakeMenuIterator(ArrayList<MenuItem> items){
        this.items = items;
    }

    public boolean hasNext(){
        if(pos>=items.size()||items.get(pos)==null)
            return false;
        return true;
    }

    public Object next(){
        return items.get(pos++);
    }
}
