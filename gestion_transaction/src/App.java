
import services.TransactionService;
public class App {
 
    public static void main(String[] args) throws Exception {
          TransactionService service=new TransactionService();
       int choix;
        do {
            choix=TransactionVue.showMenu();
             switch (choix) {
                case 1->{
                    service.addTransaction(TransactionVue.saisie());
                }
                case 2->{
                      service.listerTransaction();
                }
                case 3->{
                    service.listerTransaction(TransactionVue.getTypeTransc());
                }
               default ->{
               }
                  
             }
          } while (choix!=4);
       
    }

    

}
