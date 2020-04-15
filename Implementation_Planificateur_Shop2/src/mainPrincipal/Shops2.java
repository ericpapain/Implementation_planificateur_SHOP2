/**
 * Dans cette classe description de la procedure de l'algorithme shop2
 * elle est recurssive
 */

package mainPrincipal;

import java.util.ArrayList;
import java.util.List;
import java.util.Properties;

import representations.Action;
import representations.Axiome;
import representations.Methodes;
import representations.Noeud_Tache;
import Fonction_de_traitement.Plan_Solution;
import configuration.Code_du_Probleme;
import configuration.Domaine;

public class Shops2 {
	
	private Properties arguments;
	
	public Shops2(final Properties arguments) {
		super();
		this.arguments = arguments;
		}
	
	public List<Action> recherche(final Code_du_Probleme probleme, final Domaine domaine){
		
		/**
		 * creation du plan solution
		 */
		Plan_Solution plan = (Plan_Solution) new Plan_Solution().getSequenceActionSolution();
		
		plan=null;
		
		final List<Action> sequenceSolutions=plan.getSequenceActionSolution();
				
		/**
		 * recuperation de l'etat initial du probleme
		 */
		final List<Axiome> etatInitial_s = probleme.getEtatInitialDescription();
		
		
		/**
		 * recupération de la liste des taches a realiser
		 */
		final List<Noeud_Tache> taches_T = probleme.getTaches();
		
		/**
		 * defintion de l'algorithme shop 
		 */
		System.out.println(shop2(etatInitial_s, taches_T, domaine));
		return (List<Action>) plan;
		}
	
	/**
	 * implementation de l'algorithme shop2
	 * @param s
	 * @param T
	 * @param D
	 * @return
	 */
	public Plan_Solution shop2(List<Axiome> s, List<Noeud_Tache> T, Domaine D){
		Plan_Solution plan = (Plan_Solution) new Plan_Solution().getSequenceActionSolution();
		List<Action> plan_solution = plan.getSequenceActionSolution();
		plan = null;
		
		for (Noeud_Tache tache_t_zero : T) {
			if (T==null) {
				return plan;
			}else {
				
				//initialisation de l'etat initial comme precondition
				tache_t_zero.setPreconditions(s);
				
				int tailleParamTache=(tache_t_zero.getParametre()).size();
				List<Action> listeActionDomaine = new ArrayList<Action>();
				List<Methodes> listeMethodesDomaine = new ArrayList<Methodes>();

				listeActionDomaine=null;
				
				//recuperation de tous les opérateurs donnée dans le domaine
				for (int i = 0; i < (D.getOperateurs()).size(); i++) {
					
					//recherche des operateur pouvant resoudre la tache primitives
					for (Action op : (D.getOperateurs())) {
						if ((tailleParamTache==op.getParametres().size())&&(tache_t_zero.getPreconditions()==op.getPreconditions())){
							listeActionDomaine.add(op);
						}
					}
					
					if (listeActionDomaine!=null){
						//selection du premier opérateur dans la liste
						Action act = listeActionDomaine.get(0);
						//ajout de l'operateur dans la liste de solution
						plan_solution.add(act);
						//ajout dans le plan general
						plan.setSequenceActionSolution(plan_solution);
						
						//affectation du nouvel etat initial
						s = tache_t_zero.getEffect();
						
						//suppression de la tâche dans la liste de tâches
						int id_tache = T.indexOf(tache_t_zero);
						T.remove(id_tache);
						
						/**
						 * appel recurssif de l'algo shop2 sur les prochain noeud
						 */
					
						shop2(s, T, D);
						
					} 
					else{
							//recherche de methode de decomposition si possible
							for (Methodes method : (D.getMethodes())) {
								if ((tailleParamTache==method.getParametres().size())&&(tache_t_zero.getPreconditions()==method.getPreconditions())){
									listeMethodesDomaine.add(method);
								}
							}
							
							if (listeMethodesDomaine !=null) {
								
								//selection de la premiere methode dans la liste pour decomposer la tache
								Methodes method = listeMethodesDomaine.get(0);
								
								//suppression de la tâche dans la liste de tâches apres avoir trouver sa methode de decomposition
								int id_tache = T.indexOf(tache_t_zero);
								T.remove(id_tache);
								
								if (method.getSousTache() !=null) {
								//choix de tache dans l'ensemble de sous tache de la methode de decomposition
								List<Noeud_Tache> nouvelTache = method.getSousTache();
									
								//appel recurssif sur les sous taches
								shop2(method.getPreconditions(), nouvelTache, D);
								
								
								} else {
								
								//choix d'une nouvelle tache
								List<Noeud_Tache> nouvelTache = T;
								
								//appel recurssif sur les sous taches
								shop2(s, nouvelTache, D);
								
								}
								
							} else {
								System.out.println("aucun opérateur ni de methode ne resoudre ou decomposer cette tâche");
								return plan;
							}
						return plan;
					}
				}	
			}	
		}
		return plan;
	}
	
	
	public static List<Action> sequenceActionSolution(Plan_Solution plan){
		List<Action> solution = plan.getSequenceActionSolution();
		
		return solution;
	}
	
	
	public static void main(String[] args) {
			Plan_Solution plan =new Plan_Solution();
			sequenceActionSolution(plan);
		}
}

