package cat.itacademy.barcelonactiva.mosqueda.joseantonio.s05.t01.n01.model.domain;

import cat.itacademy.barcelonactiva.mosqueda.joseantonio.s05.t01.n01.model.dto.BranchDTO;
import jakarta.persistence.*;
import lombok.*;
import org.modelmapper.ModelMapper;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Getter
@Setter
@Table (name = "branch")
public class Branch {

    @Id
    @GeneratedValue
    private Integer pk_SucursalID;

    @Column (name = "name")
    private String name;

    @Column (name = "country")
    private String country;

}
