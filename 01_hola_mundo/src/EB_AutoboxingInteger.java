public class EB_AutoboxingInteger {
    public static void main(String[] args) {

        /*
        el autoboxing se produce automáticamente siempre que un tipo primitivo se debe convertir en un objeto,
        y el auto-unboxing tiene lugar cada vez que un objeto se debe convertir a un tipo primitivo
        */

        Integer[] enteros = {Integer.valueOf(1), 2, 3, 4, 5, 6, 7,
                8, 9, 10, 11, 12, 13, 14, 15};//las demás posiciones internamente llaman también a valueOf (autoboxing)

        int suma = 0;

        for(Integer i: enteros){
            if(i.intValue() % 2 == 0){//no es necesario intValue
                suma += i.intValue();
            }
        }
        System.out.println("suma = " + suma);

        //cuando hay operaciones aritméticas con cualquier Wrapper de primitivos
        //de forma automática el compilador hace un Auto-unboxing (invoca por detras a intValue())

        suma = 0;
        for(Integer i: enteros){
            if(i % 2 == 0){
                suma += i;
            }
        }
        System.out.println("suma = " + suma);
    }
}
