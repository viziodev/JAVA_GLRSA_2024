package services;


import entities.Patient;
import entities.RV;
import enums.Etat;
import enums.Specialite;
public class RvService {
   private   static final  int  N=5;
         private  RV[]  tabRv=new RV[N];  
         private int nbre;
       public String generateNumero(int nbre){
            int size=String.valueOf(nbre).length();
            return "RV"+"0".repeat((4-size)<0?0:4-size)+nbre;
        }
        public int generateId(){
          return RV.getNbreRv();
        }
              public RV[] listerRV() {
                 return tabRv;
             }

                public RV[] listerRV(Etat etat) {
                    RV[] rvEtat=new RV[N] ;
                    int nbreEtat=0;
                    for (RV rv: tabRv) {
                        if (rv!=null && rv.getEtat()==etat) {
                            rvEtat[nbreEtat++]=rv;
                        }
                    }
                     return rvEtat;
                }

              public RV[] listerRV(Specialite specialite) {
                  RV[] rvSpecialite=new RV[N] ;
                  int nbreSpe=0;
                    for (RV rv: tabRv) {
                        if (rv!=null && rv.getSpecialite()==specialite) {
                            rvSpecialite[nbreSpe++]=rv;
                        }
                    }
                 return rvSpecialite;
              }
   
  
      public boolean addRv(RV rv){
        if (nbre<N) {
            int id=generateId();
            rv.setId(id);
            rv.setNumero(generateNumero(id)); 
            rv.setEtat(Etat.Encours);
            tabRv[nbre++]=rv;
            return true; 
        }
           return false; 
      }

      public boolean traiterRv(RV rv,Etat etat){
        boolean result=false;
        switch (rv.getEtat()) {
            case Encours:
               rv.setEtat(etat) ; 
                 result=true;    
                break;


            default:
                break;
        }
        return result;
      }

       public RV getRvByNumero(String numero){
        for (RV  rv : tabRv) {
               if (rv!=null && rv.getNumero().compareToIgnoreCase(numero)==0) {
                   return rv;
               }
        }
        return null;
      }
}
