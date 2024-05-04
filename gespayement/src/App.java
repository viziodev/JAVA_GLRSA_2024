import java.util.Scanner;

import core.Service;
import entities.Commande;
import entities.Produit;
import services.CommandeService;
import services.ProduitService;

public class App {
    private static Scanner scanner=new Scanner(System.in);
    public static void main(String[] args) throws Exception {
        //Polymorphisme
        Service<Produit> produitService=new ProduitService();
      
        Service<Commande> pService=new CommandeService();
      int choix;
        do {
            choix=  menu() ;
            switch (choix) {
                case 1:
                    
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
        System.out.println("6- Lister les Paiements du commande");
        System.out.println("7- Faire un paiement d'une commande");
        System.out.println("8- Quitter");
        return scanner.nextInt();

 
}

}
