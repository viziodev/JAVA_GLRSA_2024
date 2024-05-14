package views;


import core.Service;
import entities.Produit;
import services.ProduitService;

public class ProduitView  extends ViewImpl<Produit>{
      //Injection de Dependance
      private  Service<Produit> produitService;
      public  ProduitView( Service<Produit> produitService){
           this.produitService=produitService;
       }

      @Override
       public  Produit saisie(){
       
            String libelle;
         do {
             System.out.println("Entrer le Libelle");
             libelle=scanner.nextLine();
        } while (produitService.getBy(libelle)!=null);
            Produit produit=new Produit();
        produit.setLibelle(libelle);
        System.out.println("Entrer le Prix");
        produit.setPrix(scanner.nextDouble());
        System.out.println("Entrer la QteStock");
        produit.setQteStock(scanner.nextInt());
        scanner.nextLine();
        return produit;
       }

   

       
}
