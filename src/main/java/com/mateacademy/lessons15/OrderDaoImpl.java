package com.mateacademy.lessons15;
import java.math.BigDecimal;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.util.HashSet;
import java.util.Set;

/**
 * @author spasko
 */
public class OrderDaoImpl  {

    public Order findOrderById(BigDecimal id) throws SQLException {
        Connection connection = ConnectToDB.getConnection();
        PreparedStatement stmt = connection.prepareStatement("SELECT * FROM  orders WHERE order_num=?");
        stmt.setBigDecimal(1, id);
        ResultSet rs = stmt.executeQuery();

        Order order = null;
        if (rs.next()) {
            order = new Order(rs.getBigDecimal("order_Num"),
                    null, rs.getDate("order_Date"),
                    rs.getString("mfr"),
                    rs.getBigDecimal("qty"),
                    rs.getBigDecimal("amount"));

        }

        rs.close();
        stmt.close();
        connection.close();
        return order;
    }




}
