package com.mateacademy.lessons15v2;

import java.beans.PropertyVetoException;
import java.sql.Connection;
import java.sql.SQLException;
import java.util.Locale;

import com.mchange.v2.c3p0.ComboPooledDataSource;

/**
 * @author spasko
 */
public class ConnectToDB {

	public static final String URL = "jdbc:oracle:thin:@localhost:1521:XE";
	public static final String USER = "MA_STUDENT";
	public static final String PASS = "KOLOBOK";

	/**
	 * Get a connection to database
	 * 
	 * @return Connection object
	 */
	public static Connection getConnection() {
		Connection conn = null;
		try {
			Locale.setDefault(Locale.ENGLISH);
			ComboPooledDataSource dataSourse = getDataSource();
			conn = dataSourse.getConnection();
		} catch (PropertyVetoException | SQLException e) {
			e.printStackTrace();
		}
		return conn;
	}

	public static ComboPooledDataSource getDataSource() throws PropertyVetoException {
	ComboPooledDataSource cpds = new ComboPooledDataSource();
		cpds.setJdbcUrl(URL);
        cpds.setUser(USER);
        cpds.setPassword(PASS);

        cpds.setInitialPoolSize(5);
        cpds.setMinPoolSize(5);
        cpds.setAcquireIncrement(5);
        cpds.setMaxPoolSize(20);
        cpds.setMaxStatements(100);
        return cpds;
	}
}
