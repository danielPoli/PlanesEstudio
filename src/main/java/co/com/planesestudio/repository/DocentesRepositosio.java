package co.com.planesestudio.repository;

import co.com.planesestudio.entity.Docentes;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.io.Serializable;
import java.util.List;

@Repository("repositorio")
public interface DocentesRepositosio extends JpaRepository<Docentes, Serializable> {

    public abstract Docentes findByNombreDocente(String nombre);

    public abstract List<Docentes> findByNumeroDocumento(Long numeroDocumento);

    public abstract Docentes findByTipoDocumentoAndNumeroDocumento(long tipoDocumento, long numeroDocumento);
}
