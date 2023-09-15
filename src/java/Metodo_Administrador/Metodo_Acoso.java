
package Metodo_Administrador;



import domain.Acoso;
import domain.Promocion;
import entrada.Metodos;
import java.sql.Connection;
import java.sql.Date;
import java.sql.DriverManager;
import java.sql.PreparedStatement;



/**
 *
 * @author pedro
 */
public class Metodo_Acoso {

    private Connection conexion;

    public Metodo_Acoso() {

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

    
    public boolean insertarAcoso(Acoso acoso) {

        // preparamos la query
        boolean bandera = true;

        String query = "INSERT INTO acoso(id_Empresa ,razon_Social,"
                + "tipo_Acoso,fecha_Alta,protocolo) VALUES(?,?,?,?,?);";

        try {
            PreparedStatement ps = conexion.prepareStatement(query);
            	ps.setInt(1, acoso.getId_Empresa());
		ps.setString(2, acoso.getRazon_Social());
                ps.setString(3, acoso.getTipo_Acoso());
                ps.setDate(4, Metodos.convertirFechaStringToFechaDate(acoso.getFecha_Alta()));
            	ps.setString(5, acoso.getProtocolo());
		
            ps.executeUpdate();
            ps.close();           
            
        } catch (Exception e) {
            bandera = false;
        }

        return bandera;
    }

   
    
     public boolean eliminarAcoso(int codigo){
        boolean bandera = true;
        
         String query = "DELETE FROM acoso WHERE id_Acoso= ?";
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
  
public boolean actualizarAcoso(Acoso acoso){
       boolean bandera = true; 
    
        String query= "UPDATE Acoso SET id_Empresa=?,razon_Social=?, "
                + "tipo_Acoso=?,fecha_Alta=?, \n" +
"                protocolo =? WHERE id_Acoso =?";
                 
        
        try{
            
            PreparedStatement ps = conexion.prepareStatement(query);
            	
		ps.setInt(1, acoso.getId_Empresa());
                ps.setString(2,acoso.getRazon_Social());
            	ps.setString(3, acoso.getTipo_Acoso());
           	ps.setDate(4, Date.valueOf(acoso.getFecha_Alta()));
                ps.setString(5,acoso.getProtocolo());
                ps.setInt(6,acoso.getId_Acoso());
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
