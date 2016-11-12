package org.hfpd.Decorator;

import java.io.*;

/**
 * Created by yuhzheng on 11/12/16.
 */
public class TestLowerCaseIO {
    public static void main(String[] args) throws IOException{
        int c;
        try{
            InputStream in =
                    new LowerCaseInputStream(
                            new BufferedInputStream(
                                    new FileInputStream("/Users/yuhzheng/IdeaProjects/HeadFirstPatternDesign/src/org/hfpd/Decorator/test.txt")
                            )
                    );
            while((c=in.read())>=0){
                System.out.print((char)c);
            }
        } catch (IOException e){
            e.printStackTrace();
        }
    }
}
