public class Armoire extends Coffre{

    public Armoire(double prix) {
        prixJour = prix;
    }

    @Override
    double calculFrais() {
        return getPrixJour();
    }
}
