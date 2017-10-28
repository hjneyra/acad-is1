package acad;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import acad.repository.AlumnoRepository;

@RunWith(SpringRunner.class)
@SpringBootTest
public class AcadApplicationTests {

  @Autowired
  AlumnoRepository repo;

  @Test
  public void contextLoads() {
    repo.count();
  }

}
