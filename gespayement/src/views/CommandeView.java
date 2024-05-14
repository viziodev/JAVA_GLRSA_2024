package views;

import java.util.List;

import core.Service;
import entities.Commande;
import entities.Facture;
import entities.Payement;
import entities.Produit;
import entities.ProduitCommande;

public class CommandeView extends ViewImpl<Commande> {

   private Service<Produit> produitService;
   private Service<Commande> comService;

   public CommandeView(Service<Produit> produitService, Service<Commande> comService) {
      this.produitService = produitService;
      this.comService = comService;
   }

   @Override
   public Commande saisie() {
      Commande commande = new Commande();
      // Ajouter des Produits
      char response;
      String libelle;
      do {
         Produit produit = null;
         int qteCmde;
         do {
            System.out.println("Entrer le Libelle du Produit");
            libelle = scanner.nextLine();
            produit = produitService.getBy(libelle);
            if (produit == null) {
               System.out.println("Ce Produit n'existe pas");
            }
         } while (produit == null);
         do {
            System.out.println("Entrer la Qte Cmde");
            qteCmde = scanner.nextInt();
         } while (qteCmde > produit.getQteStock() || qteCmde <= 0);
         // Creer la Relation entre ProduitCommande et Produit
         ProduitCommande produitCommande = new ProduitCommande(qteCmde, produit);
         // Creer la Relation entre Produit ProduitCommande et
         produit.add(produitCommande);
         // Creer Commande et ProduitCommande
         commande.add(produitCommande);
         // Creer la Relation entre ProduitCommande et Commande
         produitCommande.setCommande(commande);
         int qteStock = produit.getQteStock();
         produit.setQteStock(qteStock - qteCmde);
         System.out.println("Voulez ajouter un autre produit O/N");
         response = scanner.next().charAt(0);
      } while (response == 'O');
      // Doit Generer une Facture

      // On peut faire un Paiement
      return commande;
   }

   public Commande rechercherCommandeParNumero() {
      String numero;
      System.out.println("Entrer le Numero");
      numero = scanner.nextLine();
      return comService.getBy(numero);

   }

   public void showProduitCommande(List<ProduitCommande> produitCommandes) {
      for (ProduitCommande produitCommande : produitCommandes) {
         System.out.println(produitCommande.getProduit() +
               " Qte Commande : " + produitCommande.getQteCmde() +
               " Montant : " + produitCommande.getMontant());
      }
   }

    public void showPayementCommande(List<Payement> payements) {
       for (Payement payement : payements) {
          System.out.println(
               " Montant : " + payement.getMontant() );  
         }
   }

   public void saisiePayement(Facture facture) {
      char response;
      do {
         System.out.println("Voulez Enregistrer un Paiement O/N");
         response = scanner.next().charAt(0);
         if (response == 'O') {
            System.out.println("Entrer le Montant");
            double montant = scanner.nextDouble();
            Payement payement = new Payement();
            payement.setMontant(montant);

            facture.add(payement);
            payement.setFacture(facture);

         }

      } while (response == 'O');
   }

}