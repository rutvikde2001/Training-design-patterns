package designpattern.command;

public class FileManipulator implements Invoker{
    @Override
    public void execute(Commands command) {
        command.runCommand();
    }
}
