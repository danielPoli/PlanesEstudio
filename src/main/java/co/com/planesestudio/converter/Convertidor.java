package co.com.planesestudio.converter;

import co.com.planesestudio.entity.Docentes;
import co.com.planesestudio.model.ModelDocentes;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component("convertidor")
public class Convertidor {

    public List<ModelDocentes> convertirLista(List<Docentes> docentes){
        List<ModelDocentes> modelDocentesList = new ArrayList<>();

        for (Docentes docente: docentes) {
            modelDocentesList.add(new ModelDocentes(docente));
        }

        return modelDocentesList;
    }
}
