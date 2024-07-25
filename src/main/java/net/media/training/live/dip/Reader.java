package net.media.training.live.dip;

import java.io.*;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.ArrayList;
/*
 we can decompose further by creating Reader class as Interface
 and implements different types of reader from file,database etc.
 */
public class Reader {
    public static ArrayList<String> readFile(String path){
        ArrayList<String> list = new ArrayList<String>();
        try{
            BufferedReader reader = new BufferedReader(new FileReader(path));
            String aLine;
            while ((aLine = reader.readLine()) != null) {
                list.add(aLine);
            }
            reader.close();
        }catch(FileNotFoundException e){
            e.printStackTrace();
        }catch(IOException e){
            e.printStackTrace();
        }
        return list;
    }

    public static String readFromDB(){
        URL url = null;
        try {
            url = new URL("http", "myfirstappwith.appspot.com", "index.html");
        } catch (MalformedURLException e) {
            e.printStackTrace();
            return "";
        }
        InputStream in = null;
        try {
            in = url.openStream();
        } catch (IOException e) {
            e.printStackTrace();
            return "";
        }
        InputStreamReader reader = new InputStreamReader(in);
        StringBuilder inputString = new StringBuilder();
        try {
            int c;
            c = reader.read();
            while (c != -1) {
                inputString.append((char) c);
                c = reader.read();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return inputString.toString();
    }
}
