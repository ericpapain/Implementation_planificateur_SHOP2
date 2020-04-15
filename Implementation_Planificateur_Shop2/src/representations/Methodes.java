package representations;

import java.util.List;



public class Methodes {
	
	/**
	 * definition des paramètre et varriable de la classe
	 */
	// nom de la methode
	private String nom;
	
	//liste des parametres
	private List<String> parametres;
	
	//liste des preconditions avant l'application de la decomposition
	private List<Axiome> preconditions;
	
	//tache sur laquelle la methode de decomposition va s'appliquer
	private Noeud_Tache tache;
	
	//liste des sous taches de decomposition de notre super taches elle sont toutes ordonnées
	private List<Noeud_Tache> sousTache;

	
	//definition du constructeur par defaut de la classe
	public Methodes() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
	/**
	 * //definition du construteur de la classe
	 * @param nom
	 * @param parametres
	 * @param preconditions
	 * @param tache
	 * @param sousTache
	 */
	public Methodes(String nom, List<String> parametres,List<Axiome> preconditions, Noeud_Tache tache,List<Noeud_Tache> sousTache) {
		super();
		this.nom = nom;
		this.parametres = parametres;
		this.preconditions = preconditions;
		this.tache = tache;
		this.sousTache = sousTache;
	}
	
	/**
	 * //defintion des setters et des getters
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


	public Noeud_Tache getTache() {
		return tache;
	}


	public void setTache(Noeud_Tache tache) {
		this.tache = tache;
	}


	public List<Noeud_Tache> getSousTache() {
		return sousTache;
	}


	public void setSousTache(List<Noeud_Tache> sousTache) {
		this.sousTache = sousTache;
	}
	
}
