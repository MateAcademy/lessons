package com.mateacademy.lessons16;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

import java.math.BigDecimal;
import java.sql.SQLException;

import static org.junit.Assert.*;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class CustomerDaoImplTest {
    private CustomerDaoImpl customersDao = new CustomerDaoImpl();
    Customers customer = new Customers(BigDecimal.valueOf(2223),
            BigDecimal.valueOf(103), BigDecimal.valueOf(3000), "Apple");

    @Test
    public void test1InsertCustomers() throws SQLException {
        assertTrue(customersDao.insertCustomer(customer));
    }

    @Test
    public void test2updateCustomers() throws SQLException {
        customer.setCompany("Huawey");
        customer.setCust_rep(BigDecimal.valueOf(102));
        assertTrue(customersDao.updateCustomer(customer));
    }


    @Test
    public void test3deleteCustomers() throws SQLException {
        assertTrue(customersDao.deleteCustomer(BigDecimal.valueOf(2223)));
    }
}