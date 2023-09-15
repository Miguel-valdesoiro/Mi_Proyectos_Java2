
package domain;


public class Comision {
    // definicion atributos
    private int id_Comision;
    private int id_Empresa;
    private String razon_Social;
    private String tecnico1;
    private String tecnico2;
    private String tecnico3;
    
    // constructor vacio

    public Comision() {
    }
    
    // constructor para insercciones

    public Comision(int id_Empresa, String razon_Social, String tecnico1, String tecnico2, String tecnico3) {
        this.id_Empresa = id_Empresa;
        this.razon_Social = razon_Social;
        this.tecnico1 = tecnico1;
        this.tecnico2 = tecnico2;
        this.tecnico3 = tecnico3;
    }
    
    // constructor para eliminacion y actualizacion valores

    public Comision(int id_Comision, int id_Empresa, String razon_Social, String tecnico1, String tecnico2, String tecnico3) {
        this.id_Comision = id_Comision;
        this.id_Empresa = id_Empresa;
        this.razon_Social = razon_Social;
        this.tecnico1 = tecnico1;
        this.tecnico2 = tecnico2;
        this.tecnico3 = tecnico3;
    }
    
    
    // hacemos los get y set

    public int getId_Comision() {
        return id_Comision;
    }

    public void setId_Comision(int id_Comision) {
        this.id_Comision = id_Comision;
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

    public String getTecnico1() {
        return tecnico1;
    }

    public void setTecnico1(String tecnico1) {
        this.tecnico1 = tecnico1;
    }

    public String getTecnico2() {
        return tecnico2;
    }

    public void setTecnico2(String tecnico2) {
        this.tecnico2 = tecnico2;
    }

    public String getTecnico3() {
        return tecnico3;
    }

    public void setTecnico3(String tecnico3) {
        this.tecnico3 = tecnico3;
    }
    
    // sobreescribirmos la impresion de los valores de la clase

    @Override
    public String toString() {
        return "Comision{" + "id_Comision=" + id_Comision + ", id_Empresa=" + id_Empresa + ", razon_Social=" + razon_Social + ", tecnico1=" + tecnico1 + ", tecnico2=" + tecnico2 + ", tecnico3=" + tecnico3 + '}';
    }
    
    
    
}
