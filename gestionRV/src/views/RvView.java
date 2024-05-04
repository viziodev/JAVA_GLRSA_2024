package views;

import java.time.LocalDate;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

import entities.RV;
import enums.Etat;
import enums.Specialite;

public class RvView extends View {
   
     public static RV saisieRV(){
         RV rv=new RV();
          System.out.println("Entrer la Date JJ-MM-AAAA");
          rv.setDate(formatDate(scanner.nextLine()));
          System.out.println("Entrer l'Heure HH:MN");
           rv.setHeure(formatHeure(scanner.nextLine()));
           System.out.println("Choisir une Specialite");
           rv.setSpecialite(saisieSpecialite());
           scanner.nextLine();
          System.out.println("Entrer le motif");
          rv.setMotif(scanner.nextLine());
         
      return rv;
   }

   public static Etat saisieEtat(){
    int etat;
     do {
         System.out.println("1-Encours");
         System.out.println("2-Valider");
         System.out.println("3-Annuler");
         etat=scanner.nextInt();
     } while (etat<1 || etat>3);
        return Etat.values()[etat-1];
   }

   public static Etat validerEtat(){
    int etat;
     do {
         System.out.println("1-Valider");
         System.out.println("2-Annuler");
         etat=scanner.nextInt();
     } while (etat<1 || etat>2);
        return Etat.values()[etat];
   }

   public static Specialite saisieSpecialite(){
    int specialite;
     do {
         System.out.println("1-Cardiologie");
         System.out.println("2-Ophtalmologie");
         System.out.println("3-Urologie");
         specialite=scanner.nextInt();
     } while (specialite<1 || specialite>3);
        return Specialite.values()[specialite-1];
   }

 public static void afficherRv(RV [] rvs){
      for (RV rv: rvs) {
        if (rv==null) return;
        System.out.println(rv);
      }
  }

}
