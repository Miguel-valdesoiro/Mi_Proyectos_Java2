
package Metodo_Administrador;

import domain.Campana;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import metodos.Metodos;


public class Metodo_Campana {
    private Connection conexion;

    public Metodo_Campana(){
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

    
    public boolean insertarCampana(Campana campana) {

        // preparamos la query
        boolean bandera = true;

        String query = "INSERT INTO campana(id_Empresa ,razon_Social,"
                + "concepto,fecha_Inicio,fecha_Final,comunicacion) VALUES(?,?,?,?,?,?);";

        try {
            PreparedStatement ps = conexion.prepareStatement(query);
            	
		ps.setInt(1, campana.getId_Empresa());  
                ps.setString(2, campana.getRazon_Social());
                ps.setString(3, campana.getConcepto());
                ps.setDate(4, Metodos.convertirFechaStringToFechaDate( campana.getFecha_Inicio()));
                ps.setDate(5, Metodos.convertirFechaStringToFechaDate(campana.getFecha_Final()));
                ps.setString(6, campana.getComunicacion());
                
		
            ps.executeUpdate();
            ps.close();           
            
        } catch (Exception e) {
            bandera = false;
        }

        return bandera;
    }

   
    
     public boolean eliminarCampana(int codigo){
        boolean bandera = true;
        
         String query = "DELETE FROM campana WHERE id_Campana= ?";
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
  
public boolean actualizarCampana(Campana campana){
       boolean bandera = true; 
    
        String query= "UPDATE Campana SET id_Empresa=?,"
                + "razon_Social=?, concepto=?,fecha_Inicio=?,fecha_Final=?, comunicacion=? WHERE id_Campana = ?;";
                 
        System.out.println("tengo de campaña... = " + campana);
        try{
            
            PreparedStatement ps = conexion.prepareStatement(query);
            	
		
                ps.setInt(1, campana.getId_Empresa());  
                System.out.println("ps = " + ps);
                ps.setString(2, campana.getRazon_Social());
                System.out.println("ps = " + ps);
                ps.setString(3, campana.getConcepto());
                System.out.println("ps = " + ps);
                ps.setDate(4, Metodos.convertirFechaStringToFechaDate(campana.getFecha_Inicio()));
                System.out.println("ps = " + ps);
                ps.setDate(5, Metodos.convertirFechaStringToFechaDate(campana.getFecha_Final()));
                System.out.println("ps = " + ps);
                ps.setString(6, campana.getComunicacion());
                System.out.println("ps = " + ps);
                ps.setInt(7,campana.getId_Campana());
                
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
