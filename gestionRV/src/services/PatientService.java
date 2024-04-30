package services;

import entities.Patient;

public class PatientService {
      private   static final  int  N=5;
      private  Patient[]  tabPatient=new Patient[N];

      
      public Patient[] listerPatient() {
        return tabPatient;
    }
    private int nbre;
      public boolean addPatient(Patient patient){
        if (nbre<N) {
            int id=generateId();
            patient.setId(id);
            patient.setNumero(generateNumero(id)); 
            tabPatient[nbre++]=patient;
            return true; 
        }
           return false; 
      }
      //id=1 PAT0001   id=10    PAT0010
      public String generateNumero(int nbre){
        int size=String.valueOf(nbre).length();
        return switch (size) {
               case  1->"PAT000"+nbre;
               case  2->String.format("PAT00%d",nbre);
               case  3->"PAT0"+nbre;
               default ->"PAT"+nbre;
           };
      }
      public int generateId(){
          return Patient.getNbrePatient();
      }

      public Patient getPatientByNumero(String numero){
        for (Patient  pat : tabPatient) {
               if (pat!=null && pat.getNumero().compareToIgnoreCase(numero)==0) {
                   return pat;
               }
        }
        return null;
      }
}
