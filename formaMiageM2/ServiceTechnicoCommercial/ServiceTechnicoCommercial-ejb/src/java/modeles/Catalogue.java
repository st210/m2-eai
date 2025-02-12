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
public class Catalogue implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer idCatalogue;
    private String nomCatalogue;
    private Formation formation;

    /**
     * Constructeur d'un catalogue de formation
     * @param idCatalogue identifiant unique du catalogue
     * @param nomCatalogue intitule du catalogue
     * @param formation liste des formations du catalogue
     */
    public Catalogue(Integer idCatalogue, String nomCatalogue, Formation formation) {
        this.idCatalogue = idCatalogue;
        this.nomCatalogue = nomCatalogue;
        this.formation = formation;
    }
    
    public Integer getIdCatalogue() {
        return idCatalogue;
    }

    public String getNomCatalogue() {
        return nomCatalogue;
    }

    public Formation getFormation() {
        return formation;
    }
    
    public void setIdCatalogue(Integer idCatalogue) {
        this.idCatalogue = idCatalogue;
    }

    public void setNomCatalogue(String nomCatalogue) {
        this.nomCatalogue = nomCatalogue;
    }

    public void setFormation(Formation formation) {
        this.formation = formation;
    }
    
    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idCatalogue != null ? idCatalogue.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Catalogue)) {
            return false;
        }
        Catalogue other = (Catalogue) object;
        return !((this.idCatalogue == null && other.idCatalogue != null) || (this.idCatalogue != null && !this.idCatalogue.equals(other.idCatalogue)));
    }

    @Override
    public String toString() {
        return "modeles.Catalogue[ id=" + idCatalogue + " ]";
    }
    
}
