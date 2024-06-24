package org.aguzman.patrones.b_factory;

import org.aguzman.patrones.b_factory.producto.PizzaCaliforniaPepperoni;
import org.aguzman.patrones.b_factory.producto.PizzaCaliforniaQueso;
import org.aguzman.patrones.b_factory.producto.PizzaCaliforniaVegetariana;

public class PizzeriaCaliforniaFactory extends PizzeriaZonaAbstractFactory{
    /*
   la idea del patrón es que ya estén empaquetados dentro de la factoria
    */
    @Override
    PizzaProducto crearPizza(String tipo) {
        PizzaProducto producto = null;
        switch (tipo){
            case "queso":
                producto = new PizzaCaliforniaQueso();
                break;
            case "pepperoni":
                producto = new PizzaCaliforniaPepperoni();
                break;
            case "vegetariana":
                producto = new PizzaCaliforniaVegetariana();
                break;
        }
        return producto;
    }
}
