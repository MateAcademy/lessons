package com.mateacademy.lessons15;

import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertTrue;

import java.math.BigDecimal;
import java.sql.SQLException;
import java.util.Date;
import java.util.Set;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;


public class OrderDaoImplIntegrationTest {


    private static final BigDecimal ALREADY_EXIST_ORDER = BigDecimal.valueOf(113042);
    private static final BigDecimal ALREADY_EXIST_ORDER2 = BigDecimal.valueOf(2);
    private OrderDaoImpl orderDao = new OrderDaoImpl();

    @Test
    public void testFindOrderById() throws SQLException {
        Order order = orderDao.findOrderById(ALREADY_EXIST_ORDER);
        System.out.println(order);
        assertNotNull(order);
    }

    @Test
    public void testFindOrderById2() throws SQLException {
        Order order = orderDao.findOrderById(ALREADY_EXIST_ORDER2);
        System.out.println(order);
        assertNull(order);
    }


}