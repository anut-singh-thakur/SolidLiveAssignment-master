package net.media.training.live.dip;

import java.io.IOException;
import java.util.ArrayList;

/**
 * Created by IntelliJ IDEA.
 * User: goyalamit
 * Date: Jul 13, 2011
 * Time: 10:20:57 AM
 * To change this template use File | Settings | File Templates.
 */
public class EncodingModuleClient {
    public static void main(String[] args) throws IOException {
        EncodingModule encodingModule = new EncodingModule();


        //-------- reading file, encoding and writing file
        String readFilePath = "/Users/goyalamit/Sandbox/training/src/solid_2011/live/dip/beforeEncryption.txt";
        ArrayList<String> list = Reader.readFile(readFilePath);
        ArrayList<String> encodedList = encodingModule.encode(list);
        String writeFilePath = "/Users/goyalamit/Sandbox/training/src/solid_2011/live/dip/afterEncryption.txt";
        if(Writer.writeFile(encodedList,writeFilePath)){
            System.out.println("Successfully Data written into File.");
        }


        //----- reading from database, encoding and writing into local DB(map)
        String data = Reader.readFromDB();
        String encodedData = encodingModule.encode(data);
        if(Writer.writeToDB(encodedData)){
            System.out.println("Successfully Data written into local DB.");
        }



    }

}
