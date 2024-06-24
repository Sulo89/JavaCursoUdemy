package org.aguzman.java.jdbc;

import java.sql.*;

public class A_EjemploJdbcProbandoConexion {

    /*
    Este ejemplo básico sin usar el patrón Singleton
    ni patron Dao (repositorio) ni mapeo de la tabla al objeto java
    y sin usar el autoClose con el try con recursos

    EJEMPLO PARA INICIARNOS EN JDBC
     */

    public static void main(String[] args) {
        //es necesario el TimeZone desde las útimas versiones
        String url = "jdbc:mysql://localhost:3306/java_curso?serverTimezone=Europe/Madrid";
        String username = "root";
        String password = "sasa";
        Connection conn =  null;
        Statement stmt = null;
        ResultSet resultado = null;
        try {
            conn = DriverManager.getConnection(url,username,password);
            stmt = conn.createStatement();
            resultado = stmt.executeQuery("SELECT * FROM productos");

            while(resultado.next()){

                System.out.print(resultado.getInt("id"));
                System.out.print(" | ");
                System.out.print(resultado.getString("nombre"));
                System.out.print(" | ");
                System.out.print(resultado.getInt("precio"));
                System.out.print(" | ");
                //no hace falta pasarla a sql.Date porque hereda de util.Date
                System.out.println(resultado.getDate("fecha_registro"));
            }


        } catch (SQLException e) {
            e.printStackTrace();
        }finally {
            try {
                /*
                cerramos los recursos en el finally
                (lanzan excepción) Y  (deberiamos validar si son distinto de null
                todos los .close())
                si no existe usuario da ya error en la conexión y por tanto Statement es null
                por tanto da otro error al cerrar las conexiones que son null
                LA SOLUCIÓN ES USAR el autoClose con el try con recursos
                 */
                conn.close();
                resultado.close();
                stmt.close();

            } catch (SQLException e) {
                throw new RuntimeException(e);
            }
        }
    }


}
