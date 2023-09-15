
package domain;


public class Campana {
     // declaracion de atributos
    private int id_Campana;
    private int id_Empresa;
    private String razon_Social;
    private String concepto;
    private String fecha_Inicio;
    private String fecha_Final;
    private String comunicacion;
    
    // constructor vacio

    public Campana() {
    }
    
    // constructor para inserccion de datos

    public Campana(int id_Empresa, String razon_Social, String concepto, String fecha_Inicio, String fecha_Final, String comunicacion) {
        this.id_Empresa = id_Empresa;
        this.razon_Social = razon_Social;
        this.concepto = concepto;
        this.fecha_Inicio = fecha_Inicio;
        this.fecha_Final = fecha_Final;
        this.comunicacion = comunicacion;
    }

   
    
    
    // constructor para actualizacion y eliminacion de campanas

    public Campana(int id_Campana, int id_Empresa, String razon_Social, String concepto, String fecha_Inicio, String fecha_Final, String comunicacion) {
        this.id_Campana = id_Campana;
        this.id_Empresa = id_Empresa;
        this.razon_Social = razon_Social;
        this.concepto = concepto;
        this.fecha_Inicio = fecha_Inicio;
        this.fecha_Final = fecha_Final;
        this.comunicacion = comunicacion;
    }

    // hacemos los get y set
    public int getId_Campana() {
        return id_Campana;
    }

    public void setId_Campana(int id_Campana) {
        this.id_Campana = id_Campana;
    }

    public int getId_Empresa() {
        return id_Empresa;
    }

    public void setId_Empresa(int id_Empresa) {
        this.id_Empresa = id_Empresa;
    }

    public String getRazon_Social() {
        return razon_Social;
    }

    public void setRazon_Social(String razon_Social) {
        this.razon_Social = razon_Social;
    }

    
    public String getConcepto() {
        return concepto;
    }

    public void setConcepto(String concepto) {
        this.concepto = concepto;
    }

    public String getFecha_Inicio() {
        return fecha_Inicio;
    }

    public void setFecha_Inicio(String fecha_Inicio) {
        this.fecha_Inicio = fecha_Inicio;
    }

    public String getFecha_Final() {
        return fecha_Final;
    }

    public void setFecha_Final(String fecha_Final) {
        this.fecha_Final = fecha_Final;
    }

    public String getComunicacion() {
        return comunicacion;
    }

    public void setComunicacion(String comunicacion) {
        this.comunicacion = comunicacion;
    }
    
    
    // aobreescribimos el metodo con todos los atributos

    @Override
    public String toString() {
        return "Campa\u00f1a{" + "id_Campa\u00f1a=" + id_Campana + ", id_Empresa=" + id_Empresa + ", razon_Social=" + razon_Social + ", concepto=" + concepto + ", fecha_Inicio=" + fecha_Inicio + ", fecha_Final=" + fecha_Final + ", comunicacion=" + comunicacion + '}';
    }

    
    
    
    
    
}
