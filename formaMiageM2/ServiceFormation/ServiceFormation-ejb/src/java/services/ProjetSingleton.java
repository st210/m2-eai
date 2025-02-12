package services;

import enumerations.EnumEtat;
import java.util.ArrayList;
import javax.ejb.Singleton;
import modeles.Projet;

/**
 *
 * @author Estée
 */
@Singleton
public class ProjetSingleton {
    private final ArrayList<Projet> listeProjets;
    private static ProjetSingleton ps_instance = new ProjetSingleton();

    public static ProjetSingleton getInstance(){
        return ps_instance;
    }
    
    public ProjetSingleton() {
        listeProjets = new ArrayList<>();
        Projet p = new Projet(0, "java");
        Projet p2 = new Projet(1, "eai");
        listeProjets.add(p);
        listeProjets.add(p2);
    }
        
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
    
    public Projet addToList(Projet p){
        listeProjets.add(p);
        return p;
    }
}
