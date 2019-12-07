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
    private Long idFormation;
    private String intitule;
    private String description;
    private EnumTypeFormation typeFormation;
    private int capaciteMax;
    private int capaciteMin;
    private int tarif;
    private EnumEtatFormation etatFormation;
    private Salle[] listeSalles;
    private Formateur[] listeFormateurs;

    /**
     * Constructeur d'une formation
     * @param idFormation identifiant unique d'une formation
     * @param intitule nom d'une formation
     * @param description descrpition d'une formation
     * @param typeFormation type d'une formation (Courte/Longue)
     * @param capaciteMax maxmimum de personnes autorisés pour cette formation
     * @param capaciteMin minimum de personnes nécessaires pour cette formation
     * @param tarif montant tarifaire de la formation
     * @param etatFormation etat de la formation
     * @param listeSalles liste des salles potentielles où peut se dérouler la formation
     * @param listeFormateurs liste des formateurs potentiels pouvant animer la formation
     */
    public Formation(Long idFormation, String intitule, String description, EnumTypeFormation typeFormation, int capaciteMax, int capaciteMin, int tarif, EnumEtatFormation etatFormation, Salle[] listeSalles, Formateur[] listeFormateurs) {
        this.idFormation = idFormation;
        this.intitule = intitule;
        this.description = description;
        this.typeFormation = typeFormation;
        this.capaciteMax = capaciteMax;
        this.capaciteMin = capaciteMin;
        this.tarif = tarif;
        this.etatFormation = etatFormation;
        this.listeSalles = listeSalles;
        this.listeFormateurs = listeFormateurs;
    }
    
    public Long getIdFormation() {
        return idFormation;
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

    public EnumTypeFormation getTypeFormation() {
        return typeFormation;
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

    public EnumEtatFormation getEtatFormation() {
        return etatFormation;
    }

    public Salle[] getListeSalles() {
        return listeSalles;
    }

    public Formateur[] getListeFormateurs() {
        return listeFormateurs;
    }
    
    public void setIdFormation(Long idFormation) {
        this.idFormation = idFormation;
    }

    public void setIntitule(String intitule) {
        this.intitule = intitule;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public void setTypeFormation(EnumTypeFormation typeFormation) {
        this.typeFormation = typeFormation;
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

    public void setEtatFormation(EnumEtatFormation etatFormation) {
        this.etatFormation = etatFormation;
    }

    public void setListeSalles(Salle[] listeSalles) {
        this.listeSalles = listeSalles;
    }

    public void setListeFormateurs(Formateur[] listeFormateurs) {
        this.listeFormateurs = listeFormateurs;
    }
    
    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idFormation != null ? idFormation.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Formation)) {
            return false;
        }
        Formation other = (Formation) object;
        return !((this.idFormation == null && other.idFormation != null) || (this.idFormation != null && !this.idFormation.equals(other.idFormation)));
    }

    @Override
    public String toString() {
        return "modeles.Formation[ id=" + idFormation + " ]";
    }
    
}
