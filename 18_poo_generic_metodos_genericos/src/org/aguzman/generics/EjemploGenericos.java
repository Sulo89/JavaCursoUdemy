package org.aguzman.generics;

import org.aguzman.poointerfaces.modelo.Cliente;
import org.aguzman.poointerfaces.modelo.ClientePremium;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class EjemploGenericos {
    public static void main(String[] args) {

         /*

        Sin Genericos

        List cliente = new ArrayList();
        clientes.add(new Cliente("Andres", "Guzmán"));
        Cliente andres = (Cliente)clientes.iterator.next();//habría que andar haciendo cast
        String andres1 = (String)clientes.iterator.next(); //permitiría esto
        */

        List<Cliente> clientes = new ArrayList<>();
        clientes.add(new Cliente("Andres", "Guzmán"));

        //obtener el primer elemeto
        Cliente andres = clientes.iterator().next();
        //-------------------------------------------------------------------
        //probamos que el método vale para Clientes e Integer
        Cliente[] clientesArreglo = {new Cliente("Luci", "Martínez"),
                new Cliente("Andres", "Guzmán")};
        Integer[] enterosArreglo = {1,2,3};

        List<Cliente> clientesLista = fromArrayToList(clientesArreglo);
        List<Integer> enterosLista = fromArrayToList(enterosArreglo);

        clientesLista.forEach(System.out::println);
        enterosLista.forEach(System.out::println);

        //---------------------------------------------------------------------

        List<String> nombres = fromArrayToList(new String[]{"Andrés", "Pepe",
                "Luci", "Bea", "John"}, enterosArreglo);
        nombres.forEach(System.out::println);

        List<ClientePremium> clientesPremiumList = fromArrayToList(
                new ClientePremium[]{new ClientePremium("Paco", "Fernández")});

        imprimirClientes(clientes);
        imprimirClientes(clientesLista);
        imprimirClientes(clientesPremiumList);

        System.out.println("Máximo de 1, 9 y 4 es: " + maximo(1, 9, 4));
        System.out.println("Máximo de 3.9, 11.6, 7.78 es: " + maximo(3.9, 11.6, 7.78));
        System.out.println("Máximo de zanahoria, arándanos, manzana es: "
                + maximo("zanahoria", "arándano", "manzana"));

    }
    /*
    Solo nos permite convertir un arreglo de clientes a lista

     public static List<Cliente> fromArrayToList(Cliente[] c){
        return Arrays.asList(c);
    }

    Lo haremos más génerico y que sirva para cualquier tipo de dato

    una sola letra en mayusculas ->se usa tipicamente T para listas

    se definente antes del retorno <T> especificamos que vamos a usar un génerico

    */

    public static <T> List<T> fromArrayToList(T[] c){
        return Arrays.asList(c);
    }
    //solo tipos de Number
    public static <T extends Number> List<T> fromArrayToList(T[] c){
        return Arrays.asList(c);
    }
    //Clientes Y ademas que implemente Comparable
    public static <T extends Cliente & Comparable<T>> List<T> fromArrayToList(T[] c){
        return Arrays.asList(c);
    }
    /*
    recibe dos arrays c y x de tipo génerico
    uno lo recorro y el otro los devuelvo como lista

    */
    public static <T, G> List<T> fromArrayToList(T[] c, G[] x){
        for(G elemento: x){
            System.out.println(elemento);
        }
        return Arrays.asList(c);
    }
    /*
    EXPLICACIÓN :
    ESTOS DOS MÉTODOS SON SIMILARES (NO SE PODRÍA SOBRECARGAR):
    con génericos tenemos la ventaja de poder ALMACENAR DIRECTAMENTE EN AL LISTA LA CLASE HIJA


    public static List<Cliente>fromArrayToList(Cliente[]c){
         return Arrays.asList(c);
    }

    public static <T extends Cliente> List<T> fromArrayToList(T[]c){
         return Arrays.asList(c);
    }

    */
   /*



   public static void imprimirClientes(List<Cliente> clientes){
        clientes.forEach(System.out::println);
    }

    no podemos pasarle una lista de una clase hija (List<ClientePremium>) no es subClase de una lista de una clase padre
    la solución es usar un comodín


    */
    public static void imprimirClientes(List<? extends Cliente> clientes){
        clientes.forEach(System.out::println);
    }

    //el mayor de 3 objetos del mismo tipo que implementen Comparable
    public static <T extends Comparable<T>> T maximo(T a, T b, T c){
        T max = a;
        if(b.compareTo(max) > 0){
            max = b;
        }
        if(c.compareTo(max) > 0){
            max = c;
        }
        return max;
    }
}
