package com.mateacademy.lessons16.ipa;

import com.mateacademy.lessons16.entry.Orders;
import com.mateacademy.lessons16.ipa.OrderDao;
import com.mateacademy.lessons16.ipa.OrderDaoImplTest;
import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

import java.math.BigDecimal;
import java.sql.SQLException;
import java.util.Date;

import static org.junit.Assert.*;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class OrderDaoImplTest {

    private  Orders order = new Orders(BigDecimal.valueOf(12352), null, null, null, new Date(), null,
            BigDecimal.valueOf(10), null);
    private OrderDao orderDao = new OrderDaoImpl();


    @Test
    public void test1InsertOrder() throws SQLException{
        assertTrue(orderDao.insertOrder(order));
    }
    @Test
    public void test2updateOrder() throws SQLException {
        order.setAmount(BigDecimal.valueOf(333));
        order.setQty(BigDecimal.valueOf(999));
        assertTrue(orderDao.updateOrder(order));
    }
    @Test
    public void test3deleteOrder() throws SQLException {
        assertTrue(orderDao.deleteOrder(BigDecimal.valueOf(123456)));
    }
}