/**
 * Dans cette classe j'essaie de construire comment et décris un noeud
 * 
 */

package representations;

import java.util.List;


public final class Noeud_Tache {
		
	/**
	 * definition des paramètre et varriable de la classe
	 */
	//Noeud_Tache parent
    private Noeud_Tache parent;
    
    // nom de la tache
    private String nom;
    
    //liste des parametre de la tache
    private List<String> parametre;
    
    //liste des precondition a remplir pour realiser la tache
    private List<Axiome> preconditions;
    
    //liste des effect et changement d'etat
    private List<Axiome> effect;

    
    
	public Noeud_Tache() {
		super();
		// TODO Auto-generated constructor stub
	}


	public Noeud_Tache(Noeud_Tache parent, String nom, List<String> parametre, List<Axiome> preconditions, List<Axiome> effect) {
		super();
		this.parent = parent;
		this.nom = nom;
		this.parametre = parametre;
		this.preconditions = preconditions;
		this.effect = effect;
	}


	
	public List<String> getParametre() {
		return parametre;
	}


	public void setParametre(List<String> parametre) {
		this.parametre = parametre;
	}


	public Noeud_Tache getParent() {
		return parent;
	}



	public void setParent(Noeud_Tache parent) {
		this.parent = parent;
	}



	public String getNom() {
		return nom;
	}



	public void setNom(String nom) {
		this.nom = nom;
	}

	
	public List<Axiome> getPreconditions() {
		return preconditions;
	}



	public void setPreconditions(List<Axiome> preconditions) {
		this.preconditions = preconditions;
	}



	public List<Axiome> getEffect() {
		return effect;
	}



	public void setEffect(List<Axiome> effect) {
		this.effect = effect;
	}
    

}
