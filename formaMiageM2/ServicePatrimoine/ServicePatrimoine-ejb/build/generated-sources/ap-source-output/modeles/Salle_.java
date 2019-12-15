package modeles;

import enumerations.EnumStatutSalle;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2019-12-15T23:38:36")
@StaticMetamodel(Salle.class)
public class Salle_ { 

    public static volatile SingularAttribute<Salle, String> materiel;
    public static volatile SingularAttribute<Salle, Integer> idSalle;
    public static volatile SingularAttribute<Salle, EnumStatutSalle> statut;
    public static volatile SingularAttribute<Salle, String> nomSalle;

}