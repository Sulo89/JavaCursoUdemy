package org.aguzman.pooclasesabstractas.form.elementos.select;

public class Opcion {
    private String valor;
    private String nombre;
    private boolean selected;

    public Opcion() {
    }

    public Opcion(String valor, String nombre) {
        this.valor = valor;
        this.nombre = nombre;
    }

    public String getValor() {
        return valor;
    }

    public void setValor(String valor) {
        this.valor = valor;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public boolean isSelected() {
        return selected;
    }

    public void setSelected(boolean selected) {
        this.selected = selected;
    }

    //sobre cargamos el método MEJORA para no tener que instanciar el objeto option :devuelve el objeto y pone a true selected
    public Opcion setSelected() {
        this.selected = true;
        return this;
    }
}
