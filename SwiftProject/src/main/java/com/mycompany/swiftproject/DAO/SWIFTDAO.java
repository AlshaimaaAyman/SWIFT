package com.mycompany.swiftproject.DAO;

import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;

public class SWIFTDAO {

    private Connection connection;
    DBConnection dBConnection;

    public SWIFTDAO() {
        dBConnection = new DBConnection();

    }

    public boolean insert(String message) {
        boolean result = false;
        message = message.replace("'", "''");
        try {

            connection = dBConnection.getConnection();

            String query1 = "INSERT INTO SWIFT_MESSAGES (BODY)"
                    + "VALUES ( '" + message + "')";

            Statement stmt = connection.createStatement();

//Executing a SQL INSERT query using executeUpdate()  method of Statement object.
            int isInserted = stmt.executeUpdate(query1);
            if (isInserted == 1) {
                result = true;
            } else {
                System.out.println("failed to insert new row.");
            }
            connection.close();
        } catch (Exception e) {
            e.printStackTrace();
        } finally {

            dBConnection.close();

        }
        return result;
    }

}
