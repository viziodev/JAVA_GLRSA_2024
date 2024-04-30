import java.util.Scanner;

import entities.Patient;
import services.PatientService;
import services.RvService;
import views.PatientView;
import entities.RV;
import enums.Etat;
import views.RvView;

public class App {
      //Objet Singleton
      private static Scanner scanner=new Scanner(System.in);
    public static void main(String[] args) throws Exception {
         PatientView.setScanner(scanner);
         RvView.setScanner(scanner);
         PatientService patientService =new PatientService();
         RvService rvService=new RvService();

        int choix;
        do {
             choix=menu(); 
             scanner.nextLine();
             switch (choix) {
                case 1:
                     patientService.addPatient(PatientView.saisiePatient());
                    break;
                case 2:
                     PatientView.afficherPatient(patientService.listerPatient());
                     break;
                case 3:
                Patient pat=patientService.getPatientByNumero( PatientView.saisieNumero());
                 if (pat==null) {
                       System.out.println("Erreur sur le numero");    
                 } else{
                      RV rv=RvView.saisieRV();
                    //Association de Rv vers Patient
                     rv.setPatient(pat);
                     rvService.addRv(rv);
                 }
                    break;

                    case 4:
                           RvView.afficherRv(rvService.listerRV(RvView.saisieEtat()));
                    break;

                    case 5:
                    RvView.afficherRv(rvService.listerRV(RvView.saisieSpecialite()));
                    break;
                    case 6:
                   RV rv= rvService.getRvByNumero(RvView.saisieNumero());
                   if (rv==null) {
                        System.out.println("Ce numero n'existe pas");
                   } else {
                       if (rv.getEtat()!=Etat.Encours) {
                           System.out.println("Ce Rv est deja traite");
                       }else{
                            System.out.println(rv);
                           rvService.traiterRv(rv,RvView.validerEtat());
                       }
                       
                   }
                    break;

                default:
                    break;
             } 
        } while (choix!=7);

    }

    public static  int menu(){
        System.out.println("1-Enregistrer Patient");
        System.out.println("2-Lister Patient");
        System.out.println("3-Enregistrer un RV");
        System.out.println("4-Lister Par Etat");
        System.out.println("5-Lister Par Specialite");
        System.out.println("6-Traiter Demande");
        System.out.println("7-Quiiter");
        return scanner.nextInt();
    }
}
