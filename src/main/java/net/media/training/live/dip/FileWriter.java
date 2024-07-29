package net.media.training.live.dip;

import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.List;

public class FileWriter implements Writer{
    private String path;
    FileWriter(String path){
        this.path = path;
    }
    public void write(List<String> list) {
        try {
            BufferedWriter writer = new BufferedWriter(new java.io.FileWriter(path));
            for(String line:list){
                writer.write(line);
            }
            writer.flush();
            writer.close();
        }catch(FileNotFoundException e) {
            e.printStackTrace();
        }catch (IOException e) {
            e.printStackTrace();
        }
    }
}
