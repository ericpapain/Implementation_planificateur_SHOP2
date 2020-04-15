/**
 * Dans cette classe j'essaie construction de l'etat initial d'un probleme
 * elle comprend essentiellement les differents axiomes du probleme
 */


package configuration;


import java.util.List;

import representations.Axiome;


public class EtatInitial {
	
	/**
	 * definition des different axiome pour description de l'etat initial
	 */
	private List<Axiome> etatInitial;


	/**
	 * definition constructeur par defaut de la classe
	 */
	public EtatInitial() {
		super();
		// TODO Auto-generated constructor stub
	}
 
	/**
	 * definition du constructeur de la classe
	 * @param etatInitial
	 */
	public EtatInitial(List<Axiome> etatInitial) {
		super();
		this.etatInitial = etatInitial;
	}

	/**
	 * definition des getters et des setters
	 * @return
	 */
	public List<Axiome> getEtatInitial() {
		return etatInitial;
	}


	public void setEtatInitial(List<Axiome> etatInitial) {
		this.etatInitial = etatInitial;
	}
	
	
	
	
}
