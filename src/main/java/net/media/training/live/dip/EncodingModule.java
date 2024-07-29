package net.media.training.live.dip;

import java.util.List;
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

    public void encode(Reader reader,Writer writer){

        List<String> list  = reader.read();
        List<String> encodedList = new ArrayList<String>();
        for(String line:list) {
            String encodedLine = Base64.getEncoder().encodeToString(line.getBytes());
            encodedList.add(encodedLine);
        }
        writer.write(encodedList);
    }
}

