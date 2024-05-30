package gm.Biblioteca.servicios;

import gm.Biblioteca.entidades.Libros;
import java.util.List;

/**
 * @author Rafael Barragán Acevedo
 */
public interface ILibrosServicios {
    public List<Libros> listaLibros();
    public Libros buscar(Integer id);
    public void guardar(Libros l);
    public void eliminar(Libros l);
}
