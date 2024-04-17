import java.util.Scanner;

import entities.Transaction;
import enums.TypeTransc;

public class TransactionVue {
    private static  Scanner scanner=new Scanner(System.in);
    public static Transaction saisie(){
        Transaction t=new Transaction();
            System.out.println("Entrer l'id");
            t.setId(scanner.nextInt());
            System.out.println("Entrer le Montant");
            t.setMontant(scanner.nextDouble());
           t.setType( getTypeTransc());
           
          return t;
     }
 
     public static TypeTransc getTypeTransc(){
         int posTrans;
             do {
               System.out.println("1-Retrait");
               System.out.println("2-Depot");
               posTrans=scanner.nextInt();
             } while (posTrans!=1 && posTrans!=2);
            return TypeTransc.values()[posTrans-1];
     }
 
     public static int showMenu(){
         System.out.println("1-Ajouter Transaction");
         System.out.println("2-Lister  Transaction");
         System.out.println("3-Lister  Transaction Par Type");
         System.out.println("4-Quitter");
         return scanner.nextInt();
     }
}
