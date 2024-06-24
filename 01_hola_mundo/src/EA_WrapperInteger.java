public class EA_WrapperInteger {
    public static void main(String[] args) {

        int intPrimitivo = 32768;
        //CREAR WRAPPER DE UN int
        //new (contructores) están deprecated en los Wrappers!
        Integer intObjeto = Integer.valueOf(intPrimitivo);
        Integer intObjeto2 = intPrimitivo;
        System.out.println("intObjeto = " + intObjeto);

        //PASAR A PRIMITIVO
        int num = intObjeto;
        System.out.println("num = " + num);
        int num2 = intObjeto.intValue();
        System.out.println("num2 = " + num2);

        //CONVERSIONES DESDE STRING,SHORT,BYTE Y LONG
        String valorTvLcd = "67000";
        Integer valor = Integer.valueOf(valorTvLcd);
        System.out.println("valor = " + valor);
        
        Short shortObjeto = intObjeto.shortValue();
        System.out.println("shortObjeto = " + shortObjeto);
        
        Byte byteObjeto = intObjeto.byteValue();
        System.out.println("byteObjeto = " + byteObjeto);
        
        Long longObjeto = intObjeto.longValue();
        System.out.println("longObjeto = " + longObjeto);

    }
}
