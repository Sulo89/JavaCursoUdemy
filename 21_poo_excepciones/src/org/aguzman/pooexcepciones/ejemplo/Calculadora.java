package org.aguzman.pooexcepciones.ejemplo;

public class Calculadora {

    public double dividir(int numerador, int divisor) throws DivisionPorZeroException{
        if(divisor == 0){
            throw new DivisionPorZeroException("no se puede dividir por cero!");
        }
        return numerador/(double)divisor;//convertimos para mantener décimales (int de 32bits pasa a double que es de 64bits)
    }

    public double dividir(String numerador, String divisor)
            throws DivisionPorZeroException, FormatoNumeroException {
        try {//para manejar el error del parse Int
            int num = Integer.parseInt(numerador);
            int div = Integer.parseInt(divisor);
            return this.dividir(num, div);//usamos el primer método que lanza una excepción, la podriamos tratar pero LO PROPAGAMOS!
        } catch (NumberFormatException e){
            throw new FormatoNumeroException("debe ingresar un número en el numerador y divisor");//capturamos el error del parse int y lanzamos el nuestro
        }
    }
}
