package representations;

import java.util.List;


public class Predicates {

	/**
	 * definition des paramètre et varriable de la classe
	 */
	//ensemble des predicats pour un domaine donné
	private List<Axiome> predicats;

	//constructeur de la super classe
	public Predicates() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	//constructeur principale de la classe
	public Predicates(List<Axiome> predicats) {
		super();
		this.predicats = predicats;
	}

	
	//generateur des getters et des setters
	public List<Axiome> getPredicats() {
		return predicats;
	}

	public void setPredicats(List<Axiome> predicats) {
		this.predicats = predicats;
	}

}
