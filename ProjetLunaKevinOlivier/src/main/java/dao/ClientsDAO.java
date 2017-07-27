package dao;


public interface ClientsDAO {

	public 	void insertClient(Clients clients);
	public 	void updateClient(Clients clients);
	public 	void removeClients(int id_clients);
	public 	Clients getActeur(int acteurId);
	public Clients login(String login,String password);
	
	
}
