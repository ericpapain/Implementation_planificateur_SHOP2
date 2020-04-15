/**
 * Dans cette classe j'essaie de construire comment est décris un domaine
 * elle comprend tous ses methodes d'acces permettant de récuperer les différent param du problème
 */

package configuration;
import java.util.List;

import representations.Action;
import representations.Methodes;
import representations.Noeud_Tache;
import representations.Predicates;


public class Domaine {
	
	/**
	 * construction du domaine de resolution de probleme avec l'algorithme de SHOP2
	 */
	
	
	/**
	 * definition des paramètre et varriable de la classe
	 */
	//liste de tous les predicats du domaine
	private List<Predicates> predicats;
	
	//defintion des differentes taches qui constituent le domaine
	private List<Noeud_Tache> taches;
	
	//defintion de l'ensembles des méthodes de décomposition des taches
	private List<Methodes> methodes;
	
	//definition des differents opérateurs qui sont des taches primitives
	private List<Action> operateurs;

	
	/**
	 *  //constructeur de la super classe
	 */
	public Domaine() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * 	//constructeur de la classe 
	 * @param predicats
	 * @param taches
	 * @param methodes
	 * @param operateurs
	 */
	public Domaine(List<Predicates> predicats, List<Noeud_Tache> taches,
			List<Methodes> methodes, List<Action> operateurs) {
		super();
		this.predicats = predicats;
		this.taches = taches;
		this.methodes = methodes;
		this.operateurs = operateurs;
	}

	/**
	 * //definition des getters et des setters
	 * 
	 */
	public List<Predicates> getPredicats() {
		return predicats;
	}

	public void setPredicats(List<Predicates> predicats) {
		this.predicats = predicats;
	}

	public List<Noeud_Tache> getTaches() {
		return taches;
	}

	public void setTaches(List<Noeud_Tache> taches) {
		this.taches = taches;
	}

	public List<Methodes> getMethodes() {
		return methodes;
	}

	public void setMethodes(List<Methodes> methodes) {
		this.methodes = methodes;
	}

	public List<Action> getOperateurs() {
		return operateurs;
	}

	public void setOperateurs(List<Action> operateurs) {
		this.operateurs = operateurs;
	}

}
