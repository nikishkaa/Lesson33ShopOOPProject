package by.itstep.goutor.javalesson.lesson32.task.task1.model.entity.container;

import by.itstep.goutor.javalesson.lesson32.task.task1.model.entity.Product;

public interface Container {
    void add(Product product);

    void remove(Product product);

    void remove(int index);

    Product get(int index);

    int size();
}
