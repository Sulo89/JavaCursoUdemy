public class BE_EjemploStringValidar {
    public static void main(String[] args) {
        
        String curso = null;
        
        boolean esNulo = curso == null;

        System.out.println("esNulo = " + esNulo);

        if(esNulo) {
            curso = "Programación Java";
        }

        boolean esVacio = curso.length() == 0;

        System.out.println("esVacio = " + esVacio);

        boolean esVacio2 = curso.isEmpty();
        System.out.println("esVacio2 = " + esVacio2);
        //válida que sea distinto de vacío "", de null y si está en blanco (el más completo desde la versión 11)
        boolean esBlanco = curso.isBlank();
        System.out.println("esBlanco = " + esBlanco);

        if(esBlanco == false) {
            System.out.println(curso.toUpperCase());
            System.out.println("Bienvenido al curso ".concat(curso));
        }
    }
}
