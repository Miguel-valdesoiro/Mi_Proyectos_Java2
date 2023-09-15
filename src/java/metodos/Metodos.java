
package metodos;

import java.sql.Date;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Locale;




public class Metodos {
    
    public static java.sql.Date convertirFechaStringToFechaDate(String fechaString) {//"15/10/2009"
        Date fechaDate = null;
        try {
            SimpleDateFormat formato = new SimpleDateFormat("dd/MM/yyyy", new Locale("es", "ES"));
            fechaDate = new Date(formato.parse(fechaString).getTime());
        } catch (Exception e) {
            System.out.println("ERROR: = " + e);
        }
        return fechaDate;
    }
 
    public static String convertirFechaDateAString(Date fecha){
        DateFormat df = new SimpleDateFormat("dd/MM/yyyy ");
		       
		 String fechaString = df.format(fecha);
        
                return fechaString;
    }
    
}
