package org.aguzman.api.stream.ejemplos;

import org.aguzman.api.stream.ejemplos.models.Usuario;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class C_EjemploStreamFilter {
    /*
        Filter (operador intermedio) recibe una expresion lamnda (Predicate) que evalua una expresión booleana

        Ejemplo trae una lista de Usuarios
     */
    public static void main(String[] args) {

        Stream<Usuario> nombres = Stream
                .of("Pato Guzman", "Paco Gonzalez", "Pepa Gutierrez", "Pepe Mena",
                        "Pepe Garcia")
                .map(nombre -> new Usuario(nombre.split(" ")[0], nombre.split(" ")[1]))
                .filter(u -> u.getNombre().equals("Pepe"))//filtramos por Pepe
                .peek(System.out::println);

        List<Usuario> lista = nombres.collect(Collectors.toList());
        lista.forEach(System.out::println);
        //nombres.forEach(System.out::println);

    }
}
