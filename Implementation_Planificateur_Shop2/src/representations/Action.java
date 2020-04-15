/**
 * Dans cette classe j'essaie de construire comment est decrit une action ou un opérateur
 *
 */

package representations;

import java.util.List;


public class Action {
	
	/**
	 * definition des paramètre et varriable de la classe
	 */
	//nom de l'operateur
	private String nom;
	
	//liste des parametres de l'operateur
	private List<String> parametres;
	
	//liste des preconditions pour appliquer l'action
	private List<Axiome> preconditions;
	
	//liste des effect apres application de l'action a un état
	private List<Axiome> effects;

	
	/**
	 * //constructeur par defaut de la classe
	 */
	public Action() {
		super();
		// TODO Auto-generated constructor stub
	}


	/**
	 * //constructeur principale de la classe
	 * @param nom
	 * @param parametres
	 * @param preconditions
	 * @param effects
	 */
	public Action(String nom, List<String> parametres, List<Axiome> preconditions, List<Axiome> effects) {
		super();
		this.nom = nom;
		this.parametres = parametres;
		this.preconditions = preconditions;
		this.effects = effects;
	}



	/**
	 * //generation des getters et setters
	 * @return
	 */
	public String getNom() {
		return nom;
	}


	public void setNom(String nom) {
		this.nom = nom;
	}


	public List<String> getParametres() {
		return parametres;
	}


	public void setParametres(List<String> parametres) {
		this.parametres = parametres;
	}


	public List<Axiome> getPreconditions() {
		return preconditions;
	}


	public void setPreconditions(List<Axiome> preconditions) {
		this.preconditions = preconditions;
	}


	public List<Axiome> getEffects() {
		return effects;
	}


	public void setEffects(List<Axiome> effects) {
		this.effects = effects;
	}
	
}
