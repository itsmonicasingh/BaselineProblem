package com.tw.baseline;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ReceiptTest {

    @Test
    public void shouldCalculateTotalWhenNoItemsInTheList(){
        Receipt item = new Receipt(0, "", 0.0);
        assertEquals(0.0, item.calculateTotal(), 0.002);
    }
}
