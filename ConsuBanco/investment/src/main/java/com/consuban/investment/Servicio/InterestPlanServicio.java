package com.consuban.investment.Servicio;

import com.consuban.investment.DTO.InterestPlanDTO;
import com.consuban.investment.Objetos.InterestPlan;
import com.consuban.investment.Repositorio.InterestPlanRepositorio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class InterestPlanServicio {

    @Autowired
    private InterestPlanRepositorio interestPlanRepositorio;

    public InterestPlan saveInterestPlan(InterestPlan interestPlan) {
        return interestPlanRepositorio.save(interestPlan);
    }

    public Optional<InterestPlan> getInterestPlan(String idInterestPlan) {
        return interestPlanRepositorio.findById(idInterestPlan);
    }

    public List<InterestPlan> getAllInterestPlans() {
        return interestPlanRepositorio.findAll();
    }

    public void deleteInterestPlan(String idInterestPlan) {
        interestPlanRepositorio.deleteById(idInterestPlan);
    }

    // Métodos para convertir entre DTO y entidad
    public InterestPlan convertToEntity(InterestPlanDTO interestPlanDTO) {
        InterestPlan interestPlan = new InterestPlan();
        interestPlan.setIdInterestPlan(interestPlanDTO.getIdInterestPlan());
        interestPlan.setAmount(interestPlanDTO.getAmount());
        interestPlan.setRate(interestPlanDTO.getRate());
        interestPlan.setFactor(interestPlanDTO.getFactor());
        interestPlan.setAnnualBase(interestPlanDTO.getAnnualBase());
        return interestPlan;
    }

    public InterestPlanDTO convertToDTO(InterestPlan interestPlan) {
        InterestPlanDTO interestPlanDTO = new InterestPlanDTO();
        interestPlanDTO.setIdInterestPlan(interestPlan.getIdInterestPlan());
        interestPlanDTO.setAmount(interestPlan.getAmount());
        interestPlanDTO.setRate(interestPlan.getRate());
        interestPlanDTO.setFactor(interestPlan.getFactor());
        interestPlanDTO.setAnnualBase(interestPlan.getAnnualBase());
        return interestPlanDTO;
    }
}
