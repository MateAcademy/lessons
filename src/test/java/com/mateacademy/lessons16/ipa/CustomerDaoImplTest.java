package com.mateacademy.lessons16.ipa;

import com.mateacademy.lessons16.entry.Customers;
import org.junit.Test;
import org.junit.FixMethodOrder;
import org.junit.runners.MethodSorters;
import static org.junit.Assert.*;

import java.math.BigDecimal;
import java.sql.SQLException;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class CustomerDaoImplTest {
    private static final Customers INSERT_CUSTOMER = new Customers(BigDecimal.valueOf(3333), "Ava Corporation",
            BigDecimal.valueOf(103), BigDecimal.valueOf(333000));
    private static final Customers UPDATE_CUSTOMER = new Customers(BigDecimal.valueOf(3333), "Ava Corporation intertainment",
            BigDecimal.valueOf(103), BigDecimal.valueOf(333001));
    private CustomerDao customerDao = new CustomerDaoImpl();

    @Test
    public void test1InsertCustomer() throws SQLException {
        assertTrue(customerDao.insertCustomer(INSERT_CUSTOMER));
    }

    @Test
    public void test2UpdateCustomer() throws SQLException {
        assertTrue(customerDao.updateCustomer(UPDATE_CUSTOMER));
    }

    @Test
    public void test3DeleteCustomer() throws SQLException {
        assertTrue(customerDao.deleteCustomer(UPDATE_CUSTOMER.getCustNum()));
    }
}