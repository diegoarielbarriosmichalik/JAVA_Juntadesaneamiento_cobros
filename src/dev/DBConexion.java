
package dev;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;


public class DBConexion {

    public static Connection conexion = null; 
    
    public static void Iniciar_Conexion() {
        try {
            Class.forName("org.postgresql.Driver");
            conexion = DriverManager.getConnection("jdbc:postgresql://190.104.167.162:5432/JuntaSaneamiento", "postgres", "postgres");
//            conexion = DriverManager.getConnection("jdbc:postgresql://localhost:5432/JuntaSaneamiento", "postgres", "postgres");
//            conexion = DriverManager.getConnection("jdbc:postgresql://190.104.167.162:5432/JuntaSaneamiento_prueba", "postgres", "postgres");
        } catch (SQLException | ClassNotFoundException ex) {
            System.err.println(ex);
        }
    }
    
     public static String getSepararMiles(String txtprec) {
        String valor = txtprec;

        int largo = valor.length();
        if (largo > 8) {
            valor = valor.substring(largo - 9, largo - 6) + "." + valor.substring(largo - 6, largo - 3) + "." + valor.substring(largo - 3, largo);
        } else if (largo > 7) {
            valor = valor.substring(largo - 8, largo - 6) + "." + valor.substring(largo - 6, largo - 3) + "." + valor.substring(largo - 3, largo);
        } else if (largo > 6) {
            valor = valor.substring(largo - 7, largo - 6) + "." + valor.substring(largo - 6, largo - 3) + "." + valor.substring(largo - 3, largo);
        } else if (largo > 5) {
            valor = valor.substring(largo - 6, largo - 3) + "." + valor.substring(largo - 3, largo);
        } else if (largo > 4) {
            valor = valor.substring(largo - 5, largo - 3) + "." + valor.substring(largo - 3, largo);
        } else if (largo > 3) {
            valor = valor.substring(largo - 4, largo - 3) + "." + valor.substring(largo - 3, largo);
        }
        txtprec = valor;
        return valor;
    }

}
