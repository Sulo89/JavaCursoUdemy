package org.aguzman.patrones.f_observer.ejemplos;

import org.aguzman.patrones.f_observer.Corporacion;

public class EjemploObserver {
    public static void main(String[] args) {
        Corporacion google = new Corporacion("Google", 1000);
        google.addObserver( (observable, obj) -> {
            System.out.println("John: " + observable );
        });

        google.addObserver((observable, obj) -> {
            System.out.println("Andrés: " + observable );
        });

        google.addObserver((observable, obj) -> {
            System.out.println("Maria: " + observable );
        });
        google.modificaPrecio(2000);//si actualizamos el precio notifica a todos los observadores
    }
}
