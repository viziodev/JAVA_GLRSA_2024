package ism.glrsa.core;

import java.util.List;
//CRUD => CREATE READ UPDATE DELETE
public interface Repository<T> {
       boolean insert(T objet);
       boolean update(T objet);
       boolean delete(int  id);
       List<T> selectAll();
       T selectById(int id);
       int count();
}
