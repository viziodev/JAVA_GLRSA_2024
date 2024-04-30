package views;

import entities.Patient;
import   java.util.Scanner;

import javax.management.monitor.StringMonitor;
public class PatientView {
  
   private  static Scanner scanner;
   public static void setScanner(Scanner scanner) {
        PatientView.scanner = scanner;
   }

public static Patient saisiePatient(){
     Patient patient=new Patient();
      System.out.println("Entrer le Nom et le Prenom");
      patient.setNomComplet(scanner.nextLine());
      System.out.println("Entrer le Telephone");
      patient.setTelephone(scanner.nextLine());
      return patient;
   }

public static void afficherPatient(Patient [] patients){
      for (Patient patient: patients) {
        if (patient==null) return;
        System.out.println(patient);
      }
  }

  public static String saisieNumero(){
    System.out.println("Entrer le Numero");
      return scanner.nextLine();
    
  }
}
