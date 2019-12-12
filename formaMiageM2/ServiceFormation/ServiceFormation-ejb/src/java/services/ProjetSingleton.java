package services;

import java.util.ArrayList;
import java.util.Date;
import javax.ejb.EJB;
import javax.ejb.LocalBean;
import javax.ejb.Singleton;
import modeles.Formateur;
import modeles.Formation;
import modeles.Projet;
import modeles.Salle;
import static modeles.Formateur_.idFormateur;

/**
 *
 * @author Estée
 */
@Singleton
@LocalBean
public class ProjetSingleton {
    //@EJB
    //FormateurSingleton formateur;
    
    private final ArrayList<Projet> listeProjets = new ArrayList<>();
    
    public void creerProjet(Projet p){
        listeProjets.add(p);
    }
    
    /*
    public Projet creerProjet(Long idProjet, String intituleProjet, Date dateProjet, Formation formation, Formateur formateur, Salle salle) {
        Projet p = new Projet(listeProjets.size(), formateur.getFormateur(idFormateur));
        listeProjets.add(p);
        
        return p;
    } */ 
}
