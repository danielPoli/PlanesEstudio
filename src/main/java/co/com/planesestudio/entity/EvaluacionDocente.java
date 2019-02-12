package co.com.planesestudio.entity;

import javax.persistence.*;
import java.io.Serializable;

@Table(name = "EVALUACION_DOCENTE")
@Entity
public class EvaluacionDocente implements Serializable {

    @GeneratedValue
    @Id
    @Column(name = "ID_EVALUACION_DOCENTE")
    private Long idEvaluacionDocente;

    @Column(name = "EVALUACION_DOCENTE")
    private Long evaluacionDocente;

    public EvaluacionDocente() {
    }

    public EvaluacionDocente(Long idEvaluacionDocente, Long evaluacionDocente) {
        this.idEvaluacionDocente = idEvaluacionDocente;
        this.evaluacionDocente = evaluacionDocente;
    }

    public Long getIdEvaluacionDocente() {
        return idEvaluacionDocente;
    }

    public void setIdEvaluacionDocente(Long idEvaluacionDocente) {
        this.idEvaluacionDocente = idEvaluacionDocente;
    }

    public Long getEvaluacionDocente() {
        return evaluacionDocente;
    }

    public void setEvaluacionDocente(Long evaluacionDocente) {
        this.evaluacionDocente = evaluacionDocente;
    }
}
