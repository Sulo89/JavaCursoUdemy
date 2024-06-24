import java.util.Map;

public class HC_EjemploVariablesDeEntorno {
    public static void main(String[] args) {

        //La clase System solo tiene métodos y atributos estáticos, no se puede instanciar con new ->constructor privado, ni crear una subClase -> es Final

        //map con las variables de entorno del sistema
        Map<String, String> varEnv = System.getenv();
        System.out.println("Variables de ambiente del sistema = " + varEnv);

        System.out.println("------ Listando variables de entorno del sistema ------");
        for(String key: varEnv.keySet()){
            System.out.println(key + " => " + varEnv.get(key));//nombre variables de ambiente
        }

        String username = System.getenv("USERNAME");
        System.out.println("username = " + username);

        String javaHome = System.getenv("JAVA_HOME");
        System.out.println("javaHome = " + javaHome);

        String temDir = System.getenv("TEMP");
        System.out.println("temDir = " + temDir);

        String path = System.getenv("Path");
        System.out.println("path = " + path);

        //Usando el map en lugar de directamente

        String path2 = varEnv.get("Path");
        System.out.println("path2 = " + path2);

        String appEnv = varEnv.get("APPLICATION_ENV");
        System.out.println("appEnv = " + appEnv);

        String hola = varEnv.get("SALUDAR_HOLA");
        System.out.println("hola = " + hola);
    }
}
