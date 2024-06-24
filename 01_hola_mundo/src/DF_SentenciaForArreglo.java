import javax.swing.*;

public class DF_SentenciaForArreglo {
    public static void main(String[] args) {

        String[] nombres = {"Andres", "Pepe", "Maria", "Paco", "Lalo", "Bea", "Pato", "Pepa"};
        int count = nombres.length;//buena práctica para no calcular en cada iteación, declararlo fuera
        for(int i = 0; i < count; i++){
            if(nombres[i].toLowerCase().contains("ANDRES".toLowerCase()) ||
                    nombres[i].toLowerCase().contains("pePa".toLowerCase())){
                continue;//andres y pepa se salta la iteración
            }
            System.out.println( i + ".- " + nombres[i]);
        }
        
        String buscar = JOptionPane.showInputDialog("Ingrese un nombre, ejemplo \"Pepe\" o \"Maria\":");
        System.out.println("buscar = " + buscar);

        boolean encontrado = false;
        for(int i = 0; i < count; i++){
            if(nombres[i].equalsIgnoreCase(buscar)){
                encontrado = true;
                break;// sale del for
            }
            System.out.println("nombres = " + nombres[i]);
        }
        if(encontrado){
            JOptionPane.showMessageDialog(null, buscar + " fue encontrado!");
        } else {
            JOptionPane.showMessageDialog(null, buscar + " no existe en el sistema!");
        }
    }
}
