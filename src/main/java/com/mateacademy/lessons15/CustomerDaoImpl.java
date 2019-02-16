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

    @Override
    public boolean insertCustomer(Customer cast2) throws SQLException {
        Connection connection = ConnectToDB.getConnection();
        //PreparedStatement statement = connection.prepareStatement("INSERT INTO customers values (?, ?, ?, ?)");
        PreparedStatement statement = connection.prepareStatement(
                "INSERT INTO customers (cust_num, company, cust_rep, credit_limit) VALUES (?,?,?,?) ");

        statement.setBigDecimal(1, cast2.getCustNum());
        statement.setString(2, cast2.getCompany());
        statement.setBigDecimal(3, cast2.getCustRep());
        statement.setBigDecimal(4, cast2.getCreditLimit());

//        int rowsInserted = statement.executeUpdate();
//        if (rowsInserted > 0) {
//            statement.close();
//            connection.close();
//            return true;
//        }
//        statement.close();
//        connection.close();
//        return false;

        Boolean isRowInserted = statement.executeUpdate() > 0;
        statement.close();
        connection.close();
        return isRowInserted;

    }

    @Override
    public boolean updateCustomers(Customer customer) throws SQLException {
        Connection conn = ConnectToDB.getConnection();
        String sql = "UPDATE customers SET company=?, credit_limit=?  WHERE cust_num=?";
        PreparedStatement stmt = conn.prepareStatement(sql);
        stmt.setString(1, customer.getCompany());
        stmt.setBigDecimal(2, customer.getCreditLimit());
        stmt.setBigDecimal(3, customer.getCustNum());

        Boolean isRowInserted = stmt.executeUpdate() > 0;
        stmt.close();
        conn.close();
        return isRowInserted;
    }

    @Override
    public boolean deleteCustomers(BigDecimal id) throws SQLException {
        Connection connection = ConnectToDB.getConnection();
        String sql = "DELETE FROM customers WHERE cust_num = ?";
        PreparedStatement statement = connection.prepareStatement(sql);
        statement.setBigDecimal(1, id);

        Boolean isRowInserted = statement.executeUpdate() > 0;
        statement.close();
        connection.close();
        return isRowInserted;
    }


}