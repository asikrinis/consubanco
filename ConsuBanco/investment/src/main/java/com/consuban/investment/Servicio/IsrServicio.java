package com.consuban.investment.Servicio;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.consuban.investment.Objetos.Isr;
import com.consuban.investment.Repositorio.IsrRepositorio;

@Service
public class IsrServicio {
    
    @Autowired
    IsrRepositorio isrRepositorio;

    Isr isrP = new Isr();

    public Isr saveIsr(Isr isr){        
        if(isrRepositorio.existsById(isr.getIdIsr())){
            return isrP;
        }
        else{
            return isrRepositorio.save(isr);
            
        }
    }

    public Isr modificarIsr(Isr isr){
        if(isrRepositorio.existsById(isr.getIdIsr())){
            return isrRepositorio.save(isr);
        }else{
            return isrP;
        }
    }

    public List<Isr> obtenerId(){
        return isrRepositorio.findAll();
    }

    public Optional<Isr> obtenerIsr(String idIsr){
        return isrRepositorio.findById(idIsr);
    }

    public void eliminarIsr(String idIsr){
        isrRepositorio.deleteById(idIsr);
    }


}
