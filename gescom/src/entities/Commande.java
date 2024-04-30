package entities;

public class Commande {
    private int id;
    private String numero;
    private static int nbreCommande;
      //Navigabilite ==> ManyToOne
    private Client client;
    public Commande() {
        nbreCommande++;
        id=nbreCommande;
    }
    public Commande(int id, String numero) {
        this.id = id;
        this.numero = numero;
    }
    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public Client getClient() {
        return client;
    }
    public void setClient(Client client) {
        this.client = client;
    }
    public String getNumero() {
        return numero;
    }
    public void setNumero(String numero) {
        this.numero = numero;
    }
    @Override
    public String toString() {
        return "Commande [id=" + id + ", numero=" + numero + "]";
    }
}
