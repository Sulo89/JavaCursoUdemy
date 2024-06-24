public class DI_SentenciasBucleEtiquetas {
    public static void main(String[] args) {

        //podemos etiquetar cualquier flujo de control y hacer referencia a él (desde un hijo) para hacer un break o un continue
        etiqueta:
        for (int i = 0; i < 5; i++) {

            System.out.println();//salto de línea para ver claro lo que hace.
            for (int j = 0; j < 5; j++) {
                if (i == 2) {
                    break etiqueta;//hace referencia al primer for

                }
                System.out.print("[i = " + i + ", j = " + j + "], ");
            }
        }

        System.out.println("\n=================================================");
        bucle1: for (int i = 0; i < 5; i++) {

            System.out.println();
            int j = 0;
            while ( j < 5) { //con while
                if (i == 2) {
                    continue bucle1;
                }
                System.out.print("[i = " + i + ", j = " + j + "], ");
                j++;
            }
        }

        System.out.println("\n=================================================");

        bucle:
        for (int i = 1; i <= 7; i++) {//7 días de la semana
            int j = 1;
            while ( j <= 8) {//8 horas laborales
                if (i == 6 || i == 7) {
                    System.out.println("Dia " + i + ": descanso de fin de semana!");
                    // FIN DE SEMANA SALTA LOS DOS DÍAS
                    continue bucle;//hace referencia al for
                }
                System.out.println("Día " + i + ", trabajando a las " + j + "hrs. ");
                j++;
            }
        }
    }
}
