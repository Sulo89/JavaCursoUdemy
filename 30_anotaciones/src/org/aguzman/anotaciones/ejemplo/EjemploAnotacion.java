package org.aguzman.anotaciones.ejemplo;

import org.aguzman.anotaciones.ejemplo.models.Producto;
import org.aguzman.anotaciones.ejemplo.procesador.JsonSerializador;

import java.lang.reflect.Field;
import java.time.LocalDate;
import java.util.Arrays;

public class EjemploAnotacion {
    public static void main(String[] args) {

        Producto p = new Producto();
        p.setFecha(LocalDate.now());
        p.setNombre("mesa centro ROBLE");
        p.setPrecio(1000L);
        /*
        LO DESACOPLAMOS Y LO HACEMOS REUTILIZABLE

        Field[] atributos = p.getClass().getDeclaredFields();
        String json1 = Arrays.stream(atributos)
                        .filter(f->f.isAnnotationPresent(JsonAtributo.class))
                .map(f->{
                            f.setAccessible(true);// los campos son privados (añadimos para poder acceder mediante reflexión)
                            String nombre = f.getAnnotation(JsonAtributo.class).nombre().equals("") ? f.getName(): f.getAnnotation(JsonAtributo.class).nombre();

                            try {
                                return "\"" + nombre + "\":" + f.get(p) + "\"";
                            }catch (IllegalAccessException e){
                                throw new RuntimeException("Error al serializar a json : " + e.getMessage());
                            }
                })
                        .reduce("{", (a,b)->{
                            if("{".equals(a)){
                                return a+b;
                            }
                            return a + ", " +b;
                        }).concat("}");

        System.out.println(json1);

         */

        System.out.println("json = " + JsonSerializador.convertirJson(p));
    }
}
