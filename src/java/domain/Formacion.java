package domain;

import java.util.Date;

public class Formacion {
    
    private String id_Formacion;
    private String horario;
    private String fuera_Horario_Laboral;
    private String voluntariado;
    private String modalidad;
    private String horas_Totales;
    private int numero_Mujeres;
    private int numero_Hombres;
    private String criterio_Seleccion;
    private String informar_Seleccion;
    private int id_Empresa;
    private String razon_social;
    private String Observaciones_Formacion;
    private String fecha_Inicio;

    public Formacion() {
    }
    // constructor para insercciones
    public Formacion(String horario, String fuera_Horario_Laboral, 
            String voluntariado, String modalidad, String horas_Totales, 
            int numero_Mujeres, int numero_Hombres, String criterio_Seleccion, 
            String informar_Seleccion, int id_Empresa, String razon_social, 
            String Observaciones_Formacion, String fecha_Inicio) {
        this.horario = horario;
        this.fuera_Horario_Laboral = fuera_Horario_Laboral;
        this.voluntariado = voluntariado;
        this.modalidad = modalidad;
        this.horas_Totales = horas_Totales;
        this.numero_Mujeres = numero_Mujeres;
        this.numero_Hombres = numero_Hombres;
        this.criterio_Seleccion = criterio_Seleccion;
        this.informar_Seleccion = informar_Seleccion;
        this.id_Empresa = id_Empresa;
        this.razon_social = razon_social;
        this.Observaciones_Formacion = Observaciones_Formacion;
        this.fecha_Inicio = fecha_Inicio;
    }
    
    // constructor para eliminar y actualizar

    public Formacion(String id_Formacion, String horario, 
            String fuera_Horario_Laboral, String voluntariado, String modalidad,
            String horas_Totales, int numero_Mujeres, int numero_Hombres,
            String criterio_Seleccion, String informar_Seleccion, 
            int id_Empresa, String razon_social, String Observaciones_Formacion,
            String fecha_Inicio) {
        this.id_Formacion = id_Formacion;
        this.horario = horario;
        this.fuera_Horario_Laboral = fuera_Horario_Laboral;
        this.voluntariado = voluntariado;
        this.modalidad = modalidad;
        this.horas_Totales = horas_Totales;
        this.numero_Mujeres = numero_Mujeres;
        this.numero_Hombres = numero_Hombres;
        this.criterio_Seleccion = criterio_Seleccion;
        this.informar_Seleccion = informar_Seleccion;
        this.id_Empresa = id_Empresa;
        this.razon_social = razon_social;
        this.Observaciones_Formacion = Observaciones_Formacion;
        this.fecha_Inicio = fecha_Inicio;
    }
    
    
    // metodos get y set

    public String getId_Formacion() {
        return id_Formacion;
    }

    public void setId_Formacion(String id_Formacion) {
        this.id_Formacion = id_Formacion;
    }

    public String getHorario() {
        return horario;
    }

    public void setHorario(String horario) {
        this.horario = horario;
    }

    public String getFuera_Horario_Laboral() {
        return fuera_Horario_Laboral;
    }

    public void setFuera_Horario_Laboral(String fuera_Horario_Laboral) {
        this.fuera_Horario_Laboral = fuera_Horario_Laboral;
    }

    public String getVoluntariado() {
        return voluntariado;
    }

    public void setVoluntariado(String voluntariado) {
        this.voluntariado = voluntariado;
    }

    public String getModalidad() {
        return modalidad;
    }

    public void setModalidad(String modalidad) {
        this.modalidad = modalidad;
    }

    public String getHoras_Totales() {
        return horas_Totales;
    }

    public void setHoras_Totales(String horas_Totales) {
        this.horas_Totales = horas_Totales;
    }

    public int getNumero_Mujeres() {
        return numero_Mujeres;
    }

    public void setNumero_Mujeres(int numero_Mujeres) {
        this.numero_Mujeres = numero_Mujeres;
    }

    public int getNumero_Hombres() {
        return numero_Hombres;
    }

    public void setNumero_Hombres(int numero_Hombres) {
        this.numero_Hombres = numero_Hombres;
    }

    public String getCriterio_Seleccion() {
        return criterio_Seleccion;
    }

    public void setCriterio_Seleccion(String criterio_Seleccion) {
        this.criterio_Seleccion = criterio_Seleccion;
    }

    public String getInformar_Seleccion() {
        return informar_Seleccion;
    }

    public void setInformar_Seleccion(String informar_Seleccion) {
        this.informar_Seleccion = informar_Seleccion;
    }

    public int getId_Empresa() {
        return id_Empresa;
    }

    public void setId_Empresa(int id_Empresa) {
        this.id_Empresa = id_Empresa;
    }

    public String getRazon_social() {
        return razon_social;
    }

    public void setRazon_social(String razon_social) {
        this.razon_social = razon_social;
    }

    public String getObservaciones_Formacion() {
        return Observaciones_Formacion;
    }

    public void setObservaciones_Formacion(String Observaciones_Formacion) {
        this.Observaciones_Formacion = Observaciones_Formacion;
    }

    public String getFecha_Inicio() {
        return fecha_Inicio;
    }

    public void setFecha_Inicio(String fecha_Inicio) {
        this.fecha_Inicio = fecha_Inicio;
    }

   // metodo sobreescritura de los atributos
    @Override
    public String toString() {
        return "Formacion{" + "id_Formacion=" + id_Formacion + ", horario=" + horario + ", fuera_Horario_Laboral=" + fuera_Horario_Laboral + ", voluntariado=" + voluntariado + ", modalidad=" + modalidad + ", horas_Totales=" + horas_Totales + ", numero_Mujeres=" + numero_Mujeres + ", numero_Hombres=" + numero_Hombres + ", criterio_Seleccion=" + criterio_Seleccion + ", informar_Seleccion=" + informar_Seleccion + ", id_Empresa=" + id_Empresa + ", razon_social=" + razon_social + ", Observaciones_Formacion=" + Observaciones_Formacion + ", fecha_Inicio=" + fecha_Inicio + '}';
    }
    
    
    
    
    
    
    
    
    
}

