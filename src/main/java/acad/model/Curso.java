package acad.model;

import java.util.List;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;

@Entity
public class Curso {
  @Id
  private String codigo;

  private String nombre;

  @ManyToMany
  @JoinTable(name = "prerequisito",
      joinColumns = @JoinColumn(name = "curso_codigo", referencedColumnName = "codigo"),
      inverseJoinColumns = @JoinColumn(name = "prerequisito_codigo",
          referencedColumnName = "codigo"))
  private List<Curso> prerequisitos;

  public String getNombre() {
    return nombre;
  }

  public void setNombre(String nombre) {
    this.nombre = nombre;
  }

  public List<Curso> getPrerequisitos() {
    return prerequisitos;
  }

  public void setPrerequisitos(List<Curso> prerequisitos) {
    this.prerequisitos = prerequisitos;
  }

  public String getCodigo() {
    return codigo;
  }

  public void setCodigo(String codigo) {
    this.codigo = codigo;
  }
}
