package org.aguzman.patrones.b_factory.producto;

import org.aguzman.patrones.b_factory.PizzaProducto;

public class PizzaCaliforniaQueso extends PizzaProducto {
    public PizzaCaliforniaQueso() {//la idea del patrón es que ya estén empaquetados dentro de la factoria
        super();
        nombre = "Pizza California Queso";
        masa = "Masa a la piedra delgada";
        salsa = "Salsa de tomate rucula";
        ingredientes.add("Extra queso Mozzarella");
        ingredientes.add("Cebolla");
        ingredientes.add("Queso azul");
    }

    @Override
    public void cocinar() {
        System.out.println("Cocinando a 35 min. a 100ºC");
    }

    @Override
    public void cortar() {
        System.out.println("Cortando la piza en pequeños triángulos");
    }
}
