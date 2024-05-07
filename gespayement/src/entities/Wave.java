package entities;

public class Wave  extends Payement{
    private static final double Frais=0.01;
    //montant + Tva + frais -10
    @Override
    public double caculMontant() {
        return super.caculMontant()+ super.montant*Frais-10;
    }  
    
    public Wave(){
        type=TypePaiement.WAVE;
     }
}
