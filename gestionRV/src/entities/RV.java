package entities;


import java.time.LocalDate;
import java.time.LocalTime;

import enums.Etat;
import enums.Specialite;

public class RV extends AbstractEntity{
    private static int nbreRv;
    private String  motif;
    private LocalDate date;
    private LocalTime heure;
    //Navigabilite ==> ManyToOne
    private Patient patient;
    private Etat etat;
    private Specialite specialite;
   

    public RV() {
        
    }

    public static int getNbreRv() {
        return ++nbreRv;
    }
    

    public String getMotif() {
        return motif;
    }

    public void setMotif(String motif) {
        this.motif = motif;
    }

  


    public LocalDate getDate() {
        return date;
    }

    public void setDate(LocalDate date) {
        this.date = date;
    }

    public LocalTime getHeure() {
        return heure;
    }

    public void setHeure(LocalTime heure) {
        this.heure = heure;
    }

    public Patient getPatient() {
        return patient;
    }

    public void setPatient(Patient patient) {
        this.patient = patient;
    }

    public Etat getEtat() {
        return etat;
    }

    public void setEtat(Etat etat) {
        this.etat = etat;
    }

    public Specialite getSpecialite() {
        return specialite;
    }

    public void setSpecialite(Specialite specialite) {
        this.specialite = specialite;
    }

    @Override
    public String toString() {
        return "RV [id=" + id + ", numero=" + numero + ", motif=" + motif + ", date=" + date + ", heure=" + heure
                + ", patient=" + patient + ", etat=" + etat + ", specialite=" + specialite + "]";
    }



}
