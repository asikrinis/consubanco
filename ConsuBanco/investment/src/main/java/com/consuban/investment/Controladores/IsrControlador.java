package com.consuban.investment.Controladores;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import com.consuban.investment.DTO.IsrDTO;
import com.consuban.investment.Objetos.Isr;
import com.consuban.investment.Servicio.IsrServicio;

@RestController
@RequestMapping("/isr")
public class IsrControlador {

    @Autowired
    private IsrServicio isrService;

    // Crear un nuevo ISR
    @PostMapping("/saveIsr")
    public ResponseEntity<IsrDTO> saveIsr(@RequestBody IsrDTO isrDTO) {
        Isr isr = isrService.convertToEntity(isrDTO);
        Isr savedIsr = isrService.saveIsr(isr);
        return ResponseEntity.ok(isrService.convertToDTO(savedIsr));
    }

    // Actualizar un ISR existente
    @PutMapping("/updateIsr")
    public ResponseEntity<IsrDTO> updateIsr(@RequestBody IsrDTO isrDTO) {
        Isr isr = isrService.convertToEntity(isrDTO);
        Isr updatedIsr = isrService.updateIsr(isr);
        return ResponseEntity.ok(isrService.convertToDTO(updatedIsr));
    }

    // Obtener un ISR por su ID
    @GetMapping("/{idIsr}")
    public ResponseEntity<IsrDTO> getIsr(@PathVariable String idIsr) {
        Optional<Isr> isr = isrService.getIsr(idIsr);
        return isr.map(value -> ResponseEntity.ok(isrService.convertToDTO(value)))
                .orElseGet(() -> ResponseEntity.notFound().build());
    }

    // Eliminar un ISR por su ID
    @DeleteMapping("/{idIsr}")
    public ResponseEntity<Void> deleteIsr(@PathVariable String idIsr) {
        isrService.deleteIsr(idIsr);
        return ResponseEntity.ok().build();
    }

    // Obtener todos los ISR
    @GetMapping("/all")
    public ResponseEntity<List<IsrDTO>> getAllIsrs() {
        List<Isr> isrs = isrService.getAllIsrs();
        List<IsrDTO> isrDTOs = isrs.stream()
                                   .map(isrService::convertToDTO)
                                   .collect(Collectors.toList());
        return ResponseEntity.ok(isrDTOs);
    }
}
