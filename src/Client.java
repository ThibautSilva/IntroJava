import java.util.Scanner;

public class Client {
	
	public int id;
	public static String user = "Toto";
	public static String pass = "Tata";
	public String adresse;
	public String codePostal;
	public String numeroTel;
	
	/**
	 * Constructeur de client 
	 */
	public Client() {
		adresse = "3 rue de la paix";
		numeroTel = "06 81 98 75 42";
	}
		
	/**
	 * Mode qui permet la connexion
	 */
	public static boolean connexion() {
		Scanner input = new Scanner(System.in);
		boolean test = false;
		
		String username;
	    String password;

	    while(!test) {
			System.out.print("login: ");
			username = input.next();
			
			System.out.print("password: ");
			password = input.next();
			
			if(username.equals(user) && password.equals(pass)) {
				System.out.println(user + " est connecté");
				
				System.out.println("Bonjour "+ user);
				
				test = true;
			}
			else {
				System.out.println("ERREUR RECOMMENCER");
			}
	    }
	    return test;
	}
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public static String getUser() {
		return user;
	}
	public static void setUser(String user) {
		Client.user = user;
	}
	public static String getPass() {
		return pass;
	}
	public static void setPass(String pass) {
		Client.pass = pass;
	}
	public String getAdresse() {
		return adresse;
	}
	public void setAdresse(String adresse) {
		this.adresse = adresse;
	}
	public String getCodePostal() {
		return codePostal;
	}
	public void setCodePostal(String codePostal) {
		this.codePostal = codePostal;
	}
	public String getNumeroTel() {
		return numeroTel;
	}
	public void setNumeroTel(String numeroTel) {
		this.numeroTel = numeroTel;
	}

	public static void printClient(Client c) {
		System.out.println("Identifiant : " + c.getId());
		System.out.println("Utilisateur : " + getUser());
		System.out.println("Adresse : " + c.getAdresse() + c.getCodePostal());
		System.out.println("Téléphone : " + c.getNumeroTel());
	}
}
