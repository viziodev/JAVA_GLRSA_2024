package entities;

public class ProduitCommande {
    private int qteCmde;
    private double montant; 

    public double getMontant() {
        return montant;
    }
    public void setMontant(double montant) {
        this.montant = montant;
    }
    public int getQteCmde() {

        return qteCmde;
    }
    public void setQteCmde(int qteCmde) {
        this.qteCmde = qteCmde;
        montant=qteCmde*produit.getPrix();
    }
    private Produit produit;
    public Produit getProduit() {
        return produit;
    }
    public void setProduit(Produit produit) {
        this.produit = produit;
       // montant=qteCmde*produit.getPrix();
    }
    private Commande commande;
    public ProduitCommande(int qteCmde, Produit produit) {
        this.qteCmde = qteCmde;
        this.produit = produit;
        montant=qteCmde*produit.getPrix();
    }
    public Commande getCommande() {
        return commande;
    }
    public void setCommande(Commande commande) {
        this.commande = commande;
    }
}
