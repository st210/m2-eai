package services;

import javax.annotation.Resource;
import javax.ejb.EJB;
import javax.ejb.LocalBean;
import javax.ejb.Stateless;
import javax.inject.Inject;
import javax.jms.JMSContext;
import javax.jms.Queue;
import modeles.Formateur;

/**
 *
 * @author Estée
 */
@Stateless(name="BeanFormateur")
@LocalBean
public class GestionFormateur {
    @Inject
    private static JMSContext context;    
    @Resource(lookup = "formateur")
    private Queue queue;
    @EJB
    FormateurSingleton formateurSingleton = FormateurSingleton.getInstance();
    
    /**
     * Créer un formateur
     * @param f le formateur à créer
     * @return le formateur créé
     */
    public Formateur creerFormateur(Formateur f){
        formateurSingleton.addToList(f);
        return f;
    }
    
    /**
     * Obtenir un formateur
     * @param idF identifiant d'un formateur
     * @return le formateur
     */
    public Formateur getFormateur(Integer idF){
        return formateurSingleton.recupFormateurById(idF);
    }
    
    /**
     * Suppression d'un formateur
     */
    
    /**
     * Modification d'un formateur
     */
    
    /**
     * Affectation d'un formateur
     */
    
}
