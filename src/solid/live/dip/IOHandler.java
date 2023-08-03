package solid.live.dip;

import java.io.*;
import java.net.MalformedURLException;
import java.net.URL;

public class IOHandler {
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

    String readData() {
        String readData = "";
        try {
            BufferedReader reader = new BufferedReader(new FileReader("C:\\Users\\rutvik.d\\Documents\\Training\\Design pattern\\Solid all five\\Solid all five\\src\\solid\\live\\dip\\beforeEncryption.txt"));
            readData = reader.readLine();
            reader.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return readData;
    }

    String readNetworkData(){
        URL url = null;
        try {
            url = new URL("http", "myfirstappwith.appspot.com", "index.html");
        } catch (MalformedURLException e) {
            e.printStackTrace();
        }
        InputStream in = null;
        try {
            in = url.openStream();
        } catch (IOException e) {
            e.printStackTrace();
        }
        InputStreamReader reader = new InputStreamReader(in);
        StringBuilder inputString1 = new StringBuilder();
        try {
            int c;
            c = reader.read();
            while (c != -1) {
                inputString1.append((char) c);
                c = reader.read();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        String inputString = inputString1.toString();

        return inputString;
    }
}