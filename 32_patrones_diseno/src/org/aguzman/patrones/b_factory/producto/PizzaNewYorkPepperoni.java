package org.aguzman.patrones.b_factory.producto;

import org.aguzman.patrones.b_factory.PizzaProducto;

public class PizzaNewYorkPepperoni extends PizzaProducto {
    public PizzaNewYorkPepperoni() {//la idea del patrón es que ya estén empaquetados dentro de la factoria
        super();
        nombre = "Pizza Pepperoni New York";
        masa = "Masa delgada a la piedra";
        salsa = "Salsa de tomate";
        ingredientes.add("Queso mozzarella");
        ingredientes.add("Extra pepperoni");
        ingredientes.add("Aceitunas");
    }

    @Override
    public void cocinar() {
        System.out.println("Cocinando por 40 min. a 90ºC");
    }

    @Override
    public void cortar() {
        System.out.println("Cortando la pizza en triángulos");
    }
}
