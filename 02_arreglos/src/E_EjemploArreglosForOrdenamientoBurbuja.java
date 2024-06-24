public class E_EjemploArreglosForOrdenamientoBurbuja {
     /*
    Lo que hacemos con Arrays.sort();
    hay varias clases que ya llevan implementada la interfaz Comparable (String, Integer, Date)

    >0 mayor
    <0 mas baja
    = el mismo caracter
    */

    public static void arregloInverso(String[] arreglo){
        int total2 = arreglo.length;
        int total = arreglo.length;
        for(int i = 0; i < total2; i++){
            String actual = arreglo[i];
            String inverso = arreglo[total-1-i];
            arreglo[i] = inverso;
            arreglo[total-1-i] = actual;
            total2--;
        }
    }

    /*
  No necesitamos comparar todos con todos. Va restando las iteraciones ya comparadas.
  cambiamos el segundo for para ->como sumamos a j +1 debemos restar -1 al total
                                ->le restamos también la i, porque las primeras posiciones ya se ordenan con el primer for
                                ->(Comparable)->no es necesario el cast
                                ->pasamos array de Object
  */
    public static void sortBurbuja(Object[] arreglo){

        int total = arreglo.length;
        int contador = 0;

        for(int i = 0; i < total - 1; i++){
            for(int j = 0; j < total -1 -i; j++){
                if( ((Comparable) arreglo[j+1]).compareTo(arreglo[j]) > 0 ){//si queremos cambiamos el signo para ordenar a la inversa
                    Object auxiliar = arreglo[j];
                    arreglo[j] = arreglo[j+1];
                    arreglo[j+1] = auxiliar;
                }
                contador++;
            }
        }

        System.out.println("contador = " + contador);
    }

    public static void main(String[] args) {

        String[] productos = { "Kingston Pendrive 64GB", "Samsung Galaxy",
                "Disco Duro SSD Samsung Externo",
                "Asus Notebook", "Macbook Air",
                "Chromecast 4ta generación", "Bicicleta Oxford" };

        int total = productos.length;

        sortBurbuja(productos);

        System.out.println("=== Usando for ===");
        for(int i = 0; i < total; i++){
            System.out.println("para indice " + i + " : " + productos[i]);
        }

        Integer[] numeros = new Integer[4];

        numeros[0] = 10;
        numeros[1] = Integer.valueOf("7");
        numeros[2] = 35;
        numeros[3] = -1;

        sortBurbuja(numeros);

        for(int i = 0; i < numeros.length; i++){
            System.out.println("i = " + i + " : " + numeros[i]);
        }
    }
}