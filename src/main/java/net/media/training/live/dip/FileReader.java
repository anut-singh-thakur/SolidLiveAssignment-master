package net.media.training.live.dip;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;

public class FileReader implements  Reader{
    private String path;
    FileReader(String path){
        this.path = path;
    }
    public ArrayList<String> read(){
        ArrayList<String> list = new ArrayList<String>();
        try{
            BufferedReader reader = new BufferedReader(new java.io.FileReader(path));
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
}
