package org.aguzman.datetime.ejemplos;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.Month;
import java.time.format.TextStyle;
import java.time.temporal.ChronoUnit;
import java.util.Locale;

public class A_EjemploLocalDate {
    /*
    se mantiene inmutable la fecha original
    evita problemas usando concurrencia
     */
    public static void main(String[] args) {

        //-------------------FORMAS DE CREAR UNA FECHA -------------------------------------

        LocalDate fechaActual = LocalDate.now();
        System.out.println("fechaActual = " + fechaActual);
        
        fechaActual = LocalDate.of(2020, 12, 25);
        System.out.println("fechaActual = " + fechaActual);
        
        fechaActual = LocalDate.of(2020, Month.NOVEMBER, 11);
        System.out.println("fechaActual = " + fechaActual);
        
        fechaActual = LocalDate.parse("2020-02-01");
        System.out.println("fechaActual = " + fechaActual);

        //------------------------------------------------------------------------------

        //SUMAR 1 DÍA (mirar .plus)
        LocalDate diaDeManiana = LocalDate.now().plusDays(1);
        System.out.println("diaDeManiana = " + diaDeManiana);
        //RESTAR 1 MES (mirar .minus)
        LocalDate mesAnterioMismoDia = LocalDate.now().minus(1, ChronoUnit.MONTHS);
        System.out.println("mesAnterioMismoDia = " + mesAnterioMismoDia);
        //OBTENER DÍAS DE LA SEMANA
        DayOfWeek miercoles = LocalDate.parse("2020-11-11").getDayOfWeek();
        System.out.println("miercoles = " + miercoles);
        //OBTENER DIA DEL MES
        int once = LocalDate.of(2020, 11, 11).getDayOfMonth();
        System.out.println(once);
        //OBTENER TRUE SI ES BISIESTO
        boolean esBisiesto = LocalDate.now().isLeapYear();
        System.out.println("esBisiesto = " + esBisiesto);
        //OBTENER TRUE SI ES UNA FECHA ANTERIOR
        boolean esAntes = LocalDate.of(2020, 11, 11).isBefore(LocalDate.parse("2020-11-10"));
        System.out.println("esAntes = " + esAntes);
        //OBTENER TRUE SI ES UNA FECHA POSTERIOR
        boolean esDespues = LocalDate.parse("2020-11-11").isAfter(LocalDate.parse("2020-11-10"));
        System.out.println("esDespues = " + esDespues);
        
        esDespues = LocalDate.now().isAfter(LocalDate.now().minusDays(1));
        System.out.println("esDespues = " + esDespues);

        //-------------------------------Obtener parametros---------------------------------------------------

        fechaActual = LocalDate.now();
        System.out.println("fechaActual = " + fechaActual);
        System.out.println("Día: " + fechaActual.getDayOfMonth());
        System.out.println("Mes: " + fechaActual.getMonth());
        System.out.println("Año: " + fechaActual.getYear());
        System.out.println("Día del año: " + fechaActual.getDayOfYear());
        System.out.println("Era: " + fechaActual.getEra());
        System.out.println("Día de la semana: " + fechaActual.getDayOfWeek());

        Month mes = fechaActual.getMonth();
        System.out.println("Mes: " + mes);
        System.out.println("Número del mes: " + mes.getValue());
        System.out.println("Mes español: " + mes.getDisplayName(TextStyle.FULL, new Locale("es", "ES")));//TextStyle para pasarle el estilo (completo)

        DayOfWeek diaSemana = fechaActual.getDayOfWeek();
        System.out.println("Numero del día: " + diaSemana.getValue());
        System.out.println("Nombre del día: " + diaSemana.getDisplayName(TextStyle.FULL, new Locale("es", "ES")));

    }
}
