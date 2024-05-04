package services;

import entities.Client;

public class ClientService {
    private static final int NbreClient=10;
    private Client[] tabClients=new Client[NbreClient];
    private int n;
    //Ajouter client
    public boolean  addClient(Client client){
        boolean ok=false;
       if(n<NbreClient &&  (this.rechercherClient(client.getTelephone())==null)) {
             tabClients[n++]=client;
             ok=true;
       }
       return ok;
    }
    //Lister client
public void listerClient(){
    for (Client client : tabClients) {
          if (client!=null) {
              System.out.println(client);
          }  
    }
  }


    //Rechercher le client par telepone => appel getCommandes() 

    public Client rechercherClient(String tel){
        for (Client client : tabClients) {
              if (client!=null && client.getTelephone().compareTo(tel)==0) {
                  return client;
              }  
        }
        return null;
      }
}
