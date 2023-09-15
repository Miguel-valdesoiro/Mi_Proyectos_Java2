
package domain;




public class Acoso {
    private int id_Acoso;
    private int id_Empresa;
    private String razon_Social;
    private String tipo_Acoso;
    private String fecha_Alta;
    private String protocolo;
    
    // constructor vacio

    public Acoso() {
    }

    // constructor para Insercciones nuevas
    public Acoso(int id_Empresa, String razon_Social, String tipo_Acoso,String fecha_Alta, String protocolo) {
        this.id_Empresa = id_Empresa;
        this.razon_Social = razon_Social;
        this.tipo_Acoso = tipo_Acoso;
        this.fecha_Alta = fecha_Alta;
        this.protocolo = protocolo;
    }

        //Constructor para actualizacion y eliminacion
    public Acoso(int id_Acoso, int id_Empresa, String razon_Social, String tipo_Acoso, String fecha_Alta, String protocolo) {
        this.id_Acoso = id_Acoso;
        this.id_Empresa = id_Empresa;
        this.razon_Social = razon_Social;
        this.tipo_Acoso = tipo_Acoso;
        this.fecha_Alta = fecha_Alta;
        this.protocolo = protocolo;
    }
    
    //metodos get y Set
    public int getId_Acoso() {
        return id_Acoso;
    }

    public void setId_Acoso(int id_Acoso) {
        this.id_Acoso = id_Acoso;
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

    public String getTipo_Acoso() {
        return tipo_Acoso;
    }

    public void setTipo_Acoso(String tipo_Acoso) {
        this.tipo_Acoso = tipo_Acoso;
    }

    public String getFecha_Alta() {
        return fecha_Alta;
    }

    public void setFecha_Alta(String fecha_Alta) {
        this.fecha_Alta = fecha_Alta;
    }

    public String getProtocolo() {
        return protocolo;
    }

    public void setProtocolo(String protocolo) {
        this.protocolo = protocolo;
    }

    //metodo sobreescritura de los Atributos de la clase
    @Override
    public String toString() {
        return "Acoso{" + "id_Acoso=" + id_Acoso + ", id_Empresa=" + id_Empresa + ", razon_Social=" + razon_Social + ", tipo_Acoso=" + tipo_Acoso + ", fecha_Alta=" + fecha_Alta + ", protocolo=" + protocolo + '}';
    }

   
    
    
    
}
