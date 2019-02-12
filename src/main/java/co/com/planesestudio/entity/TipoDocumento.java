package co.com.planesestudio.entity;

import com.fasterxml.jackson.annotation.JsonIgnore;

import javax.persistence.*;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

@Table(name = "TIPO_DOCUMENTO")
@Entity
public class TipoDocumento implements Serializable {

    @GeneratedValue
    @Id
    @Column(name = "ID_TIPO_DOCUMENTO")
    private Long id;

    @Column(name = "NOMBRE_TIPO_DOCUMENTO")
    private String nombreTipoDoumento;

    @JsonIgnore
    @OneToMany(mappedBy = "tipoDocumento", cascade = CascadeType.ALL, orphanRemoval = true)
    private List<Docentes> docentesList = new ArrayList<>();

    public TipoDocumento() {
    }

    public TipoDocumento(Long id, String nombreTipoDoumento) {
        this.id = id;
        this.nombreTipoDoumento = nombreTipoDoumento;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNombreTipoDoumento() {
        return nombreTipoDoumento;
    }

    public void setNombreTipoDoumento(String nombreTipoDoumento) {
        this.nombreTipoDoumento = nombreTipoDoumento;
    }

    public List<Docentes> getDocentesList() {
        return docentesList;
    }

    public void setDocentesList(List<Docentes> docentesList) {
        this.docentesList = docentesList;
    }
}