package cat.itacademy.barcelonactiva.Mosqueda.JoseAntonio.s05.t01.n02.Model.Respository;

import cat.itacademy.barcelonactiva.Mosqueda.JoseAntonio.s05.t01.n02.Model.Domain.FlorEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface FlorRespository extends JpaRepository <FlorEntity, Integer> {
}
