
package Controlador;
import java.sql.Connection;
import java.sql.SQLException;
import java.sql.DriverManager;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Conexion {
    /// metodo static para hacer la conexion con la base de Datos
   public static Connection Conectar(){
       Connection con =null;
       try {
           con=DriverManager.getConnection("jdbc:sqlite:bd.db"); /// CAMBIARLE LA URL (OSEA DONDE TIENE SU BASE DE DATOS PONER ESA DIRRECION DESPUES DEL "sqlite:")
           System.out.println("ya estoy conectado");
       } catch (SQLException ex) {
           System.out.println(ex.getMessage());
       }
       return con;
   }


   
}
