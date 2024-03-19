package by.itstep.goutor.javalesson.lesson32.task.task1.model.logic;

import by.itstep.goutor.javalesson.lesson32.task.task1.model.entity.Bread;
import by.itstep.goutor.javalesson.lesson32.task.task1.model.entity.Milk;
import by.itstep.goutor.javalesson.lesson32.task.task1.model.entity.Orange;
import by.itstep.goutor.javalesson.lesson32.task.task1.model.entity.container.Basket;

public class ShopAssistance {
    public static double calculateTotalPrice(Basket basket) {
        if (basket == null || basket.getBreads().length == 0
                || basket.getOranges().length == 0
                || basket.getMilks().length == 0) {
            return -1;
        }

        double total = 0;

        for (Orange orange : basket.getOranges()) {
            total += orange.getCost();
        }

        for (Milk milk : basket.getMilks()) {
            total += milk.getMoney();
        }

        for (Bread bread : basket.getBreads()) {
            total += bread.getPrice();
        }

        return total;
    }
}
