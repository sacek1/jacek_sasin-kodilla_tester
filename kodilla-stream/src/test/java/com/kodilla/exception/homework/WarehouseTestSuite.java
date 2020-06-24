package com.kodilla.exception.homework;

import com.kodilla.exception.AirportNotFoundException;
import org.junit.Test;

import java.util.List;

import static org.junit.Assert.*;

public class WarehouseTestSuite {

    @Test
    public void testGetOrder() throws OrderDoesntExistException {
        //given
        Warehouse warehouse = new Warehouse();
        //when
        Order isOrder234 = warehouse.getOrder("234");
        //then
        assertEquals("Order{number='234'}", isOrder234);
    }

    @Test(expected = OrderDoesntExistException.class)
    public void testGetOrder_withException() throws OrderDoesntExistException {
        //given
        Warehouse warehouse = new Warehouse();
        //when
        Order isOrder888 = warehouse.getOrder("888");
        //then
        assertEquals("Order{number='888'}", isOrder888);
    }

}