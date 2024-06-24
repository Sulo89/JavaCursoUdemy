package org.aguzman.recursividad.ejemplo;

import org.aguzman.recursividad.ejemplo.models.Componente;

import java.util.stream.Stream;

public class EjemploRecursividad {
    public static void main(String[] args) {
        Componente pc = new Componente("Gabinete PC ATX");
        Componente poder = new Componente("Fuente Poder 700w");
        Componente placaMadre = new Componente("MainBoard Asus sockets AMD");
        Componente cpu = new Componente("Cpu AMD Ryzen 5 2800");
        Componente ventilador = new Componente("Ventilador CPU");
        Componente disipador = new Componente("Disipador");
        Componente tv =  new Componente("Nvidia RTX 3080 8GB");
        Componente gpu = new Componente("Nvidia GPU RTX");
        Componente gpuRam = new Componente("4GB Ram");
        Componente gpuRam2 = new Componente("4GB Ram");
        Componente gpuVentiladores = new Componente("Ventiladores");
        Componente ram = new Componente("Memoria Ram 32GB");
        Componente ssd = new Componente("Disco SSD 2T");

        cpu.addComponente(ventilador)
                .addComponente(disipador);
        tv.addComponente(gpu)
                .addComponente(gpuRam)
                .addComponente(gpuRam2)
                .addComponente(gpuVentiladores);
        placaMadre.addComponente(cpu)
                .addComponente(tv)
                .addComponente(ram)
                .addComponente(ssd);
        pc.addComponente(poder)
                .addComponente(placaMadre)
                .addComponente(new Componente("Teclado"))
                .addComponente(new Componente("Mouse"));

        //sin api stream
        //metodoRecursivoJava8(pc, 0);

        //con api stream
        metodoRecursivoJava8(pc, 0).forEach(c -> System.out.println("\t".repeat(c.getNivel()) + c.getNombre()));

    }

    //-----------------------CON API STREAM----------------------------
    public static Stream<Componente> metodoRecursivoJava8(Componente c, int nivel){
        c.setNivel(nivel);
        return Stream.concat(Stream.of(c),
                c.getHijos().stream().flatMap(hijo -> metodoRecursivoJava8(hijo, nivel + 1)));

    }
    //-----------------------SIN API STREAM----------------------------
    public static void metodoRecursivo(Componente c, int nivel){
        System.out.println("\t".repeat(nivel) + c.getNombre());//nivel 1 un tabulador, nilvel 2 dos tabuladores
        if(c.tieneHijos()){
            for(Componente hijo: c.getHijos()){
                metodoRecursivo(hijo, nivel + 1);//sumamos 1 nivel por hijo
            }
        }
    }
}
