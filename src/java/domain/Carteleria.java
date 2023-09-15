
package domain;


public class Carteleria {
    private int id_Carteleria;
    private int id_Campana;
    private String archivo;
    
    
    // constructor vacio

    public Carteleria() {
    }

    // constructor para insercciones de datos
    
    public Carteleria(int id_Campana, String archivo) {
        this.id_Campana = id_Campana;
        this.archivo = archivo;
    }
    
    // constructor para actualización y eliminacion de datos

    public Carteleria(int id_Carteleria, int id_Campana, String archivo) {
        this.id_Carteleria = id_Carteleria;
        this.id_Campana = id_Campana;
        this.archivo = archivo;
    }
    
    
    // hacemos los get y set

    public int getId_Carteleria() {
        return id_Carteleria;
    }

    public void setId_Carteleria(int id_Carteleria) {
        this.id_Carteleria = id_Carteleria;
    }

    public int getId_Campana() {
        return id_Campana;
    }

    public void setId_Campana(int id_Campana) {
        this.id_Campana = id_Campana;
    }

    public String getArchivo() {
        return archivo;
    }

    public void setArchivo(String archivo) {
        this.archivo = archivo;
    }
    
    
    // sobreescribos el metodo de impresion de los atributos

    @Override
    public String toString() {
        return "Carteleria{" + "id_Carteleria=" + id_Carteleria + ", id_Campana=" + id_Campana + ", archivo=" + archivo + '}';
    }
    
    
        
    
    
    
}
