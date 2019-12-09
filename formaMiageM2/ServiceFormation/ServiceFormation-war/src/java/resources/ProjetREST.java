package resources;
import javax.ejb.EJB;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import modeles.Projet;
import services.gestionProjet;

/**
 *
 * @author Estée
 */
public class ProjetREST {
    @EJB
    private gestionProjet gestionProjet;
    
    @Path("projet")    
    @PUT
    public void createProjet() {
        gestionProjet.creerProjet();
        // response ok ou NON
    }
}
