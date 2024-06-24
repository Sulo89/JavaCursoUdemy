public class F_EjemploArreglosOrdenPrincipioFinal {
    public static void main(String[] args) {

       /*
        Queremos ordenar el array 1-10-2-9-3-8.
        */

        int[] numeros = new int[10];


        //Almacenamos los número del 1 al 10
        for (int i = 0; i < numeros.length; i++) {
            numeros[i] = i + 1;
        }
        //para que no se repita la secuencia debe llegar a la mitad
        //opción 1: dividir la longitud entre 2

        for (int i = 0; i < numeros.length / 2; i++) {

            System.out.print(numeros[i] + " ");
            System.out.println(numeros[numeros.length - 1 - i]);
        }


        //opción 2: restar i a cada iteración

        for (int i = 0; i < numeros.length -i ; i++) {

            System.out.print(numeros[i] + " ");
            System.out.println(numeros[numeros.length - 1 - i]);
        }

        //poblar un arreglo con los datos intercalados
        int[] a = new int[10];
        //necesitamos una variable auxiliar para poblar 10 elementos, i solo llega hasta 5
        //guardamos en cada iteracion dos números
        int aux = 0;
        for (int i = 0; i < numeros.length - i; i++) {
            a[aux++] = numeros[i];
            a[aux++] = numeros[numeros.length - 1 - i];
            //System.out.print(numeros[i] + " ");
            //System.out.println(numeros[numeros.length - 1 - i]);
        }


        //imprimimos el nuevo array
        for (int i = 0; i < a.length; i++) {
            System.out.println("i = " + i + " valor: " + a[i]);
        }


    }
}
