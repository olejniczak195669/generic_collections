package pl.com.tt;


public class App {

    public static void main(String[] args) {
        SinglyLinked<Step> stepsList = new SinglyLinked<>();
        ComplexStep cs0 = new ComplexStep("description1");
        ComplexStep cs1 = new ComplexStep("description2");
        SimpleStep cs2 = new SimpleStep("description3");

        stepsList.addAll(cs0, cs1, cs2);
//        stepsList.printAll();
//        stepsList.printElement(0);

        SinglyLinked<Step> list2 = new SinglyLinked<>();

        stepsList.addAll(list2);
        stepsList.printAll();
    }
}
