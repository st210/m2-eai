package modeles;

import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;
import modeles.Formation;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2019-12-13T18:53:36")
@StaticMetamodel(Catalogue.class)
public class Catalogue_ { 

    public static volatile SingularAttribute<Catalogue, String> nomCatalogue;
    public static volatile SingularAttribute<Catalogue, Integer> idCatalogue;
    public static volatile SingularAttribute<Catalogue, Formation> formation;

}