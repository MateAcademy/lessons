package com.mateacademy.lessons15;

import oracle.jdbc.OracleDriver;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Locale;

import static java.util.jar.Pack200.Packer.PASS;
import static oracle.jdbc.replay.OracleDataSource.URL;
import static oracle.jdbc.replay.OracleDataSource.USER;

public class ConnectToDB {

    public static final String URL = "jdbc:oracle:thin:@localhost:1521:XE";
    public static final String USER = "MA_STUDENT";
    public static final String PASS = "KOLOBOK";


    public static Connection getConnection(){
        Connection conn = null;
        try {
            Locale.setDefault(Locale.ENGLISH);
            DriverManager.registerDriver(new OracleDriver());
            conn = DriverManager.getConnection(URL, USER, PASS);
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return conn;
    }
}
