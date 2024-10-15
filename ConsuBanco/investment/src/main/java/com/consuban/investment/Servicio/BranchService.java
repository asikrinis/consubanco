package com.consuban.investment.Servicio;

import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.consuban.investment.DTO.BranchDTO;
import com.consuban.investment.Objetos.Branch;
import com.consuban.investment.Repositorio.BranchRepository;

@Service
public class BranchService {

    @Autowired
    private BranchRepository branchRepository;

    public List<Branch> getAllBranches() {
        return branchRepository.findAll();
    }

    public Optional<Branch> getBranchById(Long id) {
        return branchRepository.findById(id);
    }

    // Guardar una nueva sucursal
    public Branch saveBranch(Branch branch) {
        return branchRepository.save(branch);
    }

    public Branch updateBranch(Branch branch) {
        return branchRepository.save(branch);
    }

    public void deleteBranch(Long id) {
        branchRepository.deleteById(id);
    }

    public Branch convertToEntity(BranchDTO branchDTO) {
        Branch branch = new Branch();
        branch.setId(branchDTO.getId());
        branch.setBranchName(branchDTO.getBranchName());
        branch.setAddress(branchDTO.getAddress());
        return branch;
    }

    public BranchDTO convertToDTO(Branch branch) {
        BranchDTO branchDTO = new BranchDTO();
        branchDTO.setId(branch.getId());
        branchDTO.setBranchName(branch.getBranchName());
        branchDTO.setAddress(branch.getAddress());
        return branchDTO;
    }
}