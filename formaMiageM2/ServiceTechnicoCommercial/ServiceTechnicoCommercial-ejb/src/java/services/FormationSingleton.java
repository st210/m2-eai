package services;

import java.util.ArrayList;
import modeles.Formation;

/**
 *
 * @author Estée
 */
public class FormationSingleton {
    public final ArrayList<Formation> listeFormations;
    private static FormationSingleton f_instance = new FormationSingleton();
    
    public FormationSingleton(){
        listeFormations = new ArrayList<>();
        Formation f1 = new Formation(1, "Java");
        Formation f2 = new Formation(2, "Agilite");
        Formation f3 = new Formation(3, "WinDev");
        listeFormations.add(f1);
        listeFormations.add(f2);
        listeFormations.add(f3);
    }
    
    public static FormationSingleton getInstance(){
        return f_instance;
    }
    
    public Formation recupFormationById(int idF){
        return listeFormations.get(idF);
    }
    
    public Formation addToList(Formation f){
        listeFormations.add(f);
        return f;
    }
}
