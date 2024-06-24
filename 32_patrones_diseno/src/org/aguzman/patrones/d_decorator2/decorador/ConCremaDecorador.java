package org.aguzman.patrones.d_decorator2.decorador;

import org.aguzman.patrones.d_decorator2.Configurable;

public class ConCremaDecorador extends CafeDecorador {
    /*
   decorador hijo debe implementar el método de la interfaz que implementa la clase abstracta(padre)
   agregamos la caracteristica anterior y le damos una nueva funcionalizad
    */
    public ConCremaDecorador(Configurable cafe) {
        super(cafe);
    }

    @Override
    public float getPrecioBase() {
        return cafe.getPrecioBase() + 2.5f;
    }

    @Override
    public String getIngredientes() {
        return cafe.getIngredientes() + ", Crema";
    }
}
