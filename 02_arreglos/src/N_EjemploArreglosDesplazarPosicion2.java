import java.util.Scanner;

public class N_EjemploArreglosDesplazarPosicion2 {
    public static void main(String[] args) {

       /*
        agregar un elemento en una posición
        y los demás se desplazan
        dejando un hueco para este
        */

        int[] a = new int[10];
        int elemento, posicion;//elemento que vamos a introducir y la posición
        Scanner s = new Scanner(System.in);

        //ingresamos 9 elementos
        for(int i = 0; i < a.length-1; i++){
            System.out.print("Ingrese el número:");
            a[i] = s.nextInt();
        }
        System.out.println();
        //pedimos el elemento
        System.out.println("Nuevo elemento:");
        elemento = s.nextInt();
        //pedimos la posición hasta 9. El 10 es para abarcar el desplazamiento
        System.out.println("Posición donde agregar (de 0 a 9)");
        posicion = s.nextInt();

        for(int i = a.length -2; i >= posicion; i--){
            a[i+1] = a[i];//desplazamos las últimas posiciones una hacia la derecha
        }
        a[posicion] = elemento;//almacenamos en la posición indicada el elemento indicado.

        System.out.println("El arreglo:");
        for(int i = 0; i < a.length; i++){
            System.out.println(a[i]);
        }

    }
}
