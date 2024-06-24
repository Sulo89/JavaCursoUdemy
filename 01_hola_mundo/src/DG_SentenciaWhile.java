public class DG_SentenciaWhile {
    public static void main(String[] args) {
        //ejecutar un bloque mientras se cumpla una condición
        //EVITAR LOOPS INFINITOS -> necesitamos un contador o algo que cambie la condición en algún momento.
        int i = 0;
        while(i <= 5){
            System.out.println("i = " + i);
            i++;
        }

        i = 0;
        boolean prueba = true;

        while(prueba){

            if(i == 7){
                prueba = false;
            }
            System.out.println("i = " + i);
            i++;
        }

        prueba = false;
        do {
            System.out.println("se ejecuta al menos una vez");
        } while (prueba);// se ejecuta al menos una sola vez, con while no se ejecutaría nunca

        prueba = true;
        i=0;

        do {
            if(i == 10){
                prueba = false;
            }
            System.out.println("i = " + i);
            i++;
        } while (prueba);
    }
}
