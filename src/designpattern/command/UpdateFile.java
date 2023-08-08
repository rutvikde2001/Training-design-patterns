package designpattern.command;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.PrintWriter;

public class UpdateFile implements Commands{
    @Override
    public void runCommand(String... data) {
        File file = new File(data[0]);
        if (!file.exists())
            throw new RuntimeException("File: " + data[0] + " does not exist");
        try {

            PrintWriter writer = new PrintWriter(file);
            writer.write(data[1]);
            writer.close();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
