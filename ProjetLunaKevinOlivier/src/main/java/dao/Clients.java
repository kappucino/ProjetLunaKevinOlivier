package dao;

public class Clients {

	private int code_client ;
	private String nom_client;
	private String prenom_client;
	private String adresse_client;
	private int mobile_phone;
	private int phone;
	private String client_mail;
	private String Client_remarque;
	
	public int getCode_client() {
		return code_client;
	}

	public void setCode_client(int code_client) {
		this.code_client = code_client;
	}

	public String getNom_client() {
		return nom_client;
	}

	public void setNom_client(String nom_client) {
		this.nom_client = nom_client;
	}

	public String getPrenom_client() {
		return prenom_client;
	}

	public void setPrenom_client(String prenom_client) {
		this.prenom_client = prenom_client;
	}

	public String getAdresse_client() {
		return adresse_client;
	}

	public void setAdresse_client(String adresse_client) {
		this.adresse_client = adresse_client;
	}

	public int getMobile_phone() {
		return mobile_phone;
	}

	public void setMobile_phone(int mobile_phone) {
		this.mobile_phone = mobile_phone;
	}

	public int getPhone() {
		return phone;
	}

	public void setPhone(int phone) {
		this.phone = phone;
	}

	public String getClient_mail() {
		return client_mail;
	}

	public void setClient_mail(String client_mail) {
		this.client_mail = client_mail;
	}

	public String getClient_remarque() {
		return Client_remarque;
	}

	public void setClient_remarque(String client_remarque) {
		Client_remarque = client_remarque;
	}

	public Clients(){
		
	}
	
	public Clients(int code_client, String nom_client, String prenom_client, String adresse_client, int mobile_phone,
			int phone, String client_mail, String client_remarque) {
		super();
		this.code_client = code_client;
		this.nom_client = nom_client;
		this.prenom_client = prenom_client;
		this.adresse_client = adresse_client;
		this.mobile_phone = mobile_phone;
		this.phone = phone;
		this.client_mail = client_mail;
		Client_remarque = client_remarque;
	}
	
	
	
}
