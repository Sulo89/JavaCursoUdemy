package org.aguzman.java.jdbc.util;

import org.apache.commons.dbcp2.BasicDataSource;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConexionBaseDatos {
    private static String url = "jdbc:mysql://localhost:3306/java_curso?serverTimezone=America/Santiago";
    private static String username = "root";
    private static String password = "sasa";
    private static BasicDataSource pool;//en vez Connection usamos un pool (Singleton, uno por app (tiene varias conexiones))

    public static BasicDataSource getInstance() throws SQLException {
        if (pool == null) {
            pool = new BasicDataSource();
            pool.setUrl(url);
            pool.setUsername(username);
            pool.setPassword(password);
            pool.setInitialSize(3);//tamaño inicial (por defecto 0)
            pool.setMinIdle(3);//mínimo inactivas esperando (por defecto 0)
            pool.setMaxIdle(8);//máximo inactivas (por defecto 8)
            pool.setMaxTotal(8);//máximo entra activas e inactivas(por defecto 8)
        }
        return pool;
    }
    //configura y crea el pool de conexiones (Singleton)
    public static Connection getConnection() throws SQLException {
        return getInstance().getConnection();
    }
}
