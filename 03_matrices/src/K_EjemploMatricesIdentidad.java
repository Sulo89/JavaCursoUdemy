public class K_EjemploMatricesIdentidad {
    public static void main(String[] args) {

          /*

        poner la diagonal principal de la matriz con unos.

        es justo cuando coinciden i=j

        NOTA: la matriz es de tipo int el valor por defecto es 0

        */

        int[][] matriz = new int[5][5];

        for(int i = 0; i < matriz.length;i++){
            for(int j = 0; j < matriz[i].length; j++){
                if(i == j){
                    matriz[i][j] = 1;
                }
            }
        }

        for(int i = 0; i < matriz.length; i++){
            for(int j = 0; j < matriz[i].length; j++){
                System.out.print(matriz[i][j] + "\t");
            }
            System.out.println();
        }
    }
}
