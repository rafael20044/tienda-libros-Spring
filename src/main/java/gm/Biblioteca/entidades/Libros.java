package gm.Biblioteca.entidades;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

/**
 * @author Rafael Barragán Acevedo
 */
@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class Libros {
    @Id
    private Integer id;
    private String titulo;
    private String autor;
    private Integer precio;
    private Integer existencias;
}
