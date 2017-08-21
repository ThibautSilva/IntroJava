/**
 * Created by jeffreydomenge on 21/08/2017.
 */
public class Agence {
    private  String nom;
    private  String codePostale;
    private  String ville;
    private  Sucursale sucursale;

    public List<Client> getAllClientsFromAgence(){
        return new List<Client>();
    }

    public List<Coffre> getAllCoffreAgence(){
        return new List<Coffre>();
    }

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

}
