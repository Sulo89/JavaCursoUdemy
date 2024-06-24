package org.aguzman.api.stream.ejemplos;

import org.aguzman.api.stream.ejemplos.models.Usuario;

import java.util.stream.Stream;

public class G_EjemploStreamFilterCount {
    public static void main(String[] args) {

        /*
        count operador terminal devuelve un entero con la cantidad. (parecido al AnyMatch(boolean))
         */

        long count = Stream
                .of("Pato Guzman", "Paco Gonzalez", "Pepa Gutierrez", "Pepe Mena",
                        "Pepe Garcia")
                .map(nombre -> new Usuario(nombre.split(" ")[0], nombre.split(" ")[1]))
                .peek(System.out::println)
                .count();

        System.out.println(count);
    }
}
