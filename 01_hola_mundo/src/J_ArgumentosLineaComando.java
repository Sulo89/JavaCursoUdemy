public class J_ArgumentosLineaComando {
    public static void main(String[] args) {
        //para pasar argumenmtos desde el ide editamos las configuraciones del arranque
        if(args.length == 0){
            System.out.println("Debe ingresar argumentos o parámetros!");
            System.exit(-1);
        }
        for(int i = 0; i < args.length; i++){
            System.out.println("Argumentos nº " + i + ": " + args[i]);
        }
    }
}
