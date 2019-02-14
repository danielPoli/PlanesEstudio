package co.com.planesestudio.entity;

import javax.persistence.*;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

@Table(name = "CONTENIDO")
@Entity
public class Contenido implements Serializable {

    @GeneratedValue
    @Id
    @Column(name = "ID_CONTENIDO")
    private Long idContenido;

    @Column(name = "NOMBRE_CONTENIDO")
    private String nombreContenido;

    @Column(name = "LINK_CONTENIDO")
    private String linkContenido;

    @OneToMany(mappedBy = "DOCENTES_PERIODO_ACADEMICO", cascade = CascadeType.ALL, orphanRemoval = true)
    private List<DocentesPeriodoAcademico> docentesPeriodoAcademicoList = new ArrayList<>();

    public Contenido() {
    }

    public Contenido(Long idContenido, String nombreContenido, String linkContenido) {
        this.idContenido = idContenido;
        this.nombreContenido = nombreContenido;
        this.linkContenido = linkContenido;
    }

    public Long getIdContenido() {
        return idContenido;
    }

    public void setIdContenido(Long idContenido) {
        this.idContenido = idContenido;
    }

    public String getNombreContenido() {
        return nombreContenido;
    }

    public void setNombreContenido(String nombreContenido) {
        this.nombreContenido = nombreContenido;
    }

    public String getLinkContenido() {
        return linkContenido;
    }

    public void setLinkContenido(String linkContenido) {
        this.linkContenido = linkContenido;
    }

    public List<DocentesPeriodoAcademico> getDocentesPeriodoAcademicoList() {
        return docentesPeriodoAcademicoList;
    }

    public void setDocentesPeriodoAcademicoList(List<DocentesPeriodoAcademico> docentesPeriodoAcademicoList) {
        this.docentesPeriodoAcademicoList = docentesPeriodoAcademicoList;
    }
}
