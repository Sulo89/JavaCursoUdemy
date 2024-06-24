package org.aguzman.genericsclass;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Camion<T> implements Iterable<T> {//implementamos iterable para usar for

    private List<T> objetos;//una lista de objetos de un tipo
    private int max;

    public Camion(int max) {
        this.max = max;
        this.objetos = new ArrayList<>();
    }

    public void add(T objeto){
        if(this.objetos.size() <= max) {//mientras no llegue al máximo
            this.objetos.add(objeto);
        } else {
            throw new RuntimeException("no hay más espacio.");
        }
    }

    @Override
    public Iterator<T> iterator() {
        return this.objetos.iterator();
    }
}
