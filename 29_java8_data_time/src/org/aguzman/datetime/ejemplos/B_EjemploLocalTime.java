package org.aguzman.datetime.ejemplos;

import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;

public class B_EjemploLocalTime {
    /*
   se mantiene inmutable la fecha original
   evita problemas usando concurrencia
    */
    public static void main(String[] args) {

        //-------------------FORMAS DE CREAR LA HORA -------------------------------------

        LocalTime ahora = LocalTime.now();
        System.out.println(ahora);

        LocalTime seisConTreinta = LocalTime.of(6, 30, 59);
        System.out.println(seisConTreinta);

        seisConTreinta = LocalTime.parse("18:30:45");
        System.out.println("seisConTreinta = " + seisConTreinta);

        //-----------------OBTENER HORAS, MINUTOS Y SEGUNDOS----------------------------
        System.out.println("Hora: " + ahora.getHour());
        System.out.println("Minutos: " + ahora.getMinute());
        System.out.println("Seg.: " + ahora.getSecond());

        //SUMAR (mirar plus y minus)
        LocalTime sieteConTreinta = LocalTime.of(6, 30).plus(1, ChronoUnit.HOURS);
        System.out.println("sieteConTreinta = " + sieteConTreinta);
        //TRUE SI ES ANTERIOR (mirar isAfter)
        boolean esAnterior = LocalTime.of(6, 30, 59).isBefore(LocalTime.parse("07:30"));
        System.out.println("esAnterior = " + esAnterior);

        //FORMATEAMOS UNA HORA CON NUESTRO PATRON
        DateTimeFormatter df = DateTimeFormatter.ofPattern("hh:mm:ss a");//HH ->24H a->am/pm
        String ahoraFormateado = seisConTreinta.format(df);
        System.out.println(ahoraFormateado);
        
        ahoraFormateado = df.format(ahora);
        System.out.println("ahoraFormateado = " + ahoraFormateado);

        //HORA MÁXIMA Y MÍNIMA DE UN DÍA
        LocalTime max = LocalTime.MAX;
        LocalTime min = LocalTime.MIN;
        System.out.println("max = " + max);
        System.out.println("min = " + min);

    }
}
