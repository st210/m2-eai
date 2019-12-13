package services;

import java.util.ArrayList;
import javax.ejb.LocalBean;
import javax.ejb.Singleton;
import modeles.Formation;

/**
 *
 * @author Estée
 */
@Singleton
@LocalBean
public class FormationSingleton {
    private final ArrayList<Formation> formations = new ArrayList<>();
    
    /**
     * Creer une formation
     * @param idF identifiant unique d'une formation
     * @param intituleF nom d'une formation
     * @return une formation
     */
    public Formation creerFormation(Integer idF, String intituleF) {
        Formation f = new Formation(idF, intituleF);
        formations.add(f);
        return f;
    }
    
    /**
     * Obtenir une formation par recherche de son identifiant
     * @param idF identifiant unique d'une formation
     * @return une formation
     */
    public Formation getFormationById(int idF) {
        return formations.get(idF);
    }
}
