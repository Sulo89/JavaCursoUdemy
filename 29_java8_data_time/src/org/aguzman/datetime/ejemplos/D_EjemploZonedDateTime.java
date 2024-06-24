package org.aguzman.datetime.ejemplos;

import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.ZoneOffset;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;

public class D_EjemploZonedDateTime {

    //se puede usar el ZoneId.of() o ZoneOffset.of()
    //recordar que son inmutables
    public static void main(String[] args) {
        //------------------------------viaje actual-----------------------------------------------------------------

        LocalDateTime fechaLocal = LocalDateTime.now();
        ZoneId newYork = ZoneId.of("America/New_York");
        ZonedDateTime zonaNy = ZonedDateTime.of(fechaLocal, newYork);
        System.out.println("Hora de partida en New York: " + zonaNy);


        ZoneId madrid = ZoneId.of("Europe/Madrid");
        //apartir de la zona de new York sacamos la zona de madrid
        ZonedDateTime zonaMadrid = zonaNy.withZoneSameInstant(madrid).plusHours(8);//8 horas de viaje
        System.out.println("Hora de llegada en Madrid: " + zonaMadrid);

        //-------------------------------viaje a futuro-----------------------------------------------------------------

        LocalDateTime fechaLocal2 = LocalDateTime.parse("2021/09/23 12:45"
                , DateTimeFormatter.ofPattern("yyyy/MM/dd HH:mm"));// 2 parametro el formato
        ZonedDateTime zonaNy2 = fechaLocal2.atZone(ZoneOffset.of("-04:00"));//podemos usar el ZoneId.of()
        System.out.println("Horario de partida en New York: " + zonaNy2);


        ZonedDateTime zonaMadrid2 = zonaNy2.withZoneSameInstant(ZoneOffset.of("+02:00")).plusHours(8);
        System.out.println("Hora de llegada en Madrid: " + zonaMadrid2);
        DateTimeFormatter f = DateTimeFormatter.ofPattern("HH:mm, dd MMM yyyy");
        System.out.println("Detalles del viaje a españa:");
        System.out.println("Partida NY: " + f.format(zonaNy2));
        System.out.println("llegada Madrid: " + f.format(zonaMadrid2));

        //-------------------------LISTA COMPLETA DE TODAS LAS ZONESID------------------------------
        ZoneId.getAvailableZoneIds().forEach(System.out::println);
    }
}
