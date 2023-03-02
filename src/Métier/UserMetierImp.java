package Métier;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import Métier.SingletonConnection;
import Métier.user;

public class UserMetierImp implements IUserMetier{

	@Override
	public void createUser(user u) {
		Connection conn = SingletonConnection.getConnection();
		
		try { 
				PreparedStatement ps = conn.prepareStatement
					("INSERT INTO user(nom_user,prenom_user,email_user,adr_user,ville_user,tel_user,mdp_user) VALUES (?,?,?,?,?,?,?)");
				ps.setString(1, u.getNom_user());
				ps.setString(2, u.getPrenom_user());
				ps.setString(3, u.getEmail_user());
				ps.setString(4, u.getAdr_user());
				ps.setString(5, u.getVille_user());
				ps.setString(6, u.getTel_user());
				ps.setString(7, u.getMdp_user());
				ps.executeUpdate();
				ps.close();						
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

	@Override
	public void deleteUser(int num_user) {
		Connection conn = SingletonConnection.getConnection();
		
		try {
				PreparedStatement ps = conn.prepareStatement
					("DELETE FROM user WHERE num_user = ?");
				ps.setInt(1, num_user);
				ps.executeUpdate();
				ps.close();						
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}

	@Override
	public void updateUser(user u) {
		Connection conn = SingletonConnection.getConnection();
		try {
			PreparedStatement ps = conn.prepareStatement
					("UPDATE user SET nom_user = ?, prenom_user = ?,email_user = ?,adr_user = ?,ville_user = ?, tel_user = ?, mdp_user = ? WHERE num_doss = ?");
				ps.setString(1, u.getNom_user());
				ps.setString(2, u.getPrenom_user());
				ps.setString(3, u.getEmail_user());
				ps.setString(4, u.getAdr_user());
				ps.setString(5, u.getVille_user());
				ps.setString(6, u.getTel_user());
				ps.setString(7, u.getMdp_user());
				ps.setInt(8, u.getNum_user());
				ps.executeUpdate();
				ps.close();						
	} catch (SQLException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
		
		
	}

	@Override
	public List<user> listeUsers() {
		List<user> ur = new ArrayList<user>();
		Connection conn = SingletonConnection.getConnection();
		try {
			PreparedStatement ps = conn.prepareStatement
					("SELECT * FROM user");
			ResultSet rs = ps.executeQuery();
			while(rs.next())
			{
				user u = new user();
				u.setNum_user(rs.getInt("num_user"));
				u.setNom_user(rs.getString("nom_user"));
				u.setPrenom_user(rs.getString("prenom_user"));
				u.setEmail_user(rs.getString("email_user"));
				u.setAdr_user(rs.getString("adr_user"));
				u.setVille_user(rs.getString("ville_user"));
				u.setTel_user(rs.getString("tel_user"));
				u.setMdp_user(rs.getString("mdp_user"));
				ur.add(u);
			}
			ps.close();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return ur;
	}

	@Override
	public user getUser(int num_user) {
		user u = null;
		Connection conn = SingletonConnection.getConnection();
		try {
			PreparedStatement ps = conn.prepareStatement
					("SELECT * FROM user WHERE num_user = ?");
			ps.setInt(1,num_user);
			ResultSet rs = ps.executeQuery();
			if(rs.next())
			{
				u = new user();
				u.setNum_user(rs.getInt("num_user"));
				u.setNom_user(rs.getString("nom_user"));
				u.setPrenom_user(rs.getString("prenom_user"));
				u.setEmail_user(rs.getString("email_user"));
				u.setAdr_user(rs.getString("adr_user"));
				u.setVille_user(rs.getString("ville_user"));
				u.setTel_user(rs.getString("tel_user"));
				u.setMdp_user(rs.getString("mdp_user"));
				
 			}
			ps.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return u;
	}

	@Override
	public user getUserTwo(String login, String mdp) {
		user u = null;
		Connection conn = SingletonConnection.getConnection();
		try {
			PreparedStatement ps = conn.prepareStatement
					("SELECT * FROM user WHERE email_user = ? AND mdp_user = ?");
			ps.setString(1,login);
			ps.setString(2, mdp);
			ResultSet rs = ps.executeQuery();
			if(rs.next())
			{
				u = new user();
				u.setNum_user(rs.getInt("num_user"));
				u.setNom_user(rs.getString("nom_user"));
				u.setPrenom_user(rs.getString("prenom_user"));
				u.setEmail_user(rs.getString("email_user"));
				u.setAdr_user(rs.getString("adr_user"));
				u.setVille_user(rs.getString("ville_user"));
				u.setTel_user(rs.getString("tel_user"));
				u.setMdp_user(rs.getString("mdp_user"));
				
 			}
			ps.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return u;
	}

}
