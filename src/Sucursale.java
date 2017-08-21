import java.util.List;

/**
 * Created by jeffreydomenge on 21/08/2017.
 */
public class Sucursale {
    private  String nom;
    private  String reference;
    private  Centre centre;
    private List<Agence> agences;

    public Sucursale(Centre centre){
        this.centre = centre;
    }
    public Sucursale(Centre centre, String Nom){
        this.centre = centre;
        this.nom = Nom;
    }

    public Sucursale(Centre centre, String Nom, String Reference){
        this.centre = centre;
        this.nom = Nom;
        this.reference = Reference;
    }


    public void setReference(String reference){
        this.reference = reference;
    }

    public String getReference(){
        return this.reference;
    }

    public void setNom(String nom){
        this.nom = nom;
    }

    public String getNom(){
        return this.nom;
    }

    public List<Agence> getAllAgences(){
        return  agences;
    }

    public void addAgence(Agence Agence){
        agences.add(Agence);
    }

}
