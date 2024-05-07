package views;


import entities.Produit;

public class ProduitView  extends ViewImpl<Produit>{
      @Override
       public  Produit saisie(){
        Produit produit=new Produit();
        System.out.println("Entrer le Libelle");
        produit.setLibelle(scanner.nextLine());
        System.out.println("Entrer le Prix");
        produit.setPrix(scanner.nextDouble());
        System.out.println("Entrer la QteStock");
        produit.setQteStock(scanner.nextInt());
        return produit;
       }

   

       
}
