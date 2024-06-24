package org.aguzman.api.stream.ejemplos;

import org.aguzman.api.stream.ejemplos.models.Usuario;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;
import java.util.stream.Stream;

public class S_EjemploStreamParallel {
    public static void main(String[] args) {
        /*
        parallel() maneja un pool de hilos. Como se ejecutan en paralelo no puede que no mantenga el orden
        ejecutamos todos los stream en paralelo
         */

        List<Usuario> lista = new ArrayList<>();
        lista.add(new Usuario("Andrés", "Guzmán"));
        lista.add(new Usuario("Luci", "Martínez"));
        lista.add(new Usuario("Pepe", "Fernández"));
        lista.add(new Usuario("Cata", "Pérez"));
        lista.add(new Usuario("Lalo", "Mena"));
        lista.add(new Usuario("Exequiel", "Doe"));
        lista.add(new Usuario("Bruce", "Lee"));
        lista.add(new Usuario("Bruce", "Willis"));

        long t1 = System.currentTimeMillis();
        String resultado = lista.stream()
                .parallel()
                .map(u -> u.toString().toUpperCase())
                .peek(n -> {
                    System.out.println("Nombre Thread: " + Thread.currentThread().getName()
                    + " - " + n);
                })
                .flatMap(nombre -> {
                    try {
                        TimeUnit.SECONDS.sleep(1);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    if(nombre.contains("bruce".toUpperCase())){
                        return Stream.of(nombre);
                    }
                    return Stream.empty();
                })
                .findAny().orElse("");

        long t2 = System.currentTimeMillis();
        System.out.println("Tiempo total: " + (t2 - t1));
        System.out.println(resultado);
    }
}
