package org.aguzman.api.stream.ejemplos;

import org.aguzman.api.stream.ejemplos.models.Usuario;

import java.util.stream.Stream;

public class M_EjemploStreamDistinctUsuario {
    public static void main(String[] args) {
        /*
        distinc operador intermedio
        para aplicar el distinc de forma efectiva tenemos que tener el equals
         */

        Stream<Usuario> nombres = Stream
                .of("Pato Guzman", "Paco Gonzalez", "Pepa Gutierrez", "Pepe Mena",
                        "Pepe Garcia", "Pato Guzman", "Pato Guzman")//.distinct(); saldría sin duplicados
                .map(nombre -> new Usuario(nombre.split(" ")[0], nombre.split(" ")[1]))
                .distinct();//aplicado después del map sin el equals sale duplicado porque son instancias distintas

        nombres.forEach(System.out::println);
    }
}
