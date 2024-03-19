package by.itstep.goutor.javalesson.lesson32.task.task1.model.logic;

import by.itstep.goutor.javalesson.lesson32.task.task1.model.entity.Bread;
import by.itstep.goutor.javalesson.lesson32.task.task1.model.entity.Milk;
import by.itstep.goutor.javalesson.lesson32.task.task1.model.entity.Orange;
import by.itstep.goutor.javalesson.lesson32.task.task1.model.entity.container.Basket;
import org.junit.Test;

import static org.junit.Assert.*;

public class ShopAssistanceTest {
    @Test
    public void testCalculateTotalPricePositive() {
        // A - arrange
        Milk[] milks = {new Milk(1000, 3.5, 2)};
        Bread[] breads = {new Bread("Black", "first", 1.5)};
        Orange[] oranges = {new Orange(0.5, 3000, 100)};
        Basket basket = new Basket(oranges, milks, breads);
        double expected = 4;

        // A - act
        double actual = ShopAssistance.calculateTotalPrice(basket);

        // A - assert
        assertEquals(expected, actual, 0.001);
    }

    @Test
    public void testCalculateTotalPriceByNull() {
        Basket basket = null;
        double expected = -1;

        double actual = ShopAssistance.calculateTotalPrice(basket);

        assertEquals(expected, actual, 0.0);
    }


    @Test
    public void testCalculateTotalPriceByEmptyBasket() {
        Basket basket = new Basket();
        double expected = -1;

        double actual = ShopAssistance.calculateTotalPrice(basket);

        assertEquals(expected, actual, 0.0);
    }
}
