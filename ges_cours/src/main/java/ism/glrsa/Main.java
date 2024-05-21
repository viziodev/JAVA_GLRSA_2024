package ism.glrsa;

import java.util.Scanner;

import ism.glrsa.core.Repository;
import ism.glrsa.data.entity.Classe;
import ism.glrsa.data.repository.ClasseRepositoryBDO;
import ism.glrsa.data.repository.ClasseRepositoryBdImpl;
import ism.glrsa.data.repository.ClasseRepositoryImpl;
import ism.glrsa.service.ClasseServiceImpl;
import ism.glrsa.view.ClasseViewImpl;

public class Main {
    private static Scanner scanner=new Scanner(System.in);
    public static void main(String[] args) {
        //
         Repository<Classe> classeRepository=new ClasseRepositoryBDO();
         ClasseServiceImpl classeServiceImpl=new ClasseServiceImpl(classeRepository);
        //Injection de dependance par constructeur
          ClasseViewImpl classeViewImpl=new ClasseViewImpl(scanner); 
        //Injection de dependance par setter
         //classeViewImpl.setScanner(scanner);
        int choix;
        do {
              choix=  menu() ;
              switch (choix) {
                   case 1:
                    classeServiceImpl.save(classeViewImpl.saisie());   
                    break;
                    case 2:
                    classeViewImpl.affiche(classeServiceImpl.show());
                    break;
                }
            }while(choix !=12);
    }

    public static int menu() {
        System.out.println("1- Créer une Classe");
        System.out.println("2- Lister les Classe");
        System.out.println("3- Créer une commande ");
        System.out.println("4- Lister les commandes");
        System.out.println("5- Lister les produits d'une commande");
        System.out.println("6- Lister les Paiements d'une commande");
        System.out.println("7- Faire un paiement d'une commande");
        System.out.println("8- Quitter");
        return scanner.nextInt();

 
}
}