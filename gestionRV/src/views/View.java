package views;

import java.time.LocalDate;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;
//private
//public
//protected  ==> 
//Type Genrique
public abstract class View {
     protected  static Scanner scanner;
     public static void setScanner(Scanner scanner) {
        View.scanner = scanner;
      }

        public static String saisieNumero(){
          System.out.println("Entrer le Numero");
          return scanner.nextLine();
       }

       public static String saisieNumero(String message){
          System.out.println(message);
          return scanner.nextLine();
       }
      public static LocalDate formatDate(String date){
         DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-yyyy");
        return LocalDate.parse(date,formatter);
      } 

      public static LocalDate formatDate(String date,String format){
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern(format);
       return LocalDate.parse(date,formatter);
     } 

     public static LocalTime formatHeure(String heure){
             DateTimeFormatter  formatter = DateTimeFormatter.ofPattern("HH:mm");
            return  LocalTime.parse(heure,formatter);
     }

     public static LocalTime formatHeure(String heure,String format){
      DateTimeFormatter  formatter = DateTimeFormatter.ofPattern(format);
       return  LocalTime.parse(heure,formatter);
     }

    
}
