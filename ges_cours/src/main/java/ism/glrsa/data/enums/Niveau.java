package ism.glrsa.data.enums;

public enum Niveau {
    L1,L2,L3,M1,M2;


    public static  Niveau getValue(String value){
        for (Niveau f: Niveau.values()) {
             if (f.name().compareToIgnoreCase(value)==0) {
                   return f; 
             }
        }
        return null;
     }
}
