package org.aguzman.patrones.b_factory;

import org.aguzman.patrones.b_factory.producto.PizzaNewYorkItaliana;
import org.aguzman.patrones.b_factory.producto.PizzaNewYorkPepperoni;
import org.aguzman.patrones.b_factory.producto.PizzaNewYorkVegetariana;

public class PizzeriaNewYorkFactory extends PizzeriaZonaAbstractFactory {
    /*
    la idea del patrón es que ya estén empaquetados dentro de la factoria
     */
    @Override
    PizzaProducto crearPizza(String tipo) {
        return switch (tipo) {//switch mejorado (apartir java 13)
            case "vegetariana" -> new PizzaNewYorkVegetariana();
            case "pepperoni" -> new PizzaNewYorkPepperoni();
            case "italiana" -> new PizzaNewYorkItaliana();
            default -> null;
        };
    }
}
