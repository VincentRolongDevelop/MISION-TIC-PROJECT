package modelo;

import org.springframework.data.relational.core.mapping.Table;
import org.springframework.data.annotation.Id;
import org.springframework.data.relational.core.mapping.Column;
import org.springframework.data.relational.core.mapping.Table;

@Table("Museo")
public class Museo {    
    @Id
    @Column("id_museo")        
    private Long idMuseo;
    @Column("nombre")
    private String nombre;
    @Column("ciudad")
    private String ciudad;
   
    private Museo(Long idMuseo, String nombre, String ciudad) {
        this.idMuseo = idMuseo;
        this.nombre = nombre;
        this.ciudad = ciudad;
    }
   
    public static Museo crearMuseo(String nombre, String ciudad){
        return new Museo(null, nombre, ciudad);
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setCiudad(String ciudad) {
        this.ciudad = ciudad;
    }

    public Long getIdMuseo() {
        return idMuseo;
    }

    public void setIdMuseo(Long idMuseo) {
        this.idMuseo = idMuseo;
    }

    public String getNombre() {
        return nombre;
    }

    public String getCiudad() {
        return ciudad;
    }

    @Override
    public String toString() {
        return "Museo{" + "idMuseo=" + idMuseo + ", nombre=" + nombre + ", ciudad=" + ciudad + '}';
    }
}