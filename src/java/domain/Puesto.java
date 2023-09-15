
package domain;


public class Puesto {
    
    private int id_Puesto;
    private String nombre_Puesto;
    private int id_Empresa;
    private String razon_Social;
    private int mujeres_Puesto;
    private int hombres_Puesto;;
    
    
    // constructor vacio

    public Puesto() {
    }
    
    //constructor para inserccion de nuevos Puestos

    public Puesto(String nombre_Puesto, int id_Empresa, String razon_Social, int mujeres_Puesto, int hombres_Puesto) {
        this.nombre_Puesto = nombre_Puesto;
        this.id_Empresa = id_Empresa;
        this.razon_Social = razon_Social;
        this.mujeres_Puesto = mujeres_Puesto;
        this.hombres_Puesto = hombres_Puesto;
    }
    
    // constructor para Actualizacion y Eliminacion de Puesto

    public Puesto(int id_Puesto, String nombre_Puesto, int id_Empresa, String razon_Social, int mujeres_Puesto, int hombres_Puesto) {
        this.id_Puesto = id_Puesto;
        this.nombre_Puesto = nombre_Puesto;
        this.id_Empresa = id_Empresa;
        this.razon_Social = razon_Social;
        this.mujeres_Puesto = mujeres_Puesto;
        this.hombres_Puesto = hombres_Puesto;
    }
    
    // Metodos get y set

    public int getId_Puesto() {
        return id_Puesto;
    }

    public void setId_Puesto(int id_Puesto) {
        this.id_Puesto = id_Puesto;
    }

    public String getNombre_Puesto() {
        return nombre_Puesto;
    }

    public void setNombre_Puesto(String nombre_Puesto) {
        this.nombre_Puesto = nombre_Puesto;
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

    public int getMujeres_Puesto() {
        return mujeres_Puesto;
    }

    public void setMujeres_Puesto(int mujeres_Puesto) {
        this.mujeres_Puesto = mujeres_Puesto;
    }

    public int getHombres_Puesto() {
        return hombres_Puesto;
    }

    public void setHombres_Puesto(int hombres_Puesto) {
        this.hombres_Puesto = hombres_Puesto;
    }
    
    
    //metoso sobreescritura de todos los atributos de la clase

    @Override
    public String toString() {
        return "Puesto{" + "id_Puesto=" + id_Puesto + ", nombre_Puesto=" + nombre_Puesto + ", id_Empresa=" + id_Empresa + ", razon_Social=" + razon_Social + ", mujeres_Puesto=" + mujeres_Puesto + ", hombres_Puesto=" + hombres_Puesto + '}';
    }
    
}
