package solid.live.dip;


import net.iharder.Base64;

import java.io.*;
import java.net.MalformedURLException;
import java.net.URL;

/**
 * Created by IntelliJ IDEA.
 * User: goyalamit
 * Date: Jul 13, 2011
 * Time: 10:05:38 AM
 * To change this template use File | Settings | File Templates.
 */
public class EncodingModule {
    public void encodeWithFiles() {
        IOHandler io = new IOHandler();
        String aLine = io.readData();
        if (aLine != "") {
            String encodedLine = Base64.encodeBytes(aLine.getBytes());
            io.writeData(encodedLine);
        }

    }

    public void encodeBasedOnNetworkAndDatabase() {
        IOHandler io = new IOHandler();
        String inputString = io.readNetworkData();
        String encodedString = Base64.encodeBytes(inputString.getBytes());
        MyDatabase database = new MyDatabase();
        database.write(encodedString);
    }
}

