package co.com.planesestudio.entity;

import com.fasterxml.jackson.annotation.JsonIgnore;

import javax.persistence.*;
import java.io.Serializable;

@Table(name = "DOCENTES_PERIODO_ACADEMICO")
@Entity
public class DocentesPeriodoAcademico implements Serializable {

    @GeneratedValue
    @Id
    @Column(name = "ID_DOCENTES_PERIODO_ACADEMICO")
    private Long id;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "ID_DOCENTES")
    private Docentes docentes;

    @Column(name = "ID_PERIODO_ACADEMICO")
    private Long idPeriodoAcademico;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "ID_CONTENIDO")
    @JsonIgnore
    private Contenido contenido;

    @Column(name = "ID_MODULO")
    private Long idModulo;

    @Column(name = "ID_EVALUCION_DOCENTE")
    @ManyToOne(fetch = FetchType.LAZY)
    private EvaluacionDocente evaluacioinDocente;

    public DocentesPeriodoAcademico() {
    }

    public DocentesPeriodoAcademico(Docentes docentes, Long idPeriodoAcademico, Contenido contenido, Long idModulo, Long idEvaluacioinDocente) {
        this.docentes = docentes;
        this.idPeriodoAcademico = idPeriodoAcademico;
        this.contenido = contenido;
        this.idModulo = idModulo;
        this.idEvaluacioinDocente = idEvaluacioinDocente;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Docentes getDocentes() {
        return docentes;
    }

    public void setDocentes(Docentes docentes) {
        this.docentes = docentes;
    }

    public Long getIdPeriodoAcademico() {
        return idPeriodoAcademico;
    }

    public void setIdPeriodoAcademico(Long idPeriodoAcademico) {
        this.idPeriodoAcademico = idPeriodoAcademico;
    }

    public Contenido getContenido() {
        return contenido;
    }

    public void setContenido(Contenido contenido) {
        this.contenido = contenido;
    }

    public Long getIdModulo() {
        return idModulo;
    }

    public void setIdModulo(Long idModulo) {
        this.idModulo = idModulo;
    }

    public Long getIdEvaluacioinDocente() {
        return idEvaluacioinDocente;
    }

    public void setIdEvaluacioinDocente(Long idEvaluacioinDocente) {
        this.idEvaluacioinDocente = idEvaluacioinDocente;
    }
}
