package org.hfpd.TemplateMethod;

import javax.imageio.IIOException;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Created by yuhzheng on 11/19/16.
 */
public class Tea extends CaffeineBeverage{

    public void brew(){
        System.out.println("Steeping some tea");
    }

    public void addCondiments(){
        System.out.println("Adding some lemon");
    }

    public boolean userWantsCondiments(){
        String answer = getUserInput();
        if(answer.toLowerCase().startsWith("y")){
            return true;
        }
        else
            return false;
    }

    private String getUserInput(){
        String answer = null;
        System.out.println("like some lemon? (y/n)");

        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        try{
            answer = in.readLine();
        } catch (IOException e){
            System.out.println("IO exception");
        }

        if(answer==null)
            return "no";

        return answer;
    }
}
