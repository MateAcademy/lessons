package com.mateacademy.lessons17;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

import java.math.BigDecimal;
import java.sql.SQLException;
import java.util.Date;

import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;

    @FixMethodOrder(MethodSorters.NAME_ASCENDING)
    public class OrderDaoImplTest {
        private static final BigDecimal ALREADY_EXIST_ORDER = BigDecimal.valueOf(113042);

        private OrderDaoImpl orderDao = new OrderDaoImpl();
        Orders order = new Orders(BigDecimal.valueOf(123456), new Date(),
                BigDecimal.valueOf(2103), BigDecimal.valueOf(103), "REI", new Products(),BigDecimal.valueOf(222), BigDecimal.valueOf(2000));

        //    @Test
//    public void test1InsertOrder() throws SQLException{
//    assertTrue(orderDao.insertOrder(order));
//    }
//    @Test
//    public void test2updateOrder() throws SQLException {
//        order.setAmount(BigDecimal.valueOf(333));
//        order.setQty(BigDecimal.valueOf(999));
//        assertTrue(orderDao.updateOrder(order));
//    }
        @Test
        public void test3deleteOrder() throws SQLException {
            assertTrue(orderDao.deleteOrder(BigDecimal.valueOf(123456)));
        }
        //   @Test
//   public void test4findOrderById() throws SQLException {
//     assertTrue(orderDao.findOrderById(BigDecimal.valueOf(2222));
//
//  }
        @Test
        public void testFindOrderById() throws SQLException {
            System.out.println("findOrderById ____________________");
            Orders order = orderDao.findOrderById(ALREADY_EXIST_ORDER);
            System.out.println(order);
            System.out.println(order.getProduct());
            assertNotNull(order);

        }
    }