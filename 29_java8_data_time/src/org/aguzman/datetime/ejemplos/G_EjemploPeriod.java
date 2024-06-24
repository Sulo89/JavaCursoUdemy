package org.aguzman.datetime.ejemplos;

import java.time.LocalDate;
import java.time.Period;

public class G_EjemploPeriod {
    /*
    no incluye el tiempo solo fechas.
    recordar que son inmutables
     */
    public static void main(String[] args) {
        LocalDate fecha1 = LocalDate.of(2011, 9, 23);
        LocalDate fecha2 = LocalDate.of(2020, 11, 25);
        LocalDate fecha3 = fecha2.withMonth(12);//cambiamos mes (al ser imutable fecha 2 no cambia)
        fecha3 = fecha3.withDayOfMonth(28);//cambiamos dia del mes (al cambiar la referencia si la modificamos)

        Period periodo = Period.between(fecha1, fecha3);

        System.out.println(periodo);
        System.out.printf("Periodo entre %s y %s hay %d años, %d meses y %d días",
                fecha1, fecha3, periodo.getYears(), periodo.getMonths(), periodo.getDays());
    }
}
