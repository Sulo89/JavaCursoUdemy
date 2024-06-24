package org.aguzman.archivos.ejemplos.servicio;

import java.io.*;
import java.util.Scanner;

public class ArchivoServicio {
    /*
    Mejor usar Buffer para acumular cierta cantidad de caracteres en un buffer
    y cuando se llena escribe en el disco.
    con FileWrite directamente cada vez que se usa accede al disco duro para escribir.
    Para pocas líneas de código da igual, podeos usar FileWrite de forma directa
     */

    public void crearArchivo_0(String nombre){
        File archivo = new File(nombre);
        try {//true para por agregar más contenido
            FileWriter escritor =new FileWriter(archivo, true);
            BufferedWriter buffer = new BufferedWriter(escritor);
            //devuelve el objeto (podemos encadenar los métodos)
            buffer.append("Hola que tal amigos!\n")//se puede usar append o write
                    .append("Todo bien? yo acá escribiendo un archivo...\n")
                    .append("Hasta luego Lucas!\n");
            buffer.close();//para cerrar el recurso(si no no escribe en el archivo)
            System.out.println("El archivo se ha creado con éxito!");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    // desde java 7-> forma de recurso ejecuta entre los paréntesis un recurso y si no entra al catch NO HACE FALTA CERRAR EL RECURSO DE FORMA EXPLICITA
    public void crearArchivo(String nombre){
        File archivo = new File(nombre);
        try (BufferedWriter buffer = new BufferedWriter(new FileWriter(archivo, true))){//true para por agregar más contenido

            buffer.append("Hola que tal amigos!\n")//se puede usar append o write
                    .append("Todo bien? yo acá escribiendo un archivo...\n")
                    .append("Hasta luego Lucas!\n");
            // buffer.close(); //no tenemos que preocuparnos de  cerrar de forma explicita
            System.out.println("El archivo se ha creado con éxito!");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    // desde java 7-> forma de recurso ejecuta entre los paréntesis un recurso y si no entra al catch NO HACE FALTA CERRAR EL RECURSO DE FORMA EXPLICITA
    //Print también maneja un buffer y nos permite usar el ptinln, printf (como una consola).
    public void crearArchivo2(String nombre){
        File archivo = new File(nombre);
        try (PrintWriter buffer = new PrintWriter(new FileWriter(archivo, true))){
            //devuelve void (no podemos encadenar los métodos)
            buffer.println("Hola que tal amigos!");
            buffer.println("Todo bien? yo acá escribiendo un archivo...");
            buffer.printf("Hasta luego %s!", "Lucas");
            // buffer.close();
            System.out.println("El archivo se ha creado con éxito!");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    // desde java 7-> forma de recurso ejecuta entre los paréntesis un recurso y si no entra al catch NO HACE FALTA CERRAR EL RECURSO DE FORMA EXPLICITA
    public String leerArchivo(String nombre){
        StringBuilder sb = new StringBuilder();
        File archivo = new File(nombre);
        try (BufferedReader reader = new BufferedReader(new FileReader(archivo))){

            String linea;
            while ( (linea = reader.readLine()) != null){//leemos la líneas hasta que no haya más (null)
                sb.append(linea).append("\n");
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return sb.toString();
    }
    
    // desde java 7-> forma de recurso ejecuta entre los paréntesis un recurso y si no entra al catch NO HACE FALTA CERRAR EL RECURSO DE FORMA EXPLICITA
    //usamos scanner en vez BufferRedaer(FileReader)
    public String leerArchivo2(String nombre){
        StringBuilder sb = new StringBuilder();
        File archivo = new File(nombre);
        try (Scanner s = new Scanner(archivo)){

            s.useDelimiter("\n");
            while (s.hasNext()){
                sb.append(s.next()).append("\n");
            }

        } catch (IOException e) {
            e.printStackTrace();
        }
        return sb.toString();
    }
}
