package resources;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import modeles.Projet;
import services.gestionProjet;

/**
 *
 * @author Estée
 */
public class ProjetREST {
    private gestionProjet gestionProjet;
    
    @Path("projet")    
    @PUT
    public void createProjet() {
        gestionProjet.creerProjet();
    }
}
