package services;

import entities.Patient;

public class PatientService  extends Service<Patient>{
   
    public PatientService(){
        tab=new Patient[N];
    }
        @Override
        public boolean add(Patient patient){
        if (nbre<N) {
            int id=generateId();
            patient.setId(id);
            patient.setNumero(generateNumero(id,"PAT")); 
            tab[nbre++]=patient;
            return true; 
        }
           return false; 
      }
      //id=1 PAT0001   id=10    PAT0010
    
      public int generateId(){
          return Patient.getNbrePatient();
      }
     
}
