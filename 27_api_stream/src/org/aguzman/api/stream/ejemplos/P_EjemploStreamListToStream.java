package org.aguzman.api.stream.ejemplos;

import org.aguzman.api.stream.ejemplos.models.Usuario;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class P_EjemploStreamListToStream {
    public static void main(String[] args) {

        List<Usuario> lista = new ArrayList<>();
        lista.add(new Usuario("Andrés", "Guzmán"));
        lista.add(new Usuario("Luci", "Martínez"));
        lista.add(new Usuario("Pepe", "Fernández"));
        lista.add(new Usuario("Cata", "Pérez"));
        lista.add(new Usuario("Lalo", "Mena"));
        lista.add(new Usuario("Exequiel", "Doe"));
        lista.add(new Usuario("Bruce", "Lee"));
        lista.add(new Usuario("Bruce", "Willis"));

        //---------------convertimos Usuario a String en mayuscula-------------------
        lista.stream()
                .map(u -> u.getNombre().toUpperCase()
                        .concat(" ")
                        .concat(u.getApellido().toUpperCase()))
                        .forEach(System.out::println);


        Stream<String> nombres = lista.stream()
                .map(u -> u.getNombre().toUpperCase()
                        .concat(" ")
                        .concat(u.getApellido().toUpperCase()))
                .flatMap(nombre -> {
                    if(nombre.contains("bruce".toUpperCase())){//
                        return Stream.of(nombre);//devolvemos los bruce
                    }
                    return Stream.empty();//vacio
                })
                .map(String::toLowerCase)//pasamos a minuscula
                .peek(System.out::println);//mostramos con peek por pantalla

        System.out.println(nombres.count());//count es terminal //2
    }
}
