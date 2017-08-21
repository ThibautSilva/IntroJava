package Modele;

import java.time.Instant;

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
    private Instant createDate;
    private Instant updateDate;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getPeriodeLocation() {
        return periodeLocation;
    }

    public void setPeriodeLocation(String periodeLocation) {
        this.periodeLocation = periodeLocation;
    }

    public String getDevise() {
        return devise;
    }

    public void setDevise(String devise) {
        this.devise = devise;
    }

    public Coffre getCoffre() {
        return coffre;
    }

    public void setCoffre(Coffre coffre) {
        this.coffre = coffre;
    }

    public Double getPrixPeriode() {
        return prixPeriode;
    }

    public void setPrixPeriode(Double prixPeriode) {
        this.prixPeriode = prixPeriode;
    }

    public Frais getFraisDeGarde() {
        return fraisDeGarde;
    }

    public void setFraisDeGarde(Frais fraisDeGarde) {
        this.fraisDeGarde = fraisDeGarde;
    }

    public Client getClient() {
        return client;
    }

    public void setClient(Client client) {
        this.client = client;
    }

    public Instant getCreateDate() {
        return createDate;
    }

    public void setCreateDate(Instant createDate) {
        this.createDate = createDate;
    }

    public Instant getUpdateDate() {
        return updateDate;
    }

    public void setUpdateDate(Instant updateDate) {
        this.updateDate = updateDate;
    }
}