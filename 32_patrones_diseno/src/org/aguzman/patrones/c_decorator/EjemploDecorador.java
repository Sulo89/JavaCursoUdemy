package org.aguzman.patrones.c_decorator;

import org.aguzman.patrones.c_decorator.decorador.MayusculaDecorador;
import org.aguzman.patrones.c_decorator.decorador.RemplazarEspaciosDecorador;
import org.aguzman.patrones.c_decorator.decorador.ReversaDecorador;
import org.aguzman.patrones.c_decorator.decorador.SubrayadoDecorador;

public class EjemploDecorador {
    public static void main(String[] args) {

        //nos permite configurar y componer añadiendo según nos convenga

        Formateable texto = new Texto("Hola que tal Andrés!");

        MayusculaDecorador mayuscula = new MayusculaDecorador(texto);
        ReversaDecorador reversa = new ReversaDecorador(mayuscula);
        SubrayadoDecorador subrayar = new SubrayadoDecorador(reversa);
        RemplazarEspaciosDecorador remplazar = new RemplazarEspaciosDecorador(subrayar);

        System.out.println(remplazar.darFormato());
    }
}
