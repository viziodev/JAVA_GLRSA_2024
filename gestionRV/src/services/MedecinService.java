package services;


import entities.Medecin;

public  class MedecinService extends Service<Medecin> {
      public  MedecinService(){
             tab=new Medecin[N];
      }
    @Override
    public boolean add(Medecin data) {
        if (nbre<N) {
            data.setNumero(generateNumero(1, "MED"));
            tab[nbre++]=data;
            return true; 
        }
            return false;
        
    }

    @Override
    public Medecin getByNumero(String numero) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'getByNumero'");
    }

   
    
   //add Medecin
   //Lister Medecin
   //Rechercher Medecin 
}
