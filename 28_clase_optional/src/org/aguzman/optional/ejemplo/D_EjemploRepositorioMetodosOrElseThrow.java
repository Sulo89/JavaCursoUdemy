package org.aguzman.optional.ejemplo;

import org.aguzman.optional.ejemplo.models.Computador;
import org.aguzman.optional.ejemplo.repositorio.ComputadorRepositorio;
import org.aguzman.optional.ejemplo.repositorio.Repositorio;

import java.util.Optional;

public class D_EjemploRepositorioMetodosOrElseThrow {
    /*
      orElseThrow() sin parametros hace lo mismo que el get y es mucho más descriptivo
      devuelven la misma excepción si no encuentra el objeto (puede que get() quede deprecated)

      se le puede pasar un lamnda suplier para lanzar otra excepción y personalizarla

       */
    public static void main(String[] args) {

        Repositorio<Computador> repositorio = new ComputadorRepositorio();
        Computador pc = repositorio.filtrar("rog").orElseThrow(IllegalStateException::new);
        System.out.println(pc);

        //Optional soporta filter y map para modificar el valor que contiene.

        String archivo = "documento.pdf";
        String extension = Optional.ofNullable(archivo)
                .filter(a -> a.contains("."))
                .map(a -> a.substring(archivo.lastIndexOf(".") + 1))
                .orElseThrow();
        System.out.println(extension);


    }
}
