package Métier;

public class utilisateur {
	private int num_cl;
	private String nom_cl;
	private String pr_cl;
	private String email_cl;
	private String tel_cl;
	private String addr_cl;
	private String username_cl;
	private String password_cl;
	
	public int getNum_cl() {
		return num_cl;
	}
	public void setNum_cl(int num_cl) {
		this.num_cl = num_cl;
	}
	
	public String getNom_cl() {
		return nom_cl;
	}
	public void setNom_cl(String nom_cl) {
		this.nom_cl = nom_cl;
	}
	public String getPr_cl() {
		return pr_cl;
	}
	public void setPr_cl(String pr_cl) {
		this.pr_cl = pr_cl;
	}
	public String getEmail_cl() {
		return email_cl;
	}
	public void setEmail_cl(String email_cl) {
		this.email_cl = email_cl;
	}
	public String getTel_cl() {
		return tel_cl;
	}
	public void setTel_cl(String tel_cl) {
		this.tel_cl = tel_cl;
	}
	public String getAddr_cl() {
		return addr_cl;
	}
	public void setAddr_cl(String addr_cl) {
		this.addr_cl = addr_cl;
	}
	public String getUsername_cl() {
		return username_cl;
	}
	public void setUsername_cl(String username_cl) {
		this.username_cl = username_cl;
	}
	public String getPassword_cl() {
		return password_cl;
	}
	public void setPassword_cl(String password_cl) {
		this.password_cl = password_cl;
	}
	public utilisateur(int num_cl, String nom_cl, String pr_cl, String email_cl, String tel_cl, String addr_cl, String username_cl,
			String password_cl) {
		super();
		this.num_cl = num_cl;
		this.nom_cl = nom_cl;
		this.pr_cl = pr_cl;
		this.email_cl = email_cl;
		this.tel_cl = tel_cl;
		this.addr_cl = addr_cl;
		this.username_cl = username_cl;
		this.password_cl = password_cl;
	}
	public utilisateur() {
		super();
		// TODO Auto-generated constructor stub
	}

	
}
