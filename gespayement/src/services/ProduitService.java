package services;

import java.util.ArrayList;
import java.util.List;

import core.Service;
import entities.Produit;

public class ProduitService   implements Service<Produit>{
      List<Produit> produits=new ArrayList<>();

    @Override
    public boolean save(Produit produit) {
        produits.add(produit);
         return true;
    }

      @Override
      public List<Produit> show() {
        return produits;
      }

    @Override
    public Produit getBy(String libelle) {
        for (Produit produit : produits) {
              if (produit.getLibelle().compareTo(libelle)==0) {
                  return produit;
              } 
        }
          return null;
    }

    @Override
      public int count() {
         return produits.size();
      }


    
}
