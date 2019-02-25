package com.mateacademy.lessons15v2;

import com.mateacademy.lessons15.Customer;

import java.math.BigDecimal;
import java.sql.SQLException;
import java.util.Set;

public interface CustomerDao {
    Set<com.mateacademy.lessons15.Customer> getAllCustomers() throws SQLException;

    Set<Customer> findCustomersByCreditLimitMoreThan(BigDecimal creditLimit) throws SQLException;
}
