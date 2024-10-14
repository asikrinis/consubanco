package com.consuban.investment.Controladores;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.consuban.investment.DTO.BranchDTO;
import com.consuban.investment.Objetos.Branch;
import com.consuban.investment.Servicio.BranchService;

@RestController
@RequestMapping("/branch")
public class BranchController {

    @Autowired
    private BranchService branchService;

    // Crear una nueva branch
    @PostMapping("/saveBranch")
    public ResponseEntity<BranchDTO> saveBranch(@RequestBody BranchDTO branchDTO) {
        Branch branch = branchService.convertToEntity(branchDTO);
        Branch savedBranch = branchService.saveBranch(branch);
        return ResponseEntity.ok(branchService.convertToDTO(savedBranch));
    }

    // Actualizar una branch existente
    @PutMapping("/updateBranch")
    public ResponseEntity<BranchDTO> updateBranch(@RequestBody BranchDTO branchDTO) {
        Branch branch = branchService.convertToEntity(branchDTO);
        Branch updatedBranch = branchService.updateBranch(branch);
        return ResponseEntity.ok(branchService.convertToDTO(updatedBranch));
    }

    // Obtener una branch por su ID
    @GetMapping("/{branchId}")
    public ResponseEntity<BranchDTO> getBranch(@PathVariable String branchId) {
        Optional<Branch> branch = branchService.getBranch(branchId);
        return branch.map(value -> ResponseEntity.ok(branchService.convertToDTO(value)))
                .orElseGet(() -> ResponseEntity.notFound().build());
    }

    // Eliminar una branch por su ID
    @DeleteMapping("/{branchId}")
    public ResponseEntity<Void> deleteBranch(@PathVariable String branchId) {
        branchService.deleteBranch(branchId);
        return ResponseEntity.ok().build();
    }

    // Obtener todas las branches
    @GetMapping("/all")
    public ResponseEntity<List<BranchDTO>> getAllBranches() {
        List<Branch> branches = branchService.getAllBranches();
        List<BranchDTO> branchDTOs = branches.stream()
                                             .map(branchService::convertToDTO)
                                             .collect(Collectors.toList());
        return ResponseEntity.ok(branchDTOs);
    }
}
