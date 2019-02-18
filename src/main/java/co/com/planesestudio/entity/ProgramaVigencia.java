package co.com.planesestudio.entity;

import javax.persistence.*;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Table(name = "PROGRAMA_VIGENCIA")
@Entity
public class ProgramaVigencia implements Serializable {



    private Long idPrograma;

    @Column(name = "FECHA_INICIO")
    private Date fechaInicio;

    @Column(name = "FECHA_FIN")
    private Date fechaFin;

    @Column(name = "PUBLICADA")
    private Boolean publicada;

    @OneToMany(mappedBy = "MODULO", cascade = CascadeType.ALL, orphanRemoval = true)
    private List<Modulo> moduloList = new ArrayList<>();

    public ProgramaVigencia() {
    }

    public ProgramaVigencia(Long idPrograma, Date fechaInicio, Date fechaFin, Boolean publicada) {
        this.idPrograma = idPrograma;
        this.fechaInicio = fechaInicio;
        this.fechaFin = fechaFin;
        this.publicada = publicada;
    }

    public Long getIdPrograma() {
        return idPrograma;
    }

    public void setIdPrograma(Long idPrograma) {
        this.idPrograma = idPrograma;
    }

    public Date getFechaInicio() {
        return fechaInicio;
    }

    public void setFechaInicio(Date fechaInicio) {
        this.fechaInicio = fechaInicio;
    }

    public Date getFechaFin() {
        return fechaFin;
    }

    public void setFechaFin(Date fechaFin) {
        this.fechaFin = fechaFin;
    }

    public Boolean getPublicada() {
        return publicada;
    }

    public void setPublicada(Boolean publicada) {
        this.publicada = publicada;
    }

    public List<Modulo> getModuloList() {
        return moduloList;
    }

    public void setModuloList(List<Modulo> moduloList) {
        this.moduloList = moduloList;
    }
}
