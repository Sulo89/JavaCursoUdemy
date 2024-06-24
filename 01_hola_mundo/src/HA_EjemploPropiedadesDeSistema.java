import java.util.Properties;

public class HA_EjemploPropiedadesDeSistema {
    public static void main(String[] args) {

        //La clase System solo tiene métodos y atributos estáticos, no se puede instanciar con new ->constructor privado, ni crear una subClase -> es Final

        String username = System.getProperty("user.name");//NOMBRE USUARIO
        System.out.println("username = " + username);

        String home = System.getProperty("user.home");//RUTA USUARIO C:\Users\nombreUsuario
        System.out.println("home = " + home);

        String workspace = System.getProperty("user.dir");
        System.out.println("workspace = " + workspace);//ruta completa de la carpeta del proyecto

        String java = System.getProperty("java.version");
        System.out.println("java = " + java);// versión de java

        //dos formas para hacer salto de línea
        String lineSeparator = System.getProperty("line.separator");
        String lineSeparator2 = System.lineSeparator();
        System.out.println("lineSeparator:" + lineSeparator2 + "Una línea nueva ...");

        Properties p = System.getProperties();// todas las propiedades
        p.list(System.out);//imprime la lista completa de las propiedades del sistema
    }
}
