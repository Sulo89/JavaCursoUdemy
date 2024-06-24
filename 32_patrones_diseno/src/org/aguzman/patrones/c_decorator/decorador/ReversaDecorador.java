package org.aguzman.patrones.c_decorator.decorador;

import org.aguzman.patrones.c_decorator.Formateable;

public class ReversaDecorador extends TextoDecorador{
    /*
    decorador hijo debe implementar el método de la interfaz que implementa la clase abstracta(padre)
    agregamos la caracteristica anterior y le damos una nueva funcionalizad
     */
    public ReversaDecorador(Formateable texto) {
        super(texto);
    }

    @Override
    public String darFormato() {
        StringBuilder sb = new StringBuilder(texto.darFormato());
        return sb.reverse().toString();
    }
}
