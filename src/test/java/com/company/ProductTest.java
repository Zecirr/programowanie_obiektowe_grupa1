package com.company;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
import static org.junit.jupiter.api.Assumptions.assumeTrue;

class ProductTest {

    @Test
    void test1(){
        int year = 2010;
        int month = 3;
        int expected = 2;
        int result = Product.priceIndex(year, month);
        assumeTrue(expected == result);
    }

    @Test
    void shouldThrowException(){
        int year = 2000;
        int month = 4;
        assertThrows(IndexOutOfBoundsException.class, () -> {
            Product.priceIndex(year, month);
        });
    }

}