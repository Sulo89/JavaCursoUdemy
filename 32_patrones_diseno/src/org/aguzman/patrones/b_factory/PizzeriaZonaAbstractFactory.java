package org.aguzman.patrones.b_factory;

abstract public class PizzeriaZonaAbstractFactory {
    /*
        CLASE ABSTRACTA (FABRICA)
     */
    public PizzaProducto ordenarPizza(String tipo){//crea la pizza
        PizzaProducto pizza = crearPizza(tipo);
        System.out.println("------Fabricando la pizza " + pizza.getNombre() + "------" );
        pizza.preparar();
        pizza.cocinar();
        pizza.cortar();
        pizza.empaquetar();
        return pizza;
    }

    abstract PizzaProducto crearPizza(String tipo);//default solo se puede crear en la factoria
}
