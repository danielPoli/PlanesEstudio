package co.com.planesestudio.entity;

import javax.persistence.*;
import java.io.Serializable;

@Table(name = "PERIODO_ACADEMICO")
@Entity
public class PeriodoAcademico implements Serializable {

    @GeneratedValue
    @Id
    @Column(name = "ID_PERIODO_ACADEMICO")
    private Long idPeriodoAcademico;

    @Column(name = "AÑO")
    private Long año;

    @Column(name = "PERIODO")
    private Long periodo;


    private Long idModulo;

    public PeriodoAcademico() {
    }

    public PeriodoAcademico(Long idPeriodoAcademico, Long año, Long periodo, Long idModulo) {
        this.idPeriodoAcademico = idPeriodoAcademico;
        this.año = año;
        this.periodo = periodo;
        this.idModulo = idModulo;
    }

    public Long getIdPeriodoAcademico() {
        return idPeriodoAcademico;
    }

    public void setIdPeriodoAcademico(Long idPeriodoAcademico) {
        this.idPeriodoAcademico = idPeriodoAcademico;
    }

    public Long getAño() {
        return año;
    }

    public void setAño(Long año) {
        this.año = año;
    }

    public Long getPeriodo() {
        return periodo;
    }

    public void setPeriodo(Long periodo) {
        this.periodo = periodo;
    }

    public Long getIdModulo() {
        return idModulo;
    }

    public void setIdModulo(Long idModulo) {
        this.idModulo = idModulo;
    }
}
