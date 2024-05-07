package entities;

public class OM  extends Payement{
      private static final double Frais=0.008;
      //montant + Tva + frais

    public  double getFrais() {
        return Frais;
    }

    @Override
     public double caculMontant() {
        return super.caculMontant()+super.montant*Frais;
     }

     public OM(){
        type=TypePaiement.OM;
     }

     
      
      
}
