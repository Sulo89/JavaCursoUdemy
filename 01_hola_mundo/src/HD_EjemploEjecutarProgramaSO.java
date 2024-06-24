public class HD_EjemploEjecutarProgramaSO {
    public static void main(String[] args) {
        //ejecutar app o programa del sistema operativo
        Runtime rt = Runtime.getRuntime(); //obtenemos la instancia de tiempo ejecución
        Process proceso; //cuando se ejecuta un programa deuvelve un objeto Process

        try {
            if (System.getProperty("os.name").toLowerCase().startsWith("windows")) {
                proceso = rt.exec("notepad");
            } else if (System.getProperty("os.name").toLowerCase().startsWith("mac")) {
                proceso = rt.exec("textedit");
            }else if (System.getProperty("os.name").toLowerCase().contains("nux") ||
                    System.getProperty("os.name").toLowerCase().contains("nix")) {
                proceso = rt.exec("gedit");
            }
            else {
                proceso = rt.exec("gedit");//debe haber un proceso por defecto, si no waitFor() da error
            }
            proceso.waitFor();//esperar que acabe el proceso (cerremos el editor)
        } catch(Exception e){
            System.err.println("El comando es desconocido: " + e.getMessage());
            System.exit(1);//Process finished with exit code 1
        }
        System.out.println("Se ha cerrado el editor");
        System.exit(0);//Process finished with exit code 0
    }
}
