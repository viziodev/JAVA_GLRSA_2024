package entities;

public class Bien {
  
    /**
     * numeric(entier ou reels)  ==> initialiser a 0
     * boolean  ==> initialiser a false
     * Objet  ==> null
     */
    //Attributs sont des variables instances ou Objets
        private int id;
        private String reference;
        private double prix;
        private String description;
        private double superficie;
        private String adresse;
      //Attributs static ou de classe sont des attributs partages entre tous les objets de la classe
        private static int nbreObjet;
         public static int getNbreObjet(){
            return nbreObjet;
        }
        public static void setNbreObjet(int nbreObjet ){
            Bien.nbreObjet=nbreObjet;
        }
        
      //Constantes
      public final int CONVERT=100;

    public Bien() {
        nbreObjet++;
        id=nbreObjet;
    }

    public Bien(String reference, double prix, String description, double superficie, String adresse) {
        nbreObjet++;
        id=nbreObjet;
        this.reference = reference;
        this.prix = prix;
        this.description = description;
        this.superficie = superficie;
        this.adresse = adresse;
    }

    public int getId() {
        return id;
    }
    public void setId(int id) {
        if (id>0) {
            this.id = id;
        }
      
    }
    public String getReference() {

        return reference;
    }
    public void setReference(String reference) {
        //General => equals(objet):boolean
        //String =>  
        if(!reference.isEmpty()){
            this.reference = reference;
        }
      
    }
    public double getPrix() {
        return prix;
    }
    public void setPrix(double prix) {
        this.prix = prix;
    }
    public String getDescription() {
        return description;
    }
    public void setDescription(String description) {
        this.description = description;
    }
    public double getSuperficie() {
        return superficie;
    }

    public double superficieEnMetreCarre() {
        return superficie/CONVERT;
    }
    public void setSuperficie(double superficie) {
        this.superficie = superficie;
    }
    public String getAdresse() {
        return adresse;
    }
    public void setAdresse(String adresse) {
        this.adresse = adresse;
    }
    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + id;
        return result;
    }
    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        Bien other = (Bien) obj;
        if (id != other.id)
            return false;
        return true;
    }
    @Override
    public String toString() {
        return "Bien [id=" + id + ", reference=" 
              + reference 
              + ", prix=" + prix 
              + ", description=" + description
              + ", superficie=" + superficie 
              + ", adresse=" + adresse + "]";
    }
    

    
    
}
