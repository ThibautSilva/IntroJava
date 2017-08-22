public class Coffre {

    private int idCoffre;
    private String typeCoffre;
    private String periode;
    private double prix;
    private String devise;
    private int idClient;


    // Constructeur
    public Coffre(int pIdCoffre, String pTypeCoffre, String pPeriode, double pPrix, String pDevise, int pClient) {
        System.out.println("Création d'un coffre !");
        idCoffre = pIdCoffre;
        typeCoffre = pTypeCoffre;
        periode = pPeriode;
        prix = pPrix;
        devise = pDevise;
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

    //Retourne la periode
    public String getPeriode() {
        return periode;
    }

    // Retourne le prix
    public double getPrix() {
        return prix;
    }

    // Retourne la devise
    public String getDevise() {
        return devise;
    }

    // Retourne le client associé au coffre
    public int getClient() {
        return idClient;

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

    //Définit le client du coffre
    public void setClientCoffre(int pClient) {
        this.idClient = pClient;
    }

}

