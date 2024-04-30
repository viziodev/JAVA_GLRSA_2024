package services;

import entities.Commande;

public class CommandeService {
    private static final int Nbre=10;
    private Commande[] tabCommandes=new Commande[Nbre];
    private int n;
     //Ajouter Commande
     public boolean  addCommande(Commande cmde){
        boolean ok=false;
       if(n<Nbre) {
           tabCommandes[n++]=cmde;
             ok=true;
       }
       return ok;
    }
    //Lister client
public void listerCommande(){
    for (Commande cmde : tabCommandes) {
          if (cmde!=null) {
              System.out.println(cmde);
          }  
    }
  }
     //Lister toutes les commandes
  
}
