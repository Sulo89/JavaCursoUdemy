import java.util.Random;

public class I_EjemploClaseMathRandom {
    public static void main(String[] args) {
        //La clase Math solo tiene métodos y atributos estáticos, no se puede instanciar con new ->constructor privado, ni crear una subClase -> es Final
        //forma 1 con Math
        String[] colores = {"azul", "amarillo", "rojo", "verde", "blanco", "negro"};

        double random = Math.random();
        System.out.println("random = " + random);//entre 0 y 0.99999999999999999999999999
        random *= colores.length;

        System.out.println("random = " + random);//entre 0 y 5.99999999999999999999999

        random = Math.floor(random);//redondeamos hacía bajo porque los arrays empiezan en 0
        System.out.println("random = " + random);

        System.out.println("colores = " + colores[(int) random]);//es double lo pasamos a int

        //forma 2 con Random
        Random randomObj = new Random(); //con Random si creamos la instancia con new
        int randomEntero = randomObj.nextInt(7);//de 0 a 6
        randomEntero = randomObj.nextInt(7+1);//de 0 a 7
        int randomInt = 15 + randomObj.nextInt(25-15+1);//de 15 a 25 -> sumo 15 para que parta de ese numero  se lo resto y +1 para incluirlo
        System.out.println("randomInt = " + randomInt);

        randomInt = randomObj.nextInt(colores.length);
        System.out.println("randomInt = " + randomInt);
        System.out.println("colores = " + colores[randomInt]);
    }
}
