package entities;

import java.util.ArrayList;
import java.util.List;

public class Facture {  
     private String numero;
     private Commande commande; 
     private double montantVerser;
     private double montantRestant;

     private List<Payement> payements=new ArrayList<>();

     public List<Payement> getPayements() {
          return payements;
     }

     public void add(Payement payement){
          payements.add(payement);
          montantVerser+= payement.montant;
          montantRestant=commande.getMontant()-montantVerser;
      }


     public Commande getCommande() {
          return commande;
     }
     public void setCommande(Commande commande) {
          this.commande = commande;
     }
     public String getNumero() {
          return numero;
     }
     public void setNumero(String numero) {
          this.numero = numero;
     }
     @Override
     public String toString() {
          return "Facture [numero=" + numero + ", Date =" + commande.getDateCmde()
                  + ", Montant  =" + commande.getMontant()
                  + ", Montant Verser  =" + montantVerser
                  + ", Montant Restant  =" + montantRestant
               + "]";
     }

     

}
