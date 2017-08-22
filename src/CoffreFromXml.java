//Merkling Dimitri

import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import org.xml.sax.SAXException;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import java.io.File;
import java.io.IOException;
import java.util.Random;

public class CoffreFromXml {

    public static void main() {
        Afficher_Logo();
        Afficher_Liste_Coffre();
    }

    private static void Afficher_Logo() {
        System.out.println(
                "   ____      _                   _   _       \n" +
                        "  / ___|_ __(_)_ __   __ _  ___ | |_| |_ ___ \n" +
                        " | |  _| '__| | '_ \\ / _` |/ _ \\| __| __/ __|\n" +
                        " | |_| | |  | | | | | (_| | (_) | |_| |_\\__ \\\n" +
                        "  \\____|_|  |_|_| |_|\\__, |\\___/ \\__|\\__|___/\n" +
                        "                     |___/                    \n" +
                        "\n" +
                        "\n");
    }

    private static void Afficher_Liste_Coffre() {
        // Récupération d'une instance de la classe "DocumentBuilderFactory"
        final DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();

        try {
            // Création d'un parseur
            final DocumentBuilder builder = factory.newDocumentBuilder();

            // Création d'un Document
            final Document document = builder.parse(new File("Cataloguefrais2016.xml"));

            // Récupération de l'Element racine
            final Element racine = document.getDocumentElement();

            // Récupération des coffres
            final NodeList racineNoeuds = racine.getChildNodes();
            final int nbRacineNoeuds = racineNoeuds.getLength();

            for (int i = 0; i < nbRacineNoeuds; i++) {
                if (racineNoeuds.item(i).getNodeType() == Node.ELEMENT_NODE) {
                    final Element coffre = (Element) racineNoeuds.item(i);

                    //Affichage d'une opération
                    //System.out.println("\n*************COFFRES************");

                    // Récupération des informations
                    final Element TypeCoffre = (Element) coffre.getElementsByTagName("TypeCoffre").item(0);
                    final Element PeriodeLocation = (Element) coffre.getElementsByTagName("PeriodeLocation").item(0);
                    final Element PrixPeriode = (Element) coffre.getElementsByTagName("PrixPeriode").item(0);
                    final Element Devise = (Element) coffre.getElementsByTagName("Devise").item(0);
                    final Element IdClient = (Element) coffre.getElementsByTagName("IdClient").item(0);

                    //Affichage des informations
                    /*System.out.println("Type de coffre : " + TypeCoffre.getTextContent());
                    System.out.println("Période de location : " + PeriodeLocation.getTextContent());
                    System.out.println("Prix de la période : " + PrixPeriode.getTextContent());
                    System.out.println("Devise : " + Devise.getTextContent());
                    System.out.println("Client : " + IdClient.getTextContent());*/

                    Random rand = new Random();
                    int nombreAleatoire = rand.nextInt(10);

                    Coffre coffreObjet = new Coffre(nombreAleatoire, TypeCoffre.getTextContent(), PeriodeLocation.getTextContent(), Double.parseDouble(PrixPeriode.getTextContent()), Devise.getTextContent(), Integer.parseInt(IdClient.getTextContent()));
                    Coffre.listeCoffre.add(coffreObjet);
                }
            }
        } catch (final Exception e) {
            e.printStackTrace();
        }
    }
}
