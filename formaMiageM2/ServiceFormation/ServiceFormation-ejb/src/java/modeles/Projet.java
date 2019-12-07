package modeles;

import java.io.Serializable;
import java.util.Date;
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
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long idProjet;
    private String intituleProjet;
    @Temporal(javax.persistence.TemporalType.DATE)
    private Date dateProjet;

    public Projet(Long idProjet, String intituleProjet) {
        this.idProjet = idProjet;
        this.intituleProjet = intituleProjet;
    }
    
    public Projet(Long idProjet, String intituleProjet, Date dateProjet) {
        this.idProjet = idProjet;
        this.intituleProjet = intituleProjet;
        this.dateProjet = dateProjet;
    }
    
    public Long getIdProjet() {
        return idProjet;
    }

    public static long getSerialVersionUID() {
        return serialVersionUID;
    }

    public String getIntituleProjet() {
        return intituleProjet;
    }

    public Date getDateProjet() {
        return dateProjet;
    }

    public void setIdProjet(Long idProjet) {
        this.idProjet = idProjet;
    }
        
    public void setIntituleProjet(String intitule) {
        this.intituleProjet = intitule;
    }

    public void setDateProjet(Date date) {
        this.dateProjet = date;
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
