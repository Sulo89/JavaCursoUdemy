package org.aguzman.api.stream.ejemplos;

import org.aguzman.api.stream.ejemplos.models.Usuario;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class B_EjemploStreamMap {
    /*
    con los operadores intermedios transformamos el flujo pero como
    son inmutables -> retornan una instancia del Stream sin modificar este

    * map (operador intermedio) es una expresion lambda (function) se emite cada elemento pero retorna ese elemento modificado
    * peek (operador intermedio) es una expresion lambda (consumer) se usa para debug (realizar un rasteo de los elementos (inspecionamos)
    * collect (operador final) transforma en lista

    sin un operador final no pasa nada!! ni se ejecuta el peek ni el map
    collect (operador final) transforma en lista
     */
    public static void main(String[] args) {

        Stream<String> nombresMayusculas = Stream.of("Pato Guzman", "Paco Gonzalez", "Pepa Gutierrez", "Pepe Mena").map(nombre -> nombre.toUpperCase());

        nombresMayusculas.forEach(System.out::println);//(operador final)como devuelve void no podemos concatenarlo pues estamos almacenandolo en una variable.

        System.out.println();
        //así podriamos concatenar el .forEach
        Stream.of("Pato Guzman", "Paco Gonzalez", "Pepa Gutierrez", "Pepe Mena").map(nombre -> nombre.toUpperCase()).forEach(System.out::println);

        System.out.println();
        //con metodo referenciado
        Stream.of("Pato Guzman", "Paco Gonzalez", "Pepa Gutierrez", "Pepe Mena").map(String::toUpperCase).forEach(System.out::println);

        System.out.println();

        //añadimos peek para inspeccionar antes de que el map pase a mayusculas y de mostrar con forEach
        Stream.of("Pato Guzman", "Paco Gonzalez", "Pepa Gutierrez", "Pepe Mena").peek(System.out::println).map(String::toUpperCase).forEach(System.out::println);

        System.out.println();

        //creamos otra variable con el Stream (nombresMayusculas ya tiene un operador final y no pueden tener 2)
        Stream<String> nombresMayusculas2 = Stream.of("Pato Guzman", "Paco Gonzalez", "Pepa Gutierrez", "Pepe Mena").map(nombre -> nombre.toUpperCase());
        //convertimos a List con el operador final collect
        List<String> listaNombresMayuscula = nombresMayusculas2.collect(Collectors.toList());//puede ser toSet, toMap
        listaNombresMayuscula.forEach(System.out::println);

        System.out.println();

        //Creamos en el paquete models la clase Usuario
        //tenemos un array de "nombre y apellido"
        //almacenamos en un stream


        //almacenamos en un Stream Usuarios separando nombre y apellidos y poniendo el nombre en mayusculas.
        Stream<Usuario> usuarios = Stream
                .of("Pato Guzman", "Paco Gonzalez", "Pepa Gutierrez", "Pepe Mena")
                .map(nombre -> new Usuario(nombre.split(" ")[0], nombre.split(" ")[1]))//la más importante
                .peek(System.out::println)
                .map(usuario -> {
                    String nombre =  usuario.getNombre().toUpperCase();
                    usuario.setNombre(nombre);
                    return usuario;
                });

        List<Usuario> lista = usuarios.collect(Collectors.toList());
        lista.forEach(System.out::println);
        //sin un operador final no pasa nada!! ni se ejecuta el peek ni el map
        //nombres.forEach(System.out::println);

    }
}
