import java.util.Scanner;

public class O_EjemplosArreglosEliminarElemento {
    public static void main(String[] args) {


        /*
         * eliminamos un elemento
         */

        int[] a = new int[10];

        Scanner s = new Scanner(System.in);

        for(int i = 0; i < a.length; i++){
            System.out.print("Ingrese un número: ");
            a[i] = s.nextInt();
        }
        System.out.println();
        System.out.println("Ingrese una posición a eliminar entre 0 - 9:");
        int posicion = s.nextInt();

        //desplazamos hacia abajo la 9 pasa a la 8, 8 a la 7
        for(int i = posicion; i < a.length - 1; i++){
            a[i] = a[i+1];
        }
        //deberiamos elimina la posición 9. Copiamos en otro array "temporal" con una posición menos.
        int[] b = new int[a.length-1];//array temporal
        System.arraycopy(a, 0, b, 0, b.length);//arrayOrigen,indiceOrigen,arrayDestino,indiceDestino,tamañoDestino

        a = b;//asignamos en a el b(la copia)
        for(int i = 0; i<a.length;i++){
            System.out.println(i + " => " + a[i]);
        }
    }
}
