package com.company;


public class Coffre {

    private int IdCoffre;
    private String TypeCoffre;
    private String Periode;
    private int Prix;
    private String Devise;
    private Client Client;


    // Constructeur
    public Coffre(String pIdCoffre, String pTypeCoffre, String pPeriode, int pPrix, String pDevise, Client pClient)
    {
        System.out.println("Création d'un coffre !");
        TypeCoffre = pIdCoffre;
        TypeCoffre = pTypeCoffre;
        Periode = pPeriode;
        Prix = pPrix;
        Devise = pDevise;
        Client = pClient;
    }

    //*************   GETTERS *************


    //Retourne le type de coffre
    public String getTypeCoffre()  {
        return TypeCoffre;
    }

    //Retourne la periode
    public String getPeriode()
    {
        return Periode;
    }

    // Retourne le prix
    public int getPrix()
    {
        return Prix;
    }

    // Retourne la devise
    public String getDevise()
    {
        return Devise;

    }

    // Retourne le client associé au coffre
    public Client getClient()
    {
        return Client;

    }




    //*************   SETTER   *************

    //Définit le type du coffre
    public void setTypeCoffre(String pTypeCoffre)
    {
        this.TypeCoffre = pTypeCoffre;
    }

    //Définit la periode
    public void setPeriode (String pPeriode)
    {
        this.Periode = pPeriode;
    }

    //Définit le prix
    public void setPrix(int pPrix)
    {
        this.Prix = pPrix;
    }

    //Définit le devise
    public void setDevise(String pDevise)
    {
        this.Devise = pDevise;
    }

    //Définit le client du coffre
    public void setClientCoffre(Client pClient)
    {
        this.Client = pClient;
    }


}
