package com.mateacademy.lessons15;

import java.math.BigDecimal;
import java.sql.SQLException;
import java.util.Set;

public interface CustomerDao {

    Set<Customer> getAllCustomers() throws SQLException;

    Set<Customer> findCustomersByCreditLimitMoreThan(BigDecimal creditLimit) throws SQLException;
}
