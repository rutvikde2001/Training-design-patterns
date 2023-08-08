package designpattern.command;

import java.io.File;

public class DeleteFile implements Commands {
    @Override
    public void runCommand(String... data) {
        File file = new File(data[0]);
        file.delete();
    }
}
