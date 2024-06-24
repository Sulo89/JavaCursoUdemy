package org.aguzman.optional.ejemplo;

import org.aguzman.optional.ejemplo.models.Computador;
import org.aguzman.optional.ejemplo.repositorio.ComputadorRepositorio;
import org.aguzman.optional.ejemplo.repositorio.Repositorio;

public class C_EjemploRepositorioMetodosOrElse {
    public static void main(String[] args) {

        /*
        dos método que hace lo mismo pero
        orElseGet está más optimizado
        orElse ->exista o no crea el objeto del else(si existe queda en el limbo)
         */

        Repositorio<Computador> repositorio = new ComputadorRepositorio();

        // Computador defecto = new Computador("HP Omen", "LA0001");

        //NO OPTIMIZADO
        Computador pc = repositorio.filtrar("rog").orElse(valorDefecto());
        System.out.println(pc);

        //OPTIMIZADO  parametro (lamnda Supplier)
        pc = repositorio.filtrar("macbook pro").orElseGet(C_EjemploRepositorioMetodosOrElse::valorDefecto);
        System.out.println(pc);

    }

    public static Computador valorDefecto(){
        System.out.println("Obteniendo valor por defecto!!!");
        return new Computador("HP Omen", "LA0001");
    }
}
