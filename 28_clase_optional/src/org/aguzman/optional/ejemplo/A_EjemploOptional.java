package org.aguzman.optional.ejemplo;

import java.util.Optional;

public class A_EjemploOptional {
    public static void main(String[] args) {
        
        String nombre = "Andrés";
        Optional<String> opt = Optional.of(nombre);//referencia de un objeto (no permite nulos)
        System.out.println("opt = " + opt);
        System.out.println(opt.isPresent());
        if(opt.isPresent()){
            System.out.println("Hola " + opt.get());//conveniente asegurarnos que está presente
        }
        //alternativa a isPresent()
        System.out.println(opt.isEmpty());

        //de forma funcional
        opt.ifPresent( valor -> System.out.println("Hola " + valor));

        nombre = null;
        //si dudamos si es null para que en ese caso devuelva Optional.empty
        //System.out.println(opt.isPresent());
        opt = Optional.ofNullable(nombre);//referencia de un objeto (permite nulos)
        System.out.println("opt = " + opt);//Optional.empty
        System.out.println(opt.isPresent());
        System.out.println(opt.isEmpty());

        //disponible desde java 9
        opt.ifPresentOrElse(valor -> System.out.println("Hola " + valor),
                () -> System.out.println("No está presente"));//2 parametro  camino alternativo si no está presente

        if(opt.isPresent()){
            System.out.println("Hola " + opt.get());
        } else {
            System.out.println("No está presente");
        }
        //creamos un opcional vacio ( no nulo si no Optional.empty)
        Optional<String> optEmpty = Optional.empty();
        System.out.println("optEmpty = " + optEmpty);
        System.out.println(optEmpty.isPresent());
    }
}
