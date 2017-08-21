import java.util.List;

/**
 * Created by jeffreydomenge on 21/08/2017.
 */
public class Centre {
    private  String nom;
    private List<Sucursale> sucursales;

    public Centre(String nom){
        this.nom = nom;
    }

    public Centre(){

    }

    public void setNom(String nom){
        this.nom = nom;
    }

    public String getNom(){
        return this.nom;
    }

    public List<Sucursale> getAllSucursale(){
        return  sucursales;
    }

    public void addSucursale(Sucursale sucursale){
        sucursales.add(sucursale);
    }

}
