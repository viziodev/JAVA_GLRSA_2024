package entities;

public class Patient {
     private static int nbrePatient;
    
    private int id;
     private String numero;
     private String nomComplet;
     private String telephone;
  

    public static int getNbrePatient() {
        return ++nbrePatient;
    }
    public Patient(String numero, String nomComplet, String telephone) {
        this.numero = numero;
        this.nomComplet = nomComplet;
        this.telephone = telephone;
    }
    public Patient() {
   
    }
    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public String getNumero() {
        return numero;
    }
    public void setNumero(String numero) {
        this.numero = numero;
    }
    public String getNomComplet() {
        return nomComplet;
    }
    public void setNomComplet(String nomComplet) {
        this.nomComplet = nomComplet;
    }
    public String getTelephone() {
        return telephone;
    }
    public void setTelephone(String telephone) {
        this.telephone = telephone;
    }
    @Override
    public String toString() {
        return "Patient [id=" + id + ", numero=" + numero + ", nomComplet=" + nomComplet + ", telephone=" + telephone
                + "]";
    }

     



}
