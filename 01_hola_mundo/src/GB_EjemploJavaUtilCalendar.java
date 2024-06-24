import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class GB_EjemploJavaUtilCalendar {
    public static void main(String[] args) {
        //es abstracta y no podemos instanciarla con new
        Calendar calendario = Calendar.getInstance();//depende de la ubicación (Gregorian Calendar en occidente)

        //calendario.set(2019, Calendar.SEPTEMBER, 25, 18, 20, 10);
        calendario.set(Calendar.YEAR, 2020);
        calendario.set(Calendar.MONTH, Calendar.MARCH);
        calendario.set(Calendar.DAY_OF_MONTH, 25);

        //calendario.set(Calendar.HOUR_OF_DAY, 21); 24
        calendario.set(Calendar.HOUR, 7);//12
        calendario.set(Calendar.AM_PM, Calendar.PM);
        calendario.set(Calendar.MINUTE, 20);
        calendario.set(Calendar.SECOND, 10);
        calendario.set(Calendar.MILLISECOND, 125);

        Date fecha = calendario.getTime();
        System.out.println("fecha sin formato = " + fecha);

        SimpleDateFormat formato = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss:SSS a");
        String fechaConFormato = formato.format(fecha);
        System.out.println("fecha Con Formato = " + fechaConFormato);

        Calendar calActual = Calendar.getInstance();
        Date fecha2 = calActual.getTime();

        if(fecha.after(fecha2)){
            System.out.println("fecha1 (del usuario) es después que fecha2 (actual)");
        } else if(fecha.before(fecha2)){
            System.out.println("fecha es anterior que fecha2");
        } else if(fecha.equals(fecha2)){
            System.out.println("fecha es igual a fecha2");
        }

        if(fecha.compareTo(fecha2) > 0){
            System.out.println("fecha1 (del usuario) es después que fecha2 (actual)");
        } else if(fecha.compareTo(fecha2) < 0){
            System.out.println("fecha es anterior que fecha2");
        } else if(fecha.compareTo(fecha2) == 0){
            System.out.println("fecha es igual a fecha2");
        }

    }
}
