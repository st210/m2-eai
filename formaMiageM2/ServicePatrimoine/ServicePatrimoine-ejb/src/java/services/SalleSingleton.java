package services;

import java.util.ArrayList;
import java.util.HashMap;
import modeles.Salle;

/**
 *
 * @author Estée
 */
public class SalleSingleton {
    public final HashMap<Integer, Salle> listeSalles;
    public final ArrayList<Salle> listeS;
    private static SalleSingleton s_instance = new SalleSingleton();
    
    public SalleSingleton(){
        listeS = new ArrayList<>();
        Salle s = new Salle(3,"test salle");
        listeS.add(s);
        
        listeSalles = new HashMap<>();
        Salle s1 = new Salle(0, "Grande Salle");
        Salle s2 = new Salle(1, "Moyenne Salle");
        Salle s3 = new Salle(2, "Petite Salle");

        listeSalles.put(s1.getIdSalle(), s1);
        listeSalles.put(s1.getIdSalle(), s2);
        listeSalles.put(s1.getIdSalle(), s3);
    }
    
    public static SalleSingleton getInstance(){
        return s_instance;
    }
    
    public Salle recupSalleById(int idS){
        return listeSalles.get(idS);
    }
    
    public Salle addToList(Salle s){
        listeS.add(s);
        return s;
    }
    
    public HashMap<Integer, Salle> getSalles(){
        return listeSalles;
    }
}
