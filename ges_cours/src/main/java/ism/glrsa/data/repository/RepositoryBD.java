package ism.glrsa.data.repository;

import ism.glrsa.core.Repository;
import ism.glrsa.data.entity.Classe;

public interface RepositoryBD  extends Repository<Classe>{
    Classe selectByLibelle(String libelle);
}
