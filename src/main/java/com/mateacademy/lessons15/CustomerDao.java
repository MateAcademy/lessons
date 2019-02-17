package com.mateacademy.lessons15;

import java.math.BigDecimal;
import java.sql.SQLException;
import java.util.Set;

public interface CustomerDao {

    Set<Customer> getAllCustomers() throws SQLException;

    Set<Customer> findCustomersByCreditLimitMoreThan(BigDecimal creditLimit) throws SQLException;

    Customer findCustomersByCustNum(BigDecimal cust_num) throws SQLException;

    boolean insertCustomer(Customer customer) throws SQLException;

    boolean updateCustomer(Customer customer) throws SQLException;

    boolean deleteCustomer(BigDecimal id) throws SQLException;
}
