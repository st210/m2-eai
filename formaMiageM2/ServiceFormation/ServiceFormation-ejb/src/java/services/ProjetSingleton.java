package services;

import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
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
    private final HashMap<Integer, Projet> listeProjets;
    
    public ProjetSingleton(){
        listeProjets = new HashMap<>();
        Projet p1 = new Projet(1, "Projet Beta Test");
        listeProjets.put(p1.getIdProjet(), p1);
    }
}
