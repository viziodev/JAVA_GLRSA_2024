import entities.Client;
import entities.Commande;
import services.ClientService;
import services.CommandeService;

public class App {
    public static void main(String[] args) throws Exception {
      int choix;
      CommandeService commandeService=new CommandeService();
      ClientService clientService=new ClientService();
      do {
          choix=GesComVue.showMenu();
          GesComVue.getScanner().nextLine();
           switch (choix) {
              case 1->{
                if(clientService.addClient(GesComVue.saisieClient())){
                   System.out.println("Client ajoute avec succees");
                }else{
                  System.out.println("Erreur ajout Client");
                }
                
              }
              case 2->{
                clientService.listerClient();
              }
              case 3->{
              String tel=  GesComVue.saisieTelClient();
              Client client=clientService.rechercherClient(tel);
              if (client==null) {
                   System.out.println("Erreur sur le Telephone");
              } else {
                      Commande cmde= GesComVue.saisieCommande();
                      cmde.setClient(client);
                      client.addCommande(cmde);
                      if(commandeService.addCommande(cmde)){
                        System.out.println("Commande ajoute avec succees");
                       }else{
                          System.out.println("Erreur ajout Commande");
                       }
                }
              }
              case 4->{
                  commandeService.listerCommande();
              }
              case 5->{
                String tel=  GesComVue.saisieTelClient();
                Client client=clientService.rechercherClient(tel);
                if (client==null) {
                     System.out.println("Erreur sur le Telephone");
                } else {
                   Commande[] commandes= client.getCommandes();
                   for (Commande cmde : commandes) {
                      if (cmde!=null) {
                        System.out.println(cmde);
                      }
                     
                   }
                }
            }


             default ->{
             }
                
           }
        } while (choix!=6);
    }
}
