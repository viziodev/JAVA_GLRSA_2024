package ism.glrsa.data.entity;

import ism.glrsa.data.enums.Filiere;
import ism.glrsa.data.enums.Niveau;
import lombok.Data;

@Data
public  class Classe {
    private int id;
    private String nomClasse;
    private Filiere filiere;
    private Niveau niveau;
    private static int nbre;
    
    public Classe(Filiere filiere, Niveau niveau) {
        id=++nbre;
        this.filiere = filiere;
        this.niveau = niveau;
        nomClasse= niveau+""+filiere;
    }
    public Classe() {
        id=++nbre;
    } 


}
