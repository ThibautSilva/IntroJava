// FASSEY Valentin
import java.util.ArrayList;
import java.util.List;

public class Coffre {
    public static List<Coffre> listeCoffre = new ArrayList();


    private int idCoffre;
    private String typeCoffre;
    private String periode;
    private double prix;
    private String devise;
    private int idAgence;
    private int idClient;


    // Constructeur
    public Coffre(int pIdCoffre, String pTypeCoffre, String pPeriode, double pPrix, String pDevise, int pAgence, int pClient) {
        idCoffre = pIdCoffre;
        typeCoffre = pTypeCoffre;
        periode = pPeriode;
        prix = pPrix;
        devise = pDevise;
        idAgence = pAgence;
        idClient = pClient;
    }

    //*************   GETTERS *************

    //Retourne le type de coffre
    public int getIdCOffre() {
        return idCoffre;
    }

    //Retourne le type de coffre
    public String getTypeCoffre() {
        return typeCoffre;
    }

    //Retourne la periode en nb de jours
    public int getPeriode() {
        if (periode.equals("mois")) {
            return 30;
        } else if (periode.equals("quinzaine")) {
            return 15;
        } else {
            return 1;
        }
    }

    // Retourne le prix
    public double getPrix() {
        return prix;
    }

    // Retourne la devise
    public String getDevise() {
        return devise;
    }

    // Retourne l'agence associé au coffre
    public int getAgence() {
        return idAgence;

    }

    // Retourne le client associé au coffre
    public int getClient() {
        return idClient;

    }

    public static List<Coffre> getListeCoffre() {
        return listeCoffre;
    }


//*************   SETTER   *************

    //Définit le type du coffre
    public void setIdCoffre(int pIdCoffre) {
        this.idCoffre = pIdCoffre;
    }

    //Définit le type du coffre
    public void setTypeCoffre(String pTypeCoffre) {
        this.typeCoffre = pTypeCoffre;
    }

    //Définit la periode
    public void setPeriode(String pPeriode) {
        this.periode = pPeriode;
    }

    //Définit le prix
    public void setPrix(double pPrix) {
        this.prix = pPrix;
    }

    //Définit le devise
    public void setDevise(String pDevise) {
        this.devise = pDevise;
    }

    //Définit l'agence du coffre
    public void setAgenceCoffre(int pAgence) {
        this.idAgence = pAgence;
    }

    //Définit le client du coffre
    public void setClientCoffre(int pClient) {
        this.idClient = pClient;
    }

    public static void setListeCoffre(List<Coffre> listeCoffre) {
        Coffre.listeCoffre = listeCoffre;
    }

}

