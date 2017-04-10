package pl.com.tt;


public class TestApp {

    public static void main(String[] args) {

        NonGenericSingleLikable list = new NonGenericSinglyLinked();
        list.add("sdfdsfjdsfoidsj");
        list.add(4343);
        list.add(new Tramwaj());


        String o = (String) list.get(0);
        Integer integer = (Integer) list.get(1);
        Integer fdfd = (Integer) list.get(2);

    }

}

class Tramwaj{}
