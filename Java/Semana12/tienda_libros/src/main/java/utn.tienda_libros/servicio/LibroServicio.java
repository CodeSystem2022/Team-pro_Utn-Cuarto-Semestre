package utn.tienda_libros.servicio;

import org.springframework.stereotype.Service;

@Service
public class LibroServicio implements ILibroServicio {

   @Autowired
   private LibroRepositorio libroRepositorio;
   
   @Override
   public List<Libro> listarLibros() {
   return libroRepositorio.findAll();
}

@Override
public Libro buscarLibroPorId(Integer idLibro) {
    
   Libro libro = libroRepositorio.findById(idLibro).orElse(null);
   return libro;
}

@Override
public void guardarLibro(Libro libro) {
    libroRepositorio.save(libro);
   }
@Override
public void eliminarLibro(Libro libro) {
    libroRepositorio.delete(libro);
   }
}