package org.aguzman.patrones.d_decorator2.decorador;

import org.aguzman.patrones.d_decorator2.Configurable;

abstract public class CafeDecorador implements Configurable {

       /*
        decorador abstracto padre (clase abstracta) al ser abstracta no está obligado a implementar
        el método de la interfaz -> pero si sus hijos
     */

    //debe tener un atributo de la interfaz
    protected Configurable cafe;

    public CafeDecorador(Configurable cafe) {
        this.cafe = cafe;
    }
}
