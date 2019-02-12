package co.com.planesestudio.entity;

import javax.persistence.*;
import java.io.Serializable;

@Table(name = "FACULTAD")
@Entity
public class Facultad implements Serializable {

    @GeneratedValue
    @Id
    @Column(name = "ID_FACULTAD")
    private Long idFacultad;

    @Column(name = "NOMBRE_FACULTAD")
    private String nombreFacultad;

    public Facultad() {
    }

    public Facultad(Long idFacultad, String nombreFacultad) {
        this.idFacultad = idFacultad;
        this.nombreFacultad = nombreFacultad;
    }

    public Long getIdFacultad() {
        return idFacultad;
    }

    public void setIdFacultad(Long idFacultad) {
        this.idFacultad = idFacultad;
    }

    public String getNombreFacultad() {
        return nombreFacultad;
    }

    public void setNombreFacultad(String nombreFacultad) {
        this.nombreFacultad = nombreFacultad;
    }
}
