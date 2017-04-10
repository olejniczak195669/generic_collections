package pl.com.tt;

public class NonGenericSinglyLinked implements NonGenericSingleLikable {

    Element head;
    int size;

    @Override
    public void add(Object object) {

        if(head == null) {
            head = new Element(object);
        } else {
            Element element = head;
            while(element.next != null) {
                element.next = new Element(object);
            }

        }
        size++;
    }

    @Override
    public Object get(int i) {

        Element element = head;

        while(i > 0) {
            element = element.next;
            i--;
        }

        return element;
    }
}

interface NonGenericSingleLikable {

    void add(Object object);
    Object get(int i);
}

class Element {
    Object object;
    Element next;

    public Element(Object object) {
        this.object = object;
    }
}
