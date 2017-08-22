import java.util.List;
import java.util.Scanner;

public class Main {

    private static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        boolean connect = Client.connexion();
        if (connect) {
            //todo generate Agence
            Centre centre = new Centre("Lorraine");
            Sucursale sucursale = new Sucursale(centre, "Nancy");
            Agence agenceLaxou = new Agence("Laxou", "55240", "Grand Nancy", sucursale);
            Agence agenceBrabois = new Agence("Brabois", "55230", "Grans Nancy", sucursale);
            CoffreFromXml.main();
            //todo generate coffre
            //todo generate operation

            int choix = 5;
            do {
                choix = getChoix(choix);

                switch (choix) {
                    case 1:
                        //TODO Informations sur la banque
                        System.out.println("\n****************************************");
                        System.out.println("****** INFORMATIONS SUR LA BANQUE ******");
                        System.out.println("****************************************");
                        break;
                    case 2:
                        //TODO Liste des opérations
                        System.out.println("\n**********************************");
                        System.out.println("****** LISTE DES OPERATIONS ******");
                        System.out.println("**********************************");
                        break;
                    case 3:
                        //TODO Liste des coffres
                        System.out.println("\n*******************************");
                        System.out.println("****** LISTE DES COFFRES ******");
                        System.out.println("*******************************");
                        List<Coffre> listeCoffre = Coffre.getListeCoffre();
                        for (Coffre coffre : listeCoffre) {
                            System.out.println("\n*************COFFRES************");
                            System.out.println("Id coffre + Type : " + coffre.getIdCOffre() + " - " + coffre.getTypeCoffre());
                            System.out.println("Devise : " +coffre.getDevise());
                            System.out.println("Période : " +coffre.getPeriode());
                            System.out.println("Prix : " +coffre.getPrix());
                            System.out.println("");
                        }
                        break;
                    case 4:
                        //TODO Frais correspondant
                        System.out.println("\n*********************************");
                        System.out.println("****** FRAIS CORRESPONDANT ******");
                        System.out.println("*********************************");
                        break;
                    case 0:
                        System.out.println("--- Fin du programme ---");
                        break;
                    default:
                        System.out.println("Choix inconnu. Réessayez.");
                }
            } while (choix != 0);
        }
    }

    private static void afficherMenu() {
        System.out.println("\n****************************");
        System.out.println("****** MENU PRINCIPAL ******");
        System.out.println("****************************");
        System.out.println("1 - Informations sur la banque");
        System.out.println("2 - Liste des opérations");
        System.out.println("3 - Liste des coffres");
        System.out.println("4 - Frais correspondant");
        System.out.println("0 - Arrêter le programme");
    }

    private static int getChoix(int choix) {
        do {
            afficherMenu();
            choix = sc.nextByte();
        } while (choix < 0 && choix > 4);
        return choix;
    }
}
