package services;

import java.util.ArrayList;
import modeles.Formateur;

/**
 *
 * @author Estée
 */
public class FormateurSingleton {
    private final ArrayList<Formateur> listeFormateurs;
    private static FormateurSingleton f_instance = new FormateurSingleton();
    
    public FormateurSingleton(){
        listeFormateurs = new ArrayList<>();
        Formateur f1 = new Formateur(1, "Ringue", "Maxime", "WinDev");
        Formateur f2 = new Formateur(2, "Viala", "Guillaume", "Securité");
        Formateur f3 = new Formateur(3, "Desanctis", "Estee", "Agilite");
        Formateur f4 = new Formateur(4, "Mary", "Nathan", "Base de Donnees");
        listeFormateurs.add(f1);
        listeFormateurs.add(f2);
        listeFormateurs.add(f3);
        listeFormateurs.add(f4);
    }
    
    public static FormateurSingleton getInstance(){
        return f_instance;
    }
    
    public Formateur recupFormateurById(int idF){
        return listeFormateurs.get(idF);
    }
    
    public Formateur addToList(Formateur f){
        listeFormateurs.add(f);
        return f;
    }
}
