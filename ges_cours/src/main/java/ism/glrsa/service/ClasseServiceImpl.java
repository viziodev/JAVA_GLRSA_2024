package ism.glrsa.service;

import java.util.List;

import ism.glrsa.core.Repository;
import ism.glrsa.core.Service;
import ism.glrsa.data.entity.Classe;
import ism.glrsa.data.repository.RepositoryBD;


public class ClasseServiceImpl implements Service<Classe> {
   //Open and Close Principe 
      //Couplage Faible 
       private Repository<Classe> classeRepositoryImpl;
       //Inversion de Controle + InJection de Dependance
      public ClasseServiceImpl(Repository<Classe> classeRepositoryImpl) {
        this.classeRepositoryImpl = classeRepositoryImpl;
      }


    @Override
    public boolean save(Classe objet) {
       return  classeRepositoryImpl.insert(objet);
    }
    @Override
    public List<Classe> show() {
      return classeRepositoryImpl.selectAll();
    }

    @Override
    public Classe getBy(String value) {
        return ((RepositoryBD) classeRepositoryImpl).selectByLibelle(value);
    }

    @Override
    public int count() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'count'");
    }
    
}
