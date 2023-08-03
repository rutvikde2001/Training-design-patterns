package solid.live.dip;

import java.io.*;
import java.net.MalformedURLException;
import java.net.URL;

public class IOHandler implements Reader{
    void writeData(String writeData) {
        try {
            BufferedWriter writer = new BufferedWriter(new FileWriter("C:\\Users\\rutvik.d\\Documents\\Training\\Design pattern\\Solid all five\\Solid all five\\src\\solid\\live\\dip\\afterEncryption.txt"));
            writer.write(writeData);
            writer.flush();
            writer.close();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }

    public String readData() {
        String readData = "";
        try {
            BufferedReader reader = new BufferedReader(new FileReader("C:\\Users\\rutvik.d\\Documents\\Training\\Design pattern\\Solid all five\\Solid all five\\src\\solid\\live\\dip\\beforeEncryption.txt"));
            readData = String.valueOf(reader.read()).trim();
            reader.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return readData;
    }

}