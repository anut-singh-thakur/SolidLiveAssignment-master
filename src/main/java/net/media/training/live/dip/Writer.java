package net.media.training.live.dip;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
public class Writer {

    public static boolean writeFile(ArrayList<String> list, String path) {
        boolean status = true;
        try {
            BufferedWriter writer = new BufferedWriter(new FileWriter(path));
            for(String line:list){
                writer.write(line);
            }
            writer.flush();
            writer.close();
        }catch(FileNotFoundException e) {
            e.printStackTrace();
            status = false;
        }catch (IOException e) {
            e.printStackTrace();
            status = false;
        }
        return status;
    }

    public static boolean writeToDB(String data){
        MyDatabase database = new MyDatabase();
        database.write(data);
        return true;
    }
}
