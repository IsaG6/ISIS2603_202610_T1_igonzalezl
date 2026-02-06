package co.edu.uniandes.dse.TallerPersistencia.entities;

import java.util.ArrayList;
import java.util.List;

import jakarta.persistence.Entity;
import jakarta.persistence.ManyToMany;
import lombok.Data;
import uk.co.jemos.podam.common.PodamExclude;

@Data
@Entity
public class ActorEntity extends BaseEntity{
    
    // atributos //
    private String nombre;
    private String nacionalidad;

    // asociaciones //
    @PodamExclude
    @ManyToMany
    private List<PeliculaEntity> peliculas = new ArrayList<>();
}
