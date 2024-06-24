package org.aguzman.pooexcepciones.ejemplo;

import javax.swing.*;

public class EjemploExcepciones {
    public static void main(String[] args) {

        Calculadora cal = new Calculadora();
        String numerador = JOptionPane.showInputDialog("ingrese un entero numerador:");
        String denominador = JOptionPane.showInputDialog("ingrese un entero denominador:");

        try {
            double division2 = cal.dividir(numerador, denominador);//lo que puede dar error dentro del contexto del try
            System.out.println("division2 = " + division2);
            //catch(NumberFormatException nfe){} si usamos parseInt y quisieramos manejar la excepción aunque sea unchecked
        } catch(FormatoNumeroException e){
            System.out.println("Se detecto una excepción: ingrese un número válido: " + e.getMessage());
            e.printStackTrace(System.out);//no es necesario el System.out de forma explicita
        }
        catch(DivisionPorZeroException ae){//obligada a capturar
            System.out.println("Capturamos la excepcion en tiempo de ejecución: " + ae.getMessage());
            main(args);
        } finally {
            System.out.println("Es opcional, pero se ejecuta siempre con excepción o sin!");
        }
        System.out.println("Continuamos con el flujo de nuestra aplicación!");
    }
}
