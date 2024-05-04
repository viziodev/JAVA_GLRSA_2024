package entities;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Commande {
    private int id;  
    private String mumero;
    private LocalDate dateCmde; 
    private double montant;
    private static int nbre;
    private List<ProduitCommande> produitCommandes=new ArrayList<>();
    private Facture facture;

    
    public Commande(int id, String mumero, LocalDate dateCmde, double montant) {
        this.id = id;
        this.mumero = mumero;
        this.dateCmde = dateCmde;
        this.montant = montant;
    }
    public Commande() {
        id=++nbre;
    }
    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public String getMumero() {
        return mumero;
    }
    public void setMumero(String mumero) {
        this.mumero = mumero;
    }
    public LocalDate getDateCmde() {
        return dateCmde;
    }
    public void setDateCmde(LocalDate dateCmde) {
        this.dateCmde = dateCmde;
    }
    public double getMontant() {
        return montant;
    }
    public void setMontant(double montant) {
        this.montant = montant;
    }
    @Override
    public String toString() {
        return "Commande [id=" + id + ", mumero=" + mumero + ", dateCmde=" + dateCmde + ", montant=" + montant + "]";
    }
}
