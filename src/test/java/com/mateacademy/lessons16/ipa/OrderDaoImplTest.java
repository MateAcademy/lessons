package com.mateacademy.lessons16.ipa;

import com.mateacademy.lessons16.OrderDaoImpl;
import com.mateacademy.lessons16.Orders;
import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

import java.math.BigDecimal;
import java.sql.SQLException;
import java.util.Date;
import static org.junit.Assert.assertTrue;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class OrderDaoImplTest {
    private OrderDaoImpl orderDao = new OrderDaoImpl();
    Orders order = new Orders(BigDecimal.valueOf(7777), new Date(),
            BigDecimal.valueOf(2103), BigDecimal.valueOf(103), "REI", "41004",BigDecimal.valueOf(222), BigDecimal.valueOf(2000));

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