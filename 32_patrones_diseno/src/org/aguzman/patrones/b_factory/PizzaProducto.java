package org.aguzman.patrones.b_factory;

import java.util.ArrayList;
import java.util.List;

abstract public class PizzaProducto {
    /*
    CLASE ABSTRACTA (PRODUCTO ABSTRACTO DE LA FABRICA)
     */

    protected String nombre;
    protected String masa;
    protected String salsa;
    protected List<String> ingredientes;

    public PizzaProducto() {
        this.ingredientes = new ArrayList<>();
    }

    public void preparar(){
        System.out.println("Preparando " + nombre);
        System.out.println("Seleccionando la masa " + masa);
        System.out.println("Agregando salsa " + salsa);
        System.out.println("Agregando ingredientes: ");
        this.ingredientes.forEach(System.out::println);
    }

    abstract public void cocinar();//abstract para que cada uno implemente su popia forma

    abstract public void cortar();//para que cada uno implemente su corte

    public void empaquetar(){
        System.out.println("Poniendo la piza en una caja de empaque...");
    }

    public String getNombre() {
        return nombre;
    }

    @Override
    public String toString() {
        return "PizaProducto{" +
                "nombre='" + nombre + '\'' +
                ", masa='" + masa + '\'' +
                ", salsa='" + salsa + '\'' +
                ", ingredientes=" + ingredientes +
                '}';
    }
}
