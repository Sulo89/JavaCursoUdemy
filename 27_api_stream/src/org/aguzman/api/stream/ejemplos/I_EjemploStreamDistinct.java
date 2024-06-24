package org.aguzman.api.stream.ejemplos;

import java.util.stream.Stream;

public class I_EjemploStreamDistinct {
    public static void main(String[] args) {

        /*
        distinct operador intermedio -> quita los repetidos
         */

        Stream<String> nombres =  Stream.of("Pato Guzman", "Paco Gonzalez", "Pepa Gutierrez", "Pepe Mena",
                        "Pepe Garcia", "Paco Gonzalez", "Paco Gonzalez", "Paco Gonzalez")
                .distinct();

        nombres.forEach(System.out::println);



    }
}
