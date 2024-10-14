package com.consuban.investment.Controladores;

import com.consuban.investment.DTO.InterestPlanDTO;
import com.consuban.investment.Objetos.InterestPlan;
import com.consuban.investment.Servicio.InterestPlanServicio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/interestPlan")
public class InterestPlanControlador {

    @Autowired
    private InterestPlanServicio interestPlanServicio;

    @PostMapping("/saveInterestPlan")
    public ResponseEntity<InterestPlanDTO> saveInterestPlan(@RequestBody InterestPlanDTO interestPlanDTO) {
        InterestPlan interestPlan = interestPlanServicio.convertToEntity(interestPlanDTO);
        InterestPlan savedInterestPlan = interestPlanServicio.saveInterestPlan(interestPlan);
        return ResponseEntity.ok(interestPlanServicio.convertToDTO(savedInterestPlan));
    }

    @PutMapping("/updateInterestPlan")
    public ResponseEntity<InterestPlanDTO> updateInterestPlan(@RequestBody InterestPlanDTO interestPlanDTO) {
        InterestPlan interestPlan = interestPlanServicio.convertToEntity(interestPlanDTO);
        InterestPlan updatedInterestPlan = interestPlanServicio.saveInterestPlan(interestPlan);
        return ResponseEntity.ok(interestPlanServicio.convertToDTO(updatedInterestPlan));
    }

    @GetMapping("/{idInterestPlan}")
    public ResponseEntity<InterestPlanDTO> getInterestPlan(@PathVariable String idInterestPlan) {
        Optional<InterestPlan> interestPlan = interestPlanServicio.getInterestPlan(idInterestPlan);
        return interestPlan.map(value -> ResponseEntity.ok(interestPlanServicio.convertToDTO(value)))
                .orElseGet(() -> ResponseEntity.notFound().build());
    }

    @DeleteMapping("/{idInterestPlan}")
    public ResponseEntity<Void> deleteInterestPlan(@PathVariable String idInterestPlan) {
        interestPlanServicio.deleteInterestPlan(idInterestPlan);
        return ResponseEntity.ok().build();
    }

    @GetMapping("/all")
    public ResponseEntity<List<InterestPlanDTO>> getAllInterestPlans() {
        List<InterestPlan> interestPlans = interestPlanServicio.getAllInterestPlans();
        List<InterestPlanDTO> interestPlanDTOs = interestPlans.stream()
                .map(interestPlanServicio::convertToDTO)
                .collect(Collectors.toList());
        return ResponseEntity.ok(interestPlanDTOs);
    }
}
