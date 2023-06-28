package cat.itacademy.barcelonactiva.Mosqueda.JoseAntonio.s05.t01.n02.Model.Services;

import cat.itacademy.barcelonactiva.Mosqueda.JoseAntonio.s05.t01.n02.Model.Dto.FlorDTO;
import org.springframework.stereotype.Service;

import java.util.List;

@Service

public interface IFlorServices {

    void  save (FlorDTO florDTO);
    void update ( FlorDTO florDTO);
    void delete (int id);
    FlorDTO getOne (int id);
    List<FlorDTO> getAll ();

}
