package entities;

public  class Payement implements IPaiement {
     protected static final double Tva=0.18;
     private Facture facture;
     public Facture getFacture() {
      return facture;
    }
    public void setFacture(Facture facture) {
      this.facture = facture;
    }
    protected TypePaiement type;
      public TypePaiement getType() {
      return type;
    }
      protected double montant;
      public double getMontant() {
        return montant;
      }
      public void setMontant(double montant) {
        this.montant = montant;
      }
      @Override
      public double caculMontant() {
          return montant*(1+Tva);
      }
   

}
