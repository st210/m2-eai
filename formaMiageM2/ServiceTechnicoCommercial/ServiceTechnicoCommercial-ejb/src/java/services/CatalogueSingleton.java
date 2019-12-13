package services;

import java.util.ArrayList;
import javax.ejb.LocalBean;
import javax.ejb.Singleton;
import modeles.Catalogue;
import modeles.Formation;

/**
 *
 * @author Estée
 */
@Singleton
@LocalBean
public class CatalogueSingleton {
    private final ArrayList<Catalogue> catalogues = new ArrayList<>();
    
       
    /*
    public void setCatalogue(Integer id, Catalogue catalogue, Formation f) {
        Catalogue c = catalogues.get(id);
        if (c != null) {
            catalogues.add(f);
        }
    }*/
    
}
