
import Conexion.conectar;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
import java.io.File;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
/**
 *
 * @author Diego Carcamo
 */
public class DataBase {
    
    
    conectar conector= new conectar();
    Connection cn;
    public void link(){
    
        cn=conector.conectar();
    
    
    
    }
    
    
   
    
    
    
   
    
    
    
    
    
    
    
    
    
    
  
    
    
    
    
    
    
    
}
