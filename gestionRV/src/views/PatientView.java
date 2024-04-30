package views;

import entities.Patient;



public class PatientView extends View {
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


}
