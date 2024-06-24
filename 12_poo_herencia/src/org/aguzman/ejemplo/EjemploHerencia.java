package org.aguzman.ejemplo;

import org.aguzman.pooherencia.*;

public class EjemploHerencia {
    public static void main(String[] args) {

        System.out.println("======== Creando la instancia de la clase Alumno ========");
        Alumno alumno = new Alumno();
        //la clase hija se puede instanciar como el tipo de la padre, pero para acceder a sus métodos hay que hacer un cast
        //Persona alumno = new Alumno();
        alumno.setNombre("Andres");
        alumno.setApellido("Guzman");
        alumno.setInstitucion("Instituto Nacional");
        //((Persona)alumno).setInstitucion("Instituto Nacional");
        alumno.setNotaCastellano(5.5);
        alumno.setNotaHistoria(6.3);
        alumno.setNotaMatematica(4.9);

        System.out.println("======= Creando la instancia de la clase AlumnoInternacional ======= ");
        AlumnoInternacional alumnoInt = new AlumnoInternacional();
        alumnoInt.setNombre("Peter");
        alumnoInt.setApellido("Gosling");
        alumnoInt.setPais("Australia");
        alumnoInt.setEdad(15);
        alumnoInt.setInstitucion("Instituto Nacional");
        alumnoInt.setNotaIdiomas(6.8);
        alumnoInt.setNotaCastellano(6.2);
        alumnoInt.setNotaHistoria(5.8);
        alumnoInt.setNotaMatematica(6.5);

        System.out.println("======= Creando la instancia de la clase de Profesor =======");
        Profesor profesor = new Profesor();
        profesor.setNombre("Luci");
        profesor.setApellido("Pérez");
        profesor.setAsignatura("Matemáticas");

        System.out.println(" ======== - =======");
        System.out.println(alumno.getNombre()
                + " " + alumno.getApellido()
                + " " + alumno.getInstitucion());
        System.out.println(alumnoInt.getNombre()
        + " " +  alumnoInt.getApellido()
        + " " + alumnoInt.getInstitucion()
        + " " + alumnoInt.getPais());

        System.out.println("Profesor " + profesor.getAsignatura()
                + ": " +  profesor.getNombre()
                + " " + profesor.getApellido());
        //API DE RELEXIÓN DE JAVA
        Class clase = alumnoInt.getClass();
        while(clase.getSuperclass() != null){
            String hija = clase.getName();//org.aguzman.pooherencia.AlumnoInternacional
            String padre = clase.getSuperclass().getName();//org.aguzman.pooherencia.Alumno
            System.out.println(hija + " es una clase hija de la clase padre " + padre);
            clase = clase.getSuperclass();
        }
    }
}
