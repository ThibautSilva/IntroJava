import java.util.List;

public class Main {

    public static void main(String[] args){
        boolean connect = Client.connexion();
        if(connect) {
            //todo generate Agence
             Centre centre = new Centre("Lorraine");
             Sucursale sucursale = new Sucursale(centre, "Nancy");
             Agence agenceLaxou = new Agence("Laxou","55240", "Grand Nancy", sucursale);
             Agence agenceBrabois = new Agence("Brabois", "55230", "Grans Nancy", sucursale);
            //todo generate coffre
        }
    }
}
