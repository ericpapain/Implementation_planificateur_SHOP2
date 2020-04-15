/**
 * Dans cette classe j'essaie de construire une tache qui est un ensemble de noeud qui peut etre
 * decomposer par une methode ou executer dirrectement par un opérateur
 */


package configuration;


import java.util.List;

import representations.Noeud_Tache;


public class Taches {
	/**
	 * definition 
	 */
	
	private List<Noeud_Tache> taches;

	/**
	 * defintion du constructeur par defaut
	 */
	public Taches() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
	/**
	 * constructeur de la classe
	 * @param taches
	 */
	public Taches(List<Noeud_Tache> taches) {
		super();
		this.taches = taches;
	}

	
	/**
	 * defintion des getters et des setters
	 * @return
	 */
	public List<Noeud_Tache> getTaches() {
		return taches;
	}

	public void setTaches(List<Noeud_Tache> taches) {
		this.taches = taches;
	}

}

