package by.itstep.goutor.javalesson.lesson32.task.task1.model.entity;

public class Water extends Product {

    public Water() {
    }

    public Water(double price) {
        super(price);
    }


    @Override
    public String toString() {
        return "Water{ " + super.toString() + '}';
    }
}
