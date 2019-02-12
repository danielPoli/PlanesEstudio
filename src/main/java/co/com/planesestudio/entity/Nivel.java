package co.com.planesestudio.entity;

import javax.persistence.*;
import java.io.Serializable;

@Table(name = "NIVEL")
@Entity
public class Nivel implements Serializable {

    @GeneratedValue
    @Id
    @Column(name = "ID_NIVEL")
    private Long idNivel;

    @Column(name = "NOMBRE_NIVEL")
    private String nombreNivel;

    public Nivel() {
    }

    public Nivel(Long idNivel, String nombreNivel) {
        this.idNivel = idNivel;
        this.nombreNivel = nombreNivel;
    }

    public Long getIdNivel() {
        return idNivel;
    }

    public void setIdNivel(Long idNivel) {
        this.idNivel = idNivel;
    }

    public String getNombreNivel() {
        return nombreNivel;
    }

    public void setNombreNivel(String nombreNivel) {
        this.nombreNivel = nombreNivel;
    }
}
