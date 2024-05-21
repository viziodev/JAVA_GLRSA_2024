package ism.glrsa.core;

import java.util.List;

public interface  Service<T> {
      boolean save(T objet);
      List<T> show();
      T getBy(String value);
      int count();
}
