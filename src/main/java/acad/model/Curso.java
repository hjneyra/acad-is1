package acad.model;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Curso {
  @Id
  private String curso;

  public String getCurso() {
    return curso;
  }

  public void setCurso(String curso) {
    this.curso = curso;
  }
}
