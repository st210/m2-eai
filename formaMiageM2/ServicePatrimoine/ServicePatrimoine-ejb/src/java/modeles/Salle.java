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
     * @param nomSalle nom d'une salle
     */
    public Salle(Integer idSalle, String nomSalle) {
        this.idSalle = idSalle;
        this.nomSalle = nomSalle;
    }

    /**
     * Constructeur avec materiel
     * @param idSalle identifiant unique d'une salle
     * @param nomSalle nom d'une salle
     * @param materiel liste de materiel présent dans la salle
     */
    public Salle(Integer idSalle, String nomSalle, String materiel) {
        this.idSalle = idSalle;
        this.nomSalle = nomSalle;
        this.materiel = materiel;
    }
        
    public Integer getIdSalle() {
        return idSalle;
    }
    
    public String getNomSalle() {
        return nomSalle;
    }

    public String getMateriel() {
        return materiel;
    }

    public EnumStatutSalle getStatut() {
        return statut;
    }
    
    public void setIdSalle(int id) {
        this.idSalle = id;
    }

    public void setMateriel(String materiel) {
        this.materiel = materiel;
    }
    
    public void setNomSalle(String nomSalle) {
        this.nomSalle = nomSalle;
    }

    public void setStatut(EnumStatutSalle statut) {
        this.statut = statut;
    }
    
    @Override
    public String toString() {
        return "modeles.Salle[ id=" + idSalle + " ]";
    }    
}
