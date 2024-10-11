package com.consuban.investment.Controladores;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.consuban.investment.Objetos.Isr;
import com.consuban.investment.Servicio.IsrServicio;

@RestController
@RequestMapping("/isr")
public class IsrControlador {

    @Autowired
    IsrServicio isrServicio;

    @PostMapping("/saveIsr")
    public Isr saveIsr(@RequestBody Isr isr){        
        return isrServicio.saveIsr(isr);
    }

    @PutMapping("/modificarIsr")
    public Isr modificarIsr(@RequestBody Isr isr){
        return isrServicio.modificarIsr(isr);
    }

    @GetMapping("/obtenerIsr")
    public List<Isr> obtenerIsr(){
        return isrServicio.obtenerId();
    }

    @DeleteMapping("/eliminarIsr")
    public void eliminarIsr(@RequestParam String idIsr){
        isrServicio.eliminarIsr(idIsr);
    }

    
}
