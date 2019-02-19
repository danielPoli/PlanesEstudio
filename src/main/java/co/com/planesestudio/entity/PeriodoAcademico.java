package co.com.planesestudio.entity;

import javax.persistence.*;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

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

    @OneToMany(mappedBy = "periodoAcademico", cascade = CascadeType.ALL, orphanRemoval = true)
    private List<DocentesPeriodoAcademico> docentesPeriodoAcademicoList = new ArrayList<>();

    public PeriodoAcademico() {
    }

    public PeriodoAcademico(Long idPeriodoAcademico, Long año, Long periodo) {
        this.idPeriodoAcademico = idPeriodoAcademico;
        this.año = año;
        this.periodo = periodo;
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

    public List<DocentesPeriodoAcademico> getDocentesPeriodoAcademicoList() {
        return docentesPeriodoAcademicoList;
    }

    public void setDocentesPeriodoAcademicoList(List<DocentesPeriodoAcademico> docentesPeriodoAcademicoList) {
        this.docentesPeriodoAcademicoList = docentesPeriodoAcademicoList;
    }
}
