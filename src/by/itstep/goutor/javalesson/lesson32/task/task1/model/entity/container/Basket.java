package by.itstep.goutor.javalesson.lesson32.task.task1.model.entity.container;

import by.itstep.goutor.javalesson.lesson32.task.task1.model.entity.*;

import java.util.Arrays;

public class Basket {
    public static final int DEFAULT_SIZE = 10;

    Container container;

    public Basket() {
        container = new ArrayImplementation();
    }

    public Basket(Container container) {
        this.container = container;
    }


    public int getSize() {
        return container.size();
    }


    @Override
    public String toString() {
        StringBuilder builder = new StringBuilder("List of product:\n");

        for (int i = 0; i < container.size(); i++) {
            builder.append(container.get(i)).append("\n");
        }
        return builder.toString();
    }
}