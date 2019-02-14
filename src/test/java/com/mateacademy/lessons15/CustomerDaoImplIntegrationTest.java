package com.mateacademy.lessons15;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import java.math.BigDecimal;
import java.sql.Date;
import java.sql.SQLException;
import java.util.Set;

import org.junit.Test;

public class CustomerDaoImplIntegrationTest {
    private static final BigDecimal NOT_EXIST_CUSTOMER = BigDecimal.valueOf(90777);
    private static final BigDecimal SOME_RICH_CUSTOMERS = BigDecimal.valueOf(90);
    private static final Customer MOST_VALUED_CUSTOMER = new Customer(BigDecimal.valueOf(2105), "Дурдом компании",
            BigDecimal.valueOf(101), BigDecimal.valueOf(45.865));
    private CustomerDao customerDao = new CustomerDaoImpl();

    @Test
    public void testGetAllCustomers() throws SQLException{
        Set<Customer> customers = customerDao.getAllCustomers();
        System.out.println(customers);
        assertFalse(customers.isEmpty());
    }

    @Test
    public void testFindCustomersByCreditLimitMoreThanEmpty() throws SQLException {
        Set<Customer> customers = customerDao.findCustomersByCreditLimitMoreThan(NOT_EXIST_CUSTOMER);
        System.out.println(customers);
        assertTrue(customers.isEmpty());
    }

    @Test
    public void testFindCustomersByCreditLimitMoreThan() throws SQLException {
        Set<Customer> customers = customerDao.findCustomersByCreditLimitMoreThan(SOME_RICH_CUSTOMERS);
        System.out.println(customers);
        assertFalse(customers.isEmpty());
    }

    @Test
    public void testFindCustomersByCreditLimitMoreThanHundred() throws SQLException {
        Set<Customer> customers = customerDao.findCustomersByCreditLimitMoreThan(BigDecimal.valueOf(46));
        System.out.println(customers);
        assertTrue(customers.contains(MOST_VALUED_CUSTOMER));
    }

}
