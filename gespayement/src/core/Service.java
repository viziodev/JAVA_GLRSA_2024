package core;

import java.util.List;

public interface  Service<T> {
   //Collection  :interface 
      //--Map ==> Dictionnaire {'cle':valeur} ou Tableau Associatif
      //--List  ==>  interface
             //add() remove()
         //ArrayList (sens parcours Debut a la Fin) ==> Classe Implementation
            //add()
         //LinquedList (sens parcours Debut a la Fin  ou Fin==>Debut)  
           //add()
    //Declaration des methodes abstraites ==> Prototype ou Signature


      boolean save(T objet);
      List<T> show();

         
    
} 