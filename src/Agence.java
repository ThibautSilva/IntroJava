import java.util.List;
/**
 * Created by jeffreydomenge on 21/08/2017.
 */
public class Agence {
    private  String nom;
    private  String codePostale;
    private  String ville;
    private  Sucursale sucursale;
    private List<Client> clients;
    private List<Coffre> coffres;

    public Agence(String nom, String codePostale, String ville, Sucursale sucursale ){
        this.nom = nom;
        this.codePostale = codePostale;
        this.ville = ville;
        this.sucursale = sucursale;
    }

    public void setVille(String ville){
        this.ville = ville;
    }

    public String getVille(){
        return this.ville;
    }

    public void setCodePostale(String codePostale){
        this.codePostale = codePostale;
    }

    public String getCodePostale(){
        return this.codePostale;
    }

    public void setNom(String nom){
        this.nom = nom;
    }

    public String getNom(){
        return this.nom;
    }

    public List<Client> getAllClientsFromAgence(){
        return clients;
    }

    public List<Coffre> getAllCoffreAgence(){
        return coffres;
    }

    public void addClient(Client c){
        clients.add(c);
    }
    public void addCoffre(Coffre c){
        coffres.add(c);
    }

    public void displayAgence(){
        System.out.println("--------------------");
        System.out.println("Agence: " + this.nom);
        System.out.println("Ville: " + this.ville);
        System.out.println("CP: " + this.codePostale);
        System.out.println("Sucurcale de: " + sucursale.getNom());
        System.out.println("Centre de: " + sucursale.getCentre().getNom());
        System.out.println("--------------------");

    }

}
