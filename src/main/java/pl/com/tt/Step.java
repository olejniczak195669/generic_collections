package pl.com.tt;

/**
 * Created by maciek on 29.03.17.
 */
public abstract class Step {
    private String description;

    public Step() {
        description = "";
    }

    public Step(String description) {
        this.description = description;
    }

    @Override
    public String toString() {
        return "Step{" +
                "description='" + description + '\'' +
                '}';
    }
}
