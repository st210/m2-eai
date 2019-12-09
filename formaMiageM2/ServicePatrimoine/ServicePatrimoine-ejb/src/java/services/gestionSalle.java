package services;

import java.util.logging.Level;
import java.util.logging.Logger;
import javax.ejb.ActivationConfigProperty;
import javax.ejb.MessageDriven;
import javax.jms.JMSException;
import javax.jms.Message;
import javax.jms.MessageListener;
import javax.jms.ObjectMessage;
import modeles.Salle;

/**
 *
 * @author Estée
 */
@MessageDriven(activationConfig = {
    @ActivationConfigProperty(propertyName = "destinationLookup", propertyValue = "listeProjets"),
    @ActivationConfigProperty(propertyName = "destinationType", propertyValue = "javax.jms.Topic")
})
public class gestionSalle implements MessageListener{

    // récup msg du topic projet
    @Override
    public void onMessage(Message message) {
        Logger.getLogger(Salle.class.getName()).log(Level.SEVERE, "Salle OK OKAY ????");
        if (message instanceof ObjectMessage) {
            try {
                ObjectMessage om = (ObjectMessage) message;
                Object obj = om.getObject();
                Logger.getLogger(Salle.class.getName()).log(Level.SEVERE, "Salle juste OK");
            } catch (JMSException ex) {
                Logger.getLogger(Salle.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }
    
    
    
    /*
    @Override
    public void onMessage(Message message) {
        if (message instanceof ObjectMessage) {
            try {
                ObjectMessage om = (ObjectMessage) message;
                Object obj = om.getObject();
                //Salle s = gestionSalle.getSalle();
            } catch (JMSException ex) {
                Logger.getLogger(Salle.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }
    */
    
    /**
     * Creer une salle
     */
    
    /**
     * Supprimer une salle
     */
    
    /**
     * Modifier une salle
     */
    
    /**
     * Affecter une salle
     */
    
}
