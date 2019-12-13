package resources;
import javax.ejb.EJB;
import javax.ws.rs.GET;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.core.Response;
import modeles.Salle;
import services.GestionProjet;
import services.SalleSingleton;

/**
 *
 * @author Estée
 */
@Path("projet")
public class ProjetREST {
    @EJB
    private GestionProjet gestionProjet;
    
    @GET
    public Response getProjets() {
        return Response.accepted().build();
    }
    
    @PUT
    public Response createProjet() {
        
        return Response.accepted().build();
    }
    
    @GET
    @Path("/salle")
    public Salle createSalle(){
        SalleSingleton salle = new SalleSingleton();
        
        return salle;
    }
    
    
    /*
    @GET
    public Response getProjet() {
        return Response.accepted().build();
    }*/
}
