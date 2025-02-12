package modeles;

import enumerations.EnumEtat;
import java.io.Serializable;
import java.util.Date;
import javax.ejb.ActivationConfigProperty;
import javax.ejb.MessageDriven;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Temporal;

/**
 *
 * @author Estée
 */
@Entity
public class Projet implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer idProjet;
    private String intituleProjet;
    @Temporal(javax.persistence.TemporalType.DATE)
    private Date dateProjet;
    private EnumEtat etatProjet;
    private Formation formation;
    private Formateur formateur;
    private Salle salle;

    /**
     * Création d'un projet de formation
     * @param idProjet identifiant unique d'un projet
     * @param intituleProjet nom d'un projet
     * @param dateProjet date d'un projet
     * @param formation intitule de la formation du projet
     * @param formateur formateur assurant la formation du projet
     * @param salle salle disponible pour assurer la formation
     */
    public Projet(Integer idProjet, String intituleProjet, Date dateProjet, Formation formation, Formateur formateur, Salle salle){
        this.idProjet = idProjet;
        this.intituleProjet = intituleProjet;
        this.dateProjet = dateProjet;
        this.etatProjet = EnumEtat.EnProjet;
        this.formation = formation;
        this.formateur = formateur;
        this.salle = salle;
    }

    // test
    public Projet(Integer idProjet, String intituleProjet) {
        this.idProjet = idProjet;
        this.intituleProjet = intituleProjet;
        this.etatProjet = EnumEtat.EnProjet;
    }
    
    public Integer getIdProjet() {
        return idProjet;
    }

    public String getIntituleProjet() {
        return intituleProjet;
    }

    public Date getDateProjet() {
        return dateProjet;
    }
    
    public EnumEtat getEtatProjet() {
        return etatProjet;
    }
    
    public Formation getFormation() {
        return formation;
    }

    public Formateur getFormateur() {
        return formateur;
    }

    public Salle getSalle() {
        return salle;
    }
    
    public void setIdProjet(Integer idProjet) {
        this.idProjet = idProjet;
    }
        
    public void setIntituleProjet(String intitule) {
        this.intituleProjet = intitule;
    }

    public void setDateProjet(Date date) {
        this.dateProjet = date;
    }
    
    public void setEtatProjet(EnumEtat etatProjet) {
        this.etatProjet = etatProjet;
    }

    public void setFormation(Formation formation) {
        this.formation = formation;
    }

    public void setFormateur(Formateur formateur) {
        this.formateur = formateur;
    }

    public void setSalle(Salle salle) {
        this.salle = salle;
    }
    
    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idProjet != null ? idProjet.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Projet)) {
            return false;
        }
        Projet other = (Projet) object;
        return !((this.idProjet == null && other.idProjet != null) || (this.idProjet != null && !this.idProjet.equals(other.idProjet)));
    }

    @Override
    public String toString() {
        return "modeles.projet[ id=" + idProjet + " ]";
    }
    
}
