package designpattern.composite;

public interface DataComponent {
    public void setParent(Directory parent);
    public int getSize();
    public String getName();
    public boolean exist(String name);
    public Directory getParent();
}
