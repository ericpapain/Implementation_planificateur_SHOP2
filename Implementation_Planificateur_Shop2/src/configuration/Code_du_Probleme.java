/**
 * Dans cette classe j'essaie de construire comment et décris un problème
 * elle comprend tous ses methodes d'acces permettant de récuperer les différent param du problème
 */

package configuration;

import java.util.List;

import representations.Axiome;
import representations.Noeud_Tache;


public class Code_du_Probleme {
	/**
	 * definition de la liste des taches a realiser dans le code probleme de planification
	 */
	private List<Noeud_Tache> Taches;
	
	/**
	 * definition des instance de l'etat initial
	 */
	private List<Axiome> etatInitialDescription;

	
	/**
	 * copnstructeur par defaut
	 */
	public Code_du_Probleme() {
		super();
		// TODO Auto-generated constructor stub
	}

	
	/**
	 * conctructeur de la classe probleme
	 * @param taches
	 * @param etatInitialDescription
	 */
	public Code_du_Probleme(List<Noeud_Tache> taches,
			List<Axiome> etatInitialDescription) {
		super();
		Taches = taches;
		this.etatInitialDescription = etatInitialDescription;
	}
	
	
	/**
	 * definition des gettrer et des setters
	 * @return
	 */
	public List<Noeud_Tache> getTaches() {
		return Taches;
	}

	public void setTaches(List<Noeud_Tache> taches) {
		Taches = taches;
	}

	public List<Axiome> getEtatInitialDescription() {
		return etatInitialDescription;
	}

	public void setEtatInitialDescription(List<Axiome> etatInitialDescription) {
		this.etatInitialDescription = etatInitialDescription;
	}

}
