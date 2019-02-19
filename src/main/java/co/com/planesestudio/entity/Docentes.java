package co.com.planesestudio.entity;

import com.fasterxml.jackson.annotation.JsonIgnore;

import javax.persistence.*;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Table(name = "DOCENTES")
@Entity
public class Docentes implements Serializable {

    @GeneratedValue
    @Id
    @Column(name = "ID_DOCENTE")
    private Long id;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "ID_TIPO_DOCUMENTO")
    @JsonIgnore
    private TipoDocumento tipoDocumento;

    @Column(name = "NUMERO_DOCUMENTO")
    private Long numeroDocumento;

    @Column(name = "NOMBRE_DOCENTE")
    private String nombreDocente;

    @Column(name = "PRIMER_APELLIDO")
    private String primerApellido;

    @Column(name = "SEGUNDO_APELLIDO")
    private String segundoApellido;

    @Column(name = "FECHA_VINCULACION")
    private Date fecha_vinculacion;

    @Column(name = "CORREO")
    private String correo;

    @Column(name = "TELEFONO_FIJO")
    private Long telefono_fijo;

    @Column(name = "TELEFONO_MOVIL")
    private Long telefono_movil;

    @OneToMany(mappedBy = "docentes", cascade = CascadeType.ALL, orphanRemoval = true)
    private List<DocentesPeriodoAcademico> docentesPeriodoAcademicoList = new ArrayList<>();

    public Docentes() {
    }

    public Docentes(TipoDocumento tipoDocumento, Long numeroDocumento, String nombreDocente, String primerApellido, String segundoApellido, Date fecha_vinculacion, String correo, Long telefono_fijo, Long telefono_movil) {
        this.tipoDocumento = tipoDocumento;
        this.numeroDocumento = numeroDocumento;
        this.nombreDocente = nombreDocente;
        this.primerApellido = primerApellido;
        this.segundoApellido = segundoApellido;
        this.fecha_vinculacion = fecha_vinculacion;
        this.correo = correo;
        this.telefono_fijo = telefono_fijo;
        this.telefono_movil = telefono_movil;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public TipoDocumento getTipoDocumento() {
        return tipoDocumento;
    }

    public void setTipoDocumento(TipoDocumento tipoDocumento) {
        this.tipoDocumento = tipoDocumento;
    }

    public Long getNumeroDocumento() {
        return numeroDocumento;
    }

    public void setNumeroDocumento(Long numeroDocumento) {
        this.numeroDocumento = numeroDocumento;
    }

    public String getNombreDocente() {
        return nombreDocente;
    }

    public String getPrimerApellido() {
        return primerApellido;
    }

    public void setPrimerApellido(String primerApellido) {
        this.primerApellido = primerApellido;
    }

    public String getSegundoApellido() {
        return segundoApellido;
    }

    public void setSegundoApellido(String segundoApellido) {
        this.segundoApellido = segundoApellido;
    }

    public void setNombreDocente(String nombreDocente) {
        this.nombreDocente = nombreDocente;
    }

    public Date getFecha_vinculacion() {
        return fecha_vinculacion;
    }

    public void setFecha_vinculacion(Date fecha_vinculacion) {
        this.fecha_vinculacion = fecha_vinculacion;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public Long getTelefono_fijo() {
        return telefono_fijo;
    }

    public void setTelefono_fijo(Long telefono_fijo) {
        this.telefono_fijo = telefono_fijo;
    }

    public Long getTelefono_movil() {
        return telefono_movil;
    }

    public void setTelefono_movil(Long telefono_movil) {
        this.telefono_movil = telefono_movil;
    }

    public List<DocentesPeriodoAcademico> getDocentesPeriodoAcademicoList() {
        return docentesPeriodoAcademicoList;
    }

    public void setDocentesPeriodoAcademicoList(List<DocentesPeriodoAcademico> docentesPeriodoAcademicoList) {
        this.docentesPeriodoAcademicoList = docentesPeriodoAcademicoList;
    }
}
