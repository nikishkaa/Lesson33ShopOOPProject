package by.itstep.goutor.javalesson.lesson32.task.task1.model.entity.container;

import by.itstep.goutor.javalesson.lesson32.task.task1.model.entity.*;

public class Basket {
    public static final int DEFAULT_SIZE = 10;
    private Product[] products;
    private int size = 0;

    public Basket() {
        products = new Product[DEFAULT_SIZE];
    }

    public Basket(Product[] products) {
        this.products = products;
        size = products.length;

    }

    public Product[] getProducts() {
        return products;
    }

    public int getSize() {
        return size;
    }

    public void setProducts(Product[] products) {
        this.products = products;
    }
}
