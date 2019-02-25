package com.mateacademy.lessons16.ipa;

import com.mateacademy.lessons16.entry.Orders;

import java.math.BigDecimal;
import java.sql.SQLException;
import java.util.Set;

public interface OrderDao {
    Set<Orders> getAllOrders() throws SQLException;

    Orders findOrderById(BigDecimal id) throws SQLException;

    boolean insertOrder(Orders order) throws SQLException;

    boolean updateOrder(Orders order) throws SQLException;

    boolean deleteOrder(BigDecimal id) throws SQLException;
}
