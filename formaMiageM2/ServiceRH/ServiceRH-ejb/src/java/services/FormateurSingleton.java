package services;

import java.util.HashMap;
import modeles.Formateur;

/**
 *
 * @author Estée
 */
public class FormateurSingleton {
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
    }
    
    public HashMap<Integer, Formateur> getSalles(){
        return listeFormateurs;
    }
}
