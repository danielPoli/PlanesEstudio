package co.com.planesestudio.service;

import co.com.planesestudio.converter.Convertidor;
import co.com.planesestudio.entity.Docentes;
import co.com.planesestudio.model.ModelDocentes;
import co.com.planesestudio.repository.DocentesRepositosio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import java.util.List;

@Service("servicio")
public class DocenteServicio {

    @Autowired
    @Qualifier("repositorio")
    private DocentesRepositosio repositosio;

    @Autowired
    @Qualifier("convertidor")
    private Convertidor convertidor;

    public boolean crear(Docentes docentes){
        try {
            repositosio.save(docentes);
            return true;
        }catch (Exception e){
            return false;
        }
    }

    public boolean actualizar(Docentes docentes){
        try {
            repositosio.save(docentes);
            return true;
        }catch (Exception e){
            return false;
        }
    }

    public boolean borrar(Long tipoDocumento, Long numeroDocumento){
        try {
            Docentes docentes = repositosio.findByTipoDocumentoAndNumeroDocumento(tipoDocumento,numeroDocumento);
            repositosio.delete(docentes);
            return true;
        }catch (Exception e){
            return false;
        }
    }

    public List<ModelDocentes> obtener(){;
        return convertidor.convertirLista(repositosio.findAll());
    }

    public List<ModelDocentes> obtenerPorNumeroDocumento(Long numeroDocumento){
        return convertidor.convertirLista(repositosio.findByNumeroDocumento(numeroDocumento));
    }
}
