package Métier;

public class voyages {
	private int num_voy;
	private String dest_voy;
	private String nom_voy;
	private String type_voy;
	private String check_in_v;
	private String check_out_v;
	private String moyen_trans;		//Le moyen de transport utilisé pour arriver a la destination
	private double prix_voy;
	private String date_ajout;		// La date d'ajout du voyage a la bdd
	private int num_admin;			// l'admin qui a ajouté le voyage
	private String com_voy;			// Commentaire sur le voyage (optionel)
	private int qte_offre;
	private int nbre_adultes; // Nbres de places pour adultes
	private int nbre_enfants;	// Nbres de places pour enfants
	private String nom_hotel;
	private int nbre_etoiles_hotel;
	
	public void setNbre_adultes(int nbre_adultes) {
		this.nbre_adultes = nbre_adultes;
	}


	public void setNbre_enfants(int nbre_enfants) {
		this.nbre_enfants = nbre_enfants;
	}


	public voyages(String dest_voy, String nom_voy, String type_voy, String check_in_v,
			String check_out_v, String moyen_trans, double prix_voy, String date_ajout,
			int num_admin, String com_voy,int qte_offre, int nbre_adultes, int nbre_enfants,
			String nom_hotel, int nbre_etoiles_hotel) {
		super();
		this.dest_voy = dest_voy;
		this.nom_voy = nom_voy;
		this.type_voy = type_voy;
		this.check_in_v = check_in_v;
		this.check_out_v = check_out_v;
		this.moyen_trans = moyen_trans;
		this.prix_voy = prix_voy;
		this.date_ajout = date_ajout;
		this.num_admin = num_admin;
		this.com_voy = com_voy;
		this.qte_offre = qte_offre;
		this.nbre_adultes = nbre_adultes;
		this.nbre_enfants = nbre_enfants;
		this.nom_hotel = nom_hotel;
		this.nbre_etoiles_hotel = nbre_etoiles_hotel;
	}

	
	public String getNom_hotel() {
		return nom_hotel;
	}


	public void setNom_hotel(String nom_hotel) {
		this.nom_hotel = nom_hotel;
	}


	public int getNbre_etoiles_hotel() {
		return nbre_etoiles_hotel;
	}


	public void setNbre_etoiles_hotel(int nbre_etoiles_hotel) {
		this.nbre_etoiles_hotel = nbre_etoiles_hotel;
	}


	public int getNbre_adultes() {
		return nbre_adultes;
	}

	public int getNbre_enfants() {
		return nbre_enfants;
	}

	public int getNum_voy() {
		return num_voy;
	}

	public void setNum_voy(int num_voy) {
		this.num_voy = num_voy;
	}

	public String getDest_voy() {
		return dest_voy;
	}

	public void setDest_voy(String dest_voy) {
		this.dest_voy = dest_voy;
	}

	public String getNom_voy() {
		return nom_voy;
	}

	public void setNom_voy(String nom_voy) {
		this.nom_voy = nom_voy;
	}

	public String getType_voy() {
		return type_voy;
	}

	public void setType_voy(String type_voy) {
		this.type_voy = type_voy;
	}

	public int getQte_offre() {
		return qte_offre;
	}

	public void setQte_offre(int qte_offre) {
		this.qte_offre = qte_offre;
	}

	public String getCheck_in_v() {
		return check_in_v;
	}

	public void setCheck_in_v(String check_in_v) {
		this.check_in_v = check_in_v;
	}

	public String getCheck_out_v() {
		return check_out_v;
	}

	public void setCheck_out_v(String check_out_v) {
		this.check_out_v = check_out_v;
	}

	public String getMoyen_trans() {
		return moyen_trans;
	}

	public void setMoyen_trans(String moyen_trans) {
		this.moyen_trans = moyen_trans;
	}

	
	public double getPrix_voy() {
		return prix_voy;
	}

	public void setPrix_voy(double prix_voy) {
		this.prix_voy = prix_voy;
	}

	public String getDate_ajout() {
		return date_ajout;
	}

	public void setDate_ajout(String date_ajout) {
		this.date_ajout = date_ajout;
	}

	public int getNum_admin() {
		return num_admin;
	}

	public void setNum_admin(int num_admin) {
		this.num_admin = num_admin;
	}

	public String getCom_voy() {
		return com_voy;
	}

	public void setCom_voy(String com_voy) {
		this.com_voy = com_voy;
	}
	



	public voyages() {
		super();
		// TODO Auto-generated constructor stub
	}


	
	
	
	
}
