package modeles;

import enumerations.EnumEtat;
import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;
import modeles.Formateur;
import modeles.Formation;
import modeles.Salle;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2019-12-15T23:37:55")
@StaticMetamodel(Projet.class)
public class Projet_ { 

    public static volatile SingularAttribute<Projet, Date> dateProjet;
    public static volatile SingularAttribute<Projet, String> intituleProjet;
    public static volatile SingularAttribute<Projet, EnumEtat> etatProjet;
    public static volatile SingularAttribute<Projet, Formateur> formateur;
    public static volatile SingularAttribute<Projet, Salle> salle;
    public static volatile SingularAttribute<Projet, Formation> formation;
    public static volatile SingularAttribute<Projet, Integer> idProjet;

}