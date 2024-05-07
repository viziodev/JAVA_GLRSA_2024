package views;

import java.util.List;
import java.util.Scanner;


public abstract class ViewImpl<T>  implements View<T>{
     protected Scanner scanner=new Scanner(System.in);
     @Override
      public void affiche(List<T> datas) {
      for (T data : datas) {
           System.out.println(data);   
      }
    } 
}
