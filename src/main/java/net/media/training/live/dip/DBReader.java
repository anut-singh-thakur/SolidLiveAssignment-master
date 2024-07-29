package net.media.training.live.dip;

import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;

public class DBReader implements Reader{
    public List<String> read(){
        List<String> list = new ArrayList<String>();
        URL url = null;
        try {
            url = new URL("http", "myfirstappwith.appspot.com", "index.html");
        } catch (MalformedURLException e) {
            e.printStackTrace();
            return list;
        }
        InputStream in = null;
        try {
            in = url.openStream();
        } catch (IOException e) {
            e.printStackTrace();
            return list;
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
        list.add(inputString.toString());
        return list;
    }
}
