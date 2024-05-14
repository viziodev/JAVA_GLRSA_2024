
import java.util.Scanner;

import core.Service;
import entities.Commande;
import entities.Facture;
import entities.Payement;
import entities.Produit;
import entities.ProduitCommande;
import services.CommandeService;
import services.ProduitService;
import views.ProduitView;
import views.CommandeView;
import views.ViewImpl;

/**
 * Desing Pattern
 * Principe SOLID
 *    S:Single Responsability 
 *    
 *    Dependancy Injection
 */
public class App {
    private static Scanner scanner=new Scanner(System.in);
    public static void main(String[] args) throws Exception {
        //Classe Service doivent etre des
           //Desing Pattern singletons
           //Desing Pattern Fabrique
            Service<Produit> produitService=new ProduitService();
            Service<Commande> commandeService=new CommandeService();

        //Injection de Dependance
           ProduitView produitView=new ProduitView(produitService);
           CommandeView commandeView=new CommandeView(produitService,commandeService);
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
                     case 3:
                      if (produitService.count()!=0) {
                          Commande commande= commandeView.saisie();
                          commandeService.save(commande);
                          Facture facture=commande.getFacture();
                          commandeView.saisiePayement(facture);
                          //Genere la Facture
                      }else{
                        System.out.println("Veuillez saisir au moins un produit");
                      }

                      break;
                    case 4:
                       commandeView.affiche(commandeService.show());
                     break;
                     case 5:
                      Commande commande= commandeView.rechercherCommandeParNumero();
                      if (commande==null) {
                            System.out.println("Cette commande n'existe pas");
                      } else {
                            System.out.println(commande);
                            commandeView.showProduitCommande(commande.getProduitCommandes());
                      }
                     break;
                     case 6:
                     commande= commandeView.rechercherCommandeParNumero();
                     if (commande==null) {
                           System.out.println("Cette commande n'existe pas");
                     } else {
                      if (commande.getFacture().getPayements().isEmpty()) {
                           System.out.println("Pas de Payements pour cette facture");
                       } else {
                        System.out.println(commande.getFacture());
                        commandeView.showPayementCommande(commande.getFacture().getPayements());
                      }
                          
                     }
                     break;
                default:
                    break;
            }
           
       } while (choix!=8); 



    }





    public static int menu() {
        System.out.println("1- Créer un produit");
        System.out.println("2- Lister les produits");
        System.out.println("3- Créer une commande ");
        System.out.println("4- Lister les commandes");
        System.out.println("5- Lister les produits d'une commande");
        System.out.println("6- Lister les Paiements d'une commande");
        System.out.println("7- Faire un paiement d'une commande");
        System.out.println("8- Quitter");
        return scanner.nextInt();

 
}

}
