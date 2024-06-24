package org.aguzman.api.stream.ejemplos;

import org.aguzman.api.stream.ejemplos.models.Usuario;

import java.util.IntSummaryStatistics;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class N_EjemploStreamDistinctUsuarioSum {
    public static void main(String[] args) {

        /*
        converertimos nuestro flujo de usuarios a un flujo de enteros
        con mapToInt()
         */

        IntStream largoNombres = Stream
                .of("Pato Guzman", "Paco Gonzalez", "Pepa Gutierrez", "Pepe Mena",
                        "Pepe Garcia", "Pato Guzman", "Pato Guzman")
                .map(nombre -> new Usuario(nombre.split(" ")[0], nombre.split(" ")[1]))
                .distinct()
                .mapToInt( u -> u.toString().length())//mapToDouble, mapToLong
                .peek(System.out::println);

        //No podemos usar varios operadores terminales  largoNombres.sum(); largoNombres.average()
        //largoNombres.forEach(System.out::println);
        IntSummaryStatistics stats = largoNombres.summaryStatistics();//para utilizarlos todos.
        System.out.println("total: " + stats.getSum());
        System.out.println("max: " + stats.getMax());
        System.out.println("Min = " + stats.getMin());
        System.out.println("promedio :" + stats.getAverage());
    }
}
