package services;

import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.annotation.Resource;
import javax.ejb.LocalBean;
import javax.ejb.Stateless;
import javax.inject.Inject;
import javax.jms.Destination;
import javax.jms.JMSConsumer;
import javax.jms.JMSContext;
import javax.jms.JMSException;
import javax.jms.Message;
import javax.jms.ObjectMessage;
import javax.jms.Queue;
import javax.jms.TextMessage;
import javax.jms.Topic;
import modeles.Formateur;
import modeles.Formation;
import modeles.Projet;
import modeles.Ressources;
import modeles.Salle;

/**
 *
 * @author Estée
 */
@Stateless
@LocalBean
public class gestionProjet {
    @Inject
    private static JMSContext context;
    @Resource(lookup = "listeProjets")
    private static Topic topic;
    
    public static void main(String[] args) {
        Projet p = new Projet((long)1, "formation EAI");
        ObjectMessage om = context.createObjectMessage(p);
        context.createProducer().send(topic, om);
    }

    public Projet creerProjet(){
        Projet p = new Projet((long)1, "formation EAI");
        ObjectMessage om = context.createObjectMessage(p);
        context.createProducer().send(topic, om);
        return p;
    };
}
