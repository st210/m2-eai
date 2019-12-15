package resources;
import java.io.IOException;
import java.io.StringReader;
import java.io.StringWriter;
import java.io.Writer;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.ejb.EJB;
import javax.json.Json;
import javax.json.JsonObject;
import javax.json.JsonObjectBuilder;
import javax.json.JsonReader;
import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import modeles.Projet;
import modeles.Salle;
import services.GestionProjet;
import services.GestionSalle;
import services.SalleSingleton;

/**
 *
 * @author Estée
 */
@Path("projet")
public class ProjetREST {
    private GestionSalle gestionSalle = new GestionSalle();
    
    @EJB
    private GestionProjet gestionProjet;
    
    @GET
    public Response getProjets() {
        return Response.accepted().build();
    }
    /*
    @PUT
    public Response createProjet() {
        
        return Response.accepted().build();
    }*/
    
    @PUT
    @Path("/salle")
    public Response createSalle(){
        Salle salle = new Salle(5, "salleWTF");
        //gestionSalle.creerSalle();
        return Response.accepted().build();
    }
    
    @PUT
    @Path("/creer")
    @Consumes("application/json")
    public Response createProjet(String body) {

        //Création d'un Json Reader pour récupérer le body de la requête
        JsonReader reader = Json.createReader(new StringReader(body));
        JsonObject jsonObject = reader.readObject();
        
        //Création d'un objet projet et appel du code métier via l'EJB
        Projet p = new Projet(Integer.parseInt(jsonObject.getString("idProjet")), jsonObject.getString("intituleProjet"));
        gestionProjet.creerProjet(p);

        return Response.accepted().build();
    }

    @GET
    @Path("{id}")
    public Response getProjet(@PathParam("id") String id) throws IOException {
        Projet p = gestionProjet.getProjet(Integer.parseInt(id));
        //Projet p = new Projet(1, "Java");
        JsonObjectBuilder objectBuilder = Json.createObjectBuilder()
                .add("IdProjet", p.getIdProjet())
                .add("Intitule", p.getIntituleProjet());

        JsonObject jsonObject = objectBuilder.build();

        String jsonString;
        try (Writer writer = new StringWriter()) {
            Json.createWriter(writer).write(jsonObject);
            jsonString = writer.toString();
        }
        return Response.ok(jsonString, MediaType.APPLICATION_JSON).build();
    }    
    
    /*
    @GET
    public Response getProjet() {
        return Response.accepted().build();
    }*/
}
