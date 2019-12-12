package resources;
import javax.ejb.EJB;
import javax.ws.rs.GET;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.core.Response;
import modeles.Projet;
import services.gestionProjet;

/**
 *
 * @author Estée
 */
@Path("projets")
public class ProjetREST {
    @EJB
    private gestionProjet gestionProjet;
    
    @PUT
    public Response createProjet() {
        gestionProjet.creerProjet();
        return Response.accepted().build();
    }
    
    @GET
    public Response getProjet() {
        //gestionProjet.creerProjet();
        return Response.accepted().build();
    }
}
