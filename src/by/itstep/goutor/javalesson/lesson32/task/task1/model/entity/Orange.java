package by.itstep.goutor.javalesson.lesson32.task.task1.model.entity;

public class Orange {
    private double cost;
    private int diameter;
    private int vitaminC;

    public Orange() {
    }

    public Orange(double cost, int diameter, int vitaminC) {
        this.diameter = diameter;
        this.vitaminC = vitaminC;
        this.cost = cost;

    }

    public double getCost() {
        return cost;
    }

    public int getDiameter() {
        return diameter;
    }

    public int getVitaminC() {
        return vitaminC;
    }

    public void setCost(double cost) {
        this.cost = cost;
    }

    public void setDiameter(int diameter) {
        this.diameter = diameter;
    }

    public void setVitaminC(int vitaminC) {
        this.vitaminC = vitaminC;
    }
}
