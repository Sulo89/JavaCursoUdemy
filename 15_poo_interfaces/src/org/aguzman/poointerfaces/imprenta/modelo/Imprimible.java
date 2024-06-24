package org.aguzman.poointerfaces.imprenta.modelo;

public interface Imprimible {
    /*
    el public se puede omitir
    pueden tener métodos por default y static
    solo atributos constantes
    el final y el static en los atrbutos constantes se puede omitir también
     */

    String TEXTO_DEFECTO = "Imprimiendo un valor por defecto";

    default String imprimir(){//no estarían obligadas a implementarse (deja el diseño más débil(es para el ejemplo))
        return TEXTO_DEFECTO;
    }

    static void imprimir(Imprimible imprimible){//de la interface
        System.out.println(imprimible.imprimir());
    }
}
