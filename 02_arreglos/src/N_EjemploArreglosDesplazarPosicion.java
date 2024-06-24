import java.util.Scanner;

public class N_EjemploArreglosDesplazarPosicion {
    public static void main(String[] args) {
         /*
        queremos desplazar una posición el array
        de tal forma que la primera posición sea el 10
        y la última el 1

        */

        int[] a = new int[10];
        int ultimo;
        Scanner s = new Scanner(System.in);

        for(int i = 0; i < a.length; i++){
            System.out.print("Ingrese el número:");
            a[i] = s.nextInt();
        }
        System.out.println();
        ultimo = a[a.length-1];//respaldamos el último para agregarlo a la primera posición
        int totalMenosUltimo = a.length -2;//posición 8 número 9
        for(int i = totalMenosUltimo; i >= 0; i--){
            a[i+1] = a[i];//a la posición 9 (última) añadimos el número 9 (antes había 10)
        }
        a[0] = ultimo;//el 10 a la primera

        System.out.println("El arreglo:");
        for(int i = 0; i < a.length; i++){
            System.out.println(a[i]);
        }

    }
}
