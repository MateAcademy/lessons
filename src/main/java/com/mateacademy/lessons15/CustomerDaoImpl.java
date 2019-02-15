package com.mateacademy.lessons15;

import java.math.BigDecimal;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.HashSet;
import java.util.Set;

public class CustomerDaoImpl implements CustomerDao {

    @Override
    public Set<Customer> getAllCustomers() throws SQLException {
        Set<Customer> customers = new HashSet<>();
        Connection conn = ConnectToDB.getConnection();
        PreparedStatement stmt = conn.prepareStatement("SELECT * FROM customers");
        ResultSet rs = stmt.executeQuery();
        while (rs.next()) {
            Customer customer = new Customer(rs.getBigDecimal("cust_num"), rs.getString("company"),
                    rs.getBigDecimal("cust_rep"), rs.getBigDecimal("credit_limit"));
            customers.add(customer);
        }
        rs.close();
        stmt.close();
        conn.close();
        return customers;
    }

    @Override
    public Set<Customer> findCustomersByCreditLimitMoreThan(BigDecimal creditLimit) throws SQLException {
        Set<Customer> customers = new HashSet<>();
        Connection conn = ConnectToDB.getConnection();
        PreparedStatement stmt = conn.prepareStatement("SELECT * FROM customers WHERE credit_limit	> ?");
        stmt.setBigDecimal(1, creditLimit);
        ResultSet rs = stmt.executeQuery();
        while (rs.next()) {
            Customer customer = new Customer(rs.getBigDecimal("cust_num"), rs.getString("company"),
                    rs.getBigDecimal("cust_rep"), rs.getBigDecimal("credit_limit"));
            customers.add(customer);
        }

        rs.close();
        stmt.close();
        conn.close();
        return customers;
    }

}