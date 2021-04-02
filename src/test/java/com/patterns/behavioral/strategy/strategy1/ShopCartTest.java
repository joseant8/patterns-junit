package com.patterns.behavioral.strategy.strategy1;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class ShopCartTest {

    ShopCart trolley;

    @BeforeEach
    void setUp() {
        trolley = new ShopCart();
    }

    @Test
    void addProduct(Product product) {
        int numProductsBefore = trolley.getProducts().size();
        trolley.addProduct(product);
        int numProductsAfter = trolley.getProducts().size();
        assertEquals(numProductsAfter, numProductsBefore+1);
    }

    @Test
    void removeProduct(Product product) {
        int numProductsBefore = trolley.getProducts().size();
        trolley.removeProduct(product);
        int numProductsAfter = trolley.getProducts().size();
        assertEquals(numProductsAfter-1, numProductsBefore);
    }
}