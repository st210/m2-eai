package services;

import javax.annotation.Resource;
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
@Stateless
@LocalBean
public class GestionProjet {
    @Inject
    private static JMSContext context;
    
    @Resource(lookup = "listeProjets")
    private static Topic topic;
    
    public Projet creerProjet(){
        Projet p = new Projet(1, "formation EAI");
        
        ObjectMessage om = context.createObjectMessage(p);
        context.createProducer().send(topic, om);
        return p;
    };
}
