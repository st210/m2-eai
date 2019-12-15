package services;

import java.util.ArrayList;
import javax.annotation.Resource;
import javax.ejb.EJB;
import javax.ejb.LocalBean;
import javax.ejb.Stateless;
import javax.inject.Inject;
import javax.jms.JMSContext;
import javax.jms.ObjectMessage;
import javax.jms.Topic;
import modeles.Projet;

/**
 *
 * @author Estée
 */
@Stateless(name="BeanProjet")
@LocalBean
public class GestionProjet {
    @Inject
    private static JMSContext context;    
    @Resource(lookup = "listeProjets")
    private Topic topic;
    @EJB
    ProjetSingleton projetSingleton = ProjetSingleton.getInstance();
    
    public Projet creerProjet(Projet p){
        projetSingleton.addToList(p);
        return p;
        
        //ObjectMessage om = context.createObjectMessage(p);
        //projetSingleton.addToList(p);
        //context.createProducer().send(topic, om);
        //return p;
    };
    
    public Projet getProjet(int id){
        return projetSingleton.recupProjetById(id);
    }
}
