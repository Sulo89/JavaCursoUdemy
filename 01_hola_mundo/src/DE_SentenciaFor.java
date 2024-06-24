public class DE_SentenciaFor {
    public static void main(String[] args) {

        int x = 0;//podriamos declarar la x fuera del for

        for(; x <= 5; x++) {
            System.out.println("i = " + x);//4
        }
        System.out.println("i = " + x);//5

        //otra sintáxis del for (hace lo mismo)
        int z = 0;

        for(; ; ) {

            if(z >=5){
                break;
            }

            System.out.println("i = " + z);//4

            z++;
        }


        for(int i = 0; i <= 10; i++) {
            System.out.println("i = " + i);
        }

        //decrementando
        for(int i = 10; i >= 0; i--){
            System.out.println("i = " + i);
        }
        //i incrementa y j decrementa
        for(int i = 1, j = 10; i < j; i++, j--){
            System.out.println(i + " - " + j);
        }

        for(int i = 0; i <= 10; i++) {
            if( !(i % 2 == 0) ){
                continue;// para saltar la iteración
            }
            System.out.println("i = " + i);
        }
    }
}
