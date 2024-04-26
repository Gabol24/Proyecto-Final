
package Conexion;

import java.sql.*;

public class Conexion {
    Connection con;
    
    public Conexion(){
    try{
        
        Class.forName("com.mysql.jdbc.Driver");
        con =(Connection)DriverManager.getConnection("jdbc:mysql://localhost:3306/crudproyectofinal","root","");
        System.out.println("Conexión exitosa");
        
        
    }catch(Exception e){
        System.out.println("¡¡¡ No se pudo conectar a la BD !!!");
    }
    
    }
    public Connection getConnection(){
        return con;
    }    
}
