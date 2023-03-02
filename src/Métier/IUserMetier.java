package Métier;

import java.util.List;

public interface IUserMetier {
	
	public void createUser(user u);
	public void deleteUser(int num_user);
	public void updateUser(user u);
	public List<user> listeUsers();
	public user getUser(int num_user);
	public user getUserTwo(String login, String mdp);
	
}
