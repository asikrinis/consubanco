package com.consuban.investment.Servicio;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.StreamSupport;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.consuban.investment.DTO.BranchDTO;
import com.consuban.investment.Objetos.Branch;
import com.consuban.investment.Repositorio.BranchRepository;

@Service
public class BranchService {

    @Autowired
    private BranchRepository branchRepository;

    public Branch saveBranch(Branch branch) {
        return branchRepository.save(branch);
    }

    public Branch updateBranch(Branch branch) {
        return branchRepository.save(branch);
    }

    public Optional<Branch> getBranch(Long branchId) {
        return branchRepository.findById(branchId);
    }

    public void deleteBranch(Long branchId) {
        branchRepository.deleteById(branchId);
    }

    public List<Branch> getAllBranches() {
        Iterable<Branch> iterableBranches = branchRepository.findAll();
        List<Branch> branchList = StreamSupport.stream(iterableBranches.spliterator(), false)
                                               .collect(Collectors.toList());
        return branchList;
    }

    public Branch convertToEntity(BranchDTO branchDTO) {
        Branch branch = new Branch();
        branch.setIdBranch(branchDTO.getIdBranch()); // Ya no necesitas conversión si ambos son Long
        branch.setBranchName(branchDTO.getBranchName());
        branch.setAddress(branchDTO.getAddress());
        return branch;
    }

    public BranchDTO convertToDTO(Branch branch) {
        BranchDTO branchDTO = new BranchDTO();
        branchDTO.setIdBranch(branch.getIdBranch()); // Ya no necesitas conversión si ambos son Long
        branchDTO.setBranchName(branch.getBranchName());
        branchDTO.setAddress(branch.getAddress());
        return branchDTO;
    }
}
