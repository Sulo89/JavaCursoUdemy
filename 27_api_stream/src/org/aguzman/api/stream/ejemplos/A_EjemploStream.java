package org.aguzman.api.stream.ejemplos;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class A_EjemploStream {
    /*
        4 formas de crear un flujo de datos
        forEach es un operador final (expresión lambda consumer)
    */
    public static void main(String[] args) {
        //------------1 forma---------------------
        Stream<String> nombres1 = Stream.of("Pato", "Paco", "Pepa", "Pepe");
        nombres1.forEach(System.out::println);
        System.out.println();
        //------------2 forma---------------------
        String[] arr = {"Pato", "Paco", "Pepa", "Pepe"};
        Stream<String> nombres2 = Arrays.stream(arr);
        nombres2.forEach(System.out::println);
        System.out.println();
        //------------3 forma---------------------
        Stream<String> nombres3 = Stream.<String>builder()
                .add("Pato")
                .add("paco")
                .add("pepa")
                .add("pepe")
                .build();
        nombres3.forEach(System.out::println);
        System.out.println();
        //------------4 forma---------------------
        List<String> lista = new ArrayList<>();
        lista.add("Pato");
        lista.add("Paco");
        lista.add("Pepe");
        lista.add("Pepa");

        //Stream<String> nombres = lista.stream();
        //nombres.forEach(System.out::println);
        //directamente
        lista.stream().forEach(System.out::println);

    }
}
