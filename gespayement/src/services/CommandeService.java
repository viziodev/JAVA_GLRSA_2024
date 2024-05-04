package services;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

import core.Service;
import entities.Commande;

//Use Case de Commande 
//CommandeService  implement interface Service
//CommandeService est classe implementation
public  class CommandeService implements Service<Commande>   {
     List<Commande> commandes=new ArrayList<>();
    //Redefinition 
    @Override
    public boolean save(Commande commande) {
        commandes.add(commande);
        return false;
    }


    @Override
    public List<Commande> show() {
        return commandes;
    }



    
    
}
