package modelo;

import org.springframework.data.repository.CrudRepository;
/*Se crea el repositorio de la clase que se creó, 
para esto se crea una nueva interfaz de java 
con el nombre RepositorioNombreDeLaClase 
que extiende la clase CrudRepository así:*/

public interface RepositorioMuseo extends CrudRepository<Museo, Long>{
    
}
    
