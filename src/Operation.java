import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * Created by
 * LASSERRE Arnaud
 * DUBOIS Anthony
 * LAURENT Anthony
 * the 21/08/2017.
 */
public class Operation {

    // ID propre à l'objet, unique en base
    private int id;

    // Objet lié au coffre fort présent dans l'agence
    private Coffre coffre;

    // Frais engendré par la garde de l'agence, lors du transfert d'un élément du coffre
    private float fraisDeGarde;

    // Client lié à l'opération
    private Client client;

    //Métas se référents à l'objet Operation
    private Date createDate;
    private Date updateDate;

    public Operation(int id, Coffre coffre, Client client) {
        this.id = id;
        this.coffre = coffre;
        this.client = client;
        this.createDate = new Date();
        this.updateDate = new Date();
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Coffre getCoffre() {
        return coffre;
    }

    public void setCoffre(Coffre coffre) {
        this.coffre = coffre;
    }

    public float getFraisDeGarde() {
        return fraisDeGarde;
    }

    public void setFraisDeGarde(float fraisDeGarde) {
        this.fraisDeGarde = fraisDeGarde;
    }

    public Client getClient() {
        return client;
    }

    public void setClient(Client client) {
        this.client = client;
    }

    public Date getCreateDate() {
        return createDate;
    }

    public Date getUpdateDate() {
        return updateDate;
    }

    protected static List<Operation> generateOperationsList() {
        List<Operation> operationsList = new ArrayList<Operation>();

        for (int i=0; i<Coffre.listeCoffre.size(); i++) {
            Operation o = new Operation(i, Coffre.listeCoffre.get(i), new Client());
            operationsList.add(o);
        }

        return operationsList;
    }


    protected static void printOperation(Operation o) {
        System.out.println("Opération numéro " + o.getId());
        CoffreFromXml.printCoffre(o.getCoffre());
        Client.printClient(o.getClient());
    }
}
