package services;

import java.util.HashMap;
import modeles.Salle;

/**
 *
 * @author Estée
 */
public class SalleSingleton {
    private final HashMap<Integer, Salle> listeSalles;
    
    public SalleSingleton(){
        listeSalles = new HashMap<>();
        Salle s1 = new Salle(1, "Grande Salle");
        Salle s2 = new Salle(2, "Moyenne Salle");
        Salle s3 = new Salle(3, "Petite Salle");

        listeSalles.put(s1.getIdSalle(), s1);
        listeSalles.put(s1.getIdSalle(), s2);
        listeSalles.put(s1.getIdSalle(), s3);
    }
    
    public HashMap<Integer, Salle> getSalles(){
        return listeSalles;
    }
}
