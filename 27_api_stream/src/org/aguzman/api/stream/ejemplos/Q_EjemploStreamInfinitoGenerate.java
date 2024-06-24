package org.aguzman.api.stream.ejemplos;

import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.stream.Stream;

public class Q_EjemploStreamInfinitoGenerate {
    public static void main(String[] args) {
        //imprime de forma infinita
       // Stream.generate(() ->"Hola mundo").forEach (System.out::println);


        //le damos límite
        AtomicInteger contador = new AtomicInteger(0);
        Stream.generate(() -> {

            try {
                TimeUnit.SECONDS.sleep(2);//indicamos los segundos
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            return contador.incrementAndGet();//incerementa cada dos segundos
        })
                .limit(7)
                .forEach(System.out::println);
    }
}
