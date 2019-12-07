package modeles;

import enumerations.EnumEtat;
import enumerations.EnumType;
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
    private String intitule;
    private String description;
    private EnumType type;
    private int capaciteMax;
    private int capaciteMin;
    private int tarif;
    private EnumEtat etat;
    private Formateur[] listeFormateurs;
    @Temporal(javax.persistence.TemporalType.DATE)
    private Date periode;

    public Long getIdProjet() {
        return idProjet;
    }

    public static long getSerialVersionUID() {
        return serialVersionUID;
    }

    public String getIntitule() {
        return intitule;
    }

    public String getDescription() {
        return description;
    }

    public EnumType getType() {
        return type;
    }

    public int getCapaciteMax() {
        return capaciteMax;
    }

    public int getCapaciteMin() {
        return capaciteMin;
    }

    public int getTarif() {
        return tarif;
    }

    public EnumEtat getEtat() {
        return etat;
    }

    public Formateur[] getListeFormateurs() {
        return listeFormateurs;
    }

    public Date getPeriode() {
        return periode;
    }

    public void setIdProjet(Long idProjet) {
        this.idProjet = idProjet;
    }
        
    public void setIntitule(String intitule) {
        this.intitule = intitule;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public void setType(EnumType type) {
        this.type = type;
    }

    public void setCapaciteMax(int capaciteMax) {
        this.capaciteMax = capaciteMax;
    }

    public void setCapaciteMin(int capaciteMin) {
        this.capaciteMin = capaciteMin;
    }

    public void setTarif(int tarif) {
        this.tarif = tarif;
    }

    public void setEtat(EnumEtat etat) {
        this.etat = etat;
    }

    public void setListeFormateurs(Formateur[] listeFormateurs) {
        this.listeFormateurs = listeFormateurs;
    }

    public void setPeriode(Date periode) {
        this.periode = periode;
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
