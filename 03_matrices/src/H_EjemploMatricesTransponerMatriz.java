public class H_EjemploMatricesTransponerMatriz {
    public static void main(String[] args) {

        int[][] a, b;
        a = new int[8][4];
        b = new int[4][8];//debe tener el número de filas y columnas cambiadas

        //llenamos la matriz a
        for(int i = 0; i < a.length; i++){
            for(int j = 0; j < a[i].length; j++){
                a[i][j] = i+j*3;
                System.out.print(a[i][j] + "\t");
            }
            System.out.println();
        }

        //la almacenamos en b transpuesta
        for(int i = 0; i < a.length; i++){
            for(int j = 0; j < a[i].length; j++){
                b[j][i] = a[i][j];
            }
        }

        //recorremos b
        System.out.println("La matriz transpuesta b:");
        for(int i = 0; i < b.length; i++){
            for(int j = 0; j < b[i].length; j++){
                System.out.print(b[i][j] + "\t");
            }
            System.out.println();
        }
    }
}