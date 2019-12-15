package resources;
import java.io.IOException;
import java.io.StringReader;
import java.io.StringWriter;
import java.io.Writer;
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
import modeles.Formateur;
import modeles.Formation;
import modeles.Projet;
import modeles.Salle;
import services.GestionFormateur;
import services.GestionFormation;
import services.GestionProjet;
import services.GestionSalle;

/**
 *
 * @author Estée
 */
@Path("projet")
public class ProjetREST {
    private GestionProjet gestionProjet = new GestionProjet();
    private GestionSalle gestionSalle = new GestionSalle();
    private GestionFormateur gestionFormateur = new GestionFormateur();
    private GestionFormation gestionFormation = new GestionFormation();
    
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
    @Path("/formateur/{id}")
    public Response getFormateur(@PathParam("id") String id) throws IOException {
        Formateur f = gestionFormateur.getFormateur(Integer.parseInt(id));
        JsonObjectBuilder objectBuilder = Json.createObjectBuilder()
                .add("idFormateur", f.getIdFormateur())
                .add("nomFormateur", f.getNomFormateur())
                .add("nomFormateur", f.getPrenomFormateur())
                .add("nomFormateur", f.getCompetence());

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
    @Path("/formateur")
    public Response createFormateur(String body) {
        JsonReader reader = Json.createReader(new StringReader(body));
        JsonObject jsonObject = reader.readObject();
        Formateur f = new Formateur(Integer.parseInt(jsonObject.getString("idFormateur")), jsonObject.getString("nomFormateur"),
                                    jsonObject.getString("prenomFormateur"), jsonObject.getString("competence"));
        gestionFormateur.creerFormateur(f);
        return Response.accepted().build();
    }
    
    @GET
    @Path("/formation/{id}")
    public Response getFormation(@PathParam("id") String id) throws IOException {
        Formation f = gestionFormation.getFormation(Integer.parseInt(id));
        JsonObjectBuilder objectBuilder = Json.createObjectBuilder()
                .add("idFormation", f.getIdFormation())
                .add("intitule", f.getIntitule());

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
    @Path("/formation")
    public Response createFormation(String body) {
        JsonReader reader = Json.createReader(new StringReader(body));
        JsonObject jsonObject = reader.readObject();
        Formation f = new Formation(Integer.parseInt(jsonObject.getString("idFormation")),jsonObject.getString("nomFormation"));
        gestionFormation.creerFormation(f);
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
