package co.edu.uniandes.dse.TallerPersistencia.entities;

import java.util.ArrayList;
import java.util.List;

import lombok.Data;
import jakarta.persistence.Entity;
import jakarta.persistence.OneToMany;
import uk.co.jemos.podam.common.PodamExclude;
import jakarta.persistence.CascadeType;

@Data
@Entity
public class DirectorEntity extends BaseEntity {
    
    // atributos //
    private String nombre;
    private String biografia;

    // asociaciones //
    @PodamExclude
    @OneToMany(mappedBy = "director", cascade = CascadeType.PERSIST, orphanRemoval = true)
    private List<PeliculaEntity> peliculas =  new ArrayList<>();


}
