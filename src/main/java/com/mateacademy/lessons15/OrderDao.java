package com.mateacademy.lessons15;

import java.math.BigDecimal;
import java.sql.SQLException;
import java.util.Set;

public interface OrderDao {

    Set<Order> getAllOrdersJoin() throws SQLException;

    Set<Order> getAllOrders() throws SQLException; //достаем все ордара

    Order findOrderById(BigDecimal id) throws SQLException; //ищем проверяем

    boolean insertOrder (Order order) throws SQLException;

    boolean updateOrder(Order order) throws SQLException;

    boolean deleteOrder(BigDecimal id) throws SQLException;
}
