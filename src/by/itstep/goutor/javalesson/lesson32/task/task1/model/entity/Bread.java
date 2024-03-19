package by.itstep.goutor.javalesson.lesson32.task.task1.model.entity;

public class Bread extends Product {
    private String color;
    private String flour;
    private double price;

    public Bread() {
    }

    public Bread(String color, String flour, double price) {
        super(price);
        this.color = color;
        this.flour = flour;
    }

    public String getColor() {
        return color;
    }

    public String getFlour() {
        return flour;
    }


    public void setColor(String color) {
        this.color = color;
    }

    public void setFlour(String flour) {
        this.flour = flour;
    }

    @Override
    public String toString() {
        return "Bread{" +
                "color = '" + color + '\'' +
                ", flour = '" + flour + '\'' +
                ", price = " + super.toString() +
                '}';
    }
}
