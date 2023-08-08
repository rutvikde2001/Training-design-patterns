package designpattern.command;

import java.io.File;

public class MoveFile implements Commands{
    @Override
    public void runCommand(String... data) {
        File file = new File(data[0]);
        if (!file.exists())
            throw new RuntimeException("File does not exist");
        if (!file.renameTo(new File(data[1])))
            throw new RuntimeException("Rename failed");
    }
}
