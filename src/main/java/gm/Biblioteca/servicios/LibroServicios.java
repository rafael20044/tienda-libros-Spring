package gm.Biblioteca.servicios;

import gm.Biblioteca.entidades.Libros;
import gm.Biblioteca.repositorio.librosRepositorios;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author Rafael Barragán Acevedo
 */
@Service
public class LibroServicios implements ILibrosServicios{

    @Autowired
    private librosRepositorios repositorio;
    @Override
    public List<Libros> listaLibros() {
        return repositorio.findAll();
    }

    @Override
    public Libros buscar(Integer id) {
        Libros l = repositorio.findById(id).orElse(null);
        return l;
    }

    @Override
    public void guardar(Libros l) {
        repositorio.save(l);
    }

    @Override
    public void eliminar(Libros l) {
        repositorio.delete(l);
    }
    
}
