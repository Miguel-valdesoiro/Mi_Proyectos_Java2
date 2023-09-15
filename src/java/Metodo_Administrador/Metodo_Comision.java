
package Metodo_Administrador;



import domain.Comision;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;



/**
 *
 * @author pedro
 */
public class Metodo_Comision {

    private Connection conexion;

    public Metodo_Comision() {

        String url = "jdbc:mysql://localhost:3306/igualdad";
        String usuario = "root";
        String clave = "";

        try {
            //registramos el driver---> examen pregunta
            Class.forName("com.mysql.cj.jdbc.Driver");
            conexion = DriverManager.getConnection(url, usuario, clave);

        } catch (Exception e) {
            System.out.println("ERROR: CONEXION");
        }
    }

    
    public boolean insertarComision(Comision comision) {

        // preparamos la query
        boolean bandera = true;

        String query = "INSERT INTO comision(id_Empresa ,razon_Social,"
                + "tecnico1,tecnico2,tecnico3) VALUES(?,?,?,?,?);";

        try {
            PreparedStatement ps = conexion.prepareStatement(query);
            	
		ps.setInt(1, comision.getId_Empresa());  
                ps.setString(2, comision.getRazon_Social());
                ps.setString(3, comision.getTecnico1());
                ps.setString(4, comision.getTecnico2());
                ps.setString(5, comision.getTecnico3());
                
		
            ps.executeUpdate();
            ps.close();           
            
        } catch (Exception e) {
            bandera = false;
        }

        return bandera;
    }

   
    
     public boolean eliminarComision(int codigo){
        boolean bandera = true;
        
         String query = "DELETE FROM comision WHERE id_Comision= ?";
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
  
public boolean actualizarComision(Comision comision){
       boolean bandera = true; 
    
        String query= "UPDATE Comision SET id_Empresa=?,"
                + "razon_Social=?, tecnico1=?,tecnico1=2,tecnico1=3 WHERE id_Comision = ?;";
                 
        
        try{
            
            PreparedStatement ps = conexion.prepareStatement(query);
            	
		
                ps.setInt(1, comision.getId_Empresa());  
                ps.setString(2, comision.getRazon_Social());
                ps.setString(3, comision.getTecnico1());
                ps.setString(4, comision.getTecnico2());
                ps.setString(5, comision.getTecnico3());
                ps.setInt(6,comision.getId_Comision());
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
