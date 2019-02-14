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
    @JsonIgnore
    private Docentes docentes;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "ID_PERIODO_ACADEMICO")
    @JsonIgnore
    private PeriodoAcademico periodoAcademico;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "ID_CONTENIDO")
    @JsonIgnore
    private Contenido contenido;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "ID_MODULO")
    @JsonIgnore
    private Modulo modulo;

    @Column(name = "ID_EVALUCION_DOCENTE")
    @ManyToOne(fetch = FetchType.LAZY)
    @JsonIgnore
    private EvaluacionDocente evaluacioinDocente;

    public DocentesPeriodoAcademico() {
    }

    public DocentesPeriodoAcademico(Docentes docentes, PeriodoAcademico periodoAcademico, Contenido contenido, Modulo modulo, EvaluacionDocente evaluacioinDocente) {
        this.docentes = docentes;
        this.periodoAcademico = periodoAcademico;
        this.contenido = contenido;
        this.modulo = modulo;
        this.evaluacioinDocente = evaluacioinDocente;
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

    public PeriodoAcademico getPeriodoAcademico() {
        return periodoAcademico;
    }

    public void setPeriodoAcademico(PeriodoAcademico periodoAcademico) {
        this.periodoAcademico = periodoAcademico;
    }

    public Contenido getContenido() {
        return contenido;
    }

    public void setContenido(Contenido contenido) {
        this.contenido = contenido;
    }

    public Modulo getModulo() {
        return modulo;
    }

    public void setModulo(Modulo modulo) {
        this.modulo = modulo;
    }

    public EvaluacionDocente getEvaluacioinDocente() {
        return evaluacioinDocente;
    }

    public void setEvaluacioinDocente(EvaluacionDocente evaluacioinDocente) {
        this.evaluacioinDocente = evaluacioinDocente;
    }
}
