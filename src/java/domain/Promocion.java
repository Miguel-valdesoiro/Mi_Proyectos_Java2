/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package domain;



public class Promocion {
    
    
    private String idProm;
    private int id_Empresa;
    private String razon_Social;
    private String puestoAnterior;
    private String parteEcon; //incremento de sueldo si o no?
    private int numPersProm; //numero total de personas candidatas al puesto
    private int numMujProm;//numero de mujeres candidatas al puesto
    private int numHomProm;//numero de hombres candidatos al puesto
    private String respProm;//responsable de la promocion
    private String puestoNuevo;
    private String fechaProm;

    
    public Promocion() {
   
    }     

   
    public Promocion(String idProm, int id_Empresa, String razon_Social, String puestoAnterior, String parteEcon, int numPersProm, int numMujProm, int numHomProm, String respProm, String puestoNuevo, String fechaProm) {
        this.idProm = idProm;
        this.id_Empresa = id_Empresa;
        this.razon_Social = razon_Social;
        this.puestoAnterior = puestoAnterior;
        this.parteEcon = parteEcon;
        this.numPersProm = numPersProm;
        this.numMujProm = numMujProm;
        this.numHomProm = numHomProm;
        this.respProm = respProm;
        this.puestoNuevo = puestoNuevo;
        this.fechaProm = fechaProm;
    }

    public String getIdProm() {
        return idProm;
    }

    public void setIdProm(String idProm) {
        this.idProm = idProm;
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

    public String getPuestoAnterior() {
        return puestoAnterior;
    }

    public void setPuestoAnterior(String puestoAnterior) {
        this.puestoAnterior = puestoAnterior;
    }

    public String getParteEcon() {
        return parteEcon;
    }

    public void setParteEcon(String parteEcon) {
        this.parteEcon = parteEcon;
    }

    public int getNumPersProm() {
        return numPersProm;
    }

    public void setNumPersProm(int numPersProm) {
        this.numPersProm = numPersProm;
    }

    public int getNumMujProm() {
        return numMujProm;
    }

    public void setNumMujProm(int numMujProm) {
        this.numMujProm = numMujProm;
    }

    public int getNumHomProm() {
        return numHomProm;
    }

    public void setNumHomProm(int numHomProm) {
        this.numHomProm = numHomProm;
    }

    public String getRespProm() {
        return respProm;
    }

    public void setRespProm(String respProm) {
        this.respProm = respProm;
    }

    public String getPuestoNuevo() {
        return puestoNuevo;
    }

    public void setPuestoNuevo(String puestoNuevo) {
        this.puestoNuevo = puestoNuevo;
    }

    public String getFechaProm() {
        return fechaProm;
    }

    public void setFechaProm(String fechaProm) {
        this.fechaProm = fechaProm;
    }

    @Override
    public String toString() {
        return "Promocion{" + "idProm=" + idProm + ", id_Empresa=" + id_Empresa + ", razon_Social=" + razon_Social + ", puestoAnterior=" + puestoAnterior + ", parteEcon=" + parteEcon + ", numPersProm=" + numPersProm + ", numMujProm=" + numMujProm + ", numHomProm=" + numHomProm + ", respProm=" + respProm + ", puestoNuevo=" + puestoNuevo + ", fechaProm=" + fechaProm + '}';
    }

   
}
