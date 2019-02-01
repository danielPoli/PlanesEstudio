package co.com.planesestudio.entity;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;

@Table(name = "DOCENTES")
@Entity
public class Docentes implements Serializable {

    @GeneratedValue
    @Id
    @Column(name = "ID_DOCENTE")
    private Long id;

    @Column(name = "TIPO_DOCUMENTO")
    private Long tipoDocumento;

    @Column(name = "NUMERO_DOCUMENTO")
    private Long numeroDocumento;

    @Column(name = "NOMBRE_DOCENTE")
    private String nombreDocente;

    @Column(name = "FECHA_VINCULACION")
    private Date fecha_vinculacion;

    @Column(name = "CORREO")
    private String correo;

    @Column(name = "TELEFONO_FIJO")
    private Long telefono_fijo;

    @Column(name = "TELEFONO_MOVIL")
    private Long telefono_movil;

    public Docentes() {
    }

    public Docentes(Long id, Long tipoDocumento, Long numeroDocumento, String nombreDocente, Date fecha_vinculacion, String correo, Long telefono_fijo, Long telefono_movil) {
        this.id = id;
        this.tipoDocumento = tipoDocumento;
        this.numeroDocumento = numeroDocumento;
        this.nombreDocente = nombreDocente;
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

    public Long getTipoDocumento() {
        return tipoDocumento;
    }

    public void setTipoDocumento(Long tipoDocumento) {
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
}
