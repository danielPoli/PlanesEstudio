package co.com.planesestudio.entity;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;

@Table(name = "MODULO")
@Entity
public class Modulo implements Serializable {

    @GeneratedValue
    @Id
    @Column(name = "ID_MODULO")
    private Long idModulo;

    @Column(name = "NOMBRE_MODULO")
    private String nombreModulo;

    @Column(name = "MODALIDAD")
    private Long modalidad;

    @Column(name = "HORAS_TRABAJO_PRESENCIAL")
    private Long horasTrabajoPresencial;

    @Column(name = "HORAS_TRABAJO_ASESORIA")
    private Long horasTrabajoAsesoria;

    @Column(name = "HORAS_TRABAJO_INDEPENDIENTE")
    private Long horasTrabajoIndependiente;

    @Column(name = "CREDITOS")
    private Long creditos;

    @Column(name = "SEMESTRE")
    private Long semestre;

    @Column(name = "PRERREQUISITO")
    private Long prerrequisito;

    @Column(name = "CORREQUISITO")
    private Long correquisito;

    @Column(name = "ACTO_ADMINISTRATIVO")
    private String actoAdministrativo;

    @Column(name = "VIGENCIA_DESDE")
    private Date vigenciaDesde;

    @Column(name = "VIGENCIA_HASTA")
    private Date vigenciaHasta;

    @Column(name = "PROGRAMA_VIGENCIA")
    private Long programaVigencia;

    public Modulo() {
    }

    public Modulo(Long idModulo, String nombreModulo, Long modalidad, Long horasTrabajoPresencial, Long horasTrabajoAsesoria, Long horasTrabajoIndependiente, Long creditos, Long semestre, Long prerrequisito, Long correquisito, String actoAdministrativo, Date vigenciaDesde, Date vigenciaHasta, Long programaVigencia) {
        this.idModulo = idModulo;
        this.nombreModulo = nombreModulo;
        this.modalidad = modalidad;
        this.horasTrabajoPresencial = horasTrabajoPresencial;
        this.horasTrabajoAsesoria = horasTrabajoAsesoria;
        this.horasTrabajoIndependiente = horasTrabajoIndependiente;
        this.creditos = creditos;
        this.semestre = semestre;
        this.prerrequisito = prerrequisito;
        this.correquisito = correquisito;
        this.actoAdministrativo = actoAdministrativo;
        this.vigenciaDesde = vigenciaDesde;
        this.vigenciaHasta = vigenciaHasta;
        this.programaVigencia = programaVigencia;
    }

    public Long getIdModulo() {
        return idModulo;
    }

    public void setIdModulo(Long idModulo) {
        this.idModulo = idModulo;
    }

    public String getNombreModulo() {
        return nombreModulo;
    }

    public void setNombreModulo(String nombreModulo) {
        this.nombreModulo = nombreModulo;
    }

    public Long getModalidad() {
        return modalidad;
    }

    public void setModalidad(Long modalidad) {
        this.modalidad = modalidad;
    }

    public Long getHorasTrabajoPresencial() {
        return horasTrabajoPresencial;
    }

    public void setHorasTrabajoPresencial(Long horasTrabajoPresencial) {
        this.horasTrabajoPresencial = horasTrabajoPresencial;
    }

    public Long getHorasTrabajoAsesoria() {
        return horasTrabajoAsesoria;
    }

    public void setHorasTrabajoAsesoria(Long horasTrabajoAsesoria) {
        this.horasTrabajoAsesoria = horasTrabajoAsesoria;
    }

    public Long getHorasTrabajoIndependiente() {
        return horasTrabajoIndependiente;
    }

    public void setHorasTrabajoIndependiente(Long horasTrabajoIndependiente) {
        this.horasTrabajoIndependiente = horasTrabajoIndependiente;
    }

    public Long getCreditos() {
        return creditos;
    }

    public void setCreditos(Long creditos) {
        this.creditos = creditos;
    }

    public Long getSemestre() {
        return semestre;
    }

    public void setSemestre(Long semestre) {
        this.semestre = semestre;
    }

    public Long getPrerrequisito() {
        return prerrequisito;
    }

    public void setPrerrequisito(Long prerrequisito) {
        this.prerrequisito = prerrequisito;
    }

    public Long getCorrequisito() {
        return correquisito;
    }

    public void setCorrequisito(Long correquisito) {
        this.correquisito = correquisito;
    }

    public String getActoAdministrativo() {
        return actoAdministrativo;
    }

    public void setActoAdministrativo(String actoAdministrativo) {
        this.actoAdministrativo = actoAdministrativo;
    }

    public Date getVigenciaDesde() {
        return vigenciaDesde;
    }

    public void setVigenciaDesde(Date vigenciaDesde) {
        this.vigenciaDesde = vigenciaDesde;
    }

    public Date getVigenciaHasta() {
        return vigenciaHasta;
    }

    public void setVigenciaHasta(Date vigenciaHasta) {
        this.vigenciaHasta = vigenciaHasta;
    }

    public Long getProgramaVigencia() {
        return programaVigencia;
    }

    public void setProgramaVigencia(Long programaVigencia) {
        this.programaVigencia = programaVigencia;
    }
}
