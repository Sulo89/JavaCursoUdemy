public class G_EjemploMatricesTranspuesta {
    public static void main(String[] args) {
    /*
-       Queremos da la vuelta a las columnas y filas de la matriz de forma que quede así:

        int[][] matriz = {
                {1,5,9,13},
                {2,6,10,14},
                {3,7,11,15},
                {4,8,12,16}
        };
        */


        int[][] matriz = {
                {1,2,3,4},
                {5,6,7,8},
                {9,10,11,12},
                {13,14,15,16}
        };

        System.out.println("Matriz original");
        for(int i = 0; i < matriz.length; i++){
            for(int j = 0; j < matriz[i].length; j++){
                System.out.print(matriz[i][j] + "\t");
            }
            System.out.println();
        }
        int aux;
        for(int i = 1; i < matriz.length; i++){
            for(int j = 0; j < i; j++){
                aux = matriz[i][j];
                matriz[i][j] = matriz[j][i];
                matriz[j][i]= aux;
            }
        }

        System.out.println("Matriz transpuesta");
        for(int i = 0; i < matriz.length; i++){
            for(int j = 0; j < matriz[i].length; j++){
                System.out.print(matriz[i][j] + "\t");
            }
            System.out.println();
        }
    }
}
