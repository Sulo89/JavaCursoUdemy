package org.aguzman.java8.lambda;

import org.aguzman.java8.lambda.models.Usuario;

import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.Date;
import java.util.List;
import java.util.function.BiConsumer;
import java.util.function.Consumer;
import java.util.function.Supplier;

public class EjemploConsumer {
    public static void main(String[] args) {

        /*
         * @FunctionalInterfaz
         *interfaz funcional con un solo método abstracto que tenemos que implementar.
         *Anonimo al vuelo.
         */
        //consumidor del parametro del método -> puede ser cualquier tipo y no devuelve nada, solo realiza algo.
        //es una implementacion no pasa nada hasta que invoquemos a accept
        Consumer<Date> consumidor = fecha -> {
            SimpleDateFormat f = new SimpleDateFormat("yyyy-MM-dd");
            System.out.println(f.format(fecha));
        };
        consumidor.accept(new Date());//usamos con accept

        //2 argumentos
        BiConsumer<String, Integer> consumidorBi = (nombre, edad) -> System.out.println(nombre + ", tiene " + edad + " años!");//definimos al vuelo

        consumidorBi.accept("pepe", 20);//usamos con accept

        //Consumer<String> consumidor2 = saludo-> System.out.println(saludo);
        //referencia de método
        Consumer<String> consumidor2 = System.out::println;
        consumidor2.accept("Hola mundo lambda");

        //la expresión lambda forEach recibe un consumer.
        List<String> nombres = Arrays.asList("andres", "pepe", "luz", "paco");
        nombres.forEach(consumidor2);
        //--------------------------------------------------------------------------------
        Usuario usu = new Usuario();

        BiConsumer<Usuario,String>asignarNom = (persona, nombre)->{//implementación
            persona.setNombre(nombre);
        };

        asignarNom.accept(usu, "Saul");//usamos con accept
        //---------------------------------------------------------------------------------
        //Supplier (proveedor) no recibe argumento solo devuelve un valor
        //obtenemos con get el valor que devuelve Supplier
        Supplier<Usuario> creaUsuario = Usuario::new;
        Usuario usuario = creaUsuario.get();
        //usamos referencia de métodos
        BiConsumer<Usuario, String> asignarNombre = Usuario::setNombre;//asume que se le pasa el String al método
        asignarNombre.accept(usuario, "Andrés");
        System.out.println("Nombre usuario: " + usuario.getNombre());

        Supplier<String> proveedor = () -> "Hola mundo lambda supplier";

        System.out.println(proveedor.get());
    }
}
