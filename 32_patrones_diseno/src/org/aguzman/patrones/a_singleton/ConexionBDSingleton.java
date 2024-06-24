package org.aguzman.patrones.a_singleton;

public class ConexionBDSingleton {

    /*
        el patrón singleton
        constructor debe ser privado
        atributo estatico privado que contendrña la única referencia de la clase
        método público que devuelva la instancia (nueva la primera vez, y las posteriores la misma).

     */

    private static ConexionBDSingleton instancia;
    private ConexionBDSingleton(){
        System.out.println("Conectandose algún motor de base de datos");
    }

    public static ConexionBDSingleton getInstancia(){
        //solo se crea nueva la primera vez
        if(instancia == null){
            instancia = new ConexionBDSingleton();
        }
        return instancia;
    }

}
