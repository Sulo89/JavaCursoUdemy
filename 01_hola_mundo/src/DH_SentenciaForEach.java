public class DH_SentenciaForEach {
    public static void main(String[] args) {
        
        int[] numeros = {1, 3, 5, 7, 9, 11, 13, 15};
        for(int num: numeros){   //Recorre de forma automática el array
            System.out.println("num = " + num);
        }

        String[] nombres = {"Andres", "Pepe", "Maria", "Paco", "Lalo", "Bea", "Pato", "Pepa"};
        
        for(String nombre : nombres){
            System.out.println("nombre = " + nombre);
        }
    }
}
