package modeles;

import enumerations.EnumStatutSalle;
import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.Id;

/**
 *
 * @author Estée
 */
@Entity
public class Salle implements Serializable {
    @Id
    private Integer idSalle;
    private String nomSalle;
    private String materiel;
    private EnumStatutSalle statut;

    /**
     * Constructeur simple
     * @param idSalle identifiant unique d'une salle
     */
    public Salle(Integer idSalle) {
        this.idSalle = idSalle;
    }

    /**
     * Constructeur avec materiel
     * @param idSalle identifiant unique d'une salle
     * @param materiel liste de materiel présent dans la salle
     */
    public Salle(Integer idSalle, String materiel) {
        this.idSalle = idSalle;
        this.materiel = materiel;
    }
        
    public Integer getId() {
        return idSalle;
    }

    public String getMateriel() {
        return materiel;
    }

    public EnumStatutSalle getStatut() {
        return statut;
    }
    
    public void setId(int id) {
        this.idSalle = id;
    }

    public void setMateriel(String materiel) {
        this.materiel = materiel;
    }

    public void setStatut(EnumStatutSalle statut) {
        this.statut = statut;
    }
    
    @Override
    public String toString() {
        return "modeles.Salle[ id=" + idSalle + " ]";
    }

    public int getIdSalle() {
        return idSalle;
    }

    public void setIdSalle(Integer idSalle) {
        this.idSalle = idSalle;
    }
    
}
