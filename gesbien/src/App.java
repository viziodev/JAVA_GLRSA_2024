import java.util.Scanner;
import entities.Bien;

public class App {
     private static Scanner scanner=new Scanner(System.in) ;
    public static void main(String[] args) throws Exception {
        int[]t=new int[10];
        boolean[]t1=new boolean[10];
        Bien biens[]=new Bien[10];
          for (int index = 0; index < 4 ;index++){
               biens[index]=saisieBien();
          }

          for (int index = 0; index < 10 ;index++){
             if( biens[index]!=null){
               System.out.println(biens[index].getReference());
             }
              
          }

       // for (int index = 0; index < 4 ;index++) {
            //  Bien bien= saisieBien();
            // System.out.println(bien);
       // } 
       // Operation operation=new Operation();
         Operation.somme(1,4);
    }

   public static Bien  saisieBien(){
    Bien bien=new Bien();
      do {
      System.out.println("Entrer la reference"); 
       bien.setReference(scanner.nextLine());
       } while (bien.getReference()==null || bien.getReference().isEmpty());

       return bien;
    }



}
