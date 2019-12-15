package resources;
import java.io.IOException;
import java.io.StringReader;
import java.io.StringWriter;
import java.io.Writer;
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
    @EJB
    private GestionProjet gestionProjet;
    @EJB
    private GestionSalle gestionSalle;
    
    @GET
    @Path("{id}")
    public Response getProjet(@PathParam("id") String id) throws IOException {
        Projet p = gestionProjet.getProjet(Integer.parseInt(id));
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
    
    @PUT
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
    @Path("/salle/{id}")
    public Response getSalle(@PathParam("id") String id) throws IOException {
        Salle s = gestionSalle.getSalle(Integer.parseInt(id));
        JsonObjectBuilder objectBuilder = Json.createObjectBuilder()
                .add("idSalle", s.getIdSalle())
                .add("nomSalle", s.getNomSalle());

        JsonObject jsonObject = objectBuilder.build();

        String jsonString;
        try (Writer writer = new StringWriter()) {
            Json.createWriter(writer).write(jsonObject);
            jsonString = writer.toString();
        }
        return Response.ok(jsonString, MediaType.APPLICATION_JSON).build();
    }
    
    @PUT
    @Consumes("application/json")
    @Path("/salle")
    public Response createSalle(String body) {
        JsonReader reader = Json.createReader(new StringReader(body));
        JsonObject jsonObject = reader.readObject();
        Salle s = new Salle(Integer.parseInt(jsonObject.getString("idSalle")), jsonObject.getString("nomSalle"));
        gestionSalle.creerSalle(s);
        return Response.accepted().build();
    }
}
