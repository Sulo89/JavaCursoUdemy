package org.aguzman.patrones.c_decorator.decorador;

import org.aguzman.patrones.c_decorator.Formateable;

public class SubrayadoDecorador extends TextoDecorador{
    /*
    decorador hijo debe implementar el método de la interfaz que implementa la clase abstracta(padre)
    agregamos la caracteristica anterior y le damos una nueva funcionalizad
     */
    public SubrayadoDecorador(Formateable texto) {
        super(texto);
    }

    @Override
    public String darFormato() {
        int largo = texto.darFormato().length();
        StringBuilder sb = new StringBuilder(texto.darFormato());
        sb.append("\n");
        for(int i = 0; i < largo;i++){
            sb.append("_");
        }
        return sb.toString();
    }
}
