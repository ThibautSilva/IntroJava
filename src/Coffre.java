abstract class Coffre {
    public double prixJour;
    public int client;
    public int agence;

    public double getPrixJour() {
        return prixJour;
    }

    public void setPrixJour(double prixJour) {
        this.prixJour = prixJour;
    }

    public int getClient() {
        return client;
    }

    public void setClient(int client) {
        this.client = client;
    }

    public int getAgence() {
        return agence;
    }

    public void setAgence(int agence) {
        this.agence = agence;
    }

    abstract double calculFrais();
}
