package org.aguzman.poointerfaces.repositorio;

import org.aguzman.poointerfaces.modelo.Cliente;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class ClienteListRepositorio implements CrudRepositorio,
        OrdenableRepositorio, PaginableRepositorio {//implementa las 3 interfaces

    private List<Cliente> dataSource;//contenedor de datos

    public ClienteListRepositorio() {
        this.dataSource = new ArrayList<>();//incializamos
    }
    //devolvemos la lista
    @Override
    public List<Cliente> listar() {
        return dataSource;
    }
    //buscamos por id (en bd -> select * from tabla where id)
    @Override
    public Cliente porId(Integer id) {
        Cliente resultado = null;
        for(Cliente cli: dataSource){
            if(cli.getId() != null && cli.getId().equals(id)){//comparamos con equals ->es Integer
                resultado = cli;
                break;
            }
        }
        return resultado;
    }
    //añadir a la lista ( en bd insert)
    @Override
    public void crear(Cliente cliente) {
        this.dataSource.add(cliente);
    }
    //editamos buscando por id(en bd update)
    @Override
    public void editar(Cliente cliente) {
        Cliente c = this.porId(cliente.getId());
        c.setNombre(cliente.getNombre());
        c.setApellido(cliente.getApellido());
    }
    //borramos buscando por id (en bd delete)
    @Override
    public void eliminar(Integer id) {//necesitamos que tenga implementado equals
        this.dataSource.remove(this.porId(id));
    }
    /*

    en este caso no podemos usar comparable dentro de Cliente porque solo podriamos por un campo
      @Override
    public List<Cliente> listar(String campo, Direccion dir) {
        dataSource.sort(new Comparator<Cliente>() {
            @Override
            public int compare(Cliente a, Cliente b){
                int resultado = 0;
                if(dir == Direccion.ASC){
                    switch (campo){
                         case "id" ->
                        resultado = a.getId().compareTo(b.getId());
                         case "nombre" ->
                         resultado = a.getNombre().compareTo(b.getNombre());
                        case "apellido" ->
                        resultado = a.getApellido().compareTo(b.getApellido());
                    }
                } else if(dir == Direccion.DESC){
                      case "id" ->
                        resultado = b.getId().compareTo(a.getId());
                         case "nombre" ->
                         resultado = b.getNombre().compareTo(a.getNombre());
                        case "apellido" ->
                        resultado = b.getApellido().compareTo(a.getApellido());
                }
                return resultado;
            }
        });
        return dataSource;
    }

    MEJORADA

    la interface Comparator es funcional  @FunctionaInterface (se puede utilizar como una expresion lambda) un solo método abstracto
    y separar en otro método el switch case

    */


    @Override
    public List<Cliente> listar(String campo, Direccion dir) {
        List<Cliente> listaOrdenada = new ArrayList<>(this.dataSource);
        listaOrdenada.sort((a, b) -> {//como tiene un solo método se asume que es el compare
            int resultado = 0;
            if(dir == Direccion.ASC){
                resultado = ordenar(campo, a, b);
            } else if(dir == Direccion.DESC){
                resultado = ordenar(campo, b, a);
            }
            return resultado;
        });
        return listaOrdenada;
    }

    @Override
    public List<Cliente> listar(int desde, int hasta) {
        return dataSource.subList(desde, hasta);//subConjunto de la lista
    }


    public static int ordenar(String campo, Cliente a, Cliente b){
        int resultado = 0;
        switch (campo){
            case "id" ->
                    resultado = a.getId().compareTo(b.getId());
            case "nombre" ->
                    resultado = a.getNombre().compareTo(b.getNombre());
            case "apellido" ->
                    resultado = a.getApellido().compareTo(b.getApellido());
        }
        return resultado;
    }
}
