package ism.glrsa.data.repository;

import java.util.List;

import ism.glrsa.core.Repository;
import ism.glrsa.data.entity.Classe;

public class ClasseRepositoryBdImpl implements Repository<Classe> {

    @Override
    public boolean insert(Classe objet) {
        // INSERT INTO `classe` (`id`, `nom_classe`, `filiere`, `niveau`) VALUES (NULL, 'L1IAGE', 'IAGE', 'L1');
        throw new UnsupportedOperationException("Unimplemented method 'insert'");
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
        // SELECT * FROM `classe`
        throw new UnsupportedOperationException("Unimplemented method 'selectAll'");
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
