package net.media.training.live.dip;

import java.io.File;
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
        Reader reader = null;
        Writer writer = null;

        //-------- reading file, encoding and writing file
        String readFilePath = "/Users/goyalamit/Sandbox/training/src/solid_2011/live/dip/beforeEncryption.txt";
        String writeFilePath = "/Users/goyalamit/Sandbox/training/src/solid_2011/live/dip/afterEncryption.txt";
        reader = new FileReader(readFilePath);
        writer = new FileWriter(writeFilePath);
        encodingModule.encode(reader,writer);


        //----- reading from database, encoding and writing into local DB(map)
        reader = new DBReader();
        writer = new DBWriter();
        encodingModule.encode(reader,writer);

    }
}
