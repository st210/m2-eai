package services;

import java.util.ArrayList;
import modeles.Salle;

/**
 *
 * @author Estée
 */
public class SalleSingleton {
    public final ArrayList<Salle> listeSalles;
    private static SalleSingleton s_instance = new SalleSingleton();
    
    public SalleSingleton(){
        listeSalles = new ArrayList<>();
        Salle s1 = new Salle(1, "Petite Salle");
        Salle s2 = new Salle(2, "Moyenne Salle");
        Salle s3 = new Salle(3, "Grande Salle");
        listeSalles.add(s1);
        listeSalles.add(s2);
        listeSalles.add(s3);
    }
    
    public static SalleSingleton getInstance(){
        return s_instance;
    }
    
    public Salle recupSalleById(int idS){
        return listeSalles.get(idS);
    }
    
    public Salle addToList(Salle s){
        listeSalles.add(s);
        return s;
    }
}
