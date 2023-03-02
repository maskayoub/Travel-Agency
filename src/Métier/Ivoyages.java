package Métier;

import java.util.List;

public interface Ivoyages {
	
	public int addVoyage(voyages v);
	public void deleteVoyage(int num_voy);
	public void modifierVoyage(voyages v);
	public List<voyages> listeVoyages();
	public voyages getVoyage(int num_voy);
	public List<voyages> rechercheVoyages(String dest_voy, String check_in_v, String check_out_v, int nbre_adultes, int nbre_enfants);

}
