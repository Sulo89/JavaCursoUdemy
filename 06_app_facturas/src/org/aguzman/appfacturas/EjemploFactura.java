package org.aguzman.appfacturas;

import org.aguzman.appfacturas.modelo.Cliente;
import org.aguzman.appfacturas.modelo.Factura;
import org.aguzman.appfacturas.modelo.ItemFactura;
import org.aguzman.appfacturas.modelo.Producto;

import java.util.Scanner;

public class EjemploFactura {
    public static void main(String[] args) {

        Cliente cliente = new Cliente();
        cliente.setNif("5555-5");
        cliente.setNombre("Andrés");

        Scanner s = new Scanner(System.in);
        System.out.print("Ingrese una descripción de la factura: ");
        String desc = s.nextLine();
        Factura factura = new Factura(desc, cliente);

        Producto producto;
        String nombre;
        float precio;
        int cantidad;

        System.out.println();
        //AÑADIMOS 5 PRODUCTOS A LA FACTURA
        for(int i = 0; i<5; i++){
            producto = new Producto();
            System.out.print("Ingrese producto nº " + producto.getCodigo() + ": ");
            nombre = s.nextLine();//s.next()-> solo obtendría el primer parametro
            producto.setNombre(nombre);

            System.out.print("Ingrese el precio: ");
            precio = s.nextFloat();
            producto.setPrecio(precio);

            System.out.print("Ingrese la cantidad: ");
            cantidad = s.nextInt();//la cantidad no pertenece a la factura es para crear el itemFactura

            ItemFactura item = new ItemFactura(cantidad, producto);//le pasamos la cantidad y el producto para crear los item de la factura
            factura.addItemFactura(item);

            System.out.println();
            s.nextLine();//movemos el cursor a la siguiente línea
        }
        System.out.println(factura.generarDetalle());
    }
}
