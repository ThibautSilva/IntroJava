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

    public Agence(Sucursale sucursale ){
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


}
