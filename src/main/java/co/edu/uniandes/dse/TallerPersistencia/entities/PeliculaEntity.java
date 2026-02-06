package co.edu.uniandes.dse.TallerPersistencia.entities;

import java.util.ArrayList;
import java.util.List;

import jakarta.persistence.Entity;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.ManyToOne;
import lombok.Data;
import uk.co.jemos.podam.common.PodamExclude;

@Data
@Entity
public class PeliculaEntity extends BaseEntity {
    
    // atributos //
    private String titulo;
    private Integer anioLanzamiento;

    // asociaciones //
    @PodamExclude
        @ManyToOne
        private DirectorEntity director;

    @PodamExclude
    @ManyToMany
    private List<ActorEntity> actores = new ArrayList<>();

}
