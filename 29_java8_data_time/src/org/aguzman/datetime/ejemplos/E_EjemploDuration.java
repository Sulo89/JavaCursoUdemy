package org.aguzman.datetime.ejemplos;

import java.time.Duration;
import java.time.LocalDateTime;

public class E_EjemploDuration {
    /*
    calculamos el tiempo entre dos fechas
     recordar que son inmutables
     */
    public static void main(String[] args) {
        
        LocalDateTime fecha1 = LocalDateTime.now();
        // fecha1 = fecha1.withMonth(10);
        LocalDateTime fecha2 = LocalDateTime.now().plusHours(3).plusMinutes(20).plusDays(1);
        Duration lapsus = Duration.between(fecha1, fecha2);
        System.out.println("lapsus = " + lapsus);
        //podemos pasar el lapsus de tiempo(el objeto Duration) a minutos,segundos,horas
        System.out.println(lapsus.toMinutes());
        //y sumarle o restarle postLapsus de tiempo
        System.out.println("sumamos 5 horas " + lapsus.plusHours(5));
    }
}
