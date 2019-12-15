package services;

import javax.annotation.Resource;
import javax.ejb.EJB;
import javax.ejb.LocalBean;
import javax.ejb.Stateless;
import javax.inject.Inject;
import javax.jms.JMSContext;
import javax.jms.Queue;
import modeles.Formation;

/**
 *
 * @author Estée
 */
@Stateless(name="BeanFormation")
@LocalBean
public class GestionFormation {
    @Inject
    private static JMSContext context;    
    @Resource(lookup = "formation")
    private Queue queue;
    @EJB
    FormationSingleton formationSingleton = FormationSingleton.getInstance();
    
    /**
     * Créer une formation
     * @param f la formation à créer
     * @return la formation créée
     */
    public Formation creerFormation(Formation f){
        formationSingleton.addToList(f);
        return f;
    }
    
    /**
     * Obtenir une formation
     * @param idF identifiant d'une formation
     * @return la formation
     */
    public Formation getFormation(Integer idF){
        return formationSingleton.recupFormationById(idF);
    }
    
    /**
     * Suppression d'une formation
     */
    
    /**
     * Modification d'une formation
     */
    
}
