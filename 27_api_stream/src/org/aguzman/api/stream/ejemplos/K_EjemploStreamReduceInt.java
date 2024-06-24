package org.aguzman.api.stream.ejemplos;

import java.util.stream.Stream;

public class K_EjemploStreamReduceInt {
    public static void main(String[] args) {

        /*
            con reduce también podemos sumar todos los elementos de un Stream
         */

        Stream<Integer> nombres =  Stream.of(5, 10, 15, 20);

        int resultado = nombres.reduce(0, Integer::sum);//(0, (a,b) -> a+b);
        System.out.println(resultado);



    }
}
