
package dev;

import java.text.SimpleDateFormat;
import java.util.Date;


public class Metods {
    
//    public static String usuario = null;
      
     public static String getHoy() {
        Date dNow = new Date();
        SimpleDateFormat ft = new SimpleDateFormat("yyyy-MM-dd");
        String hoy = ft.format(dNow);
        return hoy;
    }
}
