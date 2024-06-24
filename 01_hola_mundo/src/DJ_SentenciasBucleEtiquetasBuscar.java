public class DJ_SentenciasBucleEtiquetasBuscar {
    public static void main(String[] args) {

        //busca la palabra con un for para caracter y otro para la palabra y va comparando los caracteres.

        String frase = "tres tristes tigres tragan trigo en un trigal";
        String palabra = "trigo";

        int maxPalabra = palabra.length();
        int maxFrase = frase.length() - maxPalabra;//lo restamos porque no tiene sentido recorrer los últimos cáracteres es imposible que sea.

        int cantidad = 0;
        char letra = 'g';
        buscar:
        for(int i = 0; i <= maxFrase;){
            int k = i;//sacamos el valor de la i ( no podemos usarlo directamente)
            for(int j = 0; j < maxPalabra; j++) {
                if (frase.charAt(k++) != palabra.charAt(j)) {//usamos la k en un post incremento (para que sea igual que la i en el momento de usar el método y luego incrementamos(igual que i) pero así poder usarla en el for inferior).
                    i++;
                    continue buscar;//continua en el for padre
                }
            }
            cantidad++;
            i = i + maxPalabra;
        }
        System.out.println("Encontrado = " + cantidad + " veces la palabra '"+palabra+"' en la frase");
    }
}
