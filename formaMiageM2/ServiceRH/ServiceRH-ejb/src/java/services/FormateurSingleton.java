package services;

import java.util.ArrayList;
import java.util.HashMap;
import javax.ejb.LocalBean;
import javax.ejb.Singleton;
import modeles.Formateur;

/**
 *
 * @author Estée
 */
@Singleton
@LocalBean
public class FormateurSingleton {
   
    private final ArrayList<Formateur> formateurs = new ArrayList<>();
    
    /**
     *
     * @param idFormateur
     * @param nom
     * @param prenom
     * @param competence
     * @return
     */
    public Formateur creerFormateur(Integer idFormateur, String nom, String prenom, String competence) {
        Formateur f = new Formateur(idFormateur, nom, prenom, competence);
        formateurs.add(f);
        return f;
    }
    
    /**
     *
     * @param id
     * @param competence
     */
    public void setCompetence(Integer id, String competence) {
        Formateur f = formateurs.get(id);
        if (f != null) {
            f.setCompetence(competence);
        }
    }
    
    /**
     * Obtenir la liste de formateurs
     * @return une liste de formateurs de type formateur
     */
    public ArrayList<Formateur> getFormateurs(){
        return formateurs;
    }
    
    /**
     * Obtenir un formateur
     * @param idF identifiant unique d'un formateur
     * @return un formateur
     */
    public Formateur getFormateurById(Integer idF){
        return formateurs.get(idF);
    }
    
    
    
    
    /*
    private final HashMap<Integer, Formateur> listeFormateurs;
    
    public FormateurSingleton(){
        listeFormateurs = new HashMap<>();
        Formateur f1 = new Formateur(1, "Ringue", "Maxime", "Windev");
        Formateur f2 = new Formateur(2, "Viala", "Guillaume", "Securite");
        Formateur f3 = new Formateur(3, "Mary", "Nathan", "Base de donnees");
        Formateur f4 = new Formateur(4, "Desanctis", "Estee", "AgiliteMaisPasEAI");
        
        listeFormateurs.put(f1.getIdFormateur(), f1);
        listeFormateurs.put(f2.getIdFormateur(), f2);
        listeFormateurs.put(f3.getIdFormateur(), f3);
    }*/
}
