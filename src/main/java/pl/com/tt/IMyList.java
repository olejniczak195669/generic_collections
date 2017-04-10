package pl.com.tt;

/**
 * Created by maciek on 29.03.17.
 */
public interface IMyList<T> {
    void insert(T node);
    int getListSize();
    void removeAll();
    T getElemAt(int value);
    boolean isEmpty();
    void addAll(T... elems);
}
