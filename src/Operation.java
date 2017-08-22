import java.util.Date;

/**
 * Created by
 * LASSERRE Arnaud
 * DUBOIS Anthony
 * LAURENT Anthony
 * the 21/08/2017.
 */
public class Operation {

    // ID propre à l'objet, unique en base
    private String id;
    // Type de devise : euro / dollar
    private String devise;

    // Période de location : quizaine / mois / année
    private String periodeLocation;

    // Objet lié au coffre fort présent dans l'agence
    private Coffre coffre;

    // Prix du coffre fort pour la période de location
    private Double prixPeriode;
    // Frais engendré par la garde de l'agence, lors du transfert d'un élément du coffre
    private Frais fraisDeGarde;

    // Client lié à l'opération
    private Client client;

    //Métas se référents à l'objet Operation
    private Date createDate;
    private Date updateDate;

    public Operation(String id, String devise, String periodeLocation, Coffre coffre, Double prixPeriode, Frais fraisDeGarde, Client client) {
        this.id = id;
        this.devise = devise;
        this.periodeLocation = periodeLocation;
        this.coffre = coffre;
        this.prixPeriode = prixPeriode;
        this.fraisDeGarde = fraisDeGarde;
        this.client = client;
        this.createDate = new Date();
        this.updateDate = new Date();
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
        this.updateDate = new Date();
    }

    public String getPeriodeLocation() {
        return periodeLocation;
    }

    public void setPeriodeLocation(String periodeLocation) {
        this.periodeLocation = periodeLocation;
        this.updateDate = new Date();
    }

    public String getDevise() {
        return devise;
    }

    public void setDevise(String devise) {
        this.devise = devise;
        this.updateDate = new Date();
    }

    public Coffre getCoffre() {
        return coffre;
    }

    public void setCoffre(Coffre coffre) {
        this.coffre = coffre;
        this.updateDate = new Date();
    }

    public Double getPrixPeriode() {
        return prixPeriode;
    }

    public void setPrixPeriode(Double prixPeriode) {
        this.prixPeriode = prixPeriode;
        this.updateDate = new Date();
    }

    public Frais getFraisDeGarde() {
        return fraisDeGarde;
    }

    public void setFraisDeGarde(Frais fraisDeGarde) {
        this.fraisDeGarde = fraisDeGarde;
        this.updateDate = new Date();
    }

    public Client getClient() {
        return client;
    }

    public void setClient(Client client) {
        this.client = client;
        this.updateDate = new Date();
    }

    public Date getCreateDate() {
        return createDate;
    }

    public Date getUpdateDate() {
        return updateDate;
    }

}