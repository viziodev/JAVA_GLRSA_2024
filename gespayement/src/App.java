
import java.util.Scanner;

import core.Service;
import entities.Commande;

import entities.Produit;
import entities.ProduitCommande;
import services.CommandeService;
import services.ProduitService;
import views.ProduitView;
import views.ViewImpl;

public class App {
    private static Scanner scanner=new Scanner(System.in);
    public static void main(String[] args) throws Exception {
        Produit produit1=new Produit(1,"Lait",10,125);
        Produit produit2=new Produit(2,"Sucre",5,20);
        Produit produit3=new Produit(3,"Cafe",15,100);

        //Add Commande
          Commande commande=new Commande();  
          commande.setMumero("CMD001");
             //Affectation de Produit
               ProduitCommande produitCommande1=new ProduitCommande();
              
                 //Relation  de ProduitCommande vers Produit
                    produitCommande1.setProduit(produit1);
                    produitCommande1.setQteCmde(5);
                  //Relation  de Produit vers ProduitCommande 
                    produit1.add(produitCommande1);
                //Add Commande creer la Relation  de Commande vers  ProduitCommande
                commande.add(produitCommande1);
              // Relation  de ProduitCommande vers Commande 
                 produitCommande1.setCommande(commande);
              

                //Affectation de Produit
                ProduitCommande produitCommande2=new ProduitCommande();
                //Relation  de ProduitCommande vers Produit
                produitCommande2.setProduit(produit2);
                produitCommande2.setQteCmde(2);
               //Add Commande creer la Relation  de Commande vers  ProduitCommande
                commande.add(produitCommande2);

            //Les produits d'une commande
             System.out.println("Commande "+commande.getMumero() );
             for (ProduitCommande produitCommande: commande.getProduitCommandes()) {
                  System.out.println(produitCommande.getProduit() +" Qte comd "+produitCommande.getQteCmde() +" Montant "+produitCommande.getMontant());
             }
             System.out.println(" Total "+commande.getMontant());
             //Lister les commandes faites sur un produit
             System.out.println("Produit "+produit1);
             for (ProduitCommande produitCommande: produit1.getProduitCommandes()) {
                  System.out.println(produitCommande.getCommande().getMumero() +" Qte comd"+produitCommande.getQteCmde());
              }

        //Polymorphisme
       /*  Service<Produit> produitService=new ProduitService();
        Service<Commande> pService=new CommandeService();
        ProduitView produitView=new ProduitView();
      int choix;
      do {
            choix=  menu() ;
            switch (choix) {
                case 1:
                produitService.save(produitView.saisie());
                    break;
                    case 2:
               produitView.affiche( produitService.show());
                        break;
                default:
                    break;
            }
           
       } while (choix!=8);  */



    }





    public static int menu() {
        System.out.println("1- Créer un produit");
        System.out.println("2- Lister les produits");
        System.out.println("3- Créer une commande ");
        System.out.println("4- Lister les commandes");
        System.out.println("5- Lister les produits d'une commande");
        System.out.println("6- Lister les Paiements du commande");
        System.out.println("7- Faire un paiement d'une commande");
        System.out.println("8- Quitter");
        return scanner.nextInt();

 
}

}
