public class I_EjemploMatricesSumar {
    public static void main(String[] args) {

        //deben ser las dos del mismo tamaño
        int[][] a = {
                {1,2,3},
                {4,5,6},
                {7,8,9}
        };
        int[][] b = {
                {10,20,30},
                {40,50,60},
                {70,80,90}
        };
        int[][] suma = new int[3][3];

        //sumamos
        for(int i = 0; i < a.length; i++){
            for(int j = 0; j < a[i].length; j++){
                suma[i][j] = a[i][j] + b[i][j];
            }
        }
        //mostramos
        for(int i = 0; i < suma.length; i++){
            for(int j = 0; j < suma[i].length; j++){
                System.out.print(suma[i][j] + "\t");
            }
            System.out.println();
        }
    }
}
