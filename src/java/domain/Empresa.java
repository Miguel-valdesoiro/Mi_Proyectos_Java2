
package domain;

import java.util.Date;

public class Empresa {
    
    private int id_Empresa;
    private String razon_Social;
    private String cif_Empresa;
    private String domicilio_Social;
    private String forma_Juridica;
    private String year_Constitucion;
    private String responsable_Empresa;
    private String cargo_Responsable_Empresa;
    private String sector_Empresa;
    private String cnae_Empresa;
    private String convenio_Colectivo_Empresa;
    private int mujeres_Empresa;
    private int hombres_Empresa;
    private String centros_Empresa;
    private String contacto_empresa;
    private String mail_Empresa;
    private String telefono_Empresa;
    private String usu_alta;
    private String fecha_inicio_contrato;
    private String fecha_final_contrato;
    private String fecha_inicio_plan_igualdad;
    private String fecha_final_plan_igualdad;

    public Empresa() {
    }

  
    public Empresa(String razon_Social, String cif_Empresa, String domicilio_Social, String forma_Juridica, String year_Constitucion, String responsable_Empresa, String cargo_Responsable_Empresa, String sector_Empresa, String cnae_Empresa, String convenio_Colectivo_Empresa, int mujeres_Empresa, int hombres_Empresa, String centros_Empresa, String contacto_empresa, String mail_Empresa, String telefono_Empresa, String usu_alta, String fecha_inicio_contrato, String fecha_final_contrato, String fecha_inicio_plan_igualdad, String fecha_final_plan_igualdad) {
        this.razon_Social = razon_Social;
        this.cif_Empresa = cif_Empresa;
        this.domicilio_Social = domicilio_Social;
        this.forma_Juridica = forma_Juridica;
        this.year_Constitucion = year_Constitucion;
        this.responsable_Empresa = responsable_Empresa;
        this.cargo_Responsable_Empresa = cargo_Responsable_Empresa;
        this.sector_Empresa = sector_Empresa;
        this.cnae_Empresa = cnae_Empresa;
        this.convenio_Colectivo_Empresa = convenio_Colectivo_Empresa;
        this.mujeres_Empresa = mujeres_Empresa;
        this.hombres_Empresa = hombres_Empresa;
        this.centros_Empresa = centros_Empresa;
        this.contacto_empresa = contacto_empresa;
        this.mail_Empresa = mail_Empresa;
        this.telefono_Empresa = telefono_Empresa;
        this.usu_alta = usu_alta;
        this.fecha_inicio_contrato = fecha_inicio_contrato;
        this.fecha_final_contrato = fecha_final_contrato;
        this.fecha_inicio_plan_igualdad = fecha_inicio_plan_igualdad;
        this.fecha_final_plan_igualdad = fecha_final_plan_igualdad;
    }

