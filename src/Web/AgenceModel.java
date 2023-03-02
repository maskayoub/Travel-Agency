package Web;

import java.util.ArrayList;
import java.util.List;

import Métier.contact;
import Métier.user;
import Métier.voyages;


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
