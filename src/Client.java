import java.util.Scanner;

public class Client {
	
	public int id;
	public static String user;
	public static String pass;
	public String adresse;
	public String codePostal;
	public String numeroTel;
	
	/**
	 * Constructeur de client 
	 */
	public Client() {
		user = "Toto";
		pass = "Tata";
		adresse = "3 rue de la paix";
		numeroTel = "06 81 98 75 42";
	}
		
	/**
	 * Mode qui permet la connexion 
	 * @param user
	 * @param pass
	 */
	public static void Connexion(String user, String pass) {
		Scanner input = new Scanner(System.in);
		boolean test = false;
		
		String username;
	    String password;
		
	    while(test == false) {
			System.out.println("login: ");
			username = input.next();
			
			System.out.println("password: ");
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
}
