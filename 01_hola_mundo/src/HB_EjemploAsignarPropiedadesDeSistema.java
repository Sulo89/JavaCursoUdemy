import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Properties;

public class HB_EjemploAsignarPropiedadesDeSistema {
    public static void main(String[] args) {
        //La clase System solo tiene métodos y atributos estáticos, no se puede instanciar con new ->constructor privado, ni crear una subClase -> es Final

        //HAY DOS MANERAS DE AGREGAR CONFIGURACIONES MEDIANTE EL ARCHIVO PROPERTIES O MEDIANTE EL MÉTODO  SET DE PROPERTIES (CLAVE-VALOR)
        try {

            Properties p = new Properties(System.getProperties());//cargamos las configuraciones del sistema en nuestro objeto properties

            //1 manera
            FileInputStream archivo = new FileInputStream("src/hb_config.properties");//leer el contenido del archivo
            p.load(archivo);//y añadimos nuestro archivo con las configuraciones propias

            //2 manera
            p.setProperty("mi.propiedad.personalizada","Mi valor guardado en el objeto properties");

            //establecemos nuestro properties con nuestras propiedades nuevas.
            System.setProperties(p);

            //comprobamos que ya se encuentran en nuestro sistema
            Properties ps = System.getProperties();
            System.out.println("ps.getProperty(...) = " + ps.getProperty("mi.propiedad.personalizada"));
            System.out.println(System.getProperty("config.puerto.servidor"));
            System.out.println(System.getProperty("config.autor.nombre"));
            System.out.println(System.getProperty("config.autor.email"));

            ps.list(System.out);
        } catch(Exception e){
            System.err.println("no existe el archivo = " + e); //mensaje de error
            System.exit(1);

        }
    }
}
