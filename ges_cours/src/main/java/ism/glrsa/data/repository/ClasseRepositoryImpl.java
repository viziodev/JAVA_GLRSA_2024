package ism.glrsa.data.repository;

import java.util.ArrayList;
import java.util.List;

import ism.glrsa.core.Repository;
import ism.glrsa.data.entity.Classe;
/**
 * SOLID
 *    Single Responsability
 *    Open and Close Principe
 *    L
 *    I
 *    Dependancy Injection
 *    
 */
public class ClasseRepositoryImpl  implements Repository<Classe>{
     private List<Classe> classes=new ArrayList<>();
    @Override
    public boolean insert(Classe objet) {
          return classes.add(objet);
    }

    @Override
    public boolean update(Classe objet) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'update'");
    }

    @Override
    public boolean delete(int id) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'delete'");
    }

    @Override
    public List<Classe> selectAll() {
          return classes;
    }

    @Override
    public Classe selectById(int id) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'selectById'");
    }

    @Override
    public int count() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'count'");
    }
    
}
