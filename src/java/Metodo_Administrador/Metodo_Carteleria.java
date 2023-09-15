/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Metodo_Administrador;

import domain.Carteleria;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import metodos.Metodos;

/**
 *
 * @author Curso Tarde
 */
public class Metodo_Carteleria {
    private Connection conexion;

    public Metodo_Carteleria(){
        String url = "jdbc:mysql://localhost:3306/igualdad";
        String usuario = "root";
        String clave = "";
        
        try {
            //registramos el driver---> examen pregunta
            Class.forName("com.mysql.cj.jdbc.Driver");
            conexion = DriverManager.getConnection(url, usuario, clave);
            System.out.println("CONEXION, OK");
        } catch (Exception e) {
            System.out.println("ERROR: CONEXION");
        }
    }

    
    public boolean insertarCarteleria(Carteleria carteleria) {

        // preparamos la query
        boolean bandera = true;

        String query = "INSERT INTO carteleria(id_Campana ,archivo) VALUES(?,?);";

        try {
            PreparedStatement ps = conexion.prepareStatement(query);
            	
		ps.setInt(1, carteleria.getId_Campana());  
                ps.setString(2, carteleria.getArchivo());
                
                
		
            ps.executeUpdate();
            ps.close();           
            
        } catch (Exception e) {
            bandera = false;
        }

        return bandera;
    }

   
    
     public boolean eliminarCarteleria(int codigo){
        boolean bandera = true;
        
         String query = "DELETE FROM carteleria WHERE id_Carteleria= ?";
        PreparedStatement ps = null;
        try{
           
            ps=conexion.prepareStatement(query);
            ps.setInt(1, codigo);
           
            ps.executeUpdate();  
            ps.close();           
            
        }catch (Exception e){
            bandera = false;
            System.out.println("ERROR: "+e);
        }
     return bandera;
     }
  
public boolean actualizarCarteleria(Carteleria carteleria){
       boolean bandera = true; 
    
        String query= "UPDATE Carteleria SET id_Campana=?,"
                + "archivo=? WHERE id_Carteleria = ?;";
                 
        System.out.println("tengo de campaña... = " + carteleria);
        try{
            
            PreparedStatement ps = conexion.prepareStatement(query);
            	
		
                ps.setInt(1, carteleria.getId_Campana());                 
                ps.setString(2, carteleria.getArchivo());                
                ps.setInt(7,carteleria.getId_Carteleria());
                
             System.out.println("ps = " + ps);  
            ps.executeUpdate();
             ps.close();           
        }catch(Exception e){
            bandera = false;
            System.out.println("ERROR ACTUALIZAR: " + e);
            
        }
       return bandera; 
       
}
}
