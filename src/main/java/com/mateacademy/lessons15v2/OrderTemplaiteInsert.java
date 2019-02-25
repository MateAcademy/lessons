//package com.mateacademy.lessons15v2;
//
//import java.sql.Connection;
//import java.sql.PreparedStatement;
//import java.sql.SQLException;
//
//public class OrderTemplaiteInsert extends CRUDETemplate {
//
//    @Override
//    public PreparedStatement returnPrepareStatement(Order order, Connection connection) throws SQLException {
//        PreparedStatement statement;
//        String sql = "INSERT INTO orders (order_num, order_date, qty)  VALUES (?, ?, ?)";
//        statement = connection.prepareStatement(sql);
//        statement.setBigDecimal(1, order.getOrderNum());
//        statement.setDate(2, new java.sql.Date(order.getOrderDate().getTime()));
//        statement.setBigDecimal(3, order.getQty());
//        return statement;
//    }
//
////    @Override
////    public void returnPrepareStatement(Order order, Connection connection)  {
////        PreparedStatement statement;
////
////
////    }
//}
