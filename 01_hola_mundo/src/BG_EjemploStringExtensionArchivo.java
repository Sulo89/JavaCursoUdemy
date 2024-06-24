public class BG_EjemploStringExtensionArchivo {
    public static void main(String[] args) {
        
        String archivo = "alguna.imagen.pdf";
        int i = archivo.lastIndexOf(".");//buscamos la posicion de un punto
        System.out.println("archivo.length() = " + archivo.length());
        System.out.println("archivo.substring(archivo.length()-4) = " + archivo.substring(i+1));//sumamos 1 para no coger el punto
    }
}
