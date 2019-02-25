package com.mateacademy.lessons16.ipa;

import com.mateacademy.lessons16.entry.Orders;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

import java.math.BigDecimal;
import java.sql.SQLException;
import java.util.Date;

import static org.junit.Assert.*;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class OrderDaoImplTest {
    private static final BigDecimal NOT_EXIST_ORDER = BigDecimal.valueOf(-1);
    private static final BigDecimal ALREADY_EXIST_ORDER = BigDecimal.valueOf(112922);
    private static final Orders ORDER = new Orders(BigDecimal.valueOf(12352), null, null, null, new Date(), null,
            BigDecimal.valueOf(10), null);
    private OrderDao orderDao = new OrderDaoImpl();

    @Test
    public void insertOrder() throws SQLException {
        assertTrue(orderDao.insertOrder(ORDER)) ;
    }

    @Test
    public void test2updateOrder() throws SQLException {
        ORDER.setAmount(BigDecimal.valueOf(10));
        ORDER.setQty(BigDecimal.valueOf(10));
        assertTrue(orderDao.updateOrder(ORDER));
    }

    @Test
    public void test3deleteOrder() throws SQLException {
        assertTrue(orderDao.deleteOrder(ORDER.getOrderNum()));
    }

}