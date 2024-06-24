package org.aguzman.api.stream.ejemplos;

import java.util.IntSummaryStatistics;
import java.util.stream.IntStream;

public class L_EjemploStreamRange {
    public static void main(String[] args) {
        /*
         * operador range no se encuentra en Stream -> necesitamos la especialización IntStream
         * para crear un flujo de enteros
         *
         */
        //no necesita generico (es Integer)//existe el LongStream y el DoubleStream
        IntStream num =  IntStream.range(5, 20).peek(System.out::println);//del 5 al 19
        //incluye el segundo parametro
        IntStream num2 =  IntStream.rangeClosed(5, 20).peek(System.out::println);//del 5 al 10

        
        // int resultado = num.reduce(0, Integer::sum);
        // int resultado = num.sum(); //igual que el reduce (solo en IntStream)
        IntSummaryStatistics stats = num.summaryStatistics();//obtenemos varios parametros(estadisticas) (solo en IntStream)
        System.out.println("max: " + stats.getMax());//maximo
        System.out.println("min: " + stats.getMin());//minimo
        System.out.println("sum: " + stats.getSum());//suma
        System.out.println("promedio: " + stats.getAverage());//promedio
        System.out.println("total: " + stats.getCount());//total



    }
}
