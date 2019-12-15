package services;

import java.util.logging.Level;
import java.util.logging.Logger;
import javax.annotation.Resource;
import javax.ejb.ActivationConfigProperty;
import javax.ejb.EJB;
import javax.ejb.LocalBean;
import javax.ejb.MessageDriven;
import javax.ejb.Stateless;
import javax.inject.Inject;
import javax.jms.JMSContext;
import javax.jms.JMSException;
import javax.jms.Message;
import javax.jms.MessageListener;
import javax.jms.ObjectMessage;
import javax.jms.Queue;
import modeles.Salle;

/**
 *
 * @author Estée
 */
@MessageDriven(activationConfig = {
    @ActivationConfigProperty(propertyName = "destinationLookup", propertyValue = "listeProjets"),
    @ActivationConfigProperty(propertyName = "destinationType", propertyValue = "javax.jms.Topic")
})
@Stateless
@LocalBean
public class GestionSalle implements MessageListener{
    @Inject
    private static JMSContext context;    
    @Resource(lookup = "salle")
    private Queue queue;
    @EJB
    SalleSingleton salleSingleton = SalleSingleton.getInstance();
    
    /**
     * Creer une salle
     */
    public Salle creerSalle(Salle salle){
        //salleSingleton.listeSalles.put(salle.getIdSalle(), salle);
        salleSingleton.addToList(salle);
        return salle;
    }
    
    /**
     * Obtenir une salle
     */
    public Salle getSalle(Integer idS){
        return salleSingleton.recupSalleById(idS);
    }
    
    /**
     * Supprimer une salle
     */
    
    /**
     * Modifier une salle
     */
    
    /**
     * Affecter une salle
     */
    
    // récup msg du topic projet
    @Override
    public void onMessage(Message message) {
        if (message instanceof ObjectMessage) {
            try {
                ObjectMessage om = (ObjectMessage) message;
                Object obj = om.getObject();
            } catch (JMSException ex) {
                Logger.getLogger(Salle.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }
    
}
