//package com.mateacademy.lessons16.ipa;
//
//import com.mateacademy.lessons16.entry.*;
//import com.mateacademy.lessons16.entry.Customers;
//import com.mateacademy.lessons16.ipa.CustomerDaoImpl;
//import com.mateacademy.lessons16.ipa.OrderDaoImpl;
//import com.mateacademy.lessons16.entry.Orders;
//import org.junit.FixMethodOrder;
//import org.junit.Test;
//import org.junit.runners.MethodSorters;
//
//import java.math.BigDecimal;
//import java.sql.SQLException;
//
//import static org.junit.Assert.assertTrue;
//
//import static org.junit.Assert.assertTrue;
//
//@FixMethodOrder(MethodSorters.NAME_ASCENDING)
//public class CustomerDaoImplTest {
//    private CustomerDaoImpl customersDao = new CustomerDaoImpl();
//    Customers customer = new Customers(BigDecimal.valueOf(2222),
//            BigDecimal.valueOf(103), BigDecimal.valueOf(3000), "Apple");
//
//    @Test
//    public void test1InsertCustomers() throws SQLException {
//        assertTrue(customersDao.insertCustomer(customer));
//    }
//
//    @Test
//    public void test2updateCustomers() throws SQLException {
//        customer.setCompany("Huawey");
//        customer.setCust_rep(BigDecimal.valueOf(102));
//        assertTrue(customersDao.updateCustomer(customer));
//    }
//
//    @Test
//    public void test3deleteCustomers() throws SQLException {
//        assertTrue(customersDao.deleteCustomer(BigDecimal.valueOf(2222)));
//    }
//}
//
