package org.aguzman.pooclasesabstractas.form;

import org.aguzman.pooclasesabstractas.form.elementos.*;
import org.aguzman.pooclasesabstractas.form.elementos.select.Opcion;

import java.util.Arrays;
import java.util.List;

public class EjemploForm {
    public static void main(String[] args) {

        InputForm username = new InputForm("username");
        InputForm password = new InputForm("clave", "password");
        InputForm email = new InputForm("email", "email");
        InputForm edad = new InputForm("edad", "number");

        TextareaForm experiencia = new TextareaForm("exp", 5, 9);

        SelectForm lenguaje = new SelectForm("lenguaje");

        //Opcion java = new Opcion("1","Java");

        //value, name
        lenguaje.addOpcion(new Opcion("1", "Java"))
        .addOpcion(new Opcion("2", "Python").setSelected())//MEJORA para no tener que instanciar el objeto option: devuelve el objeto y pone a true selected
        .addOpcion(new Opcion("3", "JavaScript"))
        .addOpcion(new Opcion("4", "TypeScript"))
        .addOpcion(new Opcion("5", "PHP"));

        //Clase anonima implementación al vuelo no reutilizable(para clases abstractas o interfaces)
        ElementoForm saludar = new ElementoForm("saludo"){
            @Override
            public String dibujarHtml() {
                return "<input disabled name='"+this.nombre+"' value=\"" +this.valor+ "\">";
            }
        };

        //establecemos los values de los input y del text area
        saludar.setValor("Hola que tal este campo está deshabilitado!");
        username.setValor("john.doe");
        password.setValor("a1b2c3");
        email.setValor("john.doe@correo.com");
        edad.setValor("28");
        experiencia.setValor("... más de 10 años de experiencia ...");



        /*
        List<ElementoForm> elementos = new ArrayList<>();
        elementos.add(username);
        elementos.add(password);
        elementos.add(email);
        elementos.add(edad);
        elementos.add(lenguaje);
        elementos.add(saludar);

        SUSTITUIMOS
        */

        List<ElementoForm> elementos = Arrays.asList(username,
                password,
                email,
                edad,
                experiencia,
                lenguaje,
                saludar);

            /*

        for(ElementoForm e: elementos){

            System.out.println(e.dibujarHtml());
            System.out.println("<br>");


              SUSTITUIMOS usando la api stream que viene con java 8
              le pasamos una expresión lambda (o expresión de flecha)
              o consumer (consumidor de estos elementos que se van consumiendo)
        }
        */

        elementos.forEach(e -> {
            System.out.println(e.dibujarHtml());
            System.out.println("<br>");//para que salga cada elemento en una línea
        });


        //COPIAMOS Y PEGAMOS EL RESULTADO DE LA CONSOLA EN EL BODY DE UN .HTML PARA VER LOS ELEMENTOS
    }
}
