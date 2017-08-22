/**
 * Created By
 *
 * Dylan Friedrich
 * Amine Refas
 * Victor Albert
 * Thibaut Silva
 *
 * Objet Frais
 */
class Frais {
    //Identifiant unique id
    private int id;
    // prix du coffre sur une période indiquée
    private double montant;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public double getMontant() {
        return montant;
    }

    public void setMontant(double montant) {
        this.montant = montant;
    }

    public double calculFrais(Coffre coffre) {
        //todo prix du coffre * nb jour
        this.id = coffre.getIdCOffre();
        this.montant = coffre.getPrix() * coffre.getPeriode();
        return this.montant;
    }

    public static void printFrais(Frais f) {
        System.out.println("Identifiant : " + f.getId());
        System.out.println("Montant : " + f.getMontant());
    }
}
