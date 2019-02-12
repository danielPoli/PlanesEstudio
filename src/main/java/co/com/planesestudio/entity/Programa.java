package co.com.planesestudio.entity;

import javax.persistence.*;
import java.io.Serializable;

@Table(name = "PROGRAMA")
@Entity
public class Programa implements Serializable {

    @GeneratedValue
    @Id
    @Column(name = "ID_PROGRAMA")
    private Long idPrograma;

    @Column(name = "NOMBRE_PROGRAMA")
    private String nombrePrograma;

    @Column(name = "CODIGO_PROGRAMA")
    private String codigoPrograma;

    @Column(name = "ACTO_ADMINISTRATIVO")
    private String actoAdministrativo;

    @Column(name = "ID_FACULTAD")
    private Long idFacultad;

    public Programa() {
    }

    public Programa(Long idPrograma, String nombrePrograma, String codigoPrograma, String actoAdministrativo, Long idFacultad) {
        this.idPrograma = idPrograma;
        this.nombrePrograma = nombrePrograma;
        this.codigoPrograma = codigoPrograma;
        this.actoAdministrativo = actoAdministrativo;
        this.idFacultad = idFacultad;
    }

    public Long getIdPrograma() {
        return idPrograma;
    }

    public void setIdPrograma(Long idPrograma) {
        this.idPrograma = idPrograma;
    }

    public String getNombrePrograma() {
        return nombrePrograma;
    }

    public void setNombrePrograma(String nombrePrograma) {
        this.nombrePrograma = nombrePrograma;
    }

    public String getCodigoPrograma() {
        return codigoPrograma;
    }

    public void setCodigoPrograma(String codigoPrograma) {
        this.codigoPrograma = codigoPrograma;
    }

    public String getActoAdministrativo() {
        return actoAdministrativo;
    }

    public void setActoAdministrativo(String actoAdministrativo) {
        this.actoAdministrativo = actoAdministrativo;
    }

    public Long getIdFacultad() {
        return idFacultad;
    }

    public void setIdFacultad(Long idFacultad) {
        this.idFacultad = idFacultad;
    }
}
