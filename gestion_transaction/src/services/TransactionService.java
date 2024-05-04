package services;

import entities.Transaction;
import enums.TypeTransc;

public class TransactionService {
    //Tableau  ==> type de reference
        //Tableau de valeurs ou des Tableaux Objets
          //Meme type de donnee
            //Taille de reservation ==> nbre de cellule
            //Taille reelle  ==> nbre de valeurs
          //Un tablea peut etre initialise a sa declaration

        //Tableau de valeurs ou tableaux de types primitifs(int,float , double,...)
           //int tabEntier[] =new int[5];  //
           //  tabEntier[0]=10;
           // double []tabReeel =new double[5];

           //Tableau Objets
           //Transaction tabTransc[]=new Transaction[5] ;//  
           //tabTransc[0] =new Transaction() ; 
          private final int N=5;//
          private Transaction tabTransc[]=new Transaction[N];
          private int n;

          public void addTransaction(Transaction trans){
              if (n<N) {
                   tabTransc[n++]=trans;
              } else {
                    System.out.println("Le Tableau est plein");
              }
          }

          public void listerTransaction(){
            for (int index = 0; index < n; index++) {
               System.out.println(tabTransc[index].toString());
            }
        }

        public void listerTransaction(TypeTransc type){
            for (int index = 0; index < tabTransc.length; index++) {
                if(tabTransc[index]==null) return ;
                if ( tabTransc[index].getType()==type) {
                    System.out.println(tabTransc[index].toString());
                  }
            }
            
        }

        public void listerTransaction1(TypeTransc type){
            for (Transaction transc : tabTransc) {
                if(transc==null) return ;
                if ( transc.getType()==type) {
                    System.out.println(transc.toString());
                  } 
            }
            
        }

          
}
