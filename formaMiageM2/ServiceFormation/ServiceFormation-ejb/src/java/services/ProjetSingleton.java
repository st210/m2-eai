package services;

import enumerations.EnumEtat;
import java.util.ArrayList;
import javax.ejb.LocalBean;
import javax.ejb.Singleton;
import modeles.Projet;

/**
 *
 * @author Estée
 */
@Singleton
@LocalBean
public class ProjetSingleton {
    private final ArrayList<Projet> listeProjets = new ArrayList<>();
    
    public Projet creerProjet(Integer idP, String intituleP) {
        Projet p = new Projet(idP, intituleP); 
        listeProjets.add(p);
        return p;
    }
    
    public Projet recupProjetById(int idP){
        return listeProjets.get(idP);
    }
    
    public void mettreEnAttenteProjet(int p){
        listeProjets.get(p).setEtatProjet(EnumEtat.EnAttente);
    }
}
