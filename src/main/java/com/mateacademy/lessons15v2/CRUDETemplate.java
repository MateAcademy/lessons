//package com.mateacademy.lessons15v2;
//
//import java.sql.Connection;
//import java.sql.PreparedStatement;
//import java.sql.SQLException;
//
//public abstract class CRUDETemplate {
//    public boolean templateOperation(Order order) throws SQLException {
//        boolean result = false;
//        Connection connection = null;
//        PreparedStatement statement = null;
//        try {
//            connection = ConnectToDB.getConnection();
//
//            returnPrepareStatement(order, connection);
//
//
//            int rowsInserted = statement.executeUpdate();
//            if (rowsInserted > 0) {
//                result = true;
//            }
//        }finally {
//            statement.close();
//            connection.close();
//        }
//        return result;
//
//    }
//
//    public abstract PreparedStatement returnPrepareStatement(Order order, Connection connection) throws SQLException;
//    }