package services;



import entities.RV;
import enums.Etat;
import enums.Specialite;
public class RvService  extends Service<RV>{
        
       

  public RvService(){
       tab=new RV[N];
  }
        public int generateId(){
          return RV.getNbreRv();
        }
            
              public RV[] lister(Etat etat) {
                    RV[] rvEtat=new RV[N] ;
                    int nbreEtat=0;
                    for (RV rv: tab) {
                        if (rv!=null && rv.getEtat()==etat) {
                            rvEtat[nbreEtat++]=rv;
                        }
                    }
                     return rvEtat;
                }

              public RV[] lister(Specialite specialite) {
                  RV[] rvSpecialite=new RV[N] ;
                  int nbreSpe=0;
                    for (RV rv: tab) {
                        if (rv!=null && rv.getSpecialite()==specialite) {
                            rvSpecialite[nbreSpe++]=rv;
                        }
                    }
                 return rvSpecialite;
              }
   
        @Override
      public boolean add(RV rv){
        if (nbre<N) {
            int id=generateId();
            rv.setId(id);
            rv.setNumero(generateNumero(id,"RV")); 
            rv.setEtat(Etat.Encours);
            tab[nbre++]=rv;
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

       
}
