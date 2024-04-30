package entities;

public class Client {
    private int id;
    private String nomComplet;
    private String telephone;
    public String getTelephone() {
        return telephone;
    }

    public void setTelephone(String telephone) {
        this.telephone = telephone;
    }

    private static int nbreClient;

    
    public String getNomComplet() {
        return nomComplet;
    }

    public void setNomComplet(String nomComplet) {
        this.nomComplet = nomComplet;
    }

    private final int NBRECMDE=10;
    //OneToMany
    private Commande[] commandes=new Commande[NBRECMDE];
    private int nbreCommande;

    public Client() {
        this.id=++nbreClient;
    }

    public Client(int id, String nomComplet) {
        this.id = id;
        this.nomComplet = nomComplet;
    }

    public Commande[] getCommandes() {
        return commandes;
    }

    public void addCommande(Commande commande){
      if(nbreCommande<NBRECMDE){
        commandes[nbreCommande++]=commande;
      }
    }



    @Override
    public String toString() {
        return "Client [id=" + id + ", nomComplet=" + nomComplet + "]";
    }
}
