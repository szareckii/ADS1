package lesson6;

public interface Tree<E extends Comparable<? super E>> {

    enum TraverseMode {
        IN_ORDER,       //симмеричный
        PRE_ORDER,      //прямой
        POST_ORDER,     //обратный
    }

    boolean add(E value);

    boolean contains(E value);

    boolean     remove(E value);

    boolean isEmpty();

    int size();

    void display();

    void traverse(TraverseMode mode);

}
