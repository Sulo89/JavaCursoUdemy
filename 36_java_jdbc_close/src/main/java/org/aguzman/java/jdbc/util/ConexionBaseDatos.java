package org.aguzman.java.jdbc.util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConexionBaseDatos {
    private static String url = "jdbc:mysql://localhost:3306/java_curso?serverTimezone=America/Santiago";
    private static String username = "root";
    private static String password = "sasa";
    private static Connection connection;

    /*
    NO USAR SINGLETON
    public static Connection getInstance() throws SQLException {
        if (connection == null) {
            connection = DriverManager.getConnection(url, username, password);
        }
        return connection;
    }

     */

    //creamos una conexión nueva por petición
    public static Connection getInstance() throws SQLException {
        return DriverManager.getConnection(url, username, password);
    }
}
