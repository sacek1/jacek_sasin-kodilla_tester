package com.kodilla.exception.homework;

import com.kodilla.exception.AirportNotFoundException;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.*;

public class WarehouseTestSuite {

    @Test
    public void testGetOrder() throws OrderDoesntExistException {
        //given
        Warehouse warehouse = new Warehouse();
        warehouse.addOrder(new Order("234"));
        //when
        Order isOrder234 = warehouse.getOrder("234");
        //then
        List<String> expected = Arrays.asList("234");
        assertThat("234", is(isOrder234.getNumber()));
    }



    @Test(expected = OrderDoesntExistException.class)
    public void testGetOrder_withException() throws OrderDoesntExistException {
        //given
        Warehouse warehouse = new Warehouse();
        //when
        Order isOrder888 = warehouse.getOrder("888");
        //then

    }

}