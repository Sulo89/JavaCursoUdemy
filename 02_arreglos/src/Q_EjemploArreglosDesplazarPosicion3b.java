import java.util.Scanner;

public class Q_EjemploArreglosDesplazarPosicion3b {
    public static void main(String[] args) {


        /*
        en este caso no dejamos un hueco en el array
        para añadir el nuevo número
        creamos otro de una posición más.
        */

        int[] a = new int[7];
        int numero, posicion;
        int ultimo;//nuevo

        Scanner s = new Scanner(System.in);

        for(int i = 0; i < a.length; i++){
            System.out.print("Ingrese un número: ");
            a[i] = s.nextInt();
        }
        System.out.println();

        System.out.println("Ingrese un número a insertar:");
        numero = s.nextInt();

        ultimo = a[a.length - 1];//nuevo:respaldamos lo almacenado en la última posición
        posicion = 0;
        while(posicion < 6 && numero > a[posicion]){
            posicion++;
        }

        for(int i = a.length - 2; i >= posicion; i--){
            a[i+1] = a[i];
        }
        //-------------------nuevo-----------------------------------------------
        int[] b = new int[a.length + 1];//crear un nuevo arreglo con una posición mas
        System.arraycopy(a, 0, b, 0, a.length);//copiamos en el nuevo

        if(numero > ultimo){//si el número que queremos ingresar es mayor que último
            b[b.length - 1] = numero;//ponemos en la última el número
        } else {
            b[b.length - 1] = ultimo;//ponemos en la última ultimo.
            b[posicion] = numero;//numero en la posicón indicada
        }
        System.out.println("El nuevo arreglo ordenado:");
        for(int i = 0; i < b.length; i++){
            System.out.println(i + " => " + b[i]);
        }


    }
}
