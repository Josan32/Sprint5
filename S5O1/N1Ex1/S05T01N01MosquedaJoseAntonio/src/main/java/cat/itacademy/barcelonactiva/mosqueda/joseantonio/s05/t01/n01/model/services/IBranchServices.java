package cat.itacademy.barcelonactiva.mosqueda.joseantonio.s05.t01.n01.model.services;

import cat.itacademy.barcelonactiva.mosqueda.joseantonio.s05.t01.n01.model.dto.BranchDTO;
import org.springframework.stereotype.Service;
import java.util.List;
@Service
public interface IBranchServices {



    void  save (BranchDTO branchDTO);
    void update ( BranchDTO branchDTO);
    void delete (int id);
    BranchDTO getOne (int id);
    List<BranchDTO> getAll ();
}
