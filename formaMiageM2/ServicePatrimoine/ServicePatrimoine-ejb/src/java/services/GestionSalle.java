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
public class GestionSalle implements MessageListener{
    
    public GestionSalle(){
    }
    
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
    
    /**
     * Creer une salle
     */
    public Salle creerSalle(Salle salle){
        SalleSingleton.getInstance().listeSalles.put(salle.getId(), salle);
        return salle;
    }
    
    /**
     * Obtenir une salle
     */
    public SalleSingleton getSalleById(Integer idS){
        return null;
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
    
}
