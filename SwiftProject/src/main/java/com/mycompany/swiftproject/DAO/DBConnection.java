
package com.mycompany.swiftproject.DAO;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.time.LocalDateTime;


public class DBConnection {

    //JDBC and database properties.
    private static Connection conn = null;
    private static final String DB_DRIVER = "oracle.jdbc.driver.OracleDriver";
    private static final String DB_URL = "jdbc:oracle:thin:@localhost:1521:XE";
    private static final String DB_USERNAME = "SWIFT";
    private static final String DB_PASSWORD = "SWIFT1";

    public static void open() {

        try {
            //Register the JDBC driver
            Class.forName(DB_DRIVER);

            //Open the connection
            conn = DriverManager.getConnection(DB_URL, DB_USERNAME, DB_PASSWORD);

            if (conn != null) {
                System.out.println("Database connected successfully.");

            } else {
                System.out.println("Failed to connect to Database.");
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public Connection getConnection() throws SQLException {
        if (conn == null) {
            open();
        } else if (conn.isClosed()) {
            open();
        }
        return conn;
    }

    public void close() {
        if (conn != null)
            try {
            conn.close();
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
    }

}
