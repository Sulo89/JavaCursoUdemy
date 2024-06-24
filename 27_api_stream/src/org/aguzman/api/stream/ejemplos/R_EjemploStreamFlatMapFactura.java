package org.aguzman.api.stream.ejemplos;

import org.aguzman.api.stream.ejemplos.models.Factura;
import org.aguzman.api.stream.ejemplos.models.Usuario;

import java.util.Arrays;
import java.util.List;

public class R_EjemploStreamFlatMapFactura {
    public static void main(String[] args) {

        Usuario u1 = new Usuario("John", "Doe");
        Usuario u2 = new Usuario("Pepe", "Pérez");

        u1.addFactura(new Factura("compras tecnologías"));
        u1.addFactura(new Factura("compras muebles"));

        u2.addFactura(new Factura("bicicleta"));
        u2.addFactura(new Factura("notebook gamer"));

        List<Usuario> usuarios = Arrays.asList(u1, u2);
        usuarios.stream()
                .flatMap(u -> u.getFacturas().stream())//por cada item se devuelve una salida distinta (un stream diferente  por item)
                .forEach(f -> System.out.println(f.getDescripcion().concat(" : cliente ")
                .concat(f.getUsuario().toString())));//para obtener los datos del cliente debemos tener Cliente como atributo en Factura
        // en el método addFactura de Usuario - >  factura.setUsuario(this);


        //---------------------------mismo resultado-----------------------------------------------------------------
        List<Usuario> usuarios2 = Arrays.asList(u1, u2);
        usuarios.stream()
                .map(u-> u.getFacturas())//convertimos el stream de usuarios a un List de facturas
                .flatMap(lf -> lf.stream())//convertimos a stream de facturas
                .forEach(f -> System.out.println(f.getDescripcion().concat(" : cliente ")
                        .concat(f.getUsuario().toString())));




        /*for(Usuario u: usuarios){
            for(Factura f: u.getFacturas()){
                System.out.println(f.getDescripcion());
            }
        }*/
    }
}
