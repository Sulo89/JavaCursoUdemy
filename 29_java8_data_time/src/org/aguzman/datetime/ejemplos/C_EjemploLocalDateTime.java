package org.aguzman.datetime.ejemplos;

import java.time.LocalDateTime;
import java.time.Month;
import java.time.format.DateTimeFormatter;

public class C_EjemploLocalDateTime {

    /*
        LocalDateTime junta LocalDate y LocalTime
        se mantiene inmutable la fecha original
        evita problemas usando concurrencia
     */
    public static void main(String[] args) {

        //-------------------FORMAS DE CREAR FECHA CON HORA -------------------------------------

        LocalDateTime fechaTiempo = LocalDateTime.now();
        System.out.println("fechaTiempo = " + fechaTiempo);

        fechaTiempo = LocalDateTime.of(2020, Month.DECEMBER, 24, 20, 45, 59);
        System.out.println("fechaTiempo = " + fechaTiempo);
        
        fechaTiempo = LocalDateTime.parse("2020-12-25T21:45:59.821339800");//T de tiempo y desupés la hora
        System.out.println("fechaTiempo = " + fechaTiempo);

        //SUMAR, RESTAR (anio,mes,dia,hora,minutos,segundos)
        LocalDateTime fechaTiempo2 = fechaTiempo.plusDays(1).plusHours(3);
        System.out.println("fechaTiempo2 = " + fechaTiempo2);
        System.out.println("fechaTiempo = " + fechaTiempo);
        System.out.println("fechaTiempo3 = " + fechaTiempo.minusHours(5));

        //TIENE TODOS LO MÉTODOS VISTOS HASTA AHORA
        Month mes = fechaTiempo.getMonth();
        System.out.println("mes = " + mes);
        
        int dia = fechaTiempo.getDayOfMonth();
        System.out.println("dia: " + dia);

        int anio = fechaTiempo.getYear();
        System.out.println("anio = " + anio);

        //FORMATOS
        String formato1 = fechaTiempo.format(DateTimeFormatter.ISO_LOCAL_DATE_TIME);//formatos establecidos por defecto
        System.out.println("formato1 = " + formato1);
        DateTimeFormatter df = DateTimeFormatter.ofPattern("yyyy/MM/dd hh:mm:ss a");//formato personalizado
        //apartir de la fecha pasamos el patron
        String formato2 = fechaTiempo.format(df);
        System.out.println("formato2 = " + formato2);
        //apartir del patron pasamos el objeto fecha
        String formato3 = df.format(fechaTiempo);
        System.out.println("formato3 = " + formato3);


    }
}
