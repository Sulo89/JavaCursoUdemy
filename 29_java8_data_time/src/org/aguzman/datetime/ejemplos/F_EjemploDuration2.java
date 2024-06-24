package org.aguzman.datetime.ejemplos;

import java.time.Duration;
import java.time.Instant;
import java.util.concurrent.TimeUnit;

public class F_EjemploDuration2 {
    //usamos instantes de tiempo
    //recordar que son inmutables
    public static void main(String[] args) {
        
        Instant i1 = Instant.now();

        try {
            TimeUnit.SECONDS.sleep(3);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        Instant i2 = Instant.now();
        //podemos pasar instantes
        Duration tiempo = Duration.between(i1, i2);
        System.out.println("tiempo = " + tiempo);

    }
}
