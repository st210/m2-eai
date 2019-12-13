package modeles;

import enumerations.EnumEtatFormation;
import enumerations.EnumTypeFormation;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;
import modeles.Formateur;
import modeles.Salle;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2019-12-13T18:53:36")
@StaticMetamodel(Formation.class)
public class Formation_ { 

    public static volatile SingularAttribute<Formation, Integer> capaciteMax;
    public static volatile SingularAttribute<Formation, Salle[]> listeSalles;
    public static volatile SingularAttribute<Formation, Integer> tarif;
    public static volatile SingularAttribute<Formation, Integer> capaciteMin;
    public static volatile SingularAttribute<Formation, EnumEtatFormation> etatFormation;
    public static volatile SingularAttribute<Formation, String> description;
    public static volatile SingularAttribute<Formation, Formateur[]> listeFormateurs;
    public static volatile SingularAttribute<Formation, Integer> idFormation;
    public static volatile SingularAttribute<Formation, String> intitule;
    public static volatile SingularAttribute<Formation, EnumTypeFormation> typeFormation;

}