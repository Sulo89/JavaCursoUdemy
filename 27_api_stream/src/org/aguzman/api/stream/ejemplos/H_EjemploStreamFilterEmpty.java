package org.aguzman.api.stream.ejemplos;

import java.util.stream.Stream;

public class H_EjemploStreamFilterEmpty {
    public static void main(String[] args) {

        //cantidad de Strings vacios

        long count = Stream
                .of("Pato Guzman", "Paco Gonzalez", "", "Pepe Mena",
                        "")
                .filter(String::isEmpty)
                .peek(System.out::println)
                .count();
        System.out.println("count = " + count);

        
    }
}
