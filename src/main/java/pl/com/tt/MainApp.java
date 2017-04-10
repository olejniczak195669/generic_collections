package pl.com.tt;


public class MainApp {
    public static void main (String[] args) {

//        MyCollection<Step> steps = new SinglyLinked<>();
//        steps.add(new SimpleStep("fddfdfd"));
//        steps.add(new ComplexStep("fdfdf"));
//        steps.add(new SimpleStep("dsfdd"));

       // StepService.printAllItems(steps);

        MyCollection<SimpleStep> simpleSteps = new SinglyLinked<>();
        simpleSteps.add(new SimpleStep("aaa"));
        simpleSteps.add(new SimpleStep("fff"));

        System.out.println("-------------");
        StepService.printAllItems(simpleSteps);


        MyCollection<Step> steps = new SinglyLinked<>();
        steps.add(new ComplexStep("DFKDFKKDOFP"));

        StepService.merge(simpleSteps, steps);

    }
}

class Step {
    public Step(String description) {
        this.description = description;
    }

    String description;

    @Override
    public String toString() {
        return "Step{" +
                "description='" + description + '\'' +
                '}';
    }
}

class SimpleStep extends Step {

    public SimpleStep(String description) {
        super(description);
    }
}

class ComplexStep extends Step {

    public ComplexStep(String description) {
        super(description);
    }
}



class StepService {


    public static void printAllItems(MyCollection<? extends Step> steps) {

        for (int i = 0; i < steps.size(); i++) {
            print(steps.get(i));
        }
    }

    public static <E extends Step> void print(E e) {
        System.out.println(e.description);
    }

    public static MyCollection<? super Step> merge(MyCollection<? extends Step> source,
                                                   MyCollection<? super Step> target) {

        target.addAll(source);
        return target;
    }

}