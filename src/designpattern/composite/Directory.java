package designpattern.composite;

import java.util.List;
import java.util.Objects;

/**
 * Created by IntelliJ IDEA.
 * User: joelrosario
 * Date: Jul 19, 2011
 * Time: 9:18:51 PM
 * To change this template use pre_refactoring.File | Settings | pre_refactoring.File Templates.
 */
public class Directory implements DataComponent {
    private final String name;
    private final List<DataComponent> files;
    private Directory parent;
    public String getName() {
        return name;
    }
    public Directory(String name, List<DataComponent> files) {
        this.name = name;
        this.files = files;

        for (DataComponent file : files) {
            file.setParent(this);
        }
    }
    public int getSize() {
        return files.stream().mapToInt(DataComponent::getSize).sum();
    }
    public void setParent(Directory directory) {
        this.parent = directory;
    }
    public void removeEntry(DataComponent directory) {
        files.remove(directory);
    }
    public void add(DataComponent directory) {
        files.add(directory);
    }
    public boolean exist(String name) {
        return files.stream().anyMatch((e) -> {
                    return e.exist(name);
                }
        );
    }
    public List<DataComponent> getFiles() {
        return files;
    }
    public Directory getParent() {
        return parent;
    }
}
