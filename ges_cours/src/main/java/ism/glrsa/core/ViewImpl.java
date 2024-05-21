package ism.glrsa.core;

import java.util.List;
import java.util.Scanner;

public  abstract class ViewImpl<T>   implements View<T>{
     protected Scanner scanner;

     public ViewImpl(Scanner scanner) {
        this.scanner = scanner;
     }
    public void setScanner(Scanner scanner) {
        this.scanner = scanner;
    }
    @Override
      public void affiche(List<T> datas) {
      for (T data : datas) {
           System.out.println(data);   
      }
    } 
}
