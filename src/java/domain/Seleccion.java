package domain;

public class Seleccion {

    private int id_Seleccion;
    private int id_Empresa;
    private String razon_Social;
    private String id_puesto;
    private String criterio_Seleccion;
    private String anuncio_Seleccion;
    private String responsable_Seleccion;
    private String genero_Responsable;
    private String genero_Seleccion;
    private String tipo_Seleccion;
    private int numero_hombres;
    private int numero_mujeres;

    public Seleccion() {
    }

    public Seleccion(int id_Empresa, String razon_Social, String id_puesto, String criterio_Seleccion, String anuncio_Seleccion, String responsable_Seleccion, String genero_Responsable, String genero_Seleccion, String tipo_Seleccion, int numero_hombres, int numero_mujeres) {
        this.id_Empresa = id_Empresa;
        this.razon_Social = razon_Social;
        this.id_puesto = id_puesto;
        this.criterio_Seleccion = criterio_Seleccion;
        this.anuncio_Seleccion = anuncio_Seleccion;
        this.responsable_Seleccion = responsable_Seleccion;
        this.genero_Responsable = genero_Responsable;
        this.genero_Seleccion = genero_Seleccion;
        this.tipo_Seleccion = tipo_Seleccion;
        this.numero_hombres = numero_hombres;
        this.numero_mujeres = numero_mujeres;
    }

    public Seleccion(int id_Seleccion, int id_Empresa, String razon_Social, String id_puesto, String criterio_Seleccion, String anuncio_Seleccion, String responsable_Seleccion, String genero_Responsable, String genero_Seleccion, String tipo_Seleccion, int numero_hombres, int numero_mujeres) {
        this.id_Seleccion = id_Seleccion;
        this.id_Empresa = id_Empresa;
        this.razon_Social = razon_Social;
        this.id_puesto = id_puesto;
        this.criterio_Seleccion = criterio_Seleccion;
        this.anuncio_Seleccion = anuncio_Seleccion;
        this.responsable_Seleccion = responsable_Seleccion;
        this.genero_Responsable = genero_Responsable;
        this.genero_Seleccion = genero_Seleccion;
        this.tipo_Seleccion = tipo_Seleccion;
        this.numero_hombres = numero_hombres;
        this.numero_mujeres = numero_mujeres;
    }

    public int getId_Seleccion() {
        return id_Seleccion;
    }

    public void setId_Seleccion(int id_Seleccion) {
        this.id_Seleccion = id_Seleccion;
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

    public String getId_puesto() {
        return id_puesto;
    }

    public void setId_puesto(String id_puesto) {
        this.id_puesto = id_puesto;
    }

    public String getCriterio_Seleccion() {
        return criterio_Seleccion;
    }

    public void setCriterio_Seleccion(String criterio_Seleccion) {
        this.criterio_Seleccion = criterio_Seleccion;
    }

    public String getAnuncio_Seleccion() {
        return anuncio_Seleccion;
    }

    public void setAnuncio_Seleccion(String anuncio_Seleccion) {
        this.anuncio_Seleccion = anuncio_Seleccion;
    }

    public String getResponsable_Seleccion() {
        return responsable_Seleccion;
    }

    public void setResponsable_Seleccion(String responsable_Seleccion) {
        this.responsable_Seleccion = responsable_Seleccion;
    }

    public String getGenero_Responsable() {
        return genero_Responsable;
    }

    public void setGenero_Responsable(String genero_Responsable) {
        this.genero_Responsable = genero_Responsable;
    }

    public String getGenero_Seleccion() {
        return genero_Seleccion;
    }

    public void setGenero_Seleccion(String genero_Seleccion) {
        this.genero_Seleccion = genero_Seleccion;
    }

    public String getTipo_Seleccion() {
        return tipo_Seleccion;
    }

    public void setTipo_Seleccion(String tipo_Seleccion) {
        this.tipo_Seleccion = tipo_Seleccion;
    }

    public int getNumero_hombres() {
        return numero_hombres;
    }

    public void setNumero_hombres(int numero_hombres) {
        this.numero_hombres = numero_hombres;
    }

    public int getNumero_mujeres() {
        return numero_mujeres;
    }

    public void setNumero_mujeres(int numero_mujeres) {
        this.numero_mujeres = numero_mujeres;
    }

    @Override
    public String toString() {
        return "Seleccion{" + "id_Seleccion=" + id_Seleccion + ", id_Empresa=" + id_Empresa + ", razon_Social=" + razon_Social + ", id_puesto=" + id_puesto + ", criterio_Seleccion=" + criterio_Seleccion + ", anuncio_Seleccion=" + anuncio_Seleccion + ", responsable_Seleccion=" + responsable_Seleccion + ", genero_Responsable=" + genero_Responsable + ", genero_Seleccion=" + genero_Seleccion + ", tipo_Seleccion=" + tipo_Seleccion + ", numero_hombres=" + numero_hombres + ", numero_mujeres=" + numero_mujeres + '}';
    }

   
    
}
