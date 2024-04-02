package by.itstep.goutor.javalesson.lesson32.task.task1.model.logic;

import by.itstep.goutor.javalesson.lesson32.task.task1.model.entity.*;
import by.itstep.goutor.javalesson.lesson32.task.task1.model.entity.container.Basket;

public class ShopAssistance {
    public static double calculateTotalPrice(Basket basket) {
        if (basket == null || basket.getSize() == 0) {
            return -1;
        }

        double total = 0;

        for (Product product : basket) {
            total += product.getPrice();
        }
        return total;
    }
}
