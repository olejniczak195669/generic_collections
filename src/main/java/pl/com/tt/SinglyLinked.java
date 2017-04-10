package pl.com.tt;

public class SinglyLinked<T> implements IMyList<T> {

    private Node<T> first = null;

    @Override
    public void insert(T value) {
        Node<T> nodeTmp = first;
        first = new Node<>(value);
        first.setNext(nodeTmp);
    }

    @Override
    public int getListSize() {
        Node<T> node = first;
        int nodesCount = 0;
        while(node != null) {
            nodesCount++;
            node = node.getNext();
        }
        return nodesCount;
    }

    @Override
    public void removeAll() {
        first = null;
    }

    @Override
    public T getElemAt(int index) {
        if (index < 0 | index > getListSize() - 1) {
            throw new IllegalArgumentException("out of size");
        }
        Node<T> nodeTemp = first;
        int itCount = 0;
        while(index != itCount) {
            nodeTemp = nodeTemp.getNext();
        }
        return nodeTemp.getValue();
    }

    @Override
    public boolean isEmpty() {
        if (first == null) {
            return true;
        }
        return false;
    }

    @Override
    public void addAll(T... elems) {
        for (T elem : elems) {
            insert(elem);
        }
    }

    public void printAll() {
        Node<T> elem = first;
        while (elem != null) {
            System.out.println(elem.getValue());
            elem = elem.getNext();
        }
    }

    public void printElement(int index) {
        System.out.println(getElemAt(index));
    }

    public SinglyLinked<T> addAll(SinglyLinked<T> list) {
        if (isEmpty()) {
            if (list.isEmpty()) {
                return this;
            } else {
                return list;
            }
        }
        else {
            getLastNode().setNext(list.first);
        }
        return this;
    }


    private Node<T> getLastNode() {
        Node<T> nodeTemp = first;
        while(nodeTemp.getNext() != null) {
            nodeTemp = nodeTemp.getNext();
        }
        return nodeTemp;
    }
}
