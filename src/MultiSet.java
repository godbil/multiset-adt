import jdk.jshell.spi.ExecutionControl;

public interface MultiSet {
    boolean add(int item);
    void remove(int item);
    boolean contains(int item);
    boolean is_empty();
    int count(int item);
    int size();
}
