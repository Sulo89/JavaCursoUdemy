package org.aguzman.optional.ejemplo;

import org.aguzman.optional.ejemplo.models.Computador;
import org.aguzman.optional.ejemplo.models.Fabricante;
import org.aguzman.optional.ejemplo.models.Procesador;
import org.aguzman.optional.ejemplo.repositorio.ComputadorRepositorio;
import org.aguzman.optional.ejemplo.repositorio.Repositorio;


public class E_EjemploRepositorioMapFilter {
    /*
    de un computuador obtenemos el precesador luego el fabricante
    USAMOS MAP PARA OBJETOS CORRIENTES
    FlATMAP PARA OPTIONALS
     */
    public static void main(String[] args) {

        Repositorio<Computador> repositorio = new ComputadorRepositorio();

        String f = repositorio.filtrar("asus")
                .flatMap(Computador::getProcesador)//el get debe ser un Optional
                .flatMap(Procesador::getFabricante)//el get debe ser un Optional
                .filter(fab -> "intel".equalsIgnoreCase(fab.getNombre()))
                .map(Fabricante::getNombre)
                .orElse("Desconocido");

        System.out.println(f);



    }

}
