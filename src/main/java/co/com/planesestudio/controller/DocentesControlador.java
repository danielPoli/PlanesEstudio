package co.com.planesestudio.controller;

import co.com.planesestudio.entity.Docentes;
import co.com.planesestudio.service.DocenteServicio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;

@RestController
@RequestMapping("/v1")
public class DocentesControlador {

    @Autowired
    @Qualifier("servicio")
    private DocenteServicio docentesServicio;


    @PostMapping("/guardarDocentes")
    public boolean guardarDocentes(@RequestBody @Valid Docentes docentes){
        return docentesServicio.crear(docentes);
    }

    @PutMapping("/actualizarDocentes")
    public boolean actualizarDocentes(@RequestBody @Valid Docentes docentes){
        return docentesServicio.actualizar(docentes);
    }
}
