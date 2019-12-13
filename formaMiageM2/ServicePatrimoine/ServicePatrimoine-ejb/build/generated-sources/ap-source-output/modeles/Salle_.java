package modeles;

import enumerations.EnumStatutSalle;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2019-12-13T14:08:49")
@StaticMetamodel(Salle.class)
public class Salle_ { 

    public static volatile SingularAttribute<Salle, String> materiel;
    public static volatile SingularAttribute<Salle, Integer> idSalle;
    public static volatile SingularAttribute<Salle, EnumStatutSalle> statut;

}