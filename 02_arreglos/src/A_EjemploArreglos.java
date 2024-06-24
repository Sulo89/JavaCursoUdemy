import java.util.Arrays;

public class A_EjemploArreglos {
    public static void main(String[] args) {

        /*

        En los array podemos guardar primitivos o la referencia a objetos.

        Cuando creamos un array antes de añadir valor a los elementos

        primitivos -> 0

        booleans -> false

        objetos(String,Personas) -> null.


        Si intentamos acceder a un elemento fuera de los límites del arreglo :
        ArrayIndexOutOfBoundExcepction
        */

        String[] productos = new String[7];
        productos[0] = "Kingston Pendrive 64GB";
        productos[1] = "Samsung Galaxy";
        productos[2] = "Disco Duro SSD Samsung Externo";
        productos[3] = "Asus Notebook";
        productos[4] = "Macbook Air";
        productos[5] = "Chromecast 4ta generación";
        productos[6] = "Bicicleta Oxford";

        Arrays.sort(productos);//ordena de forma alfabetica

        String prod1 = productos[0];
        String prod2 = productos[1];
        String prod3 = productos[2];
        String prod4 = productos[3];
        String prod5 = productos[4];
        String prod6 = productos[5];
        String prod7 = productos[6];

        System.out.println("productos[0] = " + prod1);
        System.out.println("productos[1] = " + prod2);
        System.out.println("productos[2] = " + prod3);
        System.out.println("productos[3] = " + prod4);
        System.out.println("productos[4] = " + prod5);
        System.out.println("productos[5] = " + prod6);
        System.out.println("productos[6] = " + prod7);

        int[] numeros = new int[4];

        numeros[0] = 10;
        numeros[1] = Integer.valueOf("7");
        numeros[2] = 35;
        numeros[3] = -1;
        // numeros[4] = 5;

        Arrays.sort(numeros);//ordena de menor a mayor

        int i = numeros[0];
        int j = numeros[1];
        int k = numeros[2];
        int l = numeros[numeros.length - 1];
        //int m = numeros[4];

        System.out.println("i = " + i);
        System.out.println("j = " + j);
        System.out.println("k = " + k);
        System.out.println("l = " + l);
    }
}
