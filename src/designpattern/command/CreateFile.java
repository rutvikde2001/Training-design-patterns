package designpattern.command;

import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;

public class CreateFile implements Commands{
    @Override
    public void runCommand(String... data) {
        File file = new File(data[0]);
        if (file.exists())
            throw new RuntimeException("File already exist");
        try {
            file.createNewFile();
            PrintWriter writer = new PrintWriter(file);
            writer.write(data[1]);
            writer.close();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
