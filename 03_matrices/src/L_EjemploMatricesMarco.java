public class L_EjemploMatricesMarco {
    public static void main(String[] args) {

        int[][] matriz = new int[5][5];

        for(int i = 0; i < matriz.length;i++){
            for(int j = 0; j < matriz[i].length; j++){
                if(i == 0 || i == matriz.length - 1//bordes superior e inferior
                || j == 0 || j == matriz[i].length -1 || i == j){//laterales
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
