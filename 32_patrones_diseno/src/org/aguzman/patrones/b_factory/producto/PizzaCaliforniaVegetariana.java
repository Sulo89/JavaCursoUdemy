package org.aguzman.patrones.b_factory.producto;

import org.aguzman.patrones.b_factory.PizzaProducto;

public class PizzaCaliforniaVegetariana extends PizzaProducto {

    public PizzaCaliforniaVegetariana() {//la idea del patrón es que ya estén empaquetados dentro de la factoria
        super();
        nombre = "Pizza California Vegetariana";
        masa = "Masa delgada Light";
        salsa = "Salsa BBQ Light";
        ingredientes.add("Queso Mozzarella");
        ingredientes.add("Aceitunas");
        ingredientes.add("Espinacas");
        ingredientes.add("Cebolla");
        ingredientes.add("Berenjena");
    }

    @Override
    public void cocinar() {
        System.out.println("Cocinando por 20 min. a 180ºC");
    }

    @Override
    public void cortar() {
        System.out.println("Cortando la pizza en rebanadas rectangulares");
    }
}
