package Web;

import java.util.ArrayList;
import java.util.List;

import M�tier.contact;
import M�tier.user;
import M�tier.voyages;


public class AgenceModel {
	
	private List<voyages> listeVoyages = new ArrayList<voyages>();
	private user ur = new user();
	private List<contact> messages = new ArrayList<contact>();
	


	public List<contact> getMessages() {
		return messages;
	}

	public void setMessages(List<contact> messages) {
		this.messages = messages;
	}

	public user getUr() {
		return ur;
	}

	public void setUr(user ur) {
		this.ur = ur;
	}

	public List<voyages> getListeVoyages() {
		return listeVoyages;
	}

	public void setListeVoyages(List<voyages> listeVoyages) {
		this.listeVoyages = listeVoyages;
	}}
