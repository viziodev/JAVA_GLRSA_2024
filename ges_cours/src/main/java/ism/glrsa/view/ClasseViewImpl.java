package ism.glrsa.view;

import java.util.Scanner;

import ism.glrsa.core.ViewImpl;
import ism.glrsa.data.entity.Classe;
import ism.glrsa.data.enums.Filiere;
import ism.glrsa.data.enums.Niveau;

public class ClasseViewImpl extends ViewImpl<Classe> {
    public ClasseViewImpl(Scanner scanner) {
        super(scanner);
    }
    @Override
    public Classe saisie() {
          Niveau niveau =saisieNiveau();
          Filiere filiere=saisieFiliere();
        return new Classe(filiere,niveau);
    }

    private Filiere saisieFiliere(){
        int filiereChoice;
        do {
          for (Filiere filiere :Filiere.values()) {
            System.out.println((filiere.ordinal()+1)+"-"+filiere.name());    
          }
          System.out.println("Veuillez selectionnez une filiere ");
          filiereChoice=scanner.nextInt();
         } while (filiereChoice<=0 || filiereChoice>Filiere.values().length);  
        
          return Filiere.values()[filiereChoice-1];
    }

    private Niveau saisieNiveau(){
        int niveauChoice;
        do {
          for (Niveau filiere :Niveau.values()) {
            System.out.println((filiere.ordinal()+1)+"-"+filiere.name());    
          }
          System.out.println("Veuillez selectionnez un Niveau ");
          niveauChoice=scanner.nextInt();
         } while (niveauChoice<=0 || niveauChoice>Niveau.values().length);  
        
          return Niveau.values()[niveauChoice-1];
    }
    
}
