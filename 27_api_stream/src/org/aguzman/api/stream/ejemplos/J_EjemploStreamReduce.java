package org.aguzman.api.stream.ejemplos;

import java.util.stream.Stream;

public class J_EjemploStreamReduce {
    public static void main(String[] args) {

        /*
        reduce operador terminal que devuelve un solo String
        2 argumentos (1 valor inicial, (a,b))
        a -> anterior
        b-> actual

        convierte el array de Strings en un solo String
         */

        Stream<String> nombres =  Stream.of("Pato Guzman", "Paco Gonzalez", "Pepa Gutierrez", "Pepe Mena",
                        "Pepe Garcia", "Paco Gonzalez", "Paco Gonzalez", "Paco Gonzalez")
                .distinct();

        
        String resultado = nombres.reduce("resultado concatenación ", (a, b) -> a+ " # " + b);
        System.out.println(resultado);



    }
}
