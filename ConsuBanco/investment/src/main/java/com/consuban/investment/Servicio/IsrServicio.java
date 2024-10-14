package com.consuban.investment.Servicio;

import com.consuban.investment.DTO.IsrDTO;
import com.consuban.investment.Objetos.Isr;
import com.consuban.investment.Repositorio.IsrRepositorio;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.StreamSupport;

@Service
public class IsrServicio {

    @Autowired
    private IsrRepositorio isrRepository;

    // Guardar un ISR
    public Isr saveIsr(Isr isr) {
        return isrRepository.save(isr);
    }

    // Actualizar un ISR existente
    public Isr updateIsr(Isr isr) {
        return isrRepository.save(isr);
    }

    // Obtener un ISR por su ID
    public Optional<Isr> getIsr(String idIsr) {
        return isrRepository.findById(idIsr);
    }

    // Eliminar un ISR por su ID
    public void deleteIsr(String idIsr) {
        isrRepository.deleteById(idIsr);
    }

    // Obtener todos los ISR
    public List<Isr> getAllIsrs() {
        return StreamSupport.stream(isrRepository.findAll().spliterator(), false)
                            .collect(Collectors.toList());
    }

    // Convertir de IsrDTO a Isr
    public Isr convertToEntity(IsrDTO isrDTO) {
        Isr isr = new Isr();
        isr.setIdIsr(isrDTO.getIdIsr());
        isr.setRate((float) isrDTO.getRate());
        isr.setFactor(isrDTO.getFactor());
        isr.setAnnualBase(isrDTO.getAnnualBase());
        return isr;
    }
    

    // Convertir de Isr a IsrDTO
    public IsrDTO convertToDTO(Isr isr) {
        IsrDTO isrDTO = new IsrDTO();
        isrDTO.setIdIsr(isr.getIdIsr());
        isrDTO.setRate(isr.getRate());
        isrDTO.setFactor(isr.getFactor());
        isrDTO.setAnnualBase(isr.getAnnualBase());
        return isrDTO;
    }
    
}
