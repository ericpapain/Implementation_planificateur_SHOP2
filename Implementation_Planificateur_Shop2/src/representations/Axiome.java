package representations;

public class Axiome {
	/**
	 * definition des paramètre et varriable de la classe
	 */
	//  nom de l'axiome e.g (quitter ?pos1 ?pos2)
	private String nom;
	
	//premier operateur
	private String operateur1;
	
	//deuxieme operateur
	private String operateur2;
	
	//operateur d'assertion (poser_sur ?colis)
	private String operateur;

	
	
	// constructeur de la super classe
	public Axiome() {
		super();
		// TODO Auto-generated constructor stub
	}

	//constructeur juste d'assertion
	public Axiome(String nom, String operateur) {
		super();
		this.nom = nom;
		this.operateur = operateur;
	}

	//constructeur a deux operateur 
	public Axiome(String nom, String operateur1, String operateur2) {
		super();
		this.nom = nom;
		this.operateur1 = operateur1;
		this.operateur2 = operateur2;
	}

	
	//getter et setter
	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public String getOperateur1() {
		return operateur1;
	}

	public void setOperateur1(String operateur1) {
		this.operateur1 = operateur1;
	}

	public String getOperateur2() {
		return operateur2;
	}

	public void setOperateur2(String operateur2) {
		this.operateur2 = operateur2;
	}

	public String getOperateur() {
		return operateur;
	}

	public void setOperateur(String operateur) {
		this.operateur = operateur;
	}
	
	
}
