package org.aguzman.api.stream.ejemplos;

import org.aguzman.api.stream.ejemplos.models.Usuario;

import java.util.stream.Stream;

public class E_EjemploStreamFilterSingle2 {
    public static void main(String[] args) {

        /*
        Filter (operador intermedio) recibe una expresion lamnda (Predicate) que evalua una expresión booleana
        findFirst operador final convierte nuestro flujo a un solo objeto (primera coincidencia)
        buscamos por stream si no devuelve a John
         */

        Usuario usuario = Stream
                .of("Pato Guzman", "Paco Gonzalez", "Pepa Gutierrez", "Pepe Mena",
                        "Pepe Garcia")
                .map(nombre -> new Usuario(nombre.split(" ")[0], nombre.split(" ")[1]))
                .peek(System.out::println)
                .filter(u -> u.getId().equals(4))
                .findFirst().orElseGet(() -> new Usuario("John", "Doe"));

        System.out.println(usuario);

    }
}
