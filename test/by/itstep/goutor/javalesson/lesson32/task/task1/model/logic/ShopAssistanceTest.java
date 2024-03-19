package by.itstep.goutor.javalesson.lesson32.task.task1.model.logic;

import by.itstep.goutor.javalesson.lesson32.task.task1.model.entity.*;
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
        Water[] waters ={new Water(2)} ;
        Product[] products = {};
        Basket basket = new Basket(oranges, milks, breads, waters);
        double expected = 6;

        // A - act
        double actual = ShopAssistance.calculateTotalPrice(basket);

        // A - assert
        assertEquals(expected, actual, 0.001);
    }

    @Test
    public void testCalculateTotalPriceByNull() {
        // A - arrange
        Basket basket = null;
        double expected = -1;

        // A - act
        double actual = ShopAssistance.calculateTotalPrice(basket);

        // A - assert
        assertEquals(expected, actual, 0.0);
    }


    @Test
    public void testCalculateTotalPriceByEmptyBasket() {
        // A - arrange
        Basket basket = new Basket();
        double expected = -1;

        // A - act
        double actual = ShopAssistance.calculateTotalPrice(basket);

        // A - assert
        assertEquals(expected, actual, 0.0);
    }
}
