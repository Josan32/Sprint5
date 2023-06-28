package cat.itacademy.barcelonactiva.mosqueda.joseantonio.s05.t01.n01.model.services;

import cat.itacademy.barcelonactiva.mosqueda.joseantonio.s05.t01.n01.model.domain.Branch;
import cat.itacademy.barcelonactiva.mosqueda.joseantonio.s05.t01.n01.model.dto.BranchDTO;
import cat.itacademy.barcelonactiva.mosqueda.joseantonio.s05.t01.n01.model.repository.BranchRepository;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@Service
public class BranchServices implements IBranchServices {

    @Autowired
    private ModelMapper modelMapper;
    @Autowired
    private BranchRepository branchRepository;

    @Override
    public void save(BranchDTO branchDTO) {
        branchRepository.save(modelMapper.map(branchDTO, Branch.class));
    }

    @Override
    public void update(BranchDTO branchDTO) {
        Branch sucursal = convertDTOToEntity(branchDTO);
        branchRepository.save(sucursal);
    }

    @Override
    public void delete(int id) {
        branchRepository.deleteById(id);
    }

    @Override
    public BranchDTO getOne(int id) {
        Optional<Branch> optionalSucursal = branchRepository.findById(id);
        BranchDTO sucursalDto= null;
        if (optionalSucursal.isPresent()) {
            sucursalDto = convertEntityToDTO(optionalSucursal.get());
        }
        return sucursalDto;
    }

    @Override
    public List<BranchDTO> getAll() {
        return branchRepository.findAll()
                .stream()
                .map(this::convertEntityToDTO)
                .collect(Collectors.toList());
    }

    public BranchDTO convertEntityToDTO(Branch branch) {
        return  modelMapper.map(branch, BranchDTO.class);
    }

    public Branch convertDTOToEntity(BranchDTO sucursalDTO) {
        return  modelMapper.map(sucursalDTO, Branch.class);
    }
}
