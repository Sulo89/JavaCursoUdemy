package org.aguzman.patrones.b_factory.producto;

import org.aguzman.patrones.b_factory.PizzaProducto;

public class PizzaNewYorkVegetariana extends PizzaProducto {
    public PizzaNewYorkVegetariana() {//la idea del patrón es que ya estén empaquetados dentro de la factoria
        super();
        nombre = "Pizza vegetariana New York";
        masa = "Masa integral vegana";
        salsa = "Salsa de tomate";
        ingredientes.add("Queso vegano");
        ingredientes.add("Tomate");
        ingredientes.add("Aceitunas");
        ingredientes.add("Espinacas");
        ingredientes.add("Berenjenas");
    }

    @Override
    public void cocinar() {
        System.out.println("Cocinando por 25 min. a 150ºC");
    }

    @Override
    public void cortar() {
        System.out.println("Cortando la pizza en rebanadas cuadradas.");
    }
}
