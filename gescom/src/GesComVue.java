import java.util.Scanner;

import entities.Client;
import entities.Commande;

public class GesComVue {
    private static final   Scanner scanner=new Scanner(System.in);
    public static Scanner getScanner() {
        return scanner;
    }


    public static Client saisieClient(){
        Client client=new Client();
            System.out.println("Entrer le nomComplet");
            client.setNomComplet(scanner.nextLine());
            System.out.println("Entrer le telephone ");
            client.setTelephone(scanner.nextLine());
          return client;
     }
     public static String saisieTelClient(){
        System.out.println("Entrer le telephone");
        return scanner.nextLine();
     }


     public static Commande saisieCommande(){
            Commande cmde=new Commande();
            System.out.println("Entrer le Numero de la commande");
            cmde.setNumero(scanner.nextLine());
          return cmde;
     }
 
     
     public static int showMenu(){
         System.out.println("1-Ajouter Client");
         System.out.println("2-Lister  Client");
         System.out.println("3-Ajouter  Commande");
         System.out.println("4-Lister toutes  les Commandes");
         System.out.println("5-Lister   les Commandes un client");
         System.out.println("6-Quitter");
         return scanner.nextInt();
     }
}
