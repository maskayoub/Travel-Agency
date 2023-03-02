package Métier;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import Métier.SingletonConnection;

public class voyagesImpl implements Ivoyages{

	@Override
	public int addVoyage(voyages v) {
			Connection conn = SingletonConnection.getConnection();
		
		try {
				PreparedStatement ps = conn.prepareStatement
					("INSERT INTO voyages(dest_voy,nom_voy,type_voy,check_in_v,check_out_v,"
							+ "moyen_trans,prix_voy,date_ajout,num_admin,com_voy,qte_offre,"
							+ "nbre_adultes,nbre_enfants,nom_hotel,nbre_etoiles_hotel) "
							+ "VALUES (?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)");
				ps.setString(1, v.getDest_voy());
				ps.setString(2, v.getNom_voy());
				ps.setString(3, v.getType_voy());
				ps.setString(4, v.getCheck_in_v());
				ps.setString(5, v.getCheck_out_v());
				ps.setString(6, v.getMoyen_trans());
				ps.setDouble(7, v.getPrix_voy());
				ps.setString(8, v.getDate_ajout());
				ps.setInt(9, v.getNum_admin());
				ps.setString(10, v.getCom_voy());
				ps.setInt(11, v.getQte_offre());
				ps.setInt(12, v.getNbre_adultes());
				ps.setInt(13, v.getNbre_enfants());
				ps.setString(14, v.getNom_hotel());
				ps.setInt(15, v.getNbre_etoiles_hotel());
				ps.executeUpdate();
				ps.close();	
				return 1;
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return -1;
	}

	@Override
	public void deleteVoyage(int num_voy) {
Connection conn = SingletonConnection.getConnection();
		
		try {
				PreparedStatement ps = conn.prepareStatement
					("DELETE FROM voyages WHERE num_voy = ?");
				ps.setInt(1, num_voy);
				ps.executeUpdate();
				ps.close();						
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

	@Override
	public void modifierVoyage(voyages v) {
		Connection conn = SingletonConnection.getConnection();
		try {
			PreparedStatement ps = conn.prepareStatement
					("UPDATE voyages SET dest_voy = ?,  nom_voy = ?,  type_voy = ?,  check_in_v = ?, "
							+ " check_out_v  = ?,  moyen_trans = ?,  prix_voy = ?,  "
							+ "date_ajout = ?,  num_admin = ?,  com_voy = ?,  qte_offre = ?, "
							+ "nbre_adultes = ?,  nbre_enfants = ?,  nom_hotel = ?,  nbre_etoiles_hotel = ? "
							+ "WHERE num_voy = ?");
				ps.setString(1, v.getDest_voy());
				ps.setString(2, v.getNom_voy());
				ps.setString(3, v.getType_voy());
				ps.setString(4, v.getCheck_in_v());
				ps.setString(5, v.getCheck_out_v());
				ps.setString(6, v.getMoyen_trans());
				ps.setDouble(7, v.getPrix_voy());
				ps.setString(8, v.getDate_ajout());
				ps.setInt(9, v.getNum_admin());
				ps.setString(10, v.getCom_voy());
				ps.setInt(11, v.getQte_offre());
				ps.setInt(12, v.getNbre_adultes());
				ps.setInt(13, v.getNbre_enfants());
				ps.setString(14, v.getNom_hotel());
				ps.setInt(15, v.getNbre_etoiles_hotel());
				ps.setInt(16, v.getNum_voy());
				ps.executeUpdate();
				ps.close();						
	} catch (SQLException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
		
	}

	@Override
	public List<voyages> listeVoyages() {
		List<voyages> voy = new ArrayList<voyages>();
		Connection conn = SingletonConnection.getConnection();
		try {
			PreparedStatement ps = conn.prepareStatement
					("SELECT * FROM voyages ");
			ResultSet rs = ps.executeQuery();
			while(rs.next())
			{
				voyages v = new voyages();
				v.setNum_voy(rs.getInt("num_voy"));
				v.setDest_voy(rs.getString("dest_voy"));
				v.setNom_voy(rs.getString("nom_voy"));
				v.setType_voy(rs.getString("type_voy"));
				v.setCheck_in_v(rs.getString("check_in_v"));
				v.setCheck_out_v(rs.getString("check_out_v"));
				v.setMoyen_trans(rs.getString("moyen_trans"));
				v.setPrix_voy(rs.getDouble("prix_voy"));
				v.setDate_ajout(rs.getString("date_ajout"));
				v.setNum_admin(rs.getInt("num_admin"));
				v.setCom_voy(rs.getString("com_voy"));
				v.setQte_offre(rs.getInt("qte_offre"));
				v.setNbre_adultes(rs.getInt("nbre_adultes"));
				v.setNbre_enfants(rs.getInt("nbre_enfants"));
				v.setNom_hotel(rs.getString("nom_hotel"));
				v.setNbre_etoiles_hotel(rs.getInt("nbre_etoiles_hotel"));
				voy.add(v);
			}
			ps.close();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return voy;
	}

	@Override
	public voyages getVoyage(int num_voy) {
		voyages v = null;
		Connection conn = SingletonConnection.getConnection();
		try {
			PreparedStatement ps = conn.prepareStatement
					("SELECT * FROM voyages WHERE num_voy = ?");
			ps.setInt(1,num_voy);
			ResultSet rs = ps.executeQuery();
			if(rs.next())
			{
				v = new voyages();
				v.setNum_voy(rs.getInt("num_voy"));
				v.setDest_voy(rs.getString("dest_voy"));
				v.setNom_voy(rs.getString("nom_voy"));
				v.setType_voy(rs.getString("type_voy"));
				v.setCheck_in_v(rs.getString("check_in_v"));
				v.setCheck_out_v(rs.getString("check_out_v"));
				v.setMoyen_trans(rs.getString("moyen_trans"));
				v.setPrix_voy(rs.getDouble("prix_voy"));
				v.setDate_ajout(rs.getString("date_ajout"));
				v.setNum_admin(rs.getInt("num_admin"));
				v.setCom_voy(rs.getString("com_voy"));
				v.setQte_offre(rs.getInt("qte_offre"));
				v.setNbre_adultes(rs.getInt("nbre_adultes"));
				v.setNbre_enfants(rs.getInt("nbre_enfants"));
				v.setNom_hotel(rs.getString("nom_hotel"));
				v.setNbre_etoiles_hotel(rs.getInt("nbre_etoiles_hotel"));

 			}
			ps.close();
		} catch (SQLException e) {
			if(v==null) throw new RuntimeException("Voyage Introuvable");
			e.printStackTrace();
		}
		return v;
	}

	@Override
	public List<voyages> rechercheVoyages(String dest_voy, String check_in_v, String check_out_v, int nbre_adultes,
			int nbre_enfants) {
		List<voyages> voy = new ArrayList<voyages>();
		Connection conn = SingletonConnection.getConnection();
		try {
			PreparedStatement ps = conn.prepareStatement
					("SELECT * FROM voyages WHERE dest_voy = ? and check_in_v = ? "
							+ "and check_out_v = ? and nbre_adultes <= ? and nbre_enfants <= ?");
			ResultSet rs = ps.executeQuery();
			while(rs.next())
			{
				voyages v = new voyages();
				v.setNum_voy(rs.getInt("num_voy"));
				v.setDest_voy(rs.getString("dest_voy"));
				v.setNom_voy(rs.getString("nom_voy"));
				v.setType_voy(rs.getString("type_voy"));
				v.setCheck_in_v(rs.getString("check_in_v"));
				v.setCheck_out_v(rs.getString("check_out_v"));
				v.setMoyen_trans(rs.getString("moyen_trans"));
				v.setPrix_voy(rs.getDouble("prix_voy"));
				v.setDate_ajout(rs.getString("date_ajout"));
				v.setNum_admin(rs.getInt("num_admin"));
				v.setCom_voy(rs.getString("com_voy"));
				v.setQte_offre(rs.getInt("qte_offre"));
				v.setNbre_adultes(rs.getInt("nbre_adultes"));
				v.setNbre_enfants(rs.getInt("nbre_enfants"));
				v.setNom_hotel(rs.getString("nom_hotel"));
				v.setNbre_etoiles_hotel(rs.getInt("nbre_etoiles_hotel"));
				voy.add(v);
			}
			ps.close();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return voy;
	}


}
