package net.media.training.live.dip;


import java.io.*;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.ArrayList;
import java.util.Base64;

/**
 * Created by IntelliJ IDEA.
 * User: goyalamit
 * Date: Jul 13, 2011
 * Time: 10:05:38 AM
 * To change this template use File | Settings | File Templates.
 */

public class EncodingModule {

    public ArrayList<String> encode(ArrayList<String> list){
        ArrayList<String> encodedList = new ArrayList<String>();
        for(String line:list) {
            String encodedLine = Base64.getEncoder().encodeToString(line.getBytes());
            encodedList.add(encodedLine);
        }
        return encodedList;
    }
    public String encode(String data){
        return Base64.getEncoder().encodeToString(data.getBytes());
    }
}

