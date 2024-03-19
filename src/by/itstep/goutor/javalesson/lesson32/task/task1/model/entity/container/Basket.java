package by.itstep.goutor.javalesson.lesson32.task.task1.model.entity.container;

import by.itstep.goutor.javalesson.lesson32.task.task1.model.entity.Bread;
import by.itstep.goutor.javalesson.lesson32.task.task1.model.entity.Milk;
import by.itstep.goutor.javalesson.lesson32.task.task1.model.entity.Orange;

public class Basket {
    public static final int DEFAULT_SIZE = 10;
    private Orange[] oranges;
    private Milk[] milks;
    private Bread[] breads;

    private int sizeMilk = 0;
    private int sizeBread = 0;
    private int sizeOrange = 0;

    public Basket() {
        oranges = new Orange[DEFAULT_SIZE];
        milks = new Milk[DEFAULT_SIZE];
        breads = new Bread[DEFAULT_SIZE];
    }

    public Basket(Orange[] oranges, Milk[] milks, Bread[] breads) {
        this.oranges = oranges;
        sizeOrange = oranges.length;
        this.milks = milks;
        sizeMilk = milks.length;
        this.breads = breads;
        sizeBread = breads.length;
    }

    public Orange[] getOranges() {
        return oranges;
    }

    public Milk[] getMilks() {
        return milks;
    }

    public Bread[] getBreads() {
        return breads;
    }

    public void setOranges(Orange[] oranges) {
        this.oranges = oranges;
    }

    public void setMilks(Milk[] milks) {
        this.milks = milks;
    }

    public void setBreads(Bread[] breads) {
        this.breads = breads;
    }

    public int getSizeMilk() {
        return sizeMilk;
    }

    public int getSizeBread() {
        return sizeBread;
    }

    public int getSizeOrange() {
        return sizeOrange;
    }
}
