public class Main {

    public static void main(String[] args){
        Client client = new Client();
        Client.Connexion(client.getUser(), client.getPass());
    }
}