    public Empresa(int id_Empresa, String razon_Social, String cif_Empresa, String domicilio_Social, String forma_Juridica, String year_Constitucion, String responsable_Empresa, String cargo_Responsable_Empresa, String sector_Empresa, String cnae_Empresa, String convenio_Colectivo_Empresa, int mujeres_Empresa, int hombres_Empresa, String centros_Empresa, String contacto_empresa, String mail_Empresa, String telefono_Empresa, String usu_alta, String fecha_inicio_contrato, String fecha_final_contrato, String fecha_inicio_plan_igualdad, String fecha_final_plan_igualdad) {
        this.id_Empresa = id_Empresa;
        this.razon_Social = razon_Social;
        this.cif_Empresa = cif_Empresa;
        this.domicilio_Social = domicilio_Social;
        this.forma_Juridica = forma_Juridica;
        this.year_Constitucion = year_Constitucion;
        this.responsable_Empresa = responsable_Empresa;
        this.cargo_Responsable_Empresa = cargo_Responsable_Empresa;
        this.sector_Empresa = sector_Empresa;
        this.cnae_Empresa = cnae_Empresa;
        this.convenio_Colectivo_Empresa = convenio_Colectivo_Empresa;
        this.mujeres_Empresa = mujeres_Empresa;
        this.hombres_Empresa = hombres_Empresa;
        this.centros_Empresa = centros_Empresa;
        this.contacto_empresa = contacto_empresa;
        this.mail_Empresa = mail_Empresa;
        this.telefono_Empresa = telefono_Empresa;
        this.usu_alta = usu_alta;
        this.fecha_inicio_contrato = fecha_inicio_contrato;
        this.fecha_final_contrato = fecha_final_contrato;
        this.fecha_inicio_plan_igualdad = fecha_inicio_plan_igualdad;
        this.fecha_final_plan_igualdad = fecha_final_plan_igualdad;
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

    public String getCif_Empresa() {
        return cif_Empresa;
    }

    public void setCif_Empresa(String cif_Empresa) {
        this.cif_Empresa = cif_Empresa;
    }

    public String getDomicilio_Social() {
        return domicilio_Social;
    }

    public void setDomicilio_Social(String domicilio_Social) {
        this.domicilio_Social = domicilio_Social;
    }

    public String getForma_Juridica() {
        return forma_Juridica;
    }

    public void setForma_Juridica(String forma_Juridica) {
        this.forma_Juridica = forma_Juridica;
    }

    public String getYear_Constitucion() {
        return year_Constitucion;
    }

    public void setYear_Constitucion(String year_Constitucion) {
        this.year_Constitucion = year_Constitucion;
    }

    public String getResponsable_Empresa() {
        return responsable_Empresa;
    }

    public void setResponsable_Empresa(String responsable_Empresa) {
        this.responsable_Empresa = responsable_Empresa;
    }

    public String getCargo_Responsable_Empresa() {
        return cargo_Responsable_Empresa;
    }

    public void setCargo_Responsable_Empresa(String cargo_Responsable_Empresa) {
        this.cargo_Responsable_Empresa = cargo_Responsable_Empresa;
    }

    public String getSector_Empresa() {
        return sector_Empresa;
    }

    public void setSector_Empresa(String sector_Empresa) {
        this.sector_Empresa = sector_Empresa;
    }

    public String getCnae_Empresa() {
        return cnae_Empresa;
    }

    public void setCnae_Empresa(String cnae_Empresa) {
        this.cnae_Empresa = cnae_Empresa;
    }

    public String getConvenio_Colectivo_Empresa() {
        return convenio_Colectivo_Empresa;
    }

    public void setConvenio_Colectivo_Empresa(String convenio_Colectivo_Empresa) {
        this.convenio_Colectivo_Empresa = convenio_Colectivo_Empresa;
    }

    public int getMujeres_Empresa() {
        return mujeres_Empresa;
    }

    public void setMujeres_Empresa(int mujeres_Empresa) {
        this.mujeres_Empresa = mujeres_Empresa;
    }

    public int getHombres_Empresa() {
        return hombres_Empresa;
    }

    public void setHombres_Empresa(int hombres_Empresa) {
        this.hombres_Empresa = hombres_Empresa;
    }

    public String getCentros_Empresa() {
        return centros_Empresa;
    }

    public void setCentros_Empresa(String centros_Empresa) {
        this.centros_Empresa = centros_Empresa;
    }

    public String getContacto_empresa() {
        return contacto_empresa;
    }

    public void setContacto_empresa(String contacto_empresa) {
        this.contacto_empresa = contacto_empresa;
    }

    public String getMail_Empresa() {
        return mail_Empresa;
    }

    public void setMail_Empresa(String mail_Empresa) {
        this.mail_Empresa = mail_Empresa;
    }

    public String getTelefono_Empresa() {
        return telefono_Empresa;
    }

    public void setTelefono_Empresa(String telefono_Empresa) {
        this.telefono_Empresa = telefono_Empresa;
    }

    public String getUsu_alta() {
        return usu_alta;
    }

    public void setUsu_alta(String usu_alta) {
        this.usu_alta = usu_alta;
    }

    public String getFecha_inicio_contrato() {
        return fecha_inicio_contrato;
    }

    public void setFecha_inicio_contrato(String fecha_inicio_contrato) {
        this.fecha_inicio_contrato = fecha_inicio_contrato;
    }

    public String getFecha_final_contrato() {
        return fecha_final_contrato;
    }

    public void setFecha_final_contrato(String fecha_final_contrato) {
        this.fecha_final_contrato = fecha_final_contrato;
    }

    public String getFecha_inicio_plan_igualdad() {
        return fecha_inicio_plan_igualdad;
    }

    public void setFecha_inicio_plan_igualdad(String fecha_inicio_plan_igualdad) {
        this.fecha_inicio_plan_igualdad = fecha_inicio_plan_igualdad;
    }

    public String getFecha_final_plan_igualdad() {
        return fecha_final_plan_igualdad;
    }

    public void setFecha_final_plan_igualdad(String fecha_final_plan_igualdad) {
        this.fecha_final_plan_igualdad = fecha_final_plan_igualdad;
    }

    @Override
    public String toString() {
        return "Empresa{" + "id_Empresa=" + id_Empresa + ", razon_Social=" + razon_Social + ", cif_Empresa=" + cif_Empresa + ", domicilio_Social=" + domicilio_Social + ", forma_Juridica=" + forma_Juridica + ", year_Constitucion=" + year_Constitucion + ", responsable_Empresa=" + responsable_Empresa + ", cargo_Responsable_Empresa=" + cargo_Responsable_Empresa + ", sector_Empresa=" + sector_Empresa + ", cnae_Empresa=" + cnae_Empresa + ", convenio_Colectivo_Empresa=" + convenio_Colectivo_Empresa + ", mujeres_Empresa=" + mujeres_Empresa + ", hombres_Empresa=" + hombres_Empresa + ", centros_Empresa=" + centros_Empresa + ", contacto_empresa=" + contacto_empresa + ", mail_Empresa=" + mail_Empresa + ", telefono_Empresa=" + telefono_Empresa + ", usu_alta=" + usu_alta + ", fecha_inicio_contrato=" + fecha_inicio_contrato + ", fecha_final_contrato=" + fecha_final_contrato + ", fecha_inicio_plan_igualdad=" + fecha_inicio_plan_igualdad + ", fecha_final_plan_igualdad=" + fecha_final_plan_igualdad + '}';
    }

    
   
    
}


