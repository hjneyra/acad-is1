package acad.repository;

import java.util.List;
import org.springframework.data.repository.CrudRepository;
import acad.model.Alumno;

public interface AlumnoRepository extends CrudRepository<Alumno, String>{
  List<Alumno> findAll();
}
