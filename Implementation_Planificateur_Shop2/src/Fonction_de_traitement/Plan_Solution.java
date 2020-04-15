package Fonction_de_traitement;

import java.util.List;

import representations.Action;

public class Plan_Solution {
	
	/**
	 * definition de la liste des operateur de solutions
	 */
	private List<Action> sequenceActionSolution;

	/**
	 * defintion du constructeur par defaut
	 */
	public Plan_Solution() {
		super();
		// TODO Auto-generated constructor stub
	}
	

	/**
	 * constructeur de la classe
	 * @param sequenceActionSolution
	 */
	public Plan_Solution(List<Action> sequenceActionSolution) {
		super();
		this.sequenceActionSolution = sequenceActionSolution;
	}


	/**
	 * defintion des getters et des setters
	 * @return
	 */
	public List<Action> getSequenceActionSolution() {
		return sequenceActionSolution;
	}

	public void setSequenceActionSolution(List<Action> sequenceActionSolution) {
		this.sequenceActionSolution = sequenceActionSolution;
	}

}
