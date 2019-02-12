package co.com.planesestudio.model;

import co.com.planesestudio.entity.Docentes;
import co.com.planesestudio.entity.TipoDocumento;

import java.util.Date;

public class ModelDocentes {
    private Long id;
    private TipoDocumento tipoDocumento;
    private Long numeroDocumento;
    private String nombreDocente;
    private String primerApellido;
    private String segundoApellido;
    private Date fecha_vinculacion;
    private String correo;
    private Long telefono_fijo;
    private Long telefono_movil;

    public ModelDocentes() {

    }

    public ModelDocentes(Docentes docentes) {
        this.id = docentes.getId();
        this.tipoDocumento = docentes.getTipoDocumento();
        this.numeroDocumento = docentes.getNumeroDocumento();
        this.nombreDocente = docentes.getNombreDocente();
        this.primerApellido = docentes.getPrimerApellido();
        this.segundoApellido = docentes.getSegundoApellido();
        this.fecha_vinculacion = docentes.getFecha_vinculacion();
        this.correo = docentes.getCorreo();
        this.telefono_fijo = docentes.getTelefono_fijo();
        this.telefono_movil = docentes.getTelefono_movil();
    }

    public ModelDocentes(Long id, TipoDocumento tipoDocumento, Long numeroDocumento, String nombreDocente, String primerApellido, String segundoApellido, Date fecha_vinculacion, String correo, Long telefono_fijo, Long telefono_movil) {
        this.id = id;
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
}
