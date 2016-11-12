package org.hfpd.Decorator;

import java.io.FilterInputStream;
import java.io.IOException;

/**
 * Created by yuhzheng on 11/12/16.
 */
public class LowerCaseInputStream extends FilterInputStream {
    public LowerCaseInputStream(FilterInputStream in){
        super(in);
    }

    public int read() throws IOException{
        int c = super.read();
        return(c==-1? c: Character.toLowerCase(c));
    }

    public int read(byte[] b, int offset, int len) throws IOException{
        int res = super.read(b,offset,len);
        for(int i=offset;i<offset+res;i++){
            b[i]=(byte)Character.toLowerCase((char)b[i]);
        }
        return res;
    }

}
