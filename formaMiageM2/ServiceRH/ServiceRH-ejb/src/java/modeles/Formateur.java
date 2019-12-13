package modeles;

import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

/**
 *
 * @author Estée
 */
@Entity
public class Formateur implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer idFormateur;
    private String nomFormateur;
    private String prenomFormateur;
    private String competence;

    /**
     * Constructeur d'un formateur
     * @param idFormateur identifiant unique d'un formateur
     * @param nomFormateur nom d'un formateur
     * @param prenomFormateur prenom d'un formateur
     * @param competence liste de competences d'un formateur
     */
    public Formateur(Integer idFormateur, String nomFormateur, String prenomFormateur, String competence) {
        this.idFormateur = idFormateur;
        this.nomFormateur = nomFormateur;
        this.prenomFormateur = prenomFormateur;
        this.competence = competence;
    }
    
    public Integer getIdFormateur() {
        return idFormateur;
    }

    public String getNomFormateur() {
        return nomFormateur;
    }

    public String getPrenomFormateur() {
        return prenomFormateur;
    }

    public String getCompetence() {
        return competence;
    }
    
    public void setIdFormateur(Integer idFormateur) {
        this.idFormateur = idFormateur;
    }

    public void setNomFormateur(String nomFormateur) {
        this.nomFormateur = nomFormateur;
    }

    public void setPrenomFormateur(String prenomFormateur) {
        this.prenomFormateur = prenomFormateur;
    }

    public void setCompetence(String competence) {
        this.competence = competence;
    }
    
    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idFormateur != null ? idFormateur.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Formateur)) {
            return false;
        }
        Formateur other = (Formateur) object;
        return !((this.idFormateur == null && other.idFormateur != null) || (this.idFormateur != null && !this.idFormateur.equals(other.idFormateur)));
    }

    @Override
    public String toString() {
        return "modeles.Formateur[ id=" + idFormateur + " ]";
    }
    
}
