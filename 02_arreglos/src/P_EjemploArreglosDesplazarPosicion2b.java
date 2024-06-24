import java.util.Scanner;

public class P_EjemploArreglosDesplazarPosicion2b {
    public static void main(String[] args) {

          /*
        en este caso no dejamos un hueco en el array
        para añadir el nuevo número
        creamos otro de una posición más.
        */

        int[] a = new int[10];
        int elemento, posicion;
        int ultimo;
        Scanner s = new Scanner(System.in);

        for(int i = 0; i < a.length; i++){
            System.out.print("Ingrese el número:");
            a[i] = s.nextInt();
        }
        System.out.println();

        System.out.println("Nuevo elemento:");
        elemento = s.nextInt();

        System.out.println("Posición donde agregar (de 0 a 9)");
        posicion = s.nextInt();

        ultimo = a[a.length -1];//nuevo:respaldamos lo almacenado en la última posición
        //movemos desde la posición hasta el último para dejar el hueco en la posición indicada al elemento indicado.
        for(int i = a.length - 2; i >= posicion; i--){
            a[i+1] = a[i];
        }
        //-------------------nuevo-----------------------------------------------
        int[] b = new int[a.length+1];//crear un nuevo arreglo con una posición mas
        System.arraycopy(a, 0, b, 0, a.length);//copiamos en el nuevo
        a = b;//pasamos la referencia de b en a
        a[posicion] = elemento;//metemos el elemento en la posición

        a[a.length -1] = ultimo;//metemos el último elemento,

        System.out.println("El arreglo:");
        for(int i = 0; i < a.length; i++){
            System.out.println(a[i]);
        }

    }
}
