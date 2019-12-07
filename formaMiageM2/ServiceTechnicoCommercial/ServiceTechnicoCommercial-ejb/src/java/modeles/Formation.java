package modeles;

import enumerations.EnumEtatFormation;
import enumerations.EnumTypeFormation;
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
public class Formation implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String intitule;
    private String description;
    private EnumTypeFormation typeFormation;
    private int capaciteMax;
    private int capaciteMin;
    private int tarif;
    private EnumEtatFormation etatFormation;
    private Salle[] listeSalles;
    private Formateur[] listeFormateurs;
    @Temporal(javax.persistence.TemporalType.DATE)
    private Date periode;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (id != null ? id.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Formation)) {
            return false;
        }
        Formation other = (Formation) object;
        return !((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id)));
    }

    @Override
    public String toString() {
        return "modeles.Formation[ id=" + id + " ]";
    }
    
}
