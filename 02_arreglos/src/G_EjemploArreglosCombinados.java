public class G_EjemploArreglosCombinados {

    public static void main(String[] args) {

        //llenar el c con a y b por eso es del doble tamanyo
        int[] a, b, c;
        a = new int[12];
        b = new int[12];
        c = new int[24];
        //almacenamos en a los número del 1 al 12
        for (int i = 0; i < a.length; i++) {
            a[i] = i + 1;
        }
        //almacenamos en b los números del 5 al 60
        for (int i = 0; i < b.length; i++) {
            b[i] = (i + 1) * 5;
        }
        //los combinamos en el nuevo array
        //por cada iteracón almacenamos 3 elementos de cada en cada iteración (debe ser un número múltiple del array final)
        int aux = 0;
        for (int i = 0; i < b.length; i+=3) {
            for(int j = 0; j < 3; j++) {
                c[aux++] = a[i+j];
            }
            for(int j = 0; j < 3; j++) {
                c[aux++] = b[i+j];
            }
        }
        //imprimimos
        for (int i = 0; i < c.length; i++) {
            System.out.println(i + ": " + c[i]);
        }
    }
}
