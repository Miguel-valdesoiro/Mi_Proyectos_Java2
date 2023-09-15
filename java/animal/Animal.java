package animal;

public class Animal {
     private String idAnimal;
      private String nombreVulgar;
    private String nombreCientifico;
    private String familia;
    private int peligroExtinsion;
   private String foto;
   
    public Animal(String idAnimal, String nombreVulgar, String nombreCientifico, String familia, int peligroExtinsion, String foto) {
        this.idAnimal = idAnimal;
        this.nombreVulgar = nombreVulgar;
        this.nombreCientifico = nombreCientifico;
        this.familia = familia;
        this.peligroExtinsion = peligroExtinsion;
        this.foto = foto;
    }

    public Animal() {
    }

    public String getIdAnimal() {
        return idAnimal;
    }

    public void setIdAnimal(String idAnimal) {
        this.idAnimal = idAnimal;
    }

    public String getNombreVulgar() {
        return nombreVulgar;
    }

    public void setNombreVulgar(String nombreVulgar) {
        this.nombreVulgar = nombreVulgar;
    }

    public String getNombreCientifico() {
        return nombreCientifico;
    }

    public void setNombreCientifico(String nombreCientifico) {
        this.nombreCientifico = nombreCientifico;
    }

    public String getFamilia() {
        return familia;
    }

    public void setFamilia(String familia) {
        this.familia = familia;
    }

    public int getPeligroExtinsion() {
        return peligroExtinsion;
    }

    public void setPeligroExtinsion(int peligroExtinsion) {
        this.peligroExtinsion = peligroExtinsion;
    }

    public String getFoto() {
        return foto;
    }

    public void setFoto(String foto) {
        this.foto = foto;
    }

    @Override
    public String toString() {
        return "Animal{" + "idAnimal=" + idAnimal + ", nombreVulgar=" + nombreVulgar + ", nombreCientifico=" + nombreCientifico + ", familia=" + familia + ", peligroExtinsion=" + peligroExtinsion + ", foto=" + foto + '}';
    }
  


}