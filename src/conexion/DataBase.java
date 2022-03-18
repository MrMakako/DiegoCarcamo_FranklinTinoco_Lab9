package conexion;



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

import java.io.File;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.UIManager;
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
    
    
    public int BuscarAlumno(String Nombre,String Password){
        try {
            link();
            String inset= "SELECT Id,Nombre,Password WHERE Nombre = '  "   + Nombre +  " ' ";
            
            
            Statement d=cn.createStatement();
            ResultSet rs= d.executeQuery(inset);
            
            
            while (rs.next()){
            
                String name=rs.getString(2);
                String password=rs.getString(3);
                
                
                
                if(name.equals(Nombre)&&Password.equals(Password)){
                    return rs.getInt(1);
                
                
                
                }
            
            
            
            
            }
            
           
            
            
            
            
            
            
            
            
        } catch (SQLException ex) {
            Logger.getLogger(DataBase.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        
        return 0;
        
        
      
    
    
    
    
    
    }
    
    
    public int  BuscarMaestro(String Nombre,String Password){
        
        
                try {
            link();
            String inset= "SELECT RRH,Nombre,Password WHERE Nombre = '  "   + Nombre +  " ' ";
            
            
            Statement d=cn.createStatement();
            ResultSet rs= d.executeQuery(inset);
            
            
            while(rs.next()){
            
             
                
                    String nombre=rs.getString(2);
                    String PasswordAc=rs.getString(3);
                    
                    if(nombre.equals(Nombre)&& Password.equals(PasswordAc)){
                    
                    
                        return  rs.getInt(1);
                    
                    
                    
                    }
   
            }
    
        } catch (SQLException ex) {
            
            Logger.getLogger(DataBase.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        
        return 0;
        
    
    
    
    
    
    
    
    
    
    }
    
    
   
    
    
    
   
    
    
    
    
    
    
    
    
    
    
  
    
    
    
    
    
    
    
}
