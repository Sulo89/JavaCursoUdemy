package org.aguzman.api.stream.ejemplos;

import org.aguzman.api.stream.ejemplos.models.Usuario;

import java.util.stream.Stream;

public class O_EjemploStreamFlatMap {
    public static void main(String[] args) {
        /*
        .map devuelve un Stream de la clase que sea (modificado)
        .flatMap devuelve otro flujo de la clase, uniendo varios Stream(varias salidas unidas)
        da la posibilidad de filtrar y modificar por partes y no devolver algunas(con .empty).
         */

        Stream<Usuario> nombres = Stream
                .of("Pato Guzman", "Paco Gonzalez", "Pepa Gutierrez", "Pepe Mena",
                        "Pepe Garcia")
                .map(nombre -> new Usuario(nombre.split(" ")[0], nombre.split(" ")[1]))
                .flatMap(u -> {
                    if(u.getNombre().equalsIgnoreCase("Pepe")){
                        return Stream.of(u);
                    }
                    return Stream.empty();//quitamos del Stream
                })
                .peek(System.out::println);

        // nombres.forEach(System.out::println);
        System.out.println(nombres.count());

    }
}
