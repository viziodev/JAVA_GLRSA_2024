package services;

import java.util.ArrayList;

import java.util.List;

import core.Service;
import entities.Commande;
import entities.Facture;
import entities.Produit;

//Use Case de Commande 
//CommandeService  implement interface Service
//CommandeService est classe implementation
public  class CommandeService implements Service<Commande>   {
     List<Commande> commandes=new ArrayList<>();
    //Redefinition 
    @Override
    public boolean save(Commande commande) {
        commandes.add(commande);
        genererFacture(commande);
        return false;
    }

      public void genererFacture(Commande commande) {
          Facture facture=new Facture();
          facture.setNumero("FACT"+commande.getMumero().substring(3,7));
          //Facture vers commande 
            facture.setCommande(commande);
           //commande   vers Facture
           commande.setFacture(facture);
          //COM0001
    }
    
    @Override
    public List<Commande> show() {
        return commandes;
    }
    @Override
    public Commande getBy(String numero) {
       for (Commande commande : commandes) {
              if (commande.getMumero().compareTo(numero)==0) {
                  return commande;
              } 
        }
          return null;
    }
    @Override
    public int count() {
        return commandes.size();
    }



    
    
}
