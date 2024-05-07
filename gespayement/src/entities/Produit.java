package entities;

import java.util.ArrayList;
import java.util.List;

public class Produit {
    private int id;  
    private String libelle;
    private int qteStock; 
    private double prix;
    private static int nbre;
    private List<ProduitCommande> produitCommandes=new ArrayList<>();
     public List<ProduitCommande> getProduitCommandes() {
        return produitCommandes;
      }
      public void add(ProduitCommande produitCommande){
           produitCommandes.add(produitCommande);
      }
    
    public Produit(int id, String libelle, int qteStock, double prix) {
        this.id = id;
        this.libelle = libelle;
        this.qteStock = qteStock;
        this.prix = prix;
    }


    public Produit() {
        id=++nbre;
    }

    
    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public String getLibelle() {
        return libelle;
    }
    public void setLibelle(String libelle) {
        this.libelle = libelle;
    }
    public int getQteStock() {
        return qteStock;
    }
    public void setQteStock(int qteStock) {
        this.qteStock = qteStock;
    }
    public double getPrix() {
        return prix;
    }
    public void setPrix(double prix) {
        this.prix = prix;
    }


    @Override
    public String toString() {
        return "Produit [id=" + id + ", libelle=" + libelle + ", qteStock=" + qteStock + ", prix=" + prix + "]";
    }


    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + id;
        result = prime * result + ((libelle == null) ? 0 : libelle.hashCode());
        return result;
    }


    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        Produit other = (Produit) obj;
        if (id != other.id)
            return false;
        if (libelle == null) {
            if (other.libelle != null)
                return false;
        } else if (!libelle.equals(other.libelle))
            return false;
        return true;
    }
}
