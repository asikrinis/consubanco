package com.consuban.investment.Controladores;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.consuban.investment.Objetos.InterestPlan;
import com.consuban.investment.Servicio.InterestPlanServicio;

@RestController
@RequestMapping("/interestPlan")
public class InterestPlanControlador {

    @Autowired
    InterestPlanServicio interestPlanServicio;

    @PostMapping("/saveInterestPlan")
    public InterestPlan saveInterestPlan(@RequestBody InterestPlan interestPlan){        
        return interestPlanServicio.saveInterestPlan(interestPlan);
    }
    
    @PutMapping("/modificarInterestPlan")
    public InterestPlan modificarInterestPlan(@RequestBody InterestPlan interestPlan){
        return interestPlanServicio.modificarInterestPlan(interestPlan);
    }

    @DeleteMapping("/eliminarInterestPlan")
    public void eliminarInterestPlan(@RequestParam String idInterestPlan){
        interestPlanServicio.eliminarInterestPlan(idInterestPlan);
    }
    
}
