package org.aguzman.api.stream.ejemplos;

import org.aguzman.api.stream.ejemplos.models.Usuario;

import java.util.Optional;
import java.util.stream.Stream;

public class D_EjemploStreamFilterSingle {
    public static void main(String[] args) {

        /*
         En vez Collect usamos findFirst
         Filter (operador intermedio) recibe una expresion lamnda (Predicate) que evalua una expresión booleana
         findFirst operador final convierte nuestro flujo a un solo objeto (primera coincidencia)
         */

        Stream<Usuario> nombres = Stream
                .of("Pato Guzman", "Paco Gonzalez", "Pepa Gutierrez", "Pepe Mena",
                        "Pepe Garcia")
                .map(nombre -> new Usuario(nombre.split(" ")[0], nombre.split(" ")[1]))
                .filter(u -> u.getNombre().equals("Pepe"))
                .peek(System.out::println);

        //obtenemos un Optional (objeto que envuelve al usuario para agregar más funcionalidad) dando una capa de abstraccion para evitar el nullPointerException
        Optional<Usuario> usuario = nombres.findFirst();

        //opciones para no usar get() sobre un usuario null
        //--------------------DAMOS UNA ALTERNATIVA-----------------------------
        // System.out.println(usuario.orElse(new Usuario("John", "Doe")).getNombre());
        // System.out.println(usuario.orElseGet(() -> new Usuario("John", "Doe")).getNombre()); //recibe un Supplier (expresion lambda)
        //orElseThrow() -> lanzamos una excepción (se puede personalizar si no al igual que el get() lanza NoSuchElementException (son iguales!)

        //---------------------OTRA ALTERNATIVA--------------------------------
        if(usuario.isPresent()) {
            System.out.println(usuario.get().getNombre());
        } else {
            System.out.println("No se encontró el objeto!");
        }
        //nombres.forEach(System.out::println);

    }
}
