package ism.glrsa.data.enums;

public enum Filiere {
    IAGE,GLRS,MAE,ETSE;
    //0   1    2   3 

    public  static Filiere getValue(String value){
       for (Filiere f: Filiere.values()) {
            if (f.name().compareToIgnoreCase(value)==0) {
                  return f; 
            }
       }
       return null;
    }
}
