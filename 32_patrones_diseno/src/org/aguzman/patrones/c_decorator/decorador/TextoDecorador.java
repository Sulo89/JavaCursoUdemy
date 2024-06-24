package org.aguzman.patrones.c_decorator.decorador;

import org.aguzman.patrones.c_decorator.Formateable;

abstract public class TextoDecorador implements Formateable {
    /*
        decorador abstracto padre (clase abstracta) al ser abstracta no está obligado a implementar
        el método de la interfaz -> pero si sus hijos
     */

    //debe tener un atributo de la interfaz
    protected Formateable texto;

    public TextoDecorador(Formateable texto) {
        this.texto = texto;
    }
}
