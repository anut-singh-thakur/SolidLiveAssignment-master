package net.media.training.live.dip;

import java.util.List;

public class DBWriter implements Writer{
    public void write(List<String> list){
        MyDatabase database = new MyDatabase();
        for(String str:list) {
            database.write(str);
        }
    }
}
