package org.aguzman.anotaciones.ejemplo;

import java.lang.annotation.*;

@Documented
@Target(ElementType.FIELD)//indica donde se va a utilizar
@Retention(RetentionPolicy.RUNTIME)// en que contexto
public @interface JsonAtributo {
    String nombre() default "";
    boolean capitalizar() default false;
}
