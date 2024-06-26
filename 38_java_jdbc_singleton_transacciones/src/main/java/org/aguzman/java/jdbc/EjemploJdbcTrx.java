package org.aguzman.java.jdbc;

import org.aguzman.java.jdbc.modelo.Categoria;
import org.aguzman.java.jdbc.modelo.Producto;
import org.aguzman.java.jdbc.repositorio.ProductoRepositorioImpl;
import org.aguzman.java.jdbc.repositorio.Repositorio;
import org.aguzman.java.jdbc.util.ConexionBaseDatos;

import java.sql.Connection;
import java.sql.SQLException;
import java.util.Date;

public class EjemploJdbcTrx {
    /*
        transaccion = unidad de trabajo (siempre en la misma conexion).
     */
    public static void main(String[] args) throws SQLException {
        //la conexión en un try() aparte para no cerrar la conexión antes de hacer rollback
        try (Connection conn = ConexionBaseDatos.getInstance()) {
            if(conn.getAutoCommit()) {
                conn.setAutoCommit(false);//por defecto es true (para transacciones cambiar)
            }
            try {
                Repositorio<Producto> repositorio = new ProductoRepositorioImpl();
                System.out.println("============= listar =============");
                repositorio.listar().forEach(System.out::println);

                System.out.println("============= obtener por id =============");
                System.out.println(repositorio.porId(1L));

                System.out.println("============= insertar nuevo producto =============");
                Producto producto = new Producto();
                producto.setNombre("Teclado IBM mecánico");
                producto.setPrecio(1550);
                producto.setFechaRegistro(new Date());
                Categoria categoria = new Categoria();
                categoria.setId(3L);
                producto.setCategoria(categoria);
                producto.setSku("abcde12345");
                repositorio.guardar(producto);
                System.out.println("Producto guardado con éxito");

                System.out.println("============= editar producto =============");
                producto = new Producto();
                producto.setId(5L);
                producto.setNombre("Teclado Cosair k95 mecánico");
                producto.setPrecio(1000);
                producto.setSku("abcdef1234");
                categoria = new Categoria();
                categoria.setId(2L);
                producto.setCategoria(categoria);
                repositorio.guardar(producto);
                System.out.println("Producto editado con éxito");

                repositorio.listar().forEach(System.out::println);
                conn.commit();
            } catch (SQLException exception) { // 1 solo catch para todo el conjunto de operaciones
                conn.rollback();//si alguna de las operaciones falla rollback y no se realiza ninguna
                exception.printStackTrace();
            }
        }
    }
}
