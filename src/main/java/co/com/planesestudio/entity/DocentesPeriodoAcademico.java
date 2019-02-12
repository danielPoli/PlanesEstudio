package co.com.planesestudio.entity;

import javax.persistence.*;
import java.io.Serializable;

@Table(name = "DOCENTES_PERIODO_ACADEMICO")
@Entity
public class DocentesPeriodoAcademico implements Serializable {

    @GeneratedValue
    @Id
    @Column(name = "ID_DOCENTES_PERIODO_ACADEMICO")
    private Long id;

    @Column(name = "ID_DOCENTE")
    private Long idDocente;

    @Column(name = "ID_PERIODO_ACADEMICO")
    private Long idPeriodoAcademico;

    @Column(name = "ID_CONTENIDO")
    private Long idContenido;

    @Column(name = "ID_MODULO")
    private Long idModulo;

    @Column(name = "ID_EVALUCION_DOCENTE")
    private Long idEvaluacioinDocente;

    public DocentesPeriodoAcademico() {
    }

    public DocentesPeriodoAcademico(Long idDocente, Long idPeriodoAcademico, Long idContenido, Long idModulo, Long idEvaluacioinDocente) {
        this.idDocente = idDocente;
        this.idPeriodoAcademico = idPeriodoAcademico;
        this.idContenido = idContenido;
        this.idModulo = idModulo;
        this.idEvaluacioinDocente = idEvaluacioinDocente;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getIdDocente() {
        return idDocente;
    }

    public void setIdDocente(Long idDocente) {
        this.idDocente = idDocente;
    }

    public Long getIdPeriodoAcademico() {
        return idPeriodoAcademico;
    }

    public void setIdPeriodoAcademico(Long idPeriodoAcademico) {
        this.idPeriodoAcademico = idPeriodoAcademico;
    }

    public Long getIdContenido() {
        return idContenido;
    }

    public void setIdContenido(Long idContenido) {
        this.idContenido = idContenido;
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
